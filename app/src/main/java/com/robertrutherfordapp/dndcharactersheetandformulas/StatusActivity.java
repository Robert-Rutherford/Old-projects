package com.robertrutherfordapp.dndcharactersheetandformulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class StatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //dataStats = new statsData();
        setContentView(R.layout.activity_status);
        updateView();

    }



    public void updateView(){

        statsData datastats = MainActivity.dataStats;

        EditText strET = (EditText) findViewById(R.id.editStatSTR);
        strET.setText( "" + datastats.getStr());
        EditText dexET = (EditText) findViewById(R.id.editStatDEX);
        dexET.setText( "" + datastats.getDex());
        EditText conET = (EditText) findViewById(R.id.editStatCON);
        conET.setText( "" + datastats.getCon());
        EditText intET = (EditText) findViewById(R.id.editStatINT);
        intET.setText( "" + datastats.getIntel());
        EditText wisET = (EditText) findViewById(R.id.editStatWIS);
        wisET.setText( "" + datastats.getWis());
        EditText chaET = (EditText) findViewById(R.id.editStatCHA);
        chaET.setText( "" + datastats.getCha());

        EditText strBModET = (EditText) findViewById(R.id.editSTRmod);
        strBModET.setText( "" + datastats.getStrBmod());
        EditText dexBModET = (EditText) findViewById(R.id.editDEXmod);
        dexBModET.setText( "" + datastats.getDexBmod());
        EditText conBModET = (EditText) findViewById(R.id.editCONmod);
        conBModET.setText( "" + datastats.getConBmod());
        EditText intBModET = (EditText) findViewById(R.id.editINTmod);
        intBModET.setText( "" + datastats.getIntelBmod());
        EditText wisBModET = (EditText) findViewById(R.id.editWISmod);
        wisBModET.setText( "" + datastats.getWisBmod());
        EditText chaBModET = (EditText) findViewById(R.id.editCHAmod);
        chaBModET.setText( "" + datastats.getChaBmod());

        TextView strModET = (TextView) findViewById(R.id.textSTRmod);
        strModET.setText( "" + datastats.getStrmod());
        TextView dexModET = (TextView) findViewById(R.id.textDEXmod);
        dexModET.setText( "" + datastats.getDexmod());
        TextView conModET = (TextView) findViewById(R.id.textCONmod);
        conModET.setText( "" + datastats.getConmod());
        TextView intModET = (TextView) findViewById(R.id.textINTmod);
        intModET.setText( "" + datastats.getIntelmod());
        TextView wisModET = (TextView) findViewById(R.id.textWISmod);
        wisModET.setText( "" + datastats.getWismod());
        TextView chaModET = (TextView) findViewById(R.id.textCHAmod);
        chaModET.setText( "" + datastats.getChamod());

        EditText strSaveET = (EditText) findViewById(R.id.editStatSTRmod);
        strSaveET.setText( "" + datastats.getStrmod());
        EditText dexSaveET = (EditText) findViewById(R.id.editStatDEXmod);
        dexSaveET.setText( "" + datastats.getDexmod());
        EditText conSaveET = (EditText) findViewById(R.id.editStatCONmod);
        conSaveET.setText( "" + datastats.getConmod());
        EditText intSaveET = (EditText) findViewById(R.id.editStatINTmod);
        intSaveET.setText( "" + datastats.getIntelmod());
        EditText wisSaveET = (EditText) findViewById(R.id.editStatWISmod);
        wisSaveET.setText( "" + datastats.getWismod());
        EditText chaSaveET = (EditText) findViewById(R.id.editStatCHAmod);
        chaSaveET.setText( "" + datastats.getChamod());


    }

    public void CalcStats(View v){

        statsData datastats = MainActivity.dataStats;

        //stats
        //character stat
        EditText strET = (EditText) findViewById(R.id.editStatSTR);
        String strStatus = strET.getText().toString();
        EditText dexET = (EditText) findViewById(R.id.editStatDEX);
        String dexStatus = dexET.getText().toString();
        EditText conET = (EditText) findViewById(R.id.editStatCON);
        String conStatus = conET.getText().toString();
        EditText intET = (EditText) findViewById(R.id.editStatINT);
        String intStatus = intET.getText().toString();
        EditText wisET = (EditText) findViewById(R.id.editStatWIS);
        String wisStatus = wisET.getText().toString();
        EditText chaET = (EditText) findViewById(R.id.editStatCHA);
        String chaStatus = chaET.getText().toString();

        int statSTR = Integer.parseInt(strStatus);
        int statDEX = Integer.parseInt(dexStatus);
        int statCON = Integer.parseInt(conStatus);
        int statINT = Integer.parseInt(intStatus);
        int statWIS = Integer.parseInt(wisStatus);
        int statCHA = Integer.parseInt(chaStatus);

        datastats.setStr(statSTR);
        datastats.setDex(statDEX);
        datastats.setCon(statCON);
        datastats.setIntel(statINT);
        datastats.setWis(statWIS);
        datastats.setCha(statCHA);

        //bonus moddifier
        EditText strBModET = (EditText) findViewById(R.id.editSTRmod);
        String strBModStatus = strBModET.getText().toString();
        EditText dexBModET = (EditText) findViewById(R.id.editDEXmod);
        String dexBModStatus = dexBModET.getText().toString();
        EditText conBModET = (EditText) findViewById(R.id.editCONmod);
        String conBModStatus = conBModET.getText().toString();
        EditText intBModET = (EditText) findViewById(R.id.editINTmod);
        String intBModStatus = intBModET.getText().toString();
        EditText wisBModET = (EditText) findViewById(R.id.editWISmod);
        String wisBModStatus = wisBModET.getText().toString();
        EditText chaBModET = (EditText) findViewById(R.id.editCHAmod);
        String chaBModStatus = chaBModET.getText().toString();

        int statBmodSTR = Integer.parseInt(strBModStatus);
        int statBmodDEX = Integer.parseInt(dexBModStatus);
        int statBmodCON = Integer.parseInt(conBModStatus);
        int statBmodINT = Integer.parseInt(intBModStatus);
        int statBmodWIS = Integer.parseInt(wisBModStatus);
        int statBmodCHA = Integer.parseInt(chaBModStatus);

        datastats.setStrBmod(statBmodSTR);
        datastats.setDexBmod(statBmodDEX);
        datastats.setConBmod(statBmodCON);
        datastats.setIntelBmod(statBmodINT);
        datastats.setWisBmod(statBmodWIS);
        datastats.setChaBmod(statBmodCHA);


        //return moddifiers
        TextView strModET = (TextView) findViewById(R.id.textSTRmod);
        strModET.setText(Integer.toString(datastats.getStrmod()));
        TextView dexModET = (TextView) findViewById(R.id.textDEXmod);
        dexModET.setText(Integer.toString(datastats.getDexmod()));
        TextView conModET = (TextView) findViewById(R.id.textCONmod);
        conModET.setText(Integer.toString(datastats.getConBmod()));
        TextView intModET = (TextView) findViewById(R.id.textINTmod);
        intModET.setText(Integer.toString(datastats.getIntelBmod()));
        TextView wisModET = (TextView) findViewById(R.id.textWISmod);
        wisModET.setText(Integer.toString(datastats.getWisBmod()));
        TextView chaModET = (TextView) findViewById(R.id.textCHAmod);
        chaModET.setText(Integer.toString(datastats.getChaBmod()));

    }

    public void CalcStatSaves(View v){

        statsData datastats = MainActivity.dataStats;

        //moddifiers
        EditText strModET = (EditText) findViewById(R.id.editStatSTRmod);
        strModET.setText( "" + datastats.getStrmod());
        String strmoddi = strModET.getText().toString();
        EditText dexModET = (EditText) findViewById(R.id.editStatDEXmod);
        dexModET.setText( "" + datastats.getDexmod());
        String dexmoddi = dexModET.getText().toString();
        EditText conModET = (EditText) findViewById(R.id.editStatCONmod);
        conModET.setText( "" + datastats.getConmod());
        String conmoddi = conModET.getText().toString();
        EditText intModET = (EditText) findViewById(R.id.editStatINTmod);
        intModET.setText( "" + datastats.getIntelmod());
        String intmoddi = intModET.getText().toString();
        EditText wisModET = (EditText) findViewById(R.id.editStatWISmod);
        wisModET.setText( "" + datastats.getWismod());
        String wismoddi = wisModET.getText().toString();
        EditText chaModET = (EditText) findViewById(R.id.editStatCHAmod);
        chaModET.setText( "" + datastats.getChamod());
        String chamoddi = chaModET.getText().toString();

        int STRmoddiStat = Integer.parseInt(strmoddi);
        int DEXmoddiStat = Integer.parseInt(dexmoddi);
        int CONmoddiStat = Integer.parseInt(conmoddi);
        int INTmoddiStat = Integer.parseInt(intmoddi);
        int WISmoddiStat = Integer.parseInt(wismoddi);
        int CHAmoddiStat = Integer.parseInt(chamoddi);

        //Rolls
        EditText strRollET = (EditText) findViewById(R.id.editSTRRoll);
        String strroll = strRollET.getText().toString();
        EditText dexRollET = (EditText) findViewById(R.id.editDEXRoll);
        String dexroll = dexRollET.getText().toString();
        EditText conRollET = (EditText) findViewById(R.id.editCONRoll);
        String conroll = conRollET.getText().toString();
        EditText intRollET = (EditText) findViewById(R.id.editINTRoll);
        String introll = intRollET.getText().toString();
        EditText wisRollET = (EditText) findViewById(R.id.editWISRoll);
        String wisroll = wisRollET.getText().toString();
        EditText chaRollET = (EditText) findViewById(R.id.editCHARoll);
        String charoll = chaRollET.getText().toString();

        int STRRollStat = Integer.parseInt(strroll);
        int DEXRollStat = Integer.parseInt(dexroll);
        int CONRollStat = Integer.parseInt(conroll);
        int INTRollStat = Integer.parseInt(introll);
        int WISRollStat = Integer.parseInt(wisroll);
        int CHARollStat = Integer.parseInt(charoll);

        //calculation
        int strThrow = datastats.calcThrow(STRmoddiStat,STRRollStat);
        int dexThrow = datastats.calcThrow(DEXmoddiStat,DEXRollStat);
        int conThrow = datastats.calcThrow(CONmoddiStat,CONRollStat);
        int intThrow = datastats.calcThrow(INTmoddiStat,INTRollStat);
        int wisThrow = datastats.calcThrow(WISmoddiStat,WISRollStat);
        int chaThrow = datastats.calcThrow(CHAmoddiStat,CHARollStat);



        //output data
        TextView strThrowTV = (TextView) findViewById(R.id.textSTRThrow);
        strThrowTV.setText(String.format("%d", strThrow));
        TextView dexThrowTV = (TextView) findViewById(R.id.textDEXThrow);
        dexThrowTV.setText(String.format("%d", dexThrow));
        TextView conThrowTV = (TextView) findViewById(R.id.textCONThrow);
        conThrowTV.setText(String.format("%d", conThrow));
        TextView intThrowTV = (TextView) findViewById(R.id.textINTThrow);
        intThrowTV.setText(String.format("%d", intThrow));
        TextView wisThrowTV = (TextView) findViewById(R.id.textWISThrow);
        wisThrowTV.setText(String.format("%d", wisThrow));
        TextView chaThrowTV = (TextView) findViewById(R.id.textCHAThrow);
        chaThrowTV.setText(String.format("%d", chaThrow));



    }

    public void CalcSavesRoll(View v){
        statsData datastats = MainActivity.dataStats;

        //moddifiers
        EditText strModET = (EditText) findViewById(R.id.editStatSTRmod);
        strModET.setText( "" + datastats.getStrmod());
        String strmoddi = strModET.getText().toString();
        EditText dexModET = (EditText) findViewById(R.id.editStatDEXmod);
        dexModET.setText( "" + datastats.getDexmod());
        String dexmoddi = dexModET.getText().toString();
        EditText conModET = (EditText) findViewById(R.id.editStatCONmod);
        conModET.setText( "" + datastats.getConmod());
        String conmoddi = conModET.getText().toString();
        EditText intModET = (EditText) findViewById(R.id.editStatINTmod);
        intModET.setText( "" + datastats.getIntelmod());
        String intmoddi = intModET.getText().toString();
        EditText wisModET = (EditText) findViewById(R.id.editStatWISmod);
        wisModET.setText( "" + datastats.getWismod());
        String wismoddi = wisModET.getText().toString();
        EditText chaModET = (EditText) findViewById(R.id.editStatCHAmod);
        chaModET.setText( "" + datastats.getChamod());
        String chamoddi = chaModET.getText().toString();

        int STRmoddiStat = Integer.parseInt(strmoddi);
        int DEXmoddiStat = Integer.parseInt(dexmoddi);
        int CONmoddiStat = Integer.parseInt(conmoddi);
        int INTmoddiStat = Integer.parseInt(intmoddi);
        int WISmoddiStat = Integer.parseInt(wismoddi);
        int CHAmoddiStat = Integer.parseInt(chamoddi);

        //Rolls

        int STRRollStat = datastats.getRollD20();
        int DEXRollStat = datastats.getRollD20();
        int CONRollStat = datastats.getRollD20();
        int INTRollStat = datastats.getRollD20();
        int WISRollStat = datastats.getRollD20();
        int CHARollStat = datastats.getRollD20();


        EditText strRollET = (EditText) findViewById(R.id.editSTRRoll);
        strRollET.setText(String.format("%d", STRRollStat));
        EditText dexRollET = (EditText) findViewById(R.id.editDEXRoll);
        dexRollET.setText(String.format("%d", DEXRollStat));
        EditText conRollET = (EditText) findViewById(R.id.editCONRoll);
        conRollET.setText(String.format("%d", CONRollStat));
        EditText intRollET = (EditText) findViewById(R.id.editINTRoll);
        intRollET.setText(String.format("%d", INTRollStat));
        EditText wisRollET = (EditText) findViewById(R.id.editWISRoll);
        wisRollET.setText(String.format("%d", WISRollStat));
        EditText chaRollET = (EditText) findViewById(R.id.editCHARoll);
        chaRollET.setText(String.format("%d", CHARollStat));

        //calculation
        int strThrow = datastats.calcThrow(STRmoddiStat,STRRollStat);
        int dexThrow = datastats.calcThrow(DEXmoddiStat,DEXRollStat);
        int conThrow = datastats.calcThrow(CONmoddiStat,CONRollStat);
        int intThrow = datastats.calcThrow(INTmoddiStat,INTRollStat);
        int wisThrow = datastats.calcThrow(WISmoddiStat,WISRollStat);
        int chaThrow = datastats.calcThrow(CHAmoddiStat,CHARollStat);



        //output data
        TextView strThrowTV = (TextView) findViewById(R.id.textSTRThrow);
        strThrowTV.setText(String.format("%d", strThrow));
        TextView dexThrowTV = (TextView) findViewById(R.id.textDEXThrow);
        dexThrowTV.setText(String.format("%d", dexThrow));
        TextView conThrowTV = (TextView) findViewById(R.id.textCONThrow);
        conThrowTV.setText(String.format("%d", conThrow));
        TextView intThrowTV = (TextView) findViewById(R.id.textINTThrow);
        intThrowTV.setText(String.format("%d", intThrow));
        TextView wisThrowTV = (TextView) findViewById(R.id.textWISThrow);
        wisThrowTV.setText(String.format("%d", wisThrow));
        TextView chaThrowTV = (TextView) findViewById(R.id.textCHAThrow);
        chaThrowTV.setText(String.format("%d", chaThrow));
    }

    public void ModifyStats (View v){
        Intent myIntent = new Intent(this, StatusActivity.class);
        this.startActivity(myIntent);
    }

}
