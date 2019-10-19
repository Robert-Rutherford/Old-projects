package com.robertrutherfordapp.dndcharactersheetandformulas;

import android.content.Intent;
import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
    Spinner[] moreDiceTypeSpin = new Spinner[5];
    Spinner[] moreDamageTypeSpin = new Spinner[5];
    ArrayAdapter<CharSequence> weapTypeadapter;
    ArrayAdapter<CharSequence> diceTypeadapter;
    ArrayAdapter<CharSequence> damTypeadapter;
    ArrayAdapter<CharSequence>[] moreDiceTypeAdapter = new ArrayAdapter[5];
    ArrayAdapter<CharSequence>[] moreDamageTypeAdapter = new ArrayAdapter[5];


    CreateWeapData weapStats = MainActivity.weapStats;
    weaponDatabase weapData = MainActivity.weaponData;

    int weapID = weapData.numbOfWeaps;

    Boolean addMoreDice = false;
    int numOfDiceAdded = 0;
    int tableRows = 3;

    TableRow[] diceRowsID = new TableRow[10];
    EditText[] numbOfDiceID = new EditText[5];

    String[] numberDice = new String[5];
    String[] typeDamage = new String[5];
    String[] typeDice = new String[5];


    Button addDiceBtn = null;
    Button createWeapBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_weapon);
        weaptypeSpin = (Spinner) findViewById(R.id.weapTypeSpinner1);
        weapTypeadapter = ArrayAdapter.createFromResource(this, R.array.weapon_types, android.R.layout.simple_spinner_item);
        weapTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weaptypeSpin.setAdapter(weapTypeadapter);

        diceTypeSpin = (Spinner) findViewById(R.id.diceTypespinner1);
        diceTypeadapter = ArrayAdapter.createFromResource(this, R.array.dice_type, android.R.layout.simple_spinner_item);
        diceTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        diceTypeSpin.setAdapter(diceTypeadapter);

        damTypeSpin = (Spinner) findViewById(R.id.damTypespinner1);
        damTypeadapter = ArrayAdapter.createFromResource(this, R.array.damage_type, android.R.layout.simple_spinner_item);
        damTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        damTypeSpin.setAdapter(damTypeadapter);

        addDiceBtn = (Button) findViewById(R.id.addDiceSet);
        addDiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDiceRows(v);
            }
        });

        createWeapBtn = (Button) findViewById(R.id.createWeaponbutton);
        createWeapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createWeapon(v);
            }
        });

    }

    public void cleanMenu(View v) {
        Boolean addMoreDice = false;
        int numOfDiceAdded = 0;

    }

    public void createWeapon(View v) {


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
        numberDice[0] = numbOfDice;


        Spinner typeOfDice = (Spinner) findViewById(R.id.diceTypespinner1);
        String TypeOfDiceString1 = typeOfDice.getSelectedItem().toString();
        weapStats.setTypeDice(0, TypeOfDiceString1);
        typeDice[0] = TypeOfDiceString1;

        Spinner damageTypeSpin = (Spinner) findViewById(R.id.damTypespinner1);
        String damageTypeString1 = damageTypeSpin.getSelectedItem().toString();
        weapStats.setDamgTypes(0, damageTypeString1);
        typeDamage[0] = damageTypeString1;

        if (addMoreDice == true) {
            for (int i = 1; i <= numOfDiceAdded; i++) {
                try {
                    String NewNumbDice = numbOfDiceID[i].getText().toString();
                    int numbDice = Integer.parseInt(NewNumbDice);
                    weapStats.setNumOfDice(i, numbDice);
                    numberDice[i] = NewNumbDice;

                    String NewTypeDice = moreDiceTypeSpin[i].getSelectedItem().toString();
                    weapStats.setTypeDice(i, NewTypeDice);
                    typeDice[i] = NewTypeDice;

                    String NewDamagetype = moreDamageTypeSpin[i].getSelectedItem().toString();
                    weapStats.setDamgTypes(i, NewDamagetype);
                    typeDamage[i] = NewDamagetype;

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                }

            }
        }


        weapData.addWeapon(nameWeap, weapTypeString, numberDice, typeDice, typeDamage, numOfDiceAdded + 1);

        Intent myIntent = new Intent(this, WeaponsPageActivity.class);
        this.startActivity(myIntent);

    }


    public void addDiceRows(View v) {

        if (numOfDiceAdded < 4) {
            numOfDiceAdded++;

            TableLayout diceTable = (TableLayout) findViewById(R.id.diceTableLayout);
            //diceTable.setColumnStretchable(0,true);
            //diceTable.setColumnStretchable(4,true);


            diceRowsID[numOfDiceAdded] = new TableRow(this);
            //TableRow diceRows = new TableRow(this);

            TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT);

            TextView textDiceNum = new TextView(this);
            textDiceNum.setText("Number of Dice: ");
            textDiceNum.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            numbOfDiceID[numOfDiceAdded] = new EditText(this);
            //EditText NumbDiceEdit = new EditText(this);
            numbOfDiceID[numOfDiceAdded].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            TextView textDiceType = new TextView(this);
            textDiceType.setText("Dice Type: ");
            textDiceType.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            // try {
            //Spinner newDiceTypeSpin = new Spinner(this);
            moreDiceTypeSpin[numOfDiceAdded] = new Spinner(this);
            //moreDiceTypeSpin[numOfDiceAdded] = (Spinner) findViewById(newDiceTypeSpin[].getId());
            moreDiceTypeAdapter[numOfDiceAdded] = ArrayAdapter.createFromResource(this, R.array.dice_type, android.R.layout.simple_spinner_item);
            moreDiceTypeAdapter[numOfDiceAdded].setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            moreDiceTypeSpin[numOfDiceAdded].setAdapter(moreDiceTypeAdapter[numOfDiceAdded]);
            //  } catch (Exception ex) {
            //     System.out.println(ex.getMessage());
            //     ex.printStackTrace();
            // }


            diceRowsID[numOfDiceAdded].addView(textDiceNum);
            diceRowsID[numOfDiceAdded].addView(numbOfDiceID[numOfDiceAdded]);
            diceRowsID[numOfDiceAdded].addView(textDiceType);
            diceRowsID[numOfDiceAdded].addView(moreDiceTypeSpin[numOfDiceAdded]);

            diceTable.addView(diceRowsID[numOfDiceAdded], new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));


            //Row 2 Damage Type
            diceRowsID[numOfDiceAdded + 5] = new TableRow(this);

            TextView textDamagType = new TextView(this);
            textDamagType.setText("Damage Type: ");
            textDamagType.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));


            moreDamageTypeSpin[numOfDiceAdded] = new Spinner(this);
            moreDamageTypeAdapter[numOfDiceAdded] = ArrayAdapter.createFromResource(this, R.array.damage_type, android.R.layout.simple_spinner_item);
            moreDamageTypeAdapter[numOfDiceAdded].setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            moreDamageTypeSpin[numOfDiceAdded].setAdapter(moreDamageTypeAdapter[numOfDiceAdded]);

            diceRowsID[numOfDiceAdded + 5].addView(textDamagType);
            diceRowsID[numOfDiceAdded + 5].addView(moreDamageTypeSpin[numOfDiceAdded]);
            diceTable.addView(diceRowsID[numOfDiceAdded + 5], new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            tableRows = tableRows + 2;
            addMoreDice = true;
        }

    }


    public void removeDiceRows(View v) {

        TableLayout diceTable = (TableLayout) findViewById(R.id.diceTableLayout);

        if (addMoreDice != false) {
            for (int i = 1; i < numOfDiceAdded; i++) {
                diceTable.removeView(diceRowsID[i + 5]);
                diceTable.removeView(diceRowsID[i]);
            }
        }


    }


}
