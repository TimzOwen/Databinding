package example.databinding.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import example.databinding.R;


public final class Product implements Comparable<Product>, Parcelable {

    private String title;
    private String description;
    private int price;
    @DrawableRes
    private int image;


    public Product(String title, String description, @DrawableRes int image, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    /**
     * Default Constructor initializing default values
     */
    public Product() {
        this.title = "Black Hat";
        this.description = "This is a black hat made from and shipped from .It comes in X,Y,Z";
        this.price = 0;
        this.image = R.drawable.black_hat;
    }

    private Product(Parcel in) {
        this.title = in.readString();
        this.description = in.readString();
        this.price = in.readInt();
        this.image = in.readInt();
    }

    public static final Parcelable.Creator<Product> CREATOR
            = new Parcelable.Creator<Product>() {
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeInt(this.price);
        dest.writeInt(this.image);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return this.compareTo(that) == 0;
    }

    @Override
    public int compareTo(@NonNull Product product) {
        if (title.equals(product.title)
                && description.equals(product.description)
                && price == product.price
                && image == product.image)
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "Product(" +
                "title = " + this.title + "," +
                "description = " + this.description + "," +
                "price = " + this.price + "," +
                "image = " + this.image + ")";
    }
}
