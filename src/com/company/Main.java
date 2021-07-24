package com.company;

import java.nio.file.OpenOption;

public class Main {

    public static void main(String[] args) {

        Dialog dialog1=new Dialog();
        Data data1=new Data();

        dialog1.Hello();
//        data1.input=dialog1.GetTask();
//        data1.operation=in
        do {
            data1.SetInput(dialog1.GetTask());
            data1.result = Calculation.Calculate(data1.variables, data1.operation);
            }while(!Dialog.Answer(data1.result));
    }
}
