package com.example.a6_toolbar1;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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

        switch (id){
            case R.id.menu1:
                Snackbar.make(MainActivity.this.findViewById(R.id.col), "menu1 chosen", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;

            case R.id.menu2:
                break;

            case R.id.action_settings:
                Snackbar.make(MainActivity.this.findViewById(R.id.col), "settings chosen", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
            case R.id.action_help:
                //pop a dialog
                showDialogWithContentAndTitle("Made by me", "Help about");
                break;

        }
        return super.onOptionsItemSelected(item);   //default
    }

    private void showDialogWithContentAndTitle(String content, String title) {
    new AlertDialog.Builder(this)
            .setMessage(content)
            .setTitle(title)
            .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            })
            .create()
            .show();
    }
}
