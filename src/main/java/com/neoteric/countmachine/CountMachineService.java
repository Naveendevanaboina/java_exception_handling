package com.neoteric.countmachine;

public class CountMachineService {


    public int countAmount(int numberofNotes , int denominations){
          int count =0;
        for (int i=1 ; i<numberofNotes;i++ ){
            count=count+numberofNotes;
        }
        return count;
    }
}
