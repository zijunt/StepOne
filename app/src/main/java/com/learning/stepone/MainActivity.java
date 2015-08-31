package com.learning.stepone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.learning.stepone.model.Photo;
import com.learning.stepone.model.PhotoPage;
import com.learning.stepone.model.TestData;

import java.util.List;

/**
 * The main screen will show:
 * 1) Empty Text and Button when there is nothing in the list
 * 2) When the button for the empty view is selected, then shows the list of photos with a
 * thumbnail and the title of the image
 */
public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private Button emptyButton;
    List<Photo> photoList;
    PhotoListAdapter photoListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView)findViewById(R.id.listView);
        mListView.setEmptyView(findViewById(R.id.emptyInfoLayout));



        //botton
        emptyButton = (Button) findViewById(R.id.Button01);


        Gson gson = new Gson();
        PhotoPage flickrPhotos = gson.fromJson(TestData.testData, PhotoPage.class);
        photoListAdapter = new PhotoListAdapter(this, flickrPhotos.getPhoto());
        Log.i("out",flickrPhotos.getPhoto().toString());

        emptyButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mListView.setAdapter(photoListAdapter);
                photoListAdapter.notifyDataSetChanged();
            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // go to the photo details screen
                Toast.makeText(MainActivity.this, photoList.get(position).getPhotoUrlThumbNail(), Toast.LENGTH_LONG)
                        .show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
