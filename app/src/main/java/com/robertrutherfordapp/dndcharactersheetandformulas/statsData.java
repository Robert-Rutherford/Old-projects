package com.robertrutherfordapp.dndcharactersheetandformulas;

/**
 * Created by Robert on 9/19/2017.
 */

public class statsData {

    private int str;
    private int dex;
    private int con;
    private int intel;
    private int wis;
    private int cha;

    private int strmod;
    private int dexmod;
    private int conmod;
    private int intelmod;
    private int wismod;
    private int chamod;


    private int prof = 0;

    public statsData(){
        setStr(0);
        setDex(0);
        setCon(0);
        setIntel(0);
        setWis(0);
        setCha(0);
        setStrBmod(0);
        setDexBmod(0);
        setConBmod(0);
        setIntelBmod(0);
        setWisBmod(0);
        setChaBmod(0);
    }

    public statsData(int newStr, int newDex, int newCon, int newIntel, int newWis, int newCha,
                     int newStrmod, int newDexmod, int newConmod, int newIntelmod, int newWismod,
                     int newChamod){
        setStr(newStr);
        setDex(newDex);
        setCon(newCon);
        setIntel(newIntel);
        setWis(newWis);
        setCha(newCha);
        setStrBmod(newStrmod);
        setDexBmod(newDexmod);
        setConBmod(newConmod);
        setIntelBmod(newIntelmod);
        setWisBmod(newWismod);
        setChaBmod(newChamod);
    }

    public void setStr (int newStr){
        if (newStr >= 0)
            str = newStr;
    }

    public void setDex (int newDex){
        if (newDex >= 0)
            dex = newDex;
    }

    public void setCon (int newCon){
        if (newCon >= 0)
            con = newCon;
    }

    public void setIntel (int newIntel){
        if (newIntel >= 0)
            intel = newIntel;
    }

    public void setWis (int newWis){
        if (newWis >= 0)
            wis = newWis;
    }

    public void setCha (int newCha){
        if (newCha >= 0)
            cha = newCha;
    }

    public void setStrBmod (int newstr){
        if (newstr >= 0)
            strmod = newstr;
    }

    public void setDexBmod (int newDex){
        if (newDex >= 0)
            dexmod = newDex;
    }

    public void setConBmod (int newCon){
        if (newCon >= 0)
            conmod = newCon;
    }

    public void setIntelBmod (int newIntel){
        if (newIntel >= 0)
            intelmod = newIntel;
    }

    public void setWisBmod (int newWis){
        if (newWis >= 0)
            wismod = newWis;
    }

    public void setChaBmod (int newCha){
        if (newCha >= 0)
            chamod = newCha;
    }

    public void setProf (int newProf){
        if (newProf >= 0)
            prof = newProf;
    }

    public int calcMod(int charStat, int bonusMod){

        int statTotal = charStat + bonusMod;
        int modStat = 0;
        if (statTotal >= 20){
            statTotal = 20;
            modStat = 5;
        }else if(statTotal < 20 && statTotal >= 18){
            modStat = 4;
        }else if (statTotal < 18 && statTotal >= 16){
            modStat = 3;
        }else if (statTotal < 16 && statTotal >= 14){
            modStat = 2;
        }else if (statTotal < 14 && statTotal >= 12){
            modStat = 1;
        }else if (statTotal < 12 && statTotal >= 10){
            modStat = 0;
        }else if (statTotal < 10 && statTotal >= 8){
            modStat = -1;
        }else if (statTotal < 8 && statTotal >= 6){
            modStat = -2;
        }else if (statTotal < 6 && statTotal >= 4){
            modStat = -3;
        }else if (statTotal < 4 && statTotal >= 2){
            modStat = -4;
        }else if (statTotal < 2 && statTotal > 0){
            modStat = -5;
        } else if (statTotal <= 0) {
            statTotal = 1;
            modStat = -5;
        }

        return modStat;
    }

    public int getStr(){
        int moddifier;
        return moddifier = calcMod(str, strmod);
    }

    public int getDex(){
        int moddifier;
        return moddifier = calcMod(dex,dexmod);
    }

    public int getCon(){
        int moddifier;
        return moddifier = calcMod(con,conmod);
    }

    public int getIntel(){
        int moddifier;
        return moddifier = calcMod(intel,intelmod);
    }

    public int getWis(){
        int moddifier;
        return moddifier = calcMod(wis,wismod);
    }

    public int getCha(){
        int moddifier;
        return moddifier = calcMod(cha,chamod);
    }






}
