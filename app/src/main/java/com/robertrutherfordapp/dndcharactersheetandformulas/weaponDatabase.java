package com.robertrutherfordapp.dndcharactersheetandformulas;

/**
 * Created by Robert on 10/17/2017.
 */

public class weaponDatabase {
    String[] weapNames = new String[10];
    String[] weaponType = new String[10];
    String[][] numbOfDice = new String[10][5];
    String[][] typeOfDice = new String[10][5];
    String[][] damageType = new String[10][5];
    int[] weaponNumbSets = new int[10];
    int numbOfWeaps = 0;

    CreateWeapData weapStats = MainActivity.weapStats;

    public weaponDatabase(){

    }

    public void addWeapon(String weapname, String weapType, String[] numofDice, String[] typeofdice,
                          String[] damType, int NumbOfSets){

        weapNames[numbOfWeaps] = weapname;
        weaponType[numbOfWeaps] = weapType;
        weaponNumbSets[numbOfWeaps] = NumbOfSets;

        for (int i= 0; i < NumbOfSets; i++){
            numbOfDice[numbOfWeaps][i] = numofDice[i];
            typeOfDice[numbOfWeaps][i] = typeofdice[i];
            damageType[numbOfWeaps][i] = damType[i];

        }
        numbOfWeaps++;

    }


    public void deleteWeapon(int weapID){


        if (weapID < numbOfWeaps){
            for (int i = weapID+1; i <= numbOfWeaps; i++){

                //clean previous line
                weapNames[i-1] = null;
                weaponType[i-1] = null;
                weaponNumbSets[i-1] = 0;

                for (int k = 0; k < weaponNumbSets[i]; k++ ){
                    numbOfDice[weaponNumbSets[i-1]][k] = null;
                    typeOfDice[weaponNumbSets[i-1]][k] = null;
                    damageType[weaponNumbSets[i-1]][k] = null;
                }



                //move next line up
                weapNames[i-1] = weapNames[i];
                weaponType[i-1] = weaponType[i];
                weaponNumbSets[i-1] = weaponNumbSets[i];
                for (int j = 0; j < weaponNumbSets[i]; j++ ){
                    numbOfDice[weaponNumbSets[i-1]][j] = numbOfDice[weaponNumbSets[i]][j];
                    typeOfDice[weaponNumbSets[i-1]][j] = typeOfDice[weaponNumbSets[i]][j];
                    damageType[weaponNumbSets[i-1]][j] = damageType[weaponNumbSets[i]][j];
                }

            }

        }else if (weapID == numbOfWeaps){
            weapNames[weapID] = null;
            weaponType[weapID] = null;
            weaponNumbSets[weapID] = 0;

            for (int k = 0; k < weaponNumbSets[weapID]; k++ ){
                numbOfDice[weaponNumbSets[weapID]][k] = null;
                typeOfDice[weaponNumbSets[weapID]][k] = null;
                damageType[weaponNumbSets[weapID]][k] = null;
            }


        }else{

        }


        numbOfWeaps--;
    }










}
