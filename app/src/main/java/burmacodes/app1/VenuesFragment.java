package burmacodes.app1;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class VenuesFragment extends Fragment {

    private ListView venuesList;

    public VenuesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_venues, container, false);

        venuesList = (ListView) view.findViewById(R.id.venues_list);
        MainActivity mainActivity = (MainActivity) this.getActivity();

        ArrayList<Venues> venuesPlaying = new ArrayList<Venues>();

        Resources res1 = getResources();
        Drawable drawable1 = res1.getDrawable(R.drawable.beer_can_alley);
        Bitmap bitmap1 = ((BitmapDrawable)drawable1).getBitmap();
        ByteArrayOutputStream stream1 = new ByteArrayOutputStream();
        bitmap1.compress(Bitmap.CompressFormat.JPEG, 100, stream1);
        byte[] bitMapData1 = stream1.toByteArray();

        Venues venue1 = new Venues();
        venue1.setVenue("Beer Can Alley");
        venue1.setImage(bitMapData1);
        venue1.setLocation(".3 miles");
        venue1.setAddress("216 Court Ave. Des Moines, IA");
        venue1.setPhone("(515)875-4958");
        venue1.setHours("7pm - 2am");
        venue1.setWebsite("http://bit.ly/2gYSLLf");



        Resources res2 = getResources();
        Drawable drawable2 = res2.getDrawable(R.drawable.blue_moon_duelling_pianos);
        Bitmap bitmap2 = ((BitmapDrawable)drawable2).getBitmap();
        ByteArrayOutputStream stream2 = new ByteArrayOutputStream();
        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, stream2);
        byte[] bitMapData2 = stream1.toByteArray();


        Venues venue2 = new Venues();
        venue2.setVenue("Blue Moon Duelling Pianos");
        venue2.setImage(bitMapData2);
        venue2.setLocation(".3 miles");
        venue2.setAddress("5485 Mills Civic Pkwy Des Moines, IA");
        venue2.setPhone("(515)564-7300");
        venue2.setHours("7pm - 2am");
        venue2.setWebsite("http://bit.ly/2zZtk0R");

        Resources res3 = getResources();
        Drawable drawable3 = res3.getDrawable(R.drawable.gas_lamp);
        Bitmap bitmap3 = ((BitmapDrawable)drawable3).getBitmap();
        ByteArrayOutputStream stream3 = new ByteArrayOutputStream();
        bitmap3.compress(Bitmap.CompressFormat.JPEG, 100, stream3);
        byte[] bitMapData3 = stream3.toByteArray();


        Venues venue3 = new Venues();
        venue3.setVenue("Gas Lamp");
        venue3.setImage(bitMapData3);
        venue3.setLocation(".3 miles");
        venue3.setAddress("1501 Grand Ave. Des Moines, IA");
        venue3.setPhone("(515)280-3778");
        venue3.setHours("7pm - 2am");
        venue3.setWebsite("http://bit.ly/2yY3Bs4");

        Resources res4 = getResources();
        Drawable drawable4 = res4.getDrawable(R.drawable.greenwood_lounge);
        Bitmap bitmap4 = ((BitmapDrawable)drawable4).getBitmap();
        ByteArrayOutputStream stream4 = new ByteArrayOutputStream();
        bitmap4.compress(Bitmap.CompressFormat.JPEG, 100, stream4);
        byte[] bitMapData4 = stream4.toByteArray();


        Venues venue4 = new Venues();
        venue4.setVenue("Greenwood Lounge");
        venue4.setImage(bitMapData4);
        venue4.setLocation(".3 miles");
        venue4.setAddress("3707 Ingersoll Ave. Des Moines, IA");
        venue4.setPhone("(515)277-1219");
        venue4.setHours("7pm - 2am");
        venue4.setWebsite("");

        Resources res5 = getResources();
        Drawable drawable5 = res5.getDrawable(R.drawable.leftys_live_music);
        Bitmap bitmap5 = ((BitmapDrawable)drawable5).getBitmap();
        ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
        bitmap5.compress(Bitmap.CompressFormat.JPEG, 100, stream5);
        byte[] bitMapData5 = stream5.toByteArray();


        Venues venue5 = new Venues();
        venue5.setVenue("Lefty's Live Music");
        venue5.setImage(bitMapData5);
        venue5.setLocation(".3 miles");
        venue5.setAddress("2307 University Ave. Des Moines, IA");
        venue5.setPhone("");
        venue5.setHours("7pm - 2am");
        venue5.setWebsite("http://bit.ly/2gOtZKg");

        Resources res6 = getResources();
        Drawable drawable6 = res6.getDrawable(R.drawable.louies_wine_dive);
        Bitmap bitmap6 = ((BitmapDrawable)drawable6).getBitmap();
        ByteArrayOutputStream stream6 = new ByteArrayOutputStream();
        bitmap6.compress(Bitmap.CompressFormat.JPEG, 100, stream6);
        byte[] bitMapData6 = stream6.toByteArray();


        Venues venue6 = new Venues();
        venue6.setVenue("Louie's Wine Dive");
        venue6.setImage(bitMapData6);
        venue6.setLocation(".3 miles");
        venue6.setAddress("4040 University Ave. Ste A Des Moines, IA");
        venue6.setPhone("(515)777-3416");
        venue6.setHours("7pm - 2am");
        venue6.setWebsite("http://bit.ly/2oy0U72");

        Resources res7 = getResources();
        Drawable drawable7 = res7.getDrawable(R.drawable.noce);
        Bitmap bitmap7 = ((BitmapDrawable)drawable7).getBitmap();
        ByteArrayOutputStream stream7 = new ByteArrayOutputStream();
        bitmap7.compress(Bitmap.CompressFormat.JPEG, 100, stream7);
        byte[] bitMapData7 = stream7.toByteArray();


        Venues venue7 = new Venues();
        venue7.setVenue("Noce");
        venue7.setImage(bitMapData7);
        venue7.setLocation(".3 miles");
        venue7.setAddress("1326 Walnut St. Des Moines, IA");
        venue7.setPhone("(515)244-5399");
        venue7.setHours("7pm - 2am");
        venue7.setWebsite("http://bit.ly/2yfelT5");

        Resources res9 = getResources();
        Drawable drawable9 = res9.getDrawable(R.drawable.the_basement);
        Bitmap bitmap9 = ((BitmapDrawable)drawable9).getBitmap();
        ByteArrayOutputStream stream9 = new ByteArrayOutputStream();
        bitmap9.compress(Bitmap.CompressFormat.JPEG, 100, stream9);
        byte[] bitMapData9 = stream9.toByteArray();


        Venues venue9 = new Venues();
        venue9.setVenue("The Basement");
        venue9.setImage(bitMapData9);
        venue9.setLocation(".3 miles");
        venue9.setAddress("901 Cherry St. Des Moines, IA");
        venue9.setPhone("(515)369-3672");
        venue9.setHours("7pm - 2am");
        venue9.setWebsite("http://bit.ly/2A0zzBm");

        Resources res10 = getResources();
        Drawable drawable10 = res10.getDrawable(R.drawable.the_garden_nightclub);
        Bitmap bitmap10 = ((BitmapDrawable)drawable10).getBitmap();
        ByteArrayOutputStream stream10 = new ByteArrayOutputStream();
        bitmap10.compress(Bitmap.CompressFormat.JPEG, 100, stream10);
        byte[] bitMapData10 = stream10.toByteArray();


        Venues venue10 = new Venues();
        venue10.setVenue("The Garden Nightclub");
        venue10.setImage(bitMapData10);
        venue10.setLocation(".3 miles");
        venue10.setAddress("112 SE 4th St. Des Moines, IA");
        venue10.setPhone("");
        venue10.setHours("7pm - 2am");
        venue10.setWebsite("http://bit.ly/2yYiCaR");

        Resources res11 = getResources();
        Drawable drawable11 = res11.getDrawable(R.drawable.the_rooftop);
        Bitmap bitmap11 = ((BitmapDrawable)drawable11).getBitmap();
        ByteArrayOutputStream stream11 = new ByteArrayOutputStream();
        bitmap11.compress(Bitmap.CompressFormat.JPEG, 100, stream11);
        byte[] bitMapData11 = stream11.toByteArray();


        Venues venue11 = new Venues();
        venue11.setVenue("The Rooftop");
        venue11.setImage(bitMapData11);
        venue11.setLocation(".3 miles");
        venue11.setAddress("900 Mulberry St. Des Moines, IA");
        venue11.setPhone("(515)369-3672");
        venue11.setHours("7pm - 2am");
        venue11.setWebsite("http://bit.ly/2ltOpxo");

        Resources res12 = getResources();
        Drawable drawable12 = res12.getDrawable(R.drawable.val_air_ballroom);
        Bitmap bitmap12 = ((BitmapDrawable)drawable12).getBitmap();
        ByteArrayOutputStream stream12 = new ByteArrayOutputStream();
        bitmap12.compress(Bitmap.CompressFormat.JPEG, 100, stream12);
        byte[] bitMapData12 = stream12.toByteArray();


        Venues venue12 = new Venues();
        venue12.setVenue("Val Air Ballroom");
        venue12.setImage(bitMapData12);
        venue12.setLocation(".3 miles");
        venue12.setAddress("301 Ashworth Rd. Des Moines, IA");
        venue12.setPhone("(515)223-6152");
        venue12.setHours("7pm - 2am");
        venue12.setWebsite("");

        Resources res13 = getResources();
        Drawable drawable13 = res13.getDrawable(R.drawable.vaudeville_mews);
        Bitmap bitmap13 = ((BitmapDrawable)drawable13).getBitmap();
        ByteArrayOutputStream stream13 = new ByteArrayOutputStream();
        bitmap13.compress(Bitmap.CompressFormat.JPEG, 100, stream13);
        byte[] bitMapData13 = stream13.toByteArray();


        Venues venue13 = new Venues();
        venue13.setVenue("Vaudeville Mews");
        venue13.setImage(bitMapData13);
        venue13.setLocation(".3 miles");
        venue13.setAddress("212 4th St. Des Moines, IA");
        venue13.setPhone("(515)243-3270");
        venue13.setHours("7pm - 2am");
        venue13.setWebsite("http://bit.ly/2z2B1VO");

        Resources res14 = getResources();
        Drawable drawable14 = res14.getDrawable(R.drawable.vino209);
        Bitmap bitmap14 = ((BitmapDrawable)drawable14).getBitmap();
        ByteArrayOutputStream stream14 = new ByteArrayOutputStream();
        bitmap14.compress(Bitmap.CompressFormat.JPEG, 100, stream14);
        byte[] bitMapData14 = stream14.toByteArray();


        Venues venue14 = new Venues();
        venue14.setVenue("Vino209");
        venue14.setImage(bitMapData14);
        venue14.setLocation(".3 miles");
        venue14.setAddress("209 5th St. Des Moines, IA");
        venue14.setPhone("515-255-1209");
        venue14.setHours("7pm - 2am");
        venue14.setWebsite("http://bit.ly/2iL5B08");

        Resources res15 = getResources();
        Drawable drawable15 = res15.getDrawable(R.drawable.woolys);
        Bitmap bitmap15 = ((BitmapDrawable)drawable15).getBitmap();
        ByteArrayOutputStream stream15 = new ByteArrayOutputStream();
        bitmap15.compress(Bitmap.CompressFormat.JPEG, 100, stream15);
        byte[] bitMapData15 = stream15.toByteArray();


        Venues venue15 = new Venues();
        venue15.setVenue("Wooly's");
        venue15.setImage(bitMapData15);
        venue15.setLocation(".3 miles");
        venue15.setAddress("504 E Locust St. Des Moines, IA");
        venue15.setPhone("(515)244-0550");
        venue15.setHours("7pm - 2am");
        venue15.setWebsite("http://bit.ly/1B2Au1o");

        venuesPlaying.add(venue1);
        venuesPlaying.add(venue2);
        venuesPlaying.add(venue3);
        venuesPlaying.add(venue4);
        venuesPlaying.add(venue5);
        venuesPlaying.add(venue6);
        venuesPlaying.add(venue7);
        venuesPlaying.add(venue9);
        venuesPlaying.add(venue10);
        venuesPlaying.add(venue11);
        venuesPlaying.add(venue12);
        venuesPlaying.add(venue13);
        venuesPlaying.add(venue14);
        venuesPlaying.add(venue15);

        final VenuesAdapter adapter = new VenuesAdapter(getActivity(), venuesPlaying);
        venuesList.setAdapter(adapter);

        return view;
    }

}
