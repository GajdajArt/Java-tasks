package mvp_example_project.model;

import java.util.ArrayList;

public interface Repository {
    void addNewProduct(Product product);
    ArrayList<Product> getProductList();
}
