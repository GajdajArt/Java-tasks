package mvp_example_project.presenter;

import mvp_example_project.view.IView;

public interface IPresenter {

    void attachView(IView view);
    void addNewProduct(String title, String price);
    void detachView();

}
