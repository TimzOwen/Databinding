package example.databinding.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import example.databinding.R;
import example.databinding.adapters.IProductClickListener;
import example.databinding.adapters.ProductsRecyclerViewAdapter;
import example.databinding.helpers.Constants;
import example.databinding.helpers.SampleData;
import example.databinding.model.Product;

/**
 * Main UI that displays the list of products on the screen.
 */
public final class MainActivity extends AppCompatActivity implements IProductClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView productsRecyclerView = findViewById(R.id.products_recycler_view);

        //Creates an instance of the products adapter and initialized the click listener with `this`
        //Meaning it will use the listener implemented in this class.
        ProductsRecyclerViewAdapter productsAdapter = new ProductsRecyclerViewAdapter(this);

        //Sets the data that will be displayed on the UI
        List<Product> products = SampleData.getProducts();
        productsAdapter.setProducts(products);

        productsRecyclerView.setAdapter(productsAdapter);

    }

    /**
     * Will be called when an item has been clicked from the list of items.
     *
     * @param product clicked on recycler view
     */
    @Override
    public void onClick(Product product) {
        Log.i("MainActivity", product.toString());
        Intent detailIntent = new Intent(this, DetailActivity.class);
        detailIntent.putExtra(Constants.Keys.PRODUCT_DETAIL.toString(), product);
        startActivity(detailIntent);
    }
}
