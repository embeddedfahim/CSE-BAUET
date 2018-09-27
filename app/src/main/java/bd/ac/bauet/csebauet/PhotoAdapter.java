package bd.ac.bauet.csebauet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Fahim on 19-Aug-17.
 */

public class PhotoAdapter extends BaseAdapter {

    private Context context;
    public Integer[] Photos = {R.drawable.photo1, R.drawable.photo2, R.drawable.photo3, R.drawable.photo4, R.drawable.photo5, R.drawable.photo6, R.drawable.photo7, R.drawable.photo8, R.drawable.photo9, R.drawable.photo10, R.drawable.photo11, R.drawable.photo12, R.drawable.photo13, R.drawable.photo14, R.drawable.photo15, R.drawable.photo16, R.drawable.photo17, R.drawable.photo18};

    public PhotoAdapter(Context c) {
        context = c;
    };

    @Override
    public int getCount() {
        return Photos.length;
    }

    @Override
    public Object getItem(int position) {
        return Photos[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(Photos[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240, 240));
        return imageView;
    }
}
