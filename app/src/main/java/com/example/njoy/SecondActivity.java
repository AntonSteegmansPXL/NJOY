package com.example.njoy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button openMapBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);  //BACKEND FOR BACK BUTTON!

        openMapBtn = (Button) findViewById(R.id.openMapBtn);
        openMapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, MapsActivity.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemThatWasClickedId = item.getItemId();
        if (itemThatWasClickedId == R.id.action_search) {
            Context context = SecondActivity.this;
            String textToShow = "Search clicked";
            Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemThatWasClickedId == R.id.action_help) {
            Context context = SecondActivity.this;
            String textToShow = "Help clicked";
            Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemThatWasClickedId == R.id.action_settings) {
            startActivity(new Intent(SecondActivity.this, SettingsActivity.class));
            Context context = SecondActivity.this;
            String textToShow = "Opening settings";
            Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
        }


        if (item.getItemId() == android.R.id.home) {         //BACKEND FOR BACK BUTTON!
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}