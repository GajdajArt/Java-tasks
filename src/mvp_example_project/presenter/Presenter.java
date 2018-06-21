package mvp_example_project.presenter;


import mvp_example_project.model.IRepository;
import mvp_example_project.model.Product;
import mvp_example_project.model.Repository;
import mvp_example_project.view.IView;

import java.util.ArrayList;

public class Presenter implements IPresenter {

    private static Presenter instance;
    private IView view;
    private static IRepository repository;

    private Presenter() {
        repository = new Repository();
    }

    public static Presenter getInstance() {
        if (instance == null) {
            instance = new Presenter();
        }
        return instance;
    }


    @Override
    public void attachView(IView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void addNewProduct(String title, String price) {
        Product product = new Product(title, price);
        repository.addNewProduct(product);
        refreshViewList();
    }

    private void refreshViewList() {
        setListToView(repository.getProductList());
    }

    public void setListToView(ArrayList<Product> products) {
        view.showList(products);
    }
}
