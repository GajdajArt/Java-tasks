package mvp_example_project.view;


import mvp_example_project.model.Product;

import java.util.ArrayList;

public interface View {
    void showList(ArrayList<Product> products);
}
