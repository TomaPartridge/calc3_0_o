package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

public class Verifying {

//    Object[] Parser(String inp)
//    {
//        Object[] answer=new Object[3];
//        String digits="123456789";
//        String operations="+-*/";
//        String num="";
//        int count=0;
//
//        for (int i=0;i<inp.length();i++){
//            if(IsPattern(inp.charAt(i),digits)){
//                num+=inp.charAt(i);
//            }else if(inp.charAt(i)=='.'||inp.charAt(i)==','){
//                num+='.';
//            }else if(IsPattern(inp.charAt(i),operations)){
//                //float numer=Float.parseFloat(num);
//                answer[count]=Float.parseFloat(num);
//                answer[++count]=inp.charAt(i);
//                count++;
//            }
//
////            switch (inp.charAt(i)){
////                case '1'+'2':
////                    break;
////                case  {'a','b'}:
////                    break;
////            }
//
//        }
//        answer[count]=Float.parseFloat(num);
//
//
//        return answer;
//    }

    static float[] Parser(String inp){
//        Arrays.asList(inp.toCharArray()).stream().forEachOrdered((p)->{
//            if(p.equals(',')){
//                return '.';
//            }else {
//                return p;
//            }
       // }); //p.equals(',')?'.':p); //==','?'.':p);
        inp=inp.replace(',','.');

        String[] strs=inp.split(" ");//##
        float[] numers=new float[strs.length];
        //##
        for(int i=0;i<strs.length;i++){
            numers[i]=Float.parseFloat(strs[i]);
        }

        return numers;
    }

//    private boolean IsPattern(char symb,String pat){
//        for (int i=0;i<pat.length();i++) {
//            if(symb==pat.charAt(i)) {
//                return true;
//            }
//        }
//        return false;
//    }

}
