package com.robertrutherfordapp.dndcharactersheetandformulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CreateWeaponActivity extends AppCompatActivity {
    Spinner weaptypeSpin;
    Spinner diceTypeSpin;
    Spinner damTypeSpin;
    ArrayAdapter<CharSequence> weapTypeadapter;
    ArrayAdapter<CharSequence> diceTypeadapter;
    ArrayAdapter<CharSequence> damTypeadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_weapon);
        weaptypeSpin = (Spinner) findViewById(R.id.weapTypeSpinner1);
        weapTypeadapter = ArrayAdapter.createFromResource(this,R.array.weapon_types,android.R.layout.simple_spinner_item);
        weapTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weaptypeSpin.setAdapter(weapTypeadapter);

        diceTypeSpin = (Spinner) findViewById(R.id.diceTypespinner1);
        diceTypeadapter = ArrayAdapter.createFromResource(this,R.array.dice_type,android.R.layout.simple_spinner_item);
        diceTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        diceTypeSpin.setAdapter(diceTypeadapter);

        damTypeSpin = (Spinner) findViewById(R.id.damTypespinner1);
        damTypeadapter = ArrayAdapter.createFromResource(this,R.array.damage_type,android.R.layout.simple_spinner_item);
        damTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        damTypeSpin.setAdapter(damTypeadapter);


    }
}
