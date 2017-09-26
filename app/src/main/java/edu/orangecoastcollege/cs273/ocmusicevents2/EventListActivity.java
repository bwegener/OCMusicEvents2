package edu.orangecoastcollege.cs273.ocmusicevents2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.io.IOException;
import java.util.List;

/**
 * This creates the event list activity so that the list
 * which is displayed to users upon launching the app
 * shows the bands in a list as well as the date of the event.
 *
 * @author Brian Wegener
 * @version 1.0
 *
 * Created on 9/26/2017.
 */
public class EventListActivity extends ListActivity {

    private List<MusicEvent> mAllEventsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            mAllEventsList = JSONLoader.loadJSONFromAsset(this);
        }

        catch (IOException e) {
            Log.e("OC Music Events", "Error loading from JSON", e);
        }

        setListAdapter(new EventListAdapter(this, R.layout.music_event_list_item, mAllEventsList));
    }

    /**
     * This dictates what happens when one of the items in teh list is clicked.
     *
     * @param l the listView
     * @param v the specific view
     * @param position the position on the list
     * @param id the id of what is clicked
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        Intent detailsIntent = new Intent(this, EventDetailsActivity.class);
        MusicEvent selectedEvent = mAllEventsList.get(position);

        detailsIntent.putExtra("Title", selectedEvent.getTitle());
        detailsIntent.putExtra("Date", selectedEvent.getDate());
        detailsIntent.putExtra("Day", selectedEvent.getDay());
        detailsIntent.putExtra("Time", selectedEvent.getTime());
        detailsIntent.putExtra("Location", selectedEvent.getLocation());
        detailsIntent.putExtra("Address1", selectedEvent.getAddress1());
        detailsIntent.putExtra("Address2", selectedEvent.getAddress2());
        detailsIntent.putExtra("ImageName", selectedEvent.getImageName());

        startActivity(detailsIntent);
    }
}
