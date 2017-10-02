package com.robertrutherfordapp.dndcharactersheetandformulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class skillsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        updateView();
    }

    public void updateView(){

        statsData datastats = MainActivity.dataStats;
        //output the modifiers form the skill page
        TextView acroMod = (TextView) findViewById(R.id.textModAcro);
        acroMod.setText("" + datastats.getDexmod());
        TextView animalHandMod = (TextView) findViewById(R.id.textModAniHan);
        animalHandMod.setText("" + datastats.getWismod());
        TextView arcanaMod = (TextView) findViewById(R.id.textModArc);
        arcanaMod.setText("" + datastats.getIntelmod());
        TextView athleMod = (TextView) findViewById(R.id.textModAth);
        athleMod.setText("" + datastats.getStrmod());
        TextView decepMod = (TextView) findViewById(R.id.textModDec);
        decepMod.setText("" + datastats.getChamod());
        TextView hisMod = (TextView) findViewById(R.id.textModHis);
        hisMod.setText("" + datastats.getIntelmod());
        TextView insightMod = (TextView) findViewById(R.id.textModIns);
        insightMod.setText("" + datastats.getWismod());
        TextView intimMod = (TextView) findViewById(R.id.textModInti);
        intimMod.setText("" + datastats.getChamod());
        TextView investMod = (TextView) findViewById(R.id.textModInve);
        investMod.setText("" + datastats.getIntelmod());
        TextView mediMod = (TextView) findViewById(R.id.textModMedi);
        mediMod.setText("" + datastats.getWismod());
        TextView natureMod = (TextView) findViewById(R.id.textModNat);
        natureMod.setText("" + datastats.getIntelmod());
        TextView perceptMod = (TextView) findViewById(R.id.textModPerc);
        perceptMod.setText("" + datastats.getWismod());
        TextView perforMod = (TextView) findViewById(R.id.textModPerf);
        perforMod.setText("" + datastats.getChamod());
        TextView persMod = (TextView) findViewById(R.id.textModPers);
        persMod.setText("" + datastats.getChamod());
        TextView religionMod = (TextView) findViewById(R.id.textModReli);
        religionMod.setText("" + datastats.getIntelmod());
        TextView slightofHandMod = (TextView) findViewById(R.id.textModSliOfHand);
        slightofHandMod.setText("" + datastats.getDexmod());
        TextView stealthMod = (TextView) findViewById(R.id.textModStealth);
        stealthMod.setText("" + datastats.getDexmod());
        TextView survMod = (TextView) findViewById(R.id.textModSurv);
        survMod.setText("" + datastats.getWismod());



    }

    public void calcThrow(View v){

        statsData datastats = MainActivity.dataStats;
        // get modifier
        TextView acroMod = (TextView) findViewById(R.id.textModAcro);
        acroMod.setText("" + datastats.getDexmod());
        String acroModString = acroMod.getText().toString();
        TextView animalHandMod = (TextView) findViewById(R.id.textModAniHan);
        animalHandMod.setText("" + datastats.getWismod());
        String animalHanModString = animalHandMod.getText().toString();
        TextView arcanaMod = (TextView) findViewById(R.id.textModArc);
        arcanaMod.setText("" + datastats.getIntelmod());
        String arcanaModString = arcanaMod.getText().toString();
        TextView athleMod = (TextView) findViewById(R.id.textModAth);
        athleMod.setText("" + datastats.getStrmod());
        String athleModString = athleMod.getText().toString();
        TextView decepMod = (TextView) findViewById(R.id.textModDec);
        decepMod.setText("" + datastats.getChamod());
        String decepModString = decepMod.getText().toString();
        TextView hisMod = (TextView) findViewById(R.id.textModHis);
        hisMod.setText("" + datastats.getIntelmod());
        String hisModString = hisMod.getText().toString();
        TextView insightMod = (TextView) findViewById(R.id.textModIns);
        insightMod.setText("" + datastats.getWismod());
        String insModString = insightMod.getText().toString();
        TextView intimMod = (TextView) findViewById(R.id.textModInti);
        intimMod.setText("" + datastats.getChamod());
        String intimModString = intimMod.getText().toString();
        TextView investMod = (TextView) findViewById(R.id.textModInve);
        investMod.setText("" + datastats.getIntelmod());
        String investModString = investMod.getText().toString();
        TextView mediMod = (TextView) findViewById(R.id.textModMedi);
        mediMod.setText("" + datastats.getWismod());
        String mediModString = mediMod.getText().toString();
        TextView natureMod = (TextView) findViewById(R.id.textModNat);
        natureMod.setText("" + datastats.getIntelmod());
        String natModString = natureMod.getText().toString();
        TextView perceptMod = (TextView) findViewById(R.id.textModPerc);
        perceptMod.setText("" + datastats.getWismod());
        String percModString = perceptMod.getText().toString();
        TextView perforMod = (TextView) findViewById(R.id.textModPerf);
        perforMod.setText("" + datastats.getChamod());
        String perfModString = perforMod.getText().toString();
        TextView persMod = (TextView) findViewById(R.id.textModPers);
        persMod.setText("" + datastats.getChamod());
        String persModString = persMod.getText().toString();
        TextView religionMod = (TextView) findViewById(R.id.textModReli);
        religionMod.setText("" + datastats.getIntelmod());
        String reliModString = religionMod.getText().toString();
        TextView slightofHandMod = (TextView) findViewById(R.id.textModSliOfHand);
        slightofHandMod.setText("" + datastats.getDexmod());
        String slideOfHandModString = slightofHandMod.getText().toString();
        TextView stealthMod = (TextView) findViewById(R.id.textModStealth);
        stealthMod.setText("" + datastats.getDexmod());
        String stealthModString = stealthMod.getText().toString();
        TextView survMod = (TextView) findViewById(R.id.textModSurv);
        survMod.setText("" + datastats.getWismod());
        String survModString = survMod.getText().toString();

        int acroStat = Integer.parseInt(acroModString);
        int animHandStat = Integer.parseInt(animalHanModString);
        int arcanaStat = Integer.parseInt(arcanaModString);
        int athlStat = Integer.parseInt(athleModString);
        int decptStat = Integer.parseInt(decepModString);
        int hisStat = Integer.parseInt(hisModString);
        int insStat = Integer.parseInt(insModString);
        int intiStat = Integer.parseInt(intimModString);
        int invesStat = Integer.parseInt(investModString);
        int mediStat = Integer.parseInt(mediModString);
        int natStat = Integer.parseInt(natModString);
        int percStat = Integer.parseInt(percModString);
        int perfStat = Integer.parseInt(perfModString);
        int persStat = Integer.parseInt(persModString);
        int reliStat = Integer.parseInt(reliModString);
        int slideofHandStat = Integer.parseInt(slideOfHandModString);
        int stealthStat = Integer.parseInt(stealthModString);
        int survStat = Integer.parseInt(survModString);


        // get bonus modifier
        EditText rollAcroET = (EditText) findViewById(R.id.editRollAcro);
        String acroRollString = rollAcroET.getText().toString();
        EditText rollAnimHandET = (EditText) findViewById(R.id.editRollAniHan);
        String animalHandRollString = rollAnimHandET.getText().toString();
        EditText rollArcanaET = (EditText) findViewById(R.id.editRollArc);
        String arcanaRollString = rollArcanaET.getText().toString();
        EditText rollAthleET = (EditText) findViewById(R.id.editRollAth);
        String athleRollString = rollAthleET.getText().toString();
        EditText rollDeceptET = (EditText) findViewById(R.id.editRollDec);
        String deceptRollString = rollDeceptET.getText().toString();
        EditText rollHisET = (EditText) findViewById(R.id.editRollHis);
        String hisRollString = rollHisET.getText().toString();
        EditText rollInsightET = (EditText) findViewById(R.id.editRollIns);
        String insRollString = rollInsightET.getText().toString();
        EditText rollIntimET = (EditText) findViewById(R.id.editRollInti);
        String intimRollString = rollIntimET.getText().toString();
        EditText rollInvesET = (EditText) findViewById(R.id.editRollInve);
        String invesRollString = rollInvesET.getText().toString();
        EditText rollMediET = (EditText) findViewById(R.id.editRollMedi);
        String mediRollString = rollMediET.getText().toString();
        EditText rollNatureET = (EditText) findViewById(R.id.editRollNat);
        String natRollString = rollNatureET.getText().toString();
        EditText rollPercET = (EditText) findViewById(R.id.editRollPerc);
        String percRollString = rollPercET.getText().toString();
        EditText rollPerfET = (EditText) findViewById(R.id.editRollPerf);
        String perfRollString = rollPerfET.getText().toString();
        EditText rollPersET = (EditText) findViewById(R.id.editRollPers);
        String persRollString = rollPersET.getText().toString();
        EditText rollReliET = (EditText) findViewById(R.id.editRollReli);
        String reliRollString = rollReliET.getText().toString();
        EditText rollSliofHandET = (EditText) findViewById(R.id.editRollSliOfHand);
        String sliofHandRollString = rollSliofHandET.getText().toString();
        EditText rollStealthET = (EditText) findViewById(R.id.editRollStealth);
        String stealthRollString = rollStealthET.getText().toString();
        EditText rollSurvET = (EditText) findViewById(R.id.editRollSurv);
        String survRollString = rollSurvET.getText().toString();

        int acroRoll = Integer.parseInt(acroRollString);
        int animHandRoll = Integer.parseInt(animalHandRollString);
        int arcanaRoll = Integer.parseInt(arcanaRollString);
        int athlRoll = Integer.parseInt(athleRollString);
        int decptRoll = Integer.parseInt(deceptRollString);
        int hisRoll = Integer.parseInt(hisRollString);
        int insRoll = Integer.parseInt(insRollString);
        int intiRoll = Integer.parseInt(intimRollString);
        int invesRoll = Integer.parseInt(invesRollString);
        int mediRoll = Integer.parseInt(mediRollString);
        int natRoll = Integer.parseInt(natRollString);
        int percRoll = Integer.parseInt(percRollString);
        int perfRoll = Integer.parseInt(perfRollString);
        int persRoll = Integer.parseInt(persRollString);
        int reliRoll = Integer.parseInt(reliRollString);
        int slideofHandRoll = Integer.parseInt(sliofHandRollString);
        int stealthRoll = Integer.parseInt(stealthRollString);
        int survRoll = Integer.parseInt(survRollString);

        //calculate
        int acroThrow = datastats.calcThrow(acroStat,acroRoll);
        int animHandThrow = datastats.calcThrow(animHandStat, animHandRoll);
        int arcanaThrow = datastats.calcThrow(arcanaStat, arcanaRoll);
        int athlThrow = datastats.calcThrow(athlStat, athlRoll);
        int deceptThrow = datastats.calcThrow(decptStat, decptRoll);
        int hisThrow = datastats.calcThrow(hisStat, hisRoll);
        int insThrow = datastats.calcThrow(insStat, insRoll);
        int intiThrow = datastats.calcThrow(intiStat, intiRoll);
        int invesThrow = datastats.calcThrow(invesStat, invesRoll);
        int mediThrow = datastats.calcThrow(mediStat, mediRoll);
        int natThrow = datastats.calcThrow(natStat, natRoll);
        int percThrow = datastats.calcThrow(percStat, percRoll);
        int perfThrow = datastats.calcThrow(perfStat, perfRoll);
        int persThrow = datastats.calcThrow(persStat, persRoll);
        int reliThrow = datastats.calcThrow(reliStat, reliRoll);
        int slideofHandThrow = datastats.calcThrow(slideofHandStat, slideofHandRoll);
        int stealthThrow = datastats.calcThrow(stealthStat, stealthRoll);
        int survThrow = datastats.calcThrow(survStat, survRoll);

        //output throw
        TextView throwacro = (TextView) findViewById(R.id.textThrowAcro);
        throwacro.setText(String.format("%d", acroThrow));
        TextView throwanimHand = (TextView) findViewById(R.id.textThrowAniHan);
        throwanimHand.setText(String.format("%d", animHandThrow));
        TextView throwarcana = (TextView) findViewById(R.id.textThrowArc);
        throwarcana.setText(String.format("%d", arcanaThrow));
        TextView throwathl = (TextView) findViewById(R.id.textThrowAth);
        throwathl.setText(String.format("%d", athlThrow));
        TextView throwdecept = (TextView) findViewById(R.id.textThrowDec);
        throwdecept.setText(String.format("%d", deceptThrow));
        TextView throwHis = (TextView) findViewById(R.id.textThrowHis);
        throwHis.setText(String.format("%d", hisThrow));
        TextView throwins = (TextView) findViewById(R.id.textThrowIns);
        throwins.setText(String.format("%d", insThrow));
        TextView throwinti = (TextView) findViewById(R.id.textThrowInti);
        throwinti.setText(String.format("%d", intiThrow));
        TextView throwinves = (TextView) findViewById(R.id.textThrowInve);
        throwinves.setText(String.format("%d", invesThrow));
        TextView throwmedi = (TextView) findViewById(R.id.textThrowMedi);
        throwmedi.setText(String.format("%d", mediThrow));
        TextView thrownat = (TextView) findViewById(R.id.textThrowNat);
        thrownat.setText(String.format("%d", natThrow));
        TextView throwperc = (TextView) findViewById(R.id.textThrowPerc);
        throwperc.setText(String.format("%d", percThrow));
        TextView throwperf = (TextView) findViewById(R.id.textThrowPerf);
        throwperf.setText(String.format("%d", perfThrow));
        TextView throwpers = (TextView) findViewById(R.id.textThrowPers);
        throwpers.setText(String.format("%d", persThrow));
        TextView throwreli = (TextView) findViewById(R.id.textThrowReli);
        throwreli.setText(String.format("%d", reliThrow));
        TextView throwslidofhan = (TextView) findViewById(R.id.textThrowSliOfHand);
        throwslidofhan.setText(String.format("%d", slideofHandThrow));
        TextView throwstealth = (TextView) findViewById(R.id.textThrowStealth);
        throwstealth.setText(String.format("%d", stealthThrow));
        TextView throwsurv = (TextView) findViewById(R.id.textThrowSurv);
        throwsurv.setText(String.format("%d", survThrow));

    }


    public void rollThrow(View v){

        statsData datastats = MainActivity.dataStats;
        // get modifier
        TextView acroMod = (TextView) findViewById(R.id.textModAcro);
        acroMod.setText("" + datastats.getDexmod());
        String acroModString = acroMod.getText().toString();
        TextView animalHandMod = (TextView) findViewById(R.id.textModAniHan);
        animalHandMod.setText("" + datastats.getWismod());
        String animalHanModString = animalHandMod.getText().toString();
        TextView arcanaMod = (TextView) findViewById(R.id.textModArc);
        arcanaMod.setText("" + datastats.getIntelmod());
        String arcanaModString = arcanaMod.getText().toString();
        TextView athleMod = (TextView) findViewById(R.id.textModAth);
        athleMod.setText("" + datastats.getStrmod());
        String athleModString = athleMod.getText().toString();
        TextView decepMod = (TextView) findViewById(R.id.textModDec);
        decepMod.setText("" + datastats.getChamod());
        String decepModString = decepMod.getText().toString();
        TextView hisMod = (TextView) findViewById(R.id.textModHis);
        hisMod.setText("" + datastats.getIntelmod());
        String hisModString = hisMod.getText().toString();
        TextView insightMod = (TextView) findViewById(R.id.textModIns);
        insightMod.setText("" + datastats.getWismod());
        String insModString = insightMod.getText().toString();
        TextView intimMod = (TextView) findViewById(R.id.textModInti);
        intimMod.setText("" + datastats.getChamod());
        String intimModString = intimMod.getText().toString();
        TextView investMod = (TextView) findViewById(R.id.textModInve);
        investMod.setText("" + datastats.getIntelmod());
        String investModString = investMod.getText().toString();
        TextView mediMod = (TextView) findViewById(R.id.textModMedi);
        mediMod.setText("" + datastats.getWismod());
        String mediModString = mediMod.getText().toString();
        TextView natureMod = (TextView) findViewById(R.id.textModNat);
        natureMod.setText("" + datastats.getIntelmod());
        String natModString = natureMod.getText().toString();
        TextView perceptMod = (TextView) findViewById(R.id.textModPerc);
        perceptMod.setText("" + datastats.getWismod());
        String percModString = perceptMod.getText().toString();
        TextView perforMod = (TextView) findViewById(R.id.textModPerf);
        perforMod.setText("" + datastats.getChamod());
        String perfModString = perforMod.getText().toString();
        TextView persMod = (TextView) findViewById(R.id.textModPers);
        persMod.setText("" + datastats.getChamod());
        String persModString = persMod.getText().toString();
        TextView religionMod = (TextView) findViewById(R.id.textModReli);
        religionMod.setText("" + datastats.getIntelmod());
        String reliModString = religionMod.getText().toString();
        TextView slightofHandMod = (TextView) findViewById(R.id.textModSliOfHand);
        slightofHandMod.setText("" + datastats.getDexmod());
        String slideOfHandModString = slightofHandMod.getText().toString();
        TextView stealthMod = (TextView) findViewById(R.id.textModStealth);
        stealthMod.setText("" + datastats.getDexmod());
        String stealthModString = stealthMod.getText().toString();
        TextView survMod = (TextView) findViewById(R.id.textModSurv);
        survMod.setText("" + datastats.getWismod());
        String survModString = survMod.getText().toString();

        int acroStat = Integer.parseInt(acroModString);
        int animHandStat = Integer.parseInt(animalHanModString);
        int arcanaStat = Integer.parseInt(arcanaModString);
        int athlStat = Integer.parseInt(athleModString);
        int decptStat = Integer.parseInt(decepModString);
        int hisStat = Integer.parseInt(hisModString);
        int insStat = Integer.parseInt(insModString);
        int intiStat = Integer.parseInt(intimModString);
        int invesStat = Integer.parseInt(investModString);
        int mediStat = Integer.parseInt(mediModString);
        int natStat = Integer.parseInt(natModString);
        int percStat = Integer.parseInt(percModString);
        int perfStat = Integer.parseInt(perfModString);
        int persStat = Integer.parseInt(persModString);
        int reliStat = Integer.parseInt(reliModString);
        int slideofHandStat = Integer.parseInt(slideOfHandModString);
        int stealthStat = Integer.parseInt(stealthModString);
        int survStat = Integer.parseInt(survModString);

        // get bonus modifier
        int acroRoll = datastats.getRollD20();                     //Integer.parseInt(acroRollString);
        int animHandRoll = datastats.getRollD20();                  //Integer.parseInt(animalHandRollString);
        int arcanaRoll = datastats.getRollD20();                    //Integer.parseInt(arcanaRollString);
        int athlRoll = datastats.getRollD20();                      //Integer.parseInt(athleRollString);
        int decptRoll = datastats.getRollD20();                     //Integer.parseInt(deceptRollString);
        int hisRoll = datastats.getRollD20();                       //Integer.parseInt(hisRollString);
        int insRoll = datastats.getRollD20();                       //Integer.parseInt(insRollString);
        int intiRoll = datastats.getRollD20();                       //Integer.parseInt(intimRollString);
        int invesRoll = datastats.getRollD20();                      //Integer.parseInt(invesRollString);
        int mediRoll = datastats.getRollD20();                      //Integer.parseInt(mediRollString);
        int natRoll = datastats.getRollD20();                       //Integer.parseInt(natRollString);
        int percRoll = datastats.getRollD20();                      //Integer.parseInt(percRollString);
        int perfRoll = datastats.getRollD20();                      //Integer.parseInt(perfRollString);
        int persRoll = datastats.getRollD20();                      //Integer.parseInt(persRollString);
        int reliRoll = datastats.getRollD20();                      //Integer.parseInt(reliRollString);
        int slideofHandRoll = datastats.getRollD20();                //Integer.parseInt(sliofHandRollString);
        int stealthRoll = datastats.getRollD20();                   //Integer.parseInt(stealthRollString);
        int survRoll = datastats.getRollD20();                       //Integer.parseInt(survRollString);

        EditText rollAcroET = (EditText) findViewById(R.id.editRollAcro);
        rollAcroET.setText(String.format("%d", acroRoll));
        EditText rollAnimHandET = (EditText) findViewById(R.id.editRollAniHan);
        rollAnimHandET.setText(String.format("%d", animHandRoll));
        EditText rollArcanaET = (EditText) findViewById(R.id.editRollArc);
        rollArcanaET.setText(String.format("%d", arcanaRoll));
        EditText rollAthleET = (EditText) findViewById(R.id.editRollAth);
        rollAthleET.setText(String.format("%d", athlRoll));
        EditText rollDeceptET = (EditText) findViewById(R.id.editRollDec);
        rollDeceptET.setText(String.format("%d", decptRoll));
        EditText rollHisET = (EditText) findViewById(R.id.editRollHis);
        rollHisET.setText(String.format("%d", hisRoll));
        EditText rollInsightET = (EditText) findViewById(R.id.editRollIns);
        rollInsightET.setText(String.format("%d", insRoll));
        EditText rollIntimET = (EditText) findViewById(R.id.editRollInti);
        rollIntimET.setText(String.format("%d", intiRoll));
        EditText rollInvesET = (EditText) findViewById(R.id.editRollInve);
        rollInvesET.setText(String.format("%d", invesRoll));
        EditText rollMediET = (EditText) findViewById(R.id.editRollMedi);
        rollMediET.setText(String.format("%d", mediRoll));
        EditText rollNatureET = (EditText) findViewById(R.id.editRollNat);
        rollNatureET.setText(String.format("%d", natRoll));
        EditText rollPercET = (EditText) findViewById(R.id.editRollPerc);
        rollPercET.setText(String.format("%d", percRoll));
        EditText rollPerfET = (EditText) findViewById(R.id.editRollPerf);
        rollPerfET.setText(String.format("%d", perfRoll));
        EditText rollPersET = (EditText) findViewById(R.id.editRollPers);
        rollPersET.setText(String.format("%d", persRoll));
        EditText rollReliET = (EditText) findViewById(R.id.editRollReli);
        rollReliET.setText(String.format("%d", reliRoll));
        EditText rollSliofHandET = (EditText) findViewById(R.id.editRollSliOfHand);
        rollSliofHandET.setText(String.format("%d", slideofHandRoll));
        EditText rollStealthET = (EditText) findViewById(R.id.editRollStealth);
        rollStealthET.setText(String.format("%d", stealthRoll));
        EditText rollSurvET = (EditText) findViewById(R.id.editRollSurv);
        rollSurvET.setText(String.format("%d", survRoll));

        //calculate
        int acroThrow = datastats.calcThrow(acroStat,acroRoll);
        int animHandThrow = datastats.calcThrow(animHandStat, animHandRoll);
        int arcanaThrow = datastats.calcThrow(arcanaStat, arcanaRoll);
        int athlThrow = datastats.calcThrow(athlStat, athlRoll);
        int deceptThrow = datastats.calcThrow(decptStat, decptRoll);
        int hisThrow = datastats.calcThrow(hisStat, hisRoll);
        int insThrow = datastats.calcThrow(insStat, insRoll);
        int intiThrow = datastats.calcThrow(intiStat, intiRoll);
        int invesThrow = datastats.calcThrow(invesStat, invesRoll);
        int mediThrow = datastats.calcThrow(mediStat, mediRoll);
        int natThrow = datastats.calcThrow(natStat, natRoll);
        int percThrow = datastats.calcThrow(percStat, percRoll);
        int perfThrow = datastats.calcThrow(perfStat, perfRoll);
        int persThrow = datastats.calcThrow(persStat, persRoll);
        int reliThrow = datastats.calcThrow(reliStat, reliRoll);
        int slideofHandThrow = datastats.calcThrow(slideofHandStat, slideofHandRoll);
        int stealthThrow = datastats.calcThrow(stealthStat, stealthRoll);
        int survThrow = datastats.calcThrow(survStat, survRoll);

        //output throw
        TextView throwacro = (TextView) findViewById(R.id.textThrowAcro);
        throwacro.setText(String.format("%d", acroThrow));
        TextView throwanimHand = (TextView) findViewById(R.id.textThrowAniHan);
        throwanimHand.setText(String.format("%d", animHandThrow));
        TextView throwarcana = (TextView) findViewById(R.id.textThrowArc);
        throwarcana.setText(String.format("%d", arcanaThrow));
        TextView throwathl = (TextView) findViewById(R.id.textThrowAth);
        throwathl.setText(String.format("%d", athlThrow));
        TextView throwdecept = (TextView) findViewById(R.id.textThrowDec);
        throwdecept.setText(String.format("%d", deceptThrow));
        TextView throwHis = (TextView) findViewById(R.id.textThrowHis);
        throwHis.setText(String.format("%d", hisThrow));
        TextView throwins = (TextView) findViewById(R.id.textThrowIns);
        throwins.setText(String.format("%d", insThrow));
        TextView throwinti = (TextView) findViewById(R.id.textThrowInti);
        throwinti.setText(String.format("%d", intiThrow));
        TextView throwinves = (TextView) findViewById(R.id.textThrowInve);
        throwinves.setText(String.format("%d", invesThrow));
        TextView throwmedi = (TextView) findViewById(R.id.textThrowMedi);
        throwmedi.setText(String.format("%d", mediThrow));
        TextView thrownat = (TextView) findViewById(R.id.textThrowNat);
        thrownat.setText(String.format("%d", natThrow));
        TextView throwperc = (TextView) findViewById(R.id.textThrowPerc);
        throwperc.setText(String.format("%d", percThrow));
        TextView throwperf = (TextView) findViewById(R.id.textThrowPerf);
        throwperf.setText(String.format("%d", perfThrow));
        TextView throwpers = (TextView) findViewById(R.id.textThrowPers);
        throwpers.setText(String.format("%d", persThrow));
        TextView throwreli = (TextView) findViewById(R.id.textThrowReli);
        throwreli.setText(String.format("%d", reliThrow));
        TextView throwslidofhan = (TextView) findViewById(R.id.textThrowSliOfHand);
        throwslidofhan.setText(String.format("%d", slideofHandThrow));
        TextView throwstealth = (TextView) findViewById(R.id.textThrowStealth);
        throwstealth.setText(String.format("%d", stealthThrow));
        TextView throwsurv = (TextView) findViewById(R.id.textThrowSurv);
        throwsurv.setText(String.format("%d", survThrow));

    }

}
