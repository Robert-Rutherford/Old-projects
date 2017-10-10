package com.robertrutherfordapp.dndcharactersheetandformulas;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class CreateWeaponActivity extends AppCompatActivity {
    Spinner weaptypeSpin;
    Spinner diceTypeSpin;
    Spinner damTypeSpin;
    Spinner[] moreDiceTypeSpin;
    ArrayAdapter<CharSequence> weapTypeadapter;
    ArrayAdapter<CharSequence> diceTypeadapter;
    ArrayAdapter<CharSequence> damTypeadapter;
    ArrayAdapter<CharSequence> moreDiceTypeAdapter;

    CreateWeapData weapStats = MainActivity.weapStats;
    Boolean addMoreDice = false;
    int numOfDiceAdded = 0;

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

    public void cleanMenu(View v){
        Boolean addMoreDice = false;
        int numOfDiceAdded = 0;

    }

    public void createWeapon(){

        EditText weapNameEdit = (EditText) findViewById(R.id.editWeapName);
        String nameWeap = weapNameEdit.getText().toString();
        weapStats.setWeapName(nameWeap);

        Spinner weapTypeSpin = (Spinner) findViewById(R.id.weapTypeSpinner1);
        String weapTypeString = weapTypeSpin.getSelectedItem().toString();
        weapStats.setWeapType(weapTypeString);

        EditText numbDiceEdit = (EditText) findViewById(R.id.editNumDice);
        String numbOfDice = numbDiceEdit.getText().toString();
        int NumDice1 = Integer.parseInt(numbOfDice);
        weapStats.setNumOfDice(0, NumDice1);

        Spinner typeOfDice = (Spinner) findViewById(R.id.diceTypespinner1);
        String TypeOfDiceString1 = typeOfDice.getSelectedItem().toString();
        weapStats.setTypeDice(0, TypeOfDiceString1);

        Spinner damageTypeSpin = (Spinner) findViewById(R.id.damTypespinner1);
        String damageTypeString1 = damageTypeSpin.getSelectedItem().toString();
        weapStats.setDamgTypes(0, damageTypeString1);

        if (addMoreDice == true){
            for(int i = 0; i < numOfDiceAdded; i++){

            }
        }


    }


    public void addDiceRows( View v) {

        TableLayout weapTable = (TableLayout) findViewById(R.id.diceTableLayout);
        TableRow diceRows = new TableRow(this);
        TextView textDiceNum = new TextView(this);
        textDiceNum.setText("Number of Dice: ");
        textDiceNum.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

        EditText NumbDiceEdit = new EditText(this);
        NumbDiceEdit.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

        TextView textDiceType = new TextView(this);
        textDiceType.setText("Dice Type: ");
        textDiceType.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

        Spinner newDiceTypeSpin = new Spinner(this);
        
        diceTypeSpin = (Spinner) findViewById(R.id.diceTypespinner1);
        diceTypeadapter = ArrayAdapter.createFromResource(this,R.array.dice_type,android.R.layout.simple_spinner_item);
        diceTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        diceTypeSpin.setAdapter(diceTypeadapter);

    }





}
