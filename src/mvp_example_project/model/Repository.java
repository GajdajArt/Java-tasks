package mvp_example_project.model;

import java.util.ArrayList;

public class Repository implements IRepository{

    ArrayList<Product> db;

    public Repository() {
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
