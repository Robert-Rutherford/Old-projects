package com.robertrutherfordapp.dndcharactersheetandformulas;

/**
 * Created by Robert on 10/3/2017.
 */

public class CreateWeapData {
    statsData datastats = MainActivity.dataStats;

    String weapName;
    String weapType;
    int[] numOfDiceArray = new int[5];
    String[] damgtypeArray = new String[5];
    String[] diceTypeArray = new String[5];

    int numD4;
    int numD6;
    int numD8;
    int numD10;
    int numD12;
    int numD20;


    int d4Array[] = new int[10];
    int d6Array[] = new int[10];
    int d8Array[] = new int[10];
    int d10Array[] = new int[10];
    int d12Array[] = new int[10];
    int d20Array[] = new int[10];

    public CreateWeapData() {

    }

    public void initalSetNumbDice() {
        for (int i = 0; i < 3; i++) {
            numOfDiceArray[i] = 0;
        }
    }

    public void setNumOfDice(int diceSetNum, int newNumbDice) {
        numOfDiceArray[diceSetNum] = newNumbDice;
    }

    public void setWeapName(String newName) {
        weapName = newName;
    }

    public void setWeapType(String typeWeap) {
        weapType = typeWeap;
    }

    public void setTypeDice(int arraySlot, String diceType) {
        diceTypeArray[arraySlot] = diceType;
    }

    public void setNumD4(int newnum) {
        numD4 = newnum;
    }

    public void setNumD6(int newnum) {
        numD6 = newnum;
    }

    public void setNumD8(int newnum) {
        numD8 = newnum;
    }

    public void setNumD10(int newnum) {
        numD10 = newnum;
    }

    public void setNumD12(int newnum) {
        numD12 = newnum;
    }

    public void setNumD20(int newnum) {
        numD20 = newnum;
    }

    public void setDamgTypes(int damgTypeNumb, String damageType) {
        damgtypeArray[damgTypeNumb] = damageType;
    }

    public String getWeapName() {
        return weapName;
    }

    public String geatWeapType() {
        return weapType;
    }

    public int getNumD4() {
        return numD4;
    }

    public int getNumD6() {
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

    public int getNumofDice(int setDiceNum) {
        return numOfDiceArray[setDiceNum];
    }


    public int getstatmod(int weapType) {

        int mod = 0;

        if (weapType == 0) { //Melee
            mod = datastats.getStrmod();
        } else if (weapType == 1) { // Ranged
            mod = datastats.getDexmod();
        } else if (weapType == 2) { // Magic
            mod = datastats.getIntelmod();
        }

        return mod;

    }


}
