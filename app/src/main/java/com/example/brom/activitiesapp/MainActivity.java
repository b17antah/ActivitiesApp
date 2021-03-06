package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mountainLocations = {"Alps","Alps","Alaska"};
    private int[] mountainHeights ={4478,4808,6190};
    // Create ArrayLists from the raw data above and use these lists when populating your ListView.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("brom","onCreate() called.");

        List<String> MountainList = new ArrayList<String>(Arrays.asList(mountainNames));

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),R.layout.content_mountain_details,
                R.id.textForMountain, MountainList);

        ListView myListView = (ListView)findViewById(R.id.my_listview);
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = new Intent(getApplicationContext(), MountainDetailsActivity.class);
                intent.putExtra("MountainName", mountainNames[position]);
                intent.putExtra("MountainHeight", Integer.toString(mountainHeights[position]));
                intent.putExtra("MountainLocation", mountainLocations[position]);
                startActivity(intent);
               // Toast.makeText(getApplicationContext(), mountainNames[position]+" is in the "+mountainLocations[position]+" category and has a height of "+Integer.toString(mountainHeights[position])+"m", Toast.LENGTH_LONG).show();
            }
        });


        // 1. Create a ListView as in previous assignment
        // 2. Create a new activity named "MountainDetailsActivity
        // 3. Create a new Layout file for the MountainDetailsActivity called
        //    "activity_mountaindetails". MountainDetailsActivity must have MainActivity as its
        //    ´parent activity.
        // 4. The layout file created in step 3 must have a LinearLayout
        // 5. The layout file created in step 3 must be able to display
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 6. When tapping on a list item: create an Intent that includes
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 7. Display the MountainDetailsActivity with the data from the Intent created in step
        //    6
        // 8. From the MountainDetailsActivity you should have an option to "go back" using an
        //    left arro button. This is done by letting the MainActivity be the parent activity to
        //    MountainDetailsActivity.
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("brom","onPause() called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("brom","onResume() called.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("brom","onStart() called.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("brom","onStop() called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("brom","onDestroy() called.");
    }
}
