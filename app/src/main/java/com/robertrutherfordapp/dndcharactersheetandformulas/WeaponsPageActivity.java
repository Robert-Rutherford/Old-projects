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
        // name row
        TableLayout weapTable = (TableLayout) findViewById(R.id.WeaponsTable);
        TableRow weapNameRow = new TableRow(this);
        weapNameRow.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
        TextView weapNameText = new TextView(this);
        weapNameText.setText("Name: ");
        weapNameText.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

        TextView weapName = new TextView(this);
        weapName.setText(weapStats.getWeapName());
        weapName.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));


        weapNameRow.addView(weapNameText);
        weapNameRow.addView(weapName);

        weapTable.addView(weapNameRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));


        //damage row
        TableRow weapDamgTypeRow = new TableRow(this);
        weapDamgTypeRow.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
        TextView weapDamgTypeText = new TextView(this);
        weapDamgTypeText.setText("Damage Type: ");
        weapDamgTypeText.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

        TextView weapDamgType = new TextView(this);
        weapDamgType.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

        weapDamgTypeRow.addView(weapNameText);
        weapDamgTypeRow.addView(weapName);

        weapTable.addView(weapDamgTypeRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));

        //for (int i=0 ; i < weapStats.ge)



    }



}
