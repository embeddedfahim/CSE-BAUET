package bd.ac.bauet.csebauet;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Fahim on 15-Aug-17.
 */

public class CustomListView extends ArrayAdapter<String> {

    private String[] name;
    private String[] desig;
    private String[] qual;
    private Integer[] img;
    private Activity context;

    public  CustomListView(Activity context, String[] name, String[] qual, String[] desig, Integer[] img) {
        super(context, R.layout.listview_layout, name);

        this.context = context;
        this.name = name;
        this.desig = desig;
        this.qual = qual;
        this.img = img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r = convertView;
        ViewHolder viewHolder = null;
        if(r == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listview_layout, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(img[position]);
        viewHolder.tvw1.setText(name[position]);
        viewHolder.tvw.setText(qual[position]);
        viewHolder.tvw2.setText(desig[position]);

        return r;
    }

    class ViewHolder {
        TextView tvw1;
        TextView tvw;
        TextView tvw2;
        ImageView ivw;

        ViewHolder(View v) {
            tvw1 = (TextView) v.findViewById(R.id.textView6);
            tvw = (TextView) v.findViewById(R.id.textView7);
            tvw2 = (TextView) v.findViewById(R.id.textView3);
            ivw = v.findViewById(R.id.imageView3);
        }
    }
}
