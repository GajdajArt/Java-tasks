package mvp_example_project.model;

import java.util.ArrayList;

public interface IRepository {
    void addNewProduct(Product product);
    ArrayList<Product> getProductList();
}
