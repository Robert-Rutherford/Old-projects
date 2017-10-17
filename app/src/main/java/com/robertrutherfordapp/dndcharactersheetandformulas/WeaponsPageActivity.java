package com.robertrutherfordapp.dndcharactersheetandformulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class WeaponsPageActivity extends AppCompatActivity {
    CreateWeapData weapStats = MainActivity.weapStats;
    weaponDatabase weapData = MainActivity.weaponData;

    TableRow[] weapNameRow = new  TableRow[15];
    TableRow[] weapDamgTypeRow = new TableRow[15];
    TextView[] weapNameText = new TextView[15];
    TextView[] WeaponNames = new TextView[15];
    TextView[] weapDamgTypeText = new TextView[15];


    int weaponNumb = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons_page);
    }

    public void createWeapsPage (View v){
        Intent myIntent = new Intent(this, CreateWeaponActivity.class);
        this.startActivity(myIntent);
    }

    public void addWeaponItem(View v){
        for (int i=0; i < weaponNumb; i++) {
            // name row
            TableLayout weapTable = (TableLayout) findViewById(R.id.WeaponsTable);
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

            weapTable.addView(weapNameRow[weaponNumb], new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));


            //damage row
            weapDamgTypeRow[weaponNumb] = new TableRow(this);
            weapDamgTypeRow[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            weapDamgTypeText[weaponNumb] = new TextView(this);
            weapDamgTypeText[weaponNumb].setText("Damage Type: ");
            weapDamgTypeText[weaponNumb].setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            TextView weapDamgType = new TextView(this);

            weapDamgType.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            weapDamgTypeRow[weaponNumb].addView(weapDamgTypeText[weaponNumb]);
            weapDamgTypeRow[weaponNumb].addView(weapDamgType);

            weapTable.addView(weapDamgTypeRow[weaponNumb], new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));

            //for (int i=0 ; i < weapStats.ge)

        }

    }



}
