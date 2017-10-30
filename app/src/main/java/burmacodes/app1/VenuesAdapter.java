package burmacodes.app1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by joely on 10/24/2017.
 */

public class VenuesAdapter extends BaseAdapter{
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Venues> mDataSource;

    public VenuesAdapter(Context context, ArrayList<Venues> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Venues getItem(int position) { return mDataSource.get(position); }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = mInflater.inflate(R.layout.venue_cell, parent, false);

        TextView venue = rowView.findViewById(R.id.venue_name);
        venue.setText(getItem(position).getVenue());

        TextView phone = rowView.findViewById(R.id.phone_number);
        phone.setText(getItem(position).getPhone());

        TextView address = rowView.findViewById(R.id.address);
        address.setText(getItem(position).getAddress());

        TextView location = rowView.findViewById(R.id.relative_location);
        location.setText(getItem(position).getLocation());

        TextView hours = rowView.findViewById(R.id.today_hours);
        hours.setText(getItem(position).getHours());

        TextView web = rowView.findViewById(R.id.website);
        web.setText(getItem(position).getWebsite());





        ImageView myImageView = (ImageView)rowView.findViewById(R.id.venue_image);
        Bitmap bitmap = BitmapFactory.decodeByteArray(getItem(position).getImage() , 0, getItem(position).getImage().length);
        myImageView.setImageBitmap(bitmap);



        return rowView;
    }
}