package com.company;

public class Data {

    //    String input;
//    float variable1;
//    float variable2;
//    char operation;
    private String[] input;
    float[] variables;
    String operation;
    float result;

    void SetInput(String[] inp){
        variables=Verifying.Parser(inp[0]);
        operation=inp[1];
    }
}