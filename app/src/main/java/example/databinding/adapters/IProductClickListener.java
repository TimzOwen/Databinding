package example.databinding.adapters;

import example.databinding.model.Product;

/**
 * A listener that is responsible for handling click events in the adapter.
 *
 * The interface facilitates communication between the adapter and the activity.
 *
 * When an item is clicked the product is passed to the onClick() which is implemented
 * in the activity and makes the clicked product available for use in whichever way you see fit.
 */
public interface IProductClickListener {
    void onClick(Product product);
}
