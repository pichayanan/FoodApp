package com.pichayanan.appfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class List_resturant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_resturant2);
    }
    public void menulist(View view) {

        final String TAG = "menulist";

        Intent ResList = new Intent(List_resturant.this, menu_list.class);
        startActivity(ResList);


    }
    public void backbtn(View view) {

        final String TAG = "backbtn";

        Intent ResList = new Intent(List_resturant.this, List_Category.class);
        startActivity(ResList);


    }
}
