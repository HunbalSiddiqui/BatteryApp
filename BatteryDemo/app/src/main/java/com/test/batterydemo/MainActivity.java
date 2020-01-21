package com.test.batterydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button ProceedBtn,AddNewBatterBtn;
    private static ArrayList<String> BatteriesName;
    private static Battery toshiba,Osaka,Excide;
    private ListView BatteryList;
    private LinearLayout PopUpLinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetDefaultBatteries();
        BatteryList=findViewById(R.id.BatteryList);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,BatteriesName);
        BatteryList.setAdapter(adapter);
        ProceedBtn=findViewById(R.id.ProceedBtn);

        PopUpLinearLayout=findViewById(R.id.PopUpLinearLayout);

        ProceedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Proceed();
            }
        });

        AddNewBatterBtn=findViewById(R.id.AddNewBatterBtn);

        AddNewBatterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopUpLinearLayout.setVisibility(View.VISIBLE);
            }
        });
    }

    private void Proceed()
    {
        Intent intent=new Intent(MainActivity.this,ChoiceActivity.class);
        startActivity(intent);
        finish();
    }

    private void SetDefaultBatteries(){
        BatteriesName=new ArrayList<>();
        toshiba =new Battery();
        toshiba.setVoltage(10);
        toshiba.setCost(40);
        toshiba.setName("Toshiba Battery");
        BatteriesName.add(toshiba.getName());
        Osaka =new Battery();
        Osaka.setVoltage(5);
        Osaka.setCost(20);
        Osaka.setName("Osaka Battery");
        BatteriesName.add(Osaka.getName());
        Excide =new Battery();
        Excide.setVoltage(5);
        Excide.setCost(20);
        Excide.setName("Excide Battery");
        BatteriesName.add(Excide.getName());
    }
}
