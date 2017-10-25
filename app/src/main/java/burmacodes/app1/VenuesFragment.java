package burmacodes.app1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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

        Venues venue1 = new Venues();
        venue1.setVenue("Beer Can Alley");

        Venues venue2 = new Venues();
        venue2.setVenue("Blue Moon Duelling Pianos");

        Venues venue3 = new Venues();
        venue3.setVenue("Gas Lamp");

        Venues venue4 = new Venues();
        venue4.setVenue("Greenwood Lounge");

        Venues venue5 = new Venues();
        venue5.setVenue("Lefty's Live Music");

        Venues venue6 = new Venues();
        venue6.setVenue("Louie's Wine Dive");

        Venues venue7 = new Venues();
        venue7.setVenue("Noce");

        Venues venue8 = new Venues();
        venue8.setVenue("Seven Flags Event Center");

        Venues venue9 = new Venues();
        venue9.setVenue("The Basement");

        Venues venue10 = new Venues();
        venue10.setVenue("The Garden Nightclub");

        Venues venue11 = new Venues();
        venue11.setVenue("The Rooftop");

        Venues venue12 = new Venues();
        venue12.setVenue("Val Air Ballroom");

        Venues venue13 = new Venues();
        venue13.setVenue("Vaudeville Mews");

        Venues venue14 = new Venues();
        venue14.setVenue("Vino209");

        Venues venue15 = new Venues();
        venue15.setVenue("Wooly's");

        venuesPlaying.add(venue1);
        venuesPlaying.add(venue2);
        venuesPlaying.add(venue3);
        venuesPlaying.add(venue4);
        venuesPlaying.add(venue5);
        venuesPlaying.add(venue6);
        venuesPlaying.add(venue7);
        venuesPlaying.add(venue8);
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
