package mvp_example_project.presenter;

import mvp_example_project.model.Product;
import mvp_example_project.view.View;

public interface Presenter {

    void attachView(View view);
    void addNewProduct(Product product);
    void detachView();

}
