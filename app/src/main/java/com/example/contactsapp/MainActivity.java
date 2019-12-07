package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     ArrayList<String> mImages = new ArrayList<>() ;
     ArrayList<String> mContactName= new ArrayList<>() ;
     ArrayList<String> mPhoneNumber = new ArrayList<>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmap();

    }


    public void initImageBitmap(){

        mImages.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mContactName.add("Havasu Falls");
        mPhoneNumber.add("9845447335");

        mImages.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mContactName.add("Trondheim");
        mPhoneNumber.add("9845447336");

        mImages.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mContactName.add("Portugal");
        mPhoneNumber.add("9845447337");

        mImages.add("https://i.redd.it/j6myfqglup501.jpg");
        mContactName.add("Rocky Mountain");
        mPhoneNumber.add("9845447335");


        mImages.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mContactName.add("Mahahual");
        mPhoneNumber.add("9845447336");

        mImages.add("https://i.redd.it/k98uzl68eh501.jpg");
        mContactName.add("Frozen Lake");
        mPhoneNumber.add("9845447338");

        mImages.add("https://i.redd.it/glin0nwndo501.jpg");
        mContactName.add("White Sands Desert");
        mPhoneNumber.add("9845447345");

        mImages.add("https://i.redd.it/obx4zydshg601.jpg");
        mContactName.add("Austrailia");
        mPhoneNumber.add("9845446335");

        mImages.add("https://i.imgur.com/ZcLLrkY.jpg");
        mContactName.add("Washington");
        mPhoneNumber.add("9855447335");

        initRecyclerView();


    }

    private void initRecyclerView(){

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ViewAdapter adapter = new ViewAdapter(this, mImages, mContactName, mPhoneNumber);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
