package com.pichayanan.appfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class List_Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_resturant);
    }
    public void resturant(View view) {

        final String TAG = "resturant";

        Intent ResList = new Intent(List_Category.this, List_resturant.class);
        startActivity(ResList);


    }
}
