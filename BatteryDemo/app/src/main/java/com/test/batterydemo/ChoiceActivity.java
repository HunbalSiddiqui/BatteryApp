package com.test.batterydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ChoiceActivity extends AppCompatActivity  implements View.OnClickListener {
    private Button L1B1,L1B2,L2B1,L2B2,L3B1,L3B2,AddNewBatteryBtn;
    private ArrayList<Button> BtnArr;
    private static String selected_device_name="";
    private static ElectronicItem item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        L1B1=findViewById(R.id.L1B1);
        L1B2=findViewById(R.id.L1B2);
        L2B1=findViewById(R.id.L2B1);
        L2B2=findViewById(R.id.L2B2);
        L3B1=findViewById(R.id.L3B1);
        L3B2=findViewById(R.id.L3B2);

        BtnArr=new ArrayList<>();

        L1B1.setOnClickListener(this);BtnArr.add(L1B1);
        L1B2.setOnClickListener(this);BtnArr.add(L1B2);
        L2B1.setOnClickListener(this);BtnArr.add(L2B1);
        L2B2.setOnClickListener(this);BtnArr.add(L2B2);
        L3B1.setOnClickListener(this);BtnArr.add(L3B1);
        L3B2.setOnClickListener(this);BtnArr.add(L3B2);

        AddNewBatteryBtn=findViewById(R.id.AddNewBatteryBtn);

        AddNewBatteryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ChoiceActivity.this,ItemDetailsActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.L1B1:
                SetColors(L1B1);
                SetDevice("Mobile",2,5,3,4,4,"XYZ Category","XYZ ITEM TYPE");
                break;
            case R.id.L1B2:
                SetColors(L1B2);
                SetDevice("Laptop",2,5,3,4,4,"XYZ Category","XYZ ITEM TYPE");
                break;
            case R.id.L2B1:
                SetColors(L2B1);
                SetDevice("Clock",2,5,3,4,4,"XYZ Category","XYZ ITEM TYPE");
                break;
            case R.id.L2B2:
                SetColors(L2B2);
                SetDevice("Calculator",2,5,3,4,4,"XYZ Category","XYZ ITEM TYPE");
                break;
            case R.id.L3B1:
                SetColors(L3B1);
                SetDevice("Toy Car",2,5,3,4,4,"XYZ Category","XYZ ITEM TYPE");
                break;
            case R.id.L3B2:
                SetColors(L3B2);
                SetDevice("Tv-Remote",2,5,3,4,4,"XYZ Category","XYZ ITEM TYPE");
                break;
        }//Switch end
    }//OnClick end

private void SetColors(Button ID)
        {
            ID.setBackgroundColor(Color.WHITE);
            ID.setTextColor(Color.BLACK);
            selected_device_name=ID.getText().toString();
            BtnArr.remove(ID);
            for(int i=0;i<BtnArr.size();i++)
            {
                BtnArr.get(i).setBackgroundColor(Color.parseColor("#00574B"));
                BtnArr.get(i).setTextColor(Color.WHITE);
            }
            BtnArr.add(ID);
            AddNewBatteryBtn.setText("Proceed");
            Toast.makeText(this, "Click To Proceed With "+selected_device_name, Toast.LENGTH_SHORT).show();
        }


private void SetDevice(String Name,float Consumption,float Amp,float Volt,
        float Height,float Width,String Category,String ItemType)
        {
            item=new ElectronicItem();
            item.setName(Name);item.setConsumption(Consumption);item.setAmpere(Amp);
            item.setVolt(Volt);item.setHeight(Height);item.setWidth(Width);
            item.setCategory(Category);item.setItem_type(ItemType);
        }

public  static  ArrayList get_device_details()
    {
        ArrayList arrayList=new ArrayList();
        arrayList.addAll(item.get_all_details());
        return  arrayList;
    }

        public static String get_selected_device_name()
{
        return selected_device_name;
}
}
