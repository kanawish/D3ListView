package com.district3.d3listview;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends Activity {

    public static final String TAG = MainActivity.class.getSimpleName(); // == "MainActivity"

    String[] valuesArray = new String[] { "Alice", "Bob", "Charles" };

    // This is the Adapter being used to display the list's data
    ArrayAdapter<String> adapter;

    private ListView listView;

    private Button restButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // http://developer.android.com/guide/topics/ui/layout/listview.html
        listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, valuesArray);
        listView.setAdapter(adapter);

        restButton = (Button) findViewById(R.id.restButton);
        restButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: our Retrofit REST call
                RestAdapter restAdapter = new RestAdapter.Builder()
                        .setEndpoint("https://api.github.com")
                        .build();
                GitHubService service = restAdapter.create(GitHubService.class);

                service.listRepos("kanawish", new Callback<List<Repo>>() {
                    @Override
                    public void success(List<Repo> repos, Response response) {
                        Log.d(TAG,"we have "+repos.size()+"repos");
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.d(TAG,"we had an error repos");
                    }
                });


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
