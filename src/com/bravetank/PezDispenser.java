package com.bravetank;

public class PezDispenser {
    //final - can only be assigned once. Can't be changed after that.
    private final String characterName;
    //Constant follows - note uppercase & final - can't be changed now it is set
    public final static int MAX_PEX = 12;
    //Note too it is static - provided directly on the class as opposed to needing
    //an instance. This makes sense as ALL pez dispensers have max pez of 12
    private int pezCount;



    public PezDispenser(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getPezCount() {
        return pezCount;
    }

    public void fill(){
         fill(MAX_PEX);
    }

    public void fill(int pezAmount){
        int newAmount = pezCount += pezAmount;
        if (newAmount > MAX_PEX){
            throw new IllegalArgumentException("Too many PEZ!!");
        }
        pezCount = newAmount;
    }

    public boolean isEmpty(){
        //returns true only if pezCount == 0
        return pezCount == 0;
        //effectively says return TRUE IF pezCount == 0
        }

    public boolean dispense(){
        boolean wasDispensed = false;
        if (!isEmpty()){
            pezCount--;
            wasDispensed = true;
        } return wasDispensed;
     }
    }

