package example.databinding.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import example.databinding.databinding.ItemProdcutBinding;
import example.databinding.model.Product;

public final class ProductsRecyclerViewAdapter extends RecyclerView.Adapter<ProductsRecyclerViewAdapter.ProductViewHolder> {

    private List<Product> products;
    private IProductClickListener productClickListener;

    public ProductsRecyclerViewAdapter(IProductClickListener productClickListener) {
        this.productClickListener = productClickListener;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //Use binding to inflate the recycler view item layout
        ItemProdcutBinding binding = ItemProdcutBinding.inflate(layoutInflater, parent, false);
        return new ProductViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Product product = products.get(position);
        holder.bind(product);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ItemProdcutBinding binding;

        public ProductViewHolder(ItemProdcutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Product product) {
            //Sets the data variable being used in the item_product.xml
            binding.setProduct(product);
            binding.executePendingBindings();

            //When view is clicked the onClick in this class will be called
            binding.getRoot().setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Product product = products.get(getAdapterPosition());
            productClickListener.onClick(product);
        }
    }
}
