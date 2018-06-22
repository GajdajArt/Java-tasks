package mvp_example_project.view;



import mvp_example_project.model.Product;
import mvp_example_project.presenter.Presenter;
import mvp_example_project.presenter.MainPresenter;

import java.util.ArrayList;

public class MainView implements View {

    private String title;
    private String price;
    private ArrayList<Product> display;

    private Presenter presenter;

    public MainView() {
        display = new ArrayList<>();
        onCreteView();
    }

    public void onCreteView() {
        presenter = new MainPresenter();
        presenter.attachView(this);
    }

    public void addNewProduct() {
        if (title != null && price != null) {
            presenter.addNewProduct(new Product(title, price));
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
