package mvp_example_project;


import mvp_example_project.model.Product;
import mvp_example_project.view.MainView;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class MainTest extends Assert {


    private final ArrayList<Product> list = new ArrayList();
    private MainView view;

    @Before
    public void setUp() {

        list.add(new Product("Хлеб", "10,5"));
        list.add(new Product("Вода", "20"));
        list.add(new Product("Спички", "0,5"));
        view = new MainView();

    }

    @After
    public void tearDown() {
        view.onDestroyView();
    }

    @Test
    public void test() {

        for (Product product : list) {
            view.setTitle(product.getTitle());
            view.setPrice(product.getPrice());
            view.addNewProduct();
        }

        ArrayList<Product> display = view.getDisplay();

        for (int j = 0; j < display.size(); j++) {
            assertEquals(display.get(j).getTitle(), list.get(j).getTitle());
            assertEquals(display.get(j).getPrice(), list.get(j).getPrice());
        }

    }
}
