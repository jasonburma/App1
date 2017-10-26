package burmacodes.app1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */

public class ActsListFragment extends Fragment {

    private ListView actsList;

    public ActsListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_acts_list, container, false);

        actsList = (ListView) view.findViewById(R.id.acts_now_list);
        MainActivity mainActivity = (MainActivity) this.getActivity();

        ArrayList<Acts> actsPlaying = new ArrayList<Acts>();

        Resources res1 = getResources();
        Drawable drawable1 = res1.getDrawable(R.drawable.bobbyrock);
        Bitmap bitmap1 = ((BitmapDrawable)drawable1).getBitmap();
        ByteArrayOutputStream stream1 = new ByteArrayOutputStream();
        bitmap1.compress(Bitmap.CompressFormat.JPEG, 100, stream1);
        byte[] bitMapData1 = stream1.toByteArray();

        Acts act1 = new Acts();
        act1.setName("BobbyrocK");
        act1.setVenue("Gas Lamp");
        act1.setTime("9:00PM");
        act1.setPrice("Ticket Price: $10");
        act1.setImage(bitMapData1);

        Resources res2 = getResources();
        Drawable drawable2 = res2.getDrawable(R.drawable.casey_muessigmann);
        Bitmap bitmap2 = ((BitmapDrawable)drawable2).getBitmap();
        ByteArrayOutputStream stream2 = new ByteArrayOutputStream();
        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, stream2);
        byte[] bitMapData2 = stream2.toByteArray();

        Acts act2 = new Acts();
        act2.setName("Casey Muessigmann");
        act2.setVenue("Beer Can Alley");
        act2.setTime("9:30PM");
        act2.setPrice("Ticket Price: FREE");
        act2.setImage(bitMapData2);


        Resources res3 = getResources();
        Drawable drawable3 = res3.getDrawable(R.drawable.cults);
        Bitmap bitmap3 = ((BitmapDrawable)drawable3).getBitmap();
        ByteArrayOutputStream stream3 = new ByteArrayOutputStream();
        bitmap3.compress(Bitmap.CompressFormat.JPEG, 100, stream3);
        byte[] bitMapData3 = stream3.toByteArray();

        Acts act3 = new Acts();
        act3.setName("Cults");
        act3.setVenue("Vaudeville Mews");
        act3.setTime("6:00 PM");
        act3.setPrice("Ticket Price: $15");
        act3.setImage(bitMapData3);


        Resources res4 = getResources();
        Drawable drawable4 = res4.getDrawable(R.drawable.dalek);
        Bitmap bitmap4 = ((BitmapDrawable)drawable4).getBitmap();
        ByteArrayOutputStream stream4 = new ByteArrayOutputStream();
        bitmap4.compress(Bitmap.CompressFormat.JPEG, 100, stream4);
        byte[] bitMapData4 = stream4.toByteArray();

        Acts act4 = new Acts();
        act4.setName("Dalek");
        act4.setVenue("The Basement");
        act4.setTime("9:00PM");
        act4.setPrice("Ticket Price: $10");
        act4.setImage(bitMapData4);

        Resources res5 = getResources();
        Drawable drawable5 = res5.getDrawable(R.drawable.des_moines_big_band);
        Bitmap bitmap5 = ((BitmapDrawable)drawable5).getBitmap();
        ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
        bitmap5.compress(Bitmap.CompressFormat.JPEG, 100, stream5);
        byte[] bitMapData5 = stream5.toByteArray();

        Acts act5 = new Acts();
        act5.setName("The Des Moines Big Band");
        act5.setVenue("Noce");
        act5.setTime("7:00 PM");
        act5.setPrice("Ticket Price: $10");
        act5.setImage(bitMapData5);

        Resources res6 = getResources();
        Drawable drawable6 = res6.getDrawable(R.drawable.sole_pursuit);
        Bitmap bitmap6 = ((BitmapDrawable)drawable6).getBitmap();
        ByteArrayOutputStream stream6 = new ByteArrayOutputStream();
        bitmap6.compress(Bitmap.CompressFormat.JPEG, 100, stream6);
        byte[] bitMapData6 = stream6.toByteArray();

        Acts act6 = new Acts();
        act6.setName("The Sole Pursuit");
        act6.setVenue("Lefty's Live Music");
        act6.setTime("9:00PM");
        act6.setPrice("Ticket Price: $5");
        act6.setImage(bitMapData6);


        Resources res7 = getResources();
        Drawable drawable7 = res7.getDrawable(R.drawable.thee_commons);
        Bitmap bitmap7 = ((BitmapDrawable)drawable7).getBitmap();
        ByteArrayOutputStream stream7 = new ByteArrayOutputStream();
        bitmap7.compress(Bitmap.CompressFormat.JPEG, 100, stream7);
        byte[] bitMapData7 = stream7.toByteArray();

        Acts act7 = new Acts();
        act7.setName("Thee Commons");
        act7.setVenue("The Garden Nightclub");
        act7.setTime("7:30 PM");
        act7.setPrice("Ticket Price: $7");
        act7.setImage(bitMapData7);

        actsPlaying.add(act1);
        actsPlaying.add(act2);
        actsPlaying.add(act3);
        actsPlaying.add(act4);
        actsPlaying.add(act5);
        actsPlaying.add(act6);
        actsPlaying.add(act7);

        final ActArrayAdapter adapter = new ActArrayAdapter(getActivity(), actsPlaying);
        actsList.setAdapter(adapter);

        return view;
    }

}