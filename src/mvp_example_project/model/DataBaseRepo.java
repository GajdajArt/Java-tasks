package mvp_example_project.model;

import java.util.ArrayList;

public class DataBaseRepo implements Repository {

    ArrayList<Product> db;

    public DataBaseRepo() {
        db = new ArrayList<>();
    }

    @Override
    public void addNewProduct(Product product) {
        db.add(product);
    }

    @Override
    public ArrayList<Product> getProductList() {
        return db;
    }
}
