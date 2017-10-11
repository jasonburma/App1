package burmacodes.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Acts_Now_Activity extends AppCompatActivity {

    private ListView bandsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acts__now_);

        ArrayList<Acts> actsPlaying = new ArrayList<Acts>();
        bandsList = (ListView) findViewById(R.id.acts_now_list);

        Acts act1 = new Acts();
        act1.setName("The Wild Reeds");
        act1.setVenue("Wooly's");

        Acts act2 = new Acts();
        act2.setName("Squidward");
        act2.setVenue("The Krusty Krab");

        actsPlaying.add(act1);
        actsPlaying.add(act2);

        final ActArrayAdapter adapter = new ActArrayAdapter(this, actsPlaying);
        bandsList.setAdapter(adapter);
    }
}
