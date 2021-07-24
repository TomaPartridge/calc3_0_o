package com.company;

public class Data {

    float[] variables;
    String operation;
    float result;

    void SetInput(String[] inp){
        variables=Verifying.Parser(inp[0]);
        operation=inp[1];
    }
}