package com.moochiking.assign04_02_6206021621082;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    private static final String[] ACTIVITY_CHOISES = new String[] {
            "Call First Activity" , "Call Second Activity" , "Call Third Activity" , "Exit Multiple Activity"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , ACTIVITY_CHOISES));

        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                switch(position){
                    case 0 :
                        startActivity(new Intent(MainActivity.this , FirstActivity.class));
                        break;
                    case 1 :
                        startActivity(new Intent(MainActivity.this , SecondActivity.class));
                        break;
                    case 2 :
                        startActivity(new Intent(MainActivity.this ,ThridActivity.class));
                        break;
                    case 3 : finish();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}