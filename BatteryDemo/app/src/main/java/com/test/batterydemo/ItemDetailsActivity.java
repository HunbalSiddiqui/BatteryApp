package com.test.batterydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ItemDetailsActivity extends AppCompatActivity {
    ListView DetailsListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
//        Toast.makeText(this, "Good try "+ChoiceActivity.get_selected_device_name(), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "Nice "+ChoiceActivity.get_device_details(), Toast.LENGTH_SHORT).show();
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,ChoiceActivity.get_device_details());
        DetailsListView=findViewById(R.id.DetailsListView);
        DetailsListView.setAdapter(adapter);
    }
}
