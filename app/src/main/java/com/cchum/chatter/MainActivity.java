package com.cchum.chatter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    ChatterRecyclerViewAdapter mAdapter;
    ArrayList<ChatterModel> chats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.rvChats);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        chats = new ArrayList<>(getChats());
        mAdapter = new ChatterRecyclerViewAdapter(this, chats);
        mRecyclerView.setAdapter(mAdapter);

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

    private ArrayList<ChatterModel> getChats() {
        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.img_kp);
        ArrayList<ChatterModel> chats = new ArrayList<>();
        chats.add(new ChatterModel("Kolapo", "Ozone Cimenams is shutting down", "10m", bm));
        chats.add(new ChatterModel("Kolapo", "Ozone Cimenams is shutting down", "10m", bm));
        chats.add(new ChatterModel("Kolapo", "Ozone Cimenams is shutting down", "10m", bm));
        chats.add(new ChatterModel("Kolapo", "Ozone Cimenams is shutting down", "10m", bm));
        chats.add(new ChatterModel("Kolapo", "Ozone Cimenams is shutting down", "10m", bm));
        chats.add(new ChatterModel("Kolapo", "Ozone Cimenams is shutting down", "10m", bm));


        return  chats;
    }

}
