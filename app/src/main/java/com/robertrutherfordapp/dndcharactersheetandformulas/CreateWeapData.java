package com.robertrutherfordapp.dndcharactersheetandformulas;

/**
 * Created by Robert on 10/3/2017.
 */

public class CreateWeapData {
    statsData datastats = MainActivity.dataStats;

    int numD4;
    int numD6;
    int numD8;
    int numD10;
    int numD12;
    int numD20;

    String[] damgtypeArray = new String[5];

    int d4Array[] = new int[10];
    int d6Array[] = new int[10];
    int d8Array[] = new int[10];
    int d10Array[] = new int[10];
    int d12Array[] = new int[10];
    int d20Array[] = new int[10];

    public CreateWeapData(){

    }

    public void setNumD4 (int newnum){
        numD4 = newnum;
    }

    public void setNumD6 (int newnum){
        numD6 = newnum;
    }

    public void setNumD8 (int newnum){
        numD8 = newnum;
    }

    public void setNumD10 (int newnum){
        numD10 = newnum;
    }

    public void setNumD12 (int newnum){
        numD12 = newnum;
    }

    public void setNumD20 (int newnum){
        numD20 = newnum;
    }

    public void setDamgTypes (int damgTypeNumb, String damageType){
        damgtypeArray[damgTypeNumb] = damageType;
    }

    public int getNumD4(){
        return numD4;
    }

    public int getNumD6(){
        return numD6;
    }

    public int getNumD8() {
        return numD8;
    }

    public int getNumD10() {
        return numD10;
    }

    public int getNumD12() {
        return numD12;
    }

    public int getNumD20() {
        return numD20;
    }

    public int getstatmod(int weapType){
        int mod = 0;

        if(weapType == 0){ //Melee
            mod= datastats.getStrmod();
        }else if(weapType == 1){ // Ranged
            mod = datastats.getDexmod();
        }else if (weapType == 2){ // Magic
            mod = datastats.getIntelmod();
        }

        return mod;

    }




}
