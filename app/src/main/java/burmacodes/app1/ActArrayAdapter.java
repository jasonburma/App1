package burmacodes.app1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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

        TextView act = rowView.findViewById(R.id.act_label);
        act.setText(getItem(position).getName());

        TextView venue = rowView.findViewById(R.id.venue_label);
        venue.setText(getItem(position).getVenue());

        return rowView;
    }

}
