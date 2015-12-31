package org.esiea.navaratnam_nirosan_ramrami_lamya.myapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.mipmap.voyage4);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "En cours de maintenance " +
                        " Contact:nnavaratnam@et.esiea.fr", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void Lastminute(View view){
        Context context = getApplicationContext();
        CharSequence text="Veuillez patienter";
        int duration= Toast.LENGTH_SHORT;

        Toast toast=Toast.makeText(context,text,duration);

        toast.show();

        Button button = ( Button) view ;
        startActivity(new Intent(getApplicationContext(), lastminute.class));



    }
    public void Londres(View view){
        Context context = getApplicationContext();
        CharSequence text="Veuillez patienter";
        int duration= Toast.LENGTH_SHORT;

        Toast toast=Toast.makeText(context,text,duration);

        toast.show();

        Button button = ( Button) view ;
        startActivity(new Intent(getApplicationContext(), LONDRES.class));



    }

    public void Helpx(View view){
        Context context = getApplicationContext();
        CharSequence text="Veuillez patienter";
        int duration= Toast.LENGTH_SHORT;

        Toast toast=Toast.makeText(context,text,duration);

        toast.show();

        Button button = ( Button) view ;
        startActivity(new Intent(getApplicationContext(), helpx.class));



    }





}
