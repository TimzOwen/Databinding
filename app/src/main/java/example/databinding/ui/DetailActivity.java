package example.databinding.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import example.databinding.R;
import example.databinding.databinding.ActivityDetailBinding;
import example.databinding.helpers.Constants;
import example.databinding.model.Product;

/**
 * Details UI displays data for one product that has been clicked
 */
public final class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent detailIntent = getIntent();
        Bundle extras = detailIntent.getExtras();

        if (extras == null) return;

        //Initialize binding object by passing in the activity of interest `this` and layout id
        //and with that you dont need to use findViewById to set values for the UI.
        ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        Product product = (Product) extras.getParcelable(Constants.Keys.PRODUCT_DETAIL.toString());

        if (product == null) return;

        Log.i("DetailActivity", product.toString());

        //Set the data variable to use for activity_detail.xml
        binding.setProduct(product);
    }

}