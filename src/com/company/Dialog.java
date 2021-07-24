package com.company;

//import java.awt.event.KeyListener;

public class Dialog {

    public void Hello()
    {
        System.out.println("You are welcome to the calculator!!!");
    }

    public String[] GetTask()
    {
        System.out.println("Введите числа через пробел и нажмите \"Enter\"");///("Введите в стоку пример и нажмите \"Enter\"");
        java.util.Scanner scan=new  java.util.Scanner(System.in);
        String[] Task=new String[2];
        Task[0]=scan.nextLine();

        System.out.println("Выберете операцию:\nSum Max Avg Min");
        Task[1]=scan.nextLine();
        switch (Task[1]){
            case "1":
            case"+":
                Task[1]="Sum";
                break;
            case "2":
                Task[1]="Max";
                break;
            case "3":
                Task[1]="Avg";
                break;
            case "4":
                Task[1]="Min";
                break;
//            default:
//                System.out.println("Нет такой опера");
        }

        return  Task;
    }

    public static boolean Answer(float result){
        System.out.println("Результат операции: "+result+
                "\nдля выхода введите \"Q\", для продолжения любую другую строку.");

        //javax.swing.JFrame frame=new Listen();
        java.util.Scanner scan=new  java.util.Scanner(System.in);
        String exit=scan.nextLine();

        return  exit.charAt(0)=='Q';
    }

}
