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

        Acts act1 = new Acts();
        act1.setName("BobbyrocK");
        act1.setVenue("Gas Lamp");
        act1.setTime("9:00PM");
        act1.setPrice("Ticket Price: $10");

        Acts act2 = new Acts();
        act2.setName("Casey Muessigmann");
        act2.setVenue("Beer Can Alley");
        act2.setTime("9:30PM");
        act2.setPrice("Ticket Price: FREE");

        Acts act3 = new Acts();
        act3.setName("Cults");
        act3.setVenue("Vaudeville Mews");
        act3.setTime("6:00 PM");
        act3.setPrice("Ticket Price: $15");

        Acts act4 = new Acts();
        act4.setName("Dalek");
        act4.setVenue("The Basement");
        act4.setTime("9:00PM");
        act4.setPrice("Ticket Price: $10");

        Acts act5 = new Acts();
        act5.setName("The Des Moines Big Band");
        act5.setVenue("Noce");
        act5.setTime("7:00 PM");
        act5.setPrice("Ticket Price: $10");

        Acts act6 = new Acts();
        act6.setName("The Sole Pursuit");
        act6.setVenue("Lefty's Live Music");
        act6.setTime("9:00PM");
        act6.setPrice("Ticket Price: $5");

        Acts act7 = new Acts();
        act7.setName("Thee Commons");
        act7.setVenue("The Garden Nightclub");
        act7.setTime("7:30 PM");
        act7.setPrice("Ticket Price: $7");

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