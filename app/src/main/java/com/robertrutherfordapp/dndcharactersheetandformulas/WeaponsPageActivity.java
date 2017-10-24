package com.robertrutherfordapp.dndcharactersheetandformulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class WeaponsPageActivity extends AppCompatActivity {
    CreateWeapData weapStats = MainActivity.weapStats;
    weaponDatabase weapData = MainActivity.weaponData;

    TableRow[] weapNameRow = new TableRow[15];
    TableRow[] weapDamgTypeRow = new TableRow[15];
    TableRow[][] diceDamgTypeRow = new TableRow[15][5];
    TableRow[][] numbOfDice = new TableRow[15][10];
    TableRow[][] diceThrowRow = new TableRow[15][10];

    TextView[] weapNameText = new TextView[15];
    TextView[] WeaponNames = new TextView[15];
    TextView[] weapDamgTypeText = new TextView[15];
    TextView[] weaponType = new TextView[15];
    TextView[] weapModText = new TextView[15];
    TextView[] weapMod = new TextView[15];

    TextView[][] typeOfDiceText = new TextView[10][5];
    TextView[][] typeOfDice = new TextView[10][5];
    TextView[][] typeDamageText = new TextView[10][5];
    TextView[][] typeDamage = new TextView[10][5];
    EditText[][] diceSpaces = new EditText[30][50];
    TextView[] signTexts = new TextView[100];

    TextView[][] diceThrowText = new TextView[10][5];
    TextView[][] diceThrow = new TextView[10][5];

    int diceTextNumb = 0;
    int textSignNumb = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons_page);


        LinearLayout weapTableL = (LinearLayout) findViewById(R.id.weaponsLinearTable);

        //TextView test = new TextView(this);
        //test.setText("BS");
        //test.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

        //weapTableL.addView(test);

        int numbOfWeaps = weapData.numbOfWeaps;

        for (int weaponNumb = 0; weaponNumb < numbOfWeaps; weaponNumb++) {


            // name row
            //TableLayout weapTable = (TableLayout) findViewById(R.id.WeaponsTable);
            weapNameRow[weaponNumb] = new TableRow(this);
            weapNameRow[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

            weapNameText[weaponNumb] = new TextView(this);
            weapNameText[weaponNumb].setText("Name: ");
            //weapNameText[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            //TextView weapName = new TextView(this);
            WeaponNames[weaponNumb] = new TextView(this);
            WeaponNames[weaponNumb].setText(weapData.weapNames[weaponNumb]);
            //WeaponNames[weaponNumb].setText(weapStats.getWeapName());
            //WeaponNames[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));


            weapNameRow[weaponNumb].addView(weapNameText[weaponNumb]);
            weapNameRow[weaponNumb].addView(WeaponNames[weaponNumb]);

            weapTableL.addView(weapNameRow[weaponNumb], new LinearLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));


            //damage row
            weapDamgTypeRow[weaponNumb] = new TableRow(this);
            weapDamgTypeRow[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

            weapDamgTypeText[weaponNumb] = new TextView(this);
            weapDamgTypeText[weaponNumb].setText("Weapon Type: ");
            //weapDamgTypeText[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            weaponType[weaponNumb] = new TextView(this);
            weaponType[weaponNumb].setText(weapData.weaponType[weaponNumb]);
            //weaponType[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            weapModText[weaponNumb] = new TextView(this);
            weapModText[weaponNumb].setText("  Moddifier: ");
            //weapModText[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            weapMod[weaponNumb] = new TextView(this);
//**********            //weapMod[weaponNumb].setText(weapData.weaponType[weaponNumb]);
            //weapMod[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));


            weapDamgTypeRow[weaponNumb].addView(weapDamgTypeText[weaponNumb]);
            weapDamgTypeRow[weaponNumb].addView(weaponType[weaponNumb]);
            weapDamgTypeRow[weaponNumb].addView(weapModText[weaponNumb]);
            weapDamgTypeRow[weaponNumb].addView(weapMod[weaponNumb]);

            weapTableL.addView(weapDamgTypeRow[weaponNumb], new LinearLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            int diceBlock = 0;

            for (int j = 0; j < weapData.weaponNumbSets[weaponNumb]; j++) {

                diceDamgTypeRow[weaponNumb][j] = new TableRow(this);

                typeDamageText[weaponNumb][j] = new TextView(this);
                typeDamageText[weaponNumb][j].setText("Damage Type: ");
                typeDamageText[weaponNumb][j].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                typeDamage[weaponNumb][j] = new TextView(this);
                typeDamage[weaponNumb][j].setText(weapData.damageType[weaponNumb][j]);
                typeDamage[weaponNumb][j].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                typeOfDiceText[weaponNumb][j] = new TextView(this);
                typeOfDiceText[weaponNumb][j].setText("    Dice Type: ");
                typeOfDiceText[weaponNumb][j].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                typeOfDice[weaponNumb][j] = new TextView(this);
                typeOfDice[weaponNumb][j].setText(weapData.typeOfDice[weaponNumb][j]);
                typeOfDice[weaponNumb][j].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                diceDamgTypeRow[weaponNumb][j].addView(typeDamageText[weaponNumb][j]);
                diceDamgTypeRow[weaponNumb][j].addView(typeDamage[weaponNumb][j]);
                diceDamgTypeRow[weaponNumb][j].addView(typeOfDiceText[weaponNumb][j]);
                diceDamgTypeRow[weaponNumb][j].addView(typeOfDice[weaponNumb][j]);

                weapTableL.addView(diceDamgTypeRow[weaponNumb][j], new LinearLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                boolean alldice = false;
                int numberdice = Integer.parseInt(weapData.numbOfDice[weaponNumb][j]);

                //for (int diceSet = 0; diceSet < numberdice; diceSet++) {

                    numbOfDice[weaponNumb][j] = new TableRow(this);

                while(alldice != true) {
                    if ((numberdice - diceBlock) > 5) {
                        for (int spaceCounter = 0; spaceCounter < 5; spaceCounter++) {

                            diceSpaces[weaponNumb][diceTextNumb] = new EditText(this);
                            diceSpaces[weaponNumb][diceTextNumb].setLayoutParams(new
                                    TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                                    TableRow.LayoutParams.WRAP_CONTENT));

                            signTexts[textSignNumb] = new TextView(this);
                            signTexts[textSignNumb].setText(" + ");
                            signTexts[textSignNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                            numbOfDice[weaponNumb][j].addView(diceSpaces[weaponNumb][diceTextNumb]);
                            numbOfDice[weaponNumb][j].addView(signTexts[textSignNumb]);

                            diceTextNumb++;
                            textSignNumb++;


                        }

                        //signTexts[textSignNumb] = new TextView(this);
                        //signTexts[textSignNumb].setText(" = ");
                        //signTexts[textSignNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                        //numbOfDice[weaponNumb][diceSet].addView(signTexts[textSignNumb]);
                        //textSignNumb++;
                        diceBlock = diceBlock + 5;

                    } else {
                        for (int spaceCounter = 1; spaceCounter <= (numberdice - diceBlock); spaceCounter++) {

                            diceSpaces[weaponNumb][diceTextNumb] = new EditText(this);
                            diceSpaces[weaponNumb][diceTextNumb].setLayoutParams(new
                                    TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                                    TableRow.LayoutParams.WRAP_CONTENT));

                            signTexts[textSignNumb] = new TextView(this);
                            //if( spaceCounter == (numberdice - diceBlock)){
                            // signTexts[textSignNumb].setText(" = ");
                            //}else{
                            signTexts[textSignNumb].setText(" + ");
                            //}
                            signTexts[textSignNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                            numbOfDice[weaponNumb][j].addView(diceSpaces[weaponNumb][diceTextNumb]);
                            numbOfDice[weaponNumb][j].addView(signTexts[textSignNumb]);


                            diceTextNumb++;
                            textSignNumb++;

                            if (spaceCounter == (numberdice - diceBlock)) {
                                signTexts[textSignNumb] = new TextView(this);
                                signTexts[textSignNumb].setText(" = ");
                                signTexts[textSignNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                                numbOfDice[weaponNumb][j].addView(signTexts[textSignNumb]);

                                textSignNumb++;
                                alldice = true;
                            }


                        }

                        //signTexts[textSignNumb] = new TextView(this);
                        //signTexts[textSignNumb].setText(" = ");
                        //signTexts[textSignNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                        //numbOfDice[weaponNumb][diceSet].addView(signTexts[textSignNumb]);
                        //textSignNumb++;

                    }

                    //weapTableL.addView(numbOfDice[weaponNumb][diceSet], new LinearLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                }




                //}

                weapTableL.addView(numbOfDice[weaponNumb][j], new LinearLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));


                //Dice Throw
                diceThrowRow[weaponNumb][j] = new TableRow(this);

                diceThrowText[weaponNumb][j] = new TextView(this);
                diceThrowText[weaponNumb][j].setText("Dice Throw:  ");
                diceThrowText[weaponNumb][j].setLayoutParams(new
                        TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT));

                diceThrow[weaponNumb][j] = new TextView(this);
                diceThrowText[weaponNumb][j].setText("");
                diceThrow[weaponNumb][j].setLayoutParams(new
                        TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT));

                diceThrowRow[weaponNumb][j].addView(diceThrowText[weaponNumb][j]);
                diceThrowRow[weaponNumb][j].addView(diceThrow[weaponNumb][j]);

                weapTableL.addView(diceThrowRow[weaponNumb][j], new LinearLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }

        }













        //if (weapData.numbOfWeaps != 0) {
            //addWeaponItem();


            //addWeaponItem(v);
        //}

    }

    public void createWeapsPage(View v) {
        Intent myIntent = new Intent(this, CreateWeaponActivity.class);
        this.startActivity(myIntent);
    }

   /* public void addWeaponItem(View v) {

        LinearLayout weapTableL = (LinearLayout) findViewById(R.id.weaponsLinearTable);

        for (int i = 0; i < weaponNumb; i++) {


            // name row
            //TableLayout weapTable = (TableLayout) findViewById(R.id.WeaponsTable);
            weapNameRow[weaponNumb] = new TableRow(this);
            weapNameRow[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            weapNameText[weaponNumb] = new TextView(this);
            weapNameText[weaponNumb].setText("Name: ");
            weapNameText[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            //TextView weapName = new TextView(this);
            WeaponNames[weaponNumb] = new TextView(this);
            WeaponNames[weaponNumb].setText(weapData.weapNames[weaponNumb]);
            //WeaponNames[weaponNumb].setText(weapStats.getWeapName());
            WeaponNames[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));


            weapNameRow[weaponNumb].addView(weapNameText[weaponNumb]);
            weapNameRow[weaponNumb].addView(WeaponNames[weaponNumb]);

            weapTableL.addView(weapNameRow[weaponNumb], new LinearLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


            //damage row
            weapDamgTypeRow[weaponNumb] = new TableRow(this);
            weapDamgTypeRow[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            weapDamgTypeText[weaponNumb] = new TextView(this);
            weapDamgTypeText[weaponNumb].setText("Weapon Type: ");
            weapDamgTypeText[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            weaponType[weaponNumb] = new TextView(this);
            weaponType[weaponNumb].setText(weapData.weaponType[weaponNumb]);
            weaponType[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            weapModText[weaponNumb] = new TextView(this);
            weapModText[weaponNumb].setText("  Moddifier: ");
            weapModText[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            weapMod[weaponNumb] = new TextView(this);
//**********            //weapMod[weaponNumb].setText(weapData.weaponType[weaponNumb]);
            weapMod[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));


            weapDamgTypeRow[weaponNumb].addView(weapDamgTypeText[weaponNumb]);
            weapDamgTypeRow[weaponNumb].addView(weaponType[weaponNumb]);
            weapDamgTypeRow[weaponNumb].addView(weapModText[weaponNumb]);
            weapDamgTypeRow[weaponNumb].addView(weapMod[weaponNumb]);

            weapTableL.addView(weapDamgTypeRow[weaponNumb], new LinearLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


            for (int j = 0; j < weapData.weaponNumbSets[weaponNumb]; j++) {

                diceDamgTypeRow[weaponNumb][j] = new TableRow(this);

                typeDamageText[weaponNumb][j] = new TextView(this);
                typeDamageText[weaponNumb][j].setText("Damage Type: ");
                typeDamageText[weaponNumb][j].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                typeDamage[weaponNumb][j] = new TextView(this);
                typeDamage[weaponNumb][j].setText(weapData.damageType[weaponNumb][j]);
                typeDamage[weaponNumb][j].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                typeOfDiceText[weaponNumb][j] = new TextView(this);
                typeOfDiceText[weaponNumb][j].setText("Dice Type: ");
                typeOfDiceText[weaponNumb][j].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                typeOfDice[weaponNumb][j] = new TextView(this);
                typeOfDice[weaponNumb][j].setText(weapData.typeOfDice[weaponNumb][j]);
                typeOfDice[weaponNumb][j].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                diceDamgTypeRow[weaponNumb][j].addView(typeDamageText[weaponNumb][j]);
                diceDamgTypeRow[weaponNumb][j].addView(typeDamage[weaponNumb][j]);
                diceDamgTypeRow[weaponNumb][j].addView(typeOfDiceText[weaponNumb][j]);
                diceDamgTypeRow[weaponNumb][j].addView(typeOfDice[weaponNumb][j]);

                weapTableL.addView(diceDamgTypeRow[weaponNumb][j], new LinearLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                int diceBlock = 0;
                int numberdice = Integer.parseInt(weapData.numbOfDice[weaponNumb][j]);

                for (int diceSet = 0; diceSet < numberdice; diceSet++) {

                    numbOfDice[weaponNumb][diceSet] = new TableRow(this);

                    if ((numberdice - diceBlock) > 5) {
                        for (int spaceCounter = 1; spaceCounter <= 5; spaceCounter++) {

                            diceSpaces[weaponNumb][diceTextNumb] = new EditText(this);
                            diceSpaces[weaponNumb][diceTextNumb].setLayoutParams(new
                                    TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT,
                                    TableRow.LayoutParams.WRAP_CONTENT));

                            signTexts[textSignNumb] = new TextView(this);
                            signTexts[textSignNumb].setText(" + ");
                            signTexts[textSignNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                            numbOfDice[weaponNumb][diceSet].addView(diceSpaces[weaponNumb][diceTextNumb]);
                            numbOfDice[weaponNumb][diceSet].addView(signTexts[textSignNumb]);

                            diceTextNumb++;
                            textSignNumb++;


                        }


                    } else {
                        for (int spaceCounter = 1; spaceCounter <= (numberdice - diceBlock); spaceCounter++) {

                            diceSpaces[weaponNumb][diceTextNumb] = new EditText(this);
                            diceSpaces[weaponNumb][diceTextNumb].setLayoutParams(new
                                    TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT,
                                    TableRow.LayoutParams.WRAP_CONTENT));

                            signTexts[textSignNumb] = new TextView(this);
                            signTexts[textSignNumb].setText(" + ");
                            signTexts[textSignNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                            numbOfDice[weaponNumb][diceSet].addView(diceSpaces[weaponNumb][diceTextNumb]);
                            numbOfDice[weaponNumb][diceSet].addView(signTexts[textSignNumb]);

                            diceTextNumb++;
                            textSignNumb++;

                        }


                    }

                    weapTableL.addView(numbOfDice[weaponNumb][diceSet], new LinearLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                }


            }

        }


    }*/
}