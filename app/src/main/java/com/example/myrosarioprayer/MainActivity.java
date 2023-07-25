package com.example.myrosarioprayer;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.myrosarioprayer.databinding.ActivityMainBinding;
import com.example.myrosarioprayer.support.RosarioActions;
import com.example.myrosarioprayer.support.RosarioResourceLoader;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private AppBarConfiguration appBarConfiguration;

    private ActivityMainBinding binding;

    private Spinner spinner;
    private static final String[] spinnerComboItem = {"Misteri di GPII", "Mistero del Giorno", "Invocazione Santa Rita", "Misteri del Vaticano"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);*/

        super.onCreate(savedInstanceState);

        RosarioResourceLoader.init(this);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        setSupportActionBar(binding.toolbar);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item, spinnerComboItem);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

//                System.out.println( "DEBUG: "+ERosarioSymbol.SYM_AVE.testoPreghiera );


                LayoutInflater inflater = getLayoutInflater();
                View myView1 = inflater.inflate(R.layout.fragment_rv01, null);
                View myView2 = inflater.inflate(R.layout.fragment_rv02, null);
                View myView3 = inflater.inflate(R.layout.fragment_rv03, null);
                View myView4 = inflater.inflate(R.layout.fragment_rv04, null);
                TextView myTextView1 = (TextView) findViewById(R.id.textview_first);
                TextView myTextView2 = (TextView) findViewById(R.id.textview_second);
                TextView myTextView3 = (TextView) findViewById(R.id.textview_third);
                TextView myTextView4 = (TextView) findViewById(R.id.textview_fourth);

                //RosarioActions.agisciUno(myTextView1, myTextView2);
                RosarioActions.clearRosario(myTextView1, myTextView2, myTextView3, myTextView4);

            }
        });

        binding.stealthDarkMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = getLayoutInflater();
                View myView1 = inflater.inflate(R.layout.fragment_rv01, null);
                View myView2 = inflater.inflate(R.layout.fragment_rv02, null);
                TextView myTextView2 = (TextView) findViewById(R.id.textview_first);
                TextView myTextView1 = (TextView) findViewById(R.id.textview_second);
                FloatingActionButton floatingActionButton1 = (FloatingActionButton) findViewById(R.id.fab);
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(R.id.stealth_dark_mode);
                Button buttonFirstAction = (Button) findViewById(R.id.button_first_action);
                Button buttonSecondAction = (Button) findViewById(R.id.button_second_action);
                Spinner spinner1 = (Spinner) findViewById(R.id.spinner);

                floatingActionButton1.setBackgroundTintList(ColorStateList.valueOf( Color.parseColor("#00092F") ));
                floatingActionButton2.setBackgroundTintList(ColorStateList.valueOf( Color.parseColor("#00092F") ));


                androidx.appcompat.widget.Toolbar toolbar1 = (androidx.appcompat.widget.Toolbar) findViewById(R.id.app_tool_bar);

                binding.getRoot().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));
                if (buttonFirstAction!=null) getSupportActionBar().setTitle( Html.fromHtml("<font color=\"#00067F\">" + getString(R.string.rv01_fragment_label) + "</font>") );
                else getSupportActionBar().setTitle( Html.fromHtml("<font color=\"#00067F\">" + getString(R.string.rv02_fragment_label) + "</font>") );
                toolbar1.setTitleTextColor( Color.parseColor("#00067F") );
                toolbar1.setBackgroundColor(Color.parseColor("#000000"));

                if (buttonFirstAction!=null) buttonFirstAction.setBackgroundColor( Color.parseColor("#00061F") );
                if (buttonFirstAction!=null) buttonFirstAction.setTextColor( Color.parseColor("#00067F") );
                if (buttonSecondAction!=null) buttonSecondAction.setBackgroundColor( Color.parseColor("#00061F") );
                if (buttonSecondAction!=null) buttonSecondAction.setTextColor( Color.parseColor("#00067F") );

                ((TextView) spinner1.getChildAt(0)).setTextColor( Color.parseColor("#00067F") );

                floatingActionButton1.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00061F")));

                if (myTextView1!=null) {
                    myTextView1.setBackground( getResources().getDrawable(R.drawable.rounded_corner_dark) );
                    //myTextView1.setTextColor(Color.parseColor("#00005F"));
                }

                if (myTextView2!=null) {
                    myTextView2.setBackground(getResources().getDrawable(R.drawable.rounded_corner_dark));
                    myTextView2.setTextColor(Color.parseColor("#00009F"));
                }

                //RosarioActions.agisciUno(myTextView1, myTextView2);
                //RosarioActions.clearRosario(myTextView1, myTextView2);

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

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View v, int position, long id) {
        switch (position) {
            case 0:
                Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
                break;

            case 1:
                Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);

                break;
            case 2:
                Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main)
                        .navigate(R.id.action_Fragment_to_ThirdFragment);

            case 3:
                Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main)
                        .navigate(R.id.action_Fragment_to_FourthFragment);

                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}