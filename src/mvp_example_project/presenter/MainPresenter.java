package mvp_example_project.presenter;


import mvp_example_project.model.Repository;
import mvp_example_project.model.Product;
import mvp_example_project.model.DataBaseRepo;
import mvp_example_project.view.View;

import java.util.ArrayList;

public class MainPresenter implements Presenter {

    private View view;
    private static Repository repository;

    public MainPresenter() {
        repository = new DataBaseRepo();
    }

    @Override
    public void attachView(View view) {
        this.view = view;
        refreshViewList();
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void addNewProduct(Product product) {
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
