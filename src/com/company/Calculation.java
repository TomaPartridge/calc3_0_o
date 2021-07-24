package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

public class Calculation {
    static float Calculate(float[] variables,String operation){

        Float result=0f;
        Float[] temp=new  Float[variables.length];
        for (int i=0;i<variables.length;i++){
            temp[i]=variables[i];
        }

        Stream<Float> stream= Arrays.stream(temp);
        switch (operation){
            case "Sum":
                result= stream.reduce((s1,s2)->s1+s2).get();
                break;
            case "Max":
                result=stream.max(Float::compareTo).get();
                break;
            case "Min":
                result=stream.min(Float::compareTo).get();
                break;
            case "Avg":
                double qq =stream.mapToDouble(n->n.doubleValue()).average().getAsDouble();
                Double qqq=(Double) qq;
                result= qqq.floatValue();
                break;
        }
        return result;
    }
}


