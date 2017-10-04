package com.robertrutherfordapp.dndcharactersheetandformulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WeaponsPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons_page);
    }

    public void createWeapsPage (View v){
        Intent myIntent = new Intent(this, CreateWeaponActivity.class);
        this.startActivity(myIntent);
    }


}
