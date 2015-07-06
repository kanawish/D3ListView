package com.district3.d3listview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.district3.d3listview.model.Repo;
import com.district3.d3listview.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends Activity {

    public static final String TAG = MainActivity.class.getSimpleName(); // == "MainActivity"
    public static final String NAME = "name";
    public static final String URL = "url";

    String[] valuesArray = new String[] { "Alice", "Bob", "Charles" };

    // This is the Adapter being used to display the list's data
    ArrayAdapter<String> adapter;

    private ListView listView;

    private Button getUserButton;
    private SimpleAdapter simpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // http://developer.android.com/guide/topics/ui/layout/listview.html
        listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG,String.format("List item was clicked, %d, %d ", position, id) );
                // http://developer.android.com/training/basics/firstapp/starting-activity.html
                Map<String,String> map = (Map<String, String>) simpleAdapter.getItem((int) id);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
            }
        });

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, valuesArray);
        listView.setAdapter(adapter);

        getUserButton = (Button) findViewById(R.id.getUserButton);
        getUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // our Retrofit REST call
                RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("https://api.github.com")
                    .build();
                GitHubService service = restAdapter.create(GitHubService.class);
                service.user("kanawish", new Callback<User>() {
                    @Override
                    public void success(User user, Response response) {
                        Log.d(TAG, "User: " + user.getId());
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.d(TAG, "we had an error repos");
                    }
                });
            }
        });

        Button getReposButton = (Button) findViewById(R.id.getReposButton);
        getReposButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // our Retrofit REST call
                RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("https://api.github.com")
                    .build();
                GitHubService service = restAdapter.create(GitHubService.class);
                service.listRepos("kanawish", new Callback<List<Repo>>() {
                    @Override
                    public void success(List<Repo> repos, Response response) {
                        // http://www.vogella.com/tutorials/AndroidListView/article.html
                        Log.d(TAG, "Repo count: " + repos.size());

                        String[] from = {NAME, URL};
                        int[] to = { android.R.id.text1, android.R.id.text2 };

                        ArrayList<Map<String, String>> content = build(repos);
                        simpleAdapter = new SimpleAdapter(
                            MainActivity.this, content,
                            android.R.layout.simple_list_item_2,
                            from, to);

                        listView.setAdapter(simpleAdapter);
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.d(TAG, "we had an error repos");
                    }
                });
            }
        });
    }

    public ArrayList<Map<String,String>> build(List<Repo> repos) {
        // Creating an empty list of Maps.
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        // I'm iterating over repos
        for(Repo repo:repos) {
            // Extracting interesting strings from our current repo.
            list.add(putData(repo.getFullName(), repo.getGitUrl()));
        }

        // The list we'll be using with our adapter.
        return list;
    }

    private Map<String, String> putData(String name, String url) {
        HashMap<String, String> item = new HashMap<String, String>();
        // We're using the same keys we'll be giving the Adapter.
        item.put(NAME, name);
        item.put(URL, url);
        return item;
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
