package burmacodes.app1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/**
 * Created by Jason on 10/9/2017.
 */

public class ActArrayAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Acts> mDataSource;

    public ActArrayAdapter(Context context, ArrayList<Acts> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Acts getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = mInflater.inflate(R.layout.act_cell, parent, false);

        TextView act = rowView.findViewById(R.id.act_name);
        act.setText(getItem(position).getName());

        TextView venue = rowView.findViewById(R.id.act_venue);
        venue.setText(getItem(position).getVenue());

        TextView time = rowView.findViewById(R.id.act_time);
        time.setText(getItem(position).getTime());

        TextView price = rowView.findViewById(R.id.act_price);
        price.setText(getItem(position).getPrice());


        /*ImageView image=(ImageView)rowView.findViewById(R.id.act_image);
        image.setImageResource(ActArrayAdapter.items.get(position).drawableId);*/

        ImageView myImageView = (ImageView)rowView.findViewById(R.id.act_image);
        Bitmap bitmap = BitmapFactory.decodeByteArray(getItem(position).getImage() , 0, getItem(position).getImage().length);
        myImageView.setImageBitmap(bitmap);
        return rowView;
    }
}