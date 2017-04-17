package unicauca.movil.tdatabinding.attrs;

import android.content.res.AssetManager;
import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;



public class Attrs {

    @BindingAdapter("app:imgUrl")// Esta linea llamamos e id el metodo para utlizarlo generalmente
    public static void loadImg (ImageView view, String url){
        Uri uri = Uri.parse(url);
        Picasso.with(view.getContext())
                .load(uri)
                .into(view);
    }

    @BindingAdapter("app:fontTtf")
    public static void loadFonts(TextView txt, String font){
        AssetManager assetManager = txt.getContext().getAssets();

        Typeface typeface = Typeface.createFromAsset(assetManager, "fonts/"+font+".TTF");
        txt.setTypeface(typeface);
    }
}
