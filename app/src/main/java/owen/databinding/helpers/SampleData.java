package owen.databinding.helpers;


import java.util.ArrayList;
import java.util.List;

import owen.databinding.R;
import owen.databinding.model.Product;

public final class SampleData {

    /**
     * @return a list of dummy products
     */
    public static List<Product> getProducts() {
        return new ArrayList<Product>() {{
            add(new Product("Blue Hat", "This is a blue hat", R.drawable.blue_hat, 750));
            add(new Product("Blue Mug", "This is a blue mug", R.drawable.blue_mug, 500));
            add(new Product("Black Hat", "This is a black hat", R.drawable.black_hat, 900));
            add(new Product("Yellow Lamp", "This is a yellow lamp", R.drawable.yellow_lamp, 7000));
        }};
    }

}
