package com.company;

public class Verifying {

    static float[] Parser(String inp){
        inp=inp.replace(',','.');

        String[] strs=inp.split(" ");//##
        float[] numers=new float[strs.length];
        //##
        for(int i=0;i<strs.length;i++){
            numers[i]=Float.parseFloat(strs[i]);
        }

        return numers;
    }
}
