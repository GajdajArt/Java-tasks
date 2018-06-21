package mvp_example_project.view;



import mvp_example_project.model.Product;
import mvp_example_project.presenter.IPresenter;
import mvp_example_project.presenter.Presenter;

import java.util.ArrayList;

public class View implements IView{

    private String title;
    private String price;
    private ArrayList<Product> display;

    private IPresenter presenter;

    public View() {
        display = new ArrayList<>();
        onCreteView();
    }

    public void onCreteView() {
        presenter = Presenter.getInstance();
        presenter.attachView(this);
    }

    public void addNewProduct() {
        if (title != null && price != null) {
            presenter.addNewProduct(title, price);
        }
    }

    public void showList(ArrayList<Product> products) {
        display = products;
    }

    public ArrayList<Product> getDisplay() {
        return display;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void onDestroyView() {
        presenter.detachView();
    }
}
