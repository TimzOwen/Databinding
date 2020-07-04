package owen.databinding.helpers;


import android.databinding.BindingAdapter;
import android.support.annotation.DrawableRes;
import android.widget.ImageView;

public class BindingAdapters {

    /**
     * <p>
     * Binding adapters enable you to create your own xml attributes to handle your custom logic
     * The first parameter is usually the view of interest in this case an imageview since we
     * want to set the image and additional parameters  contain the value you are receiving
     * </p>
     *
     * This is a simple example of what you can do with binding adapters.
     *
     * @param view     view to apply the custom attribute
     * @param imageRes id of the image resource being set
     * @see <a href="https://developer.android.com/topic/libraries/data-binding/binding-adapters">Binding Adapters</a>
     */
    @BindingAdapter("app:setImage")
    public static void setImage(ImageView view, @DrawableRes int imageRes) {
        view.setImageResource(imageRes);
    }

}
