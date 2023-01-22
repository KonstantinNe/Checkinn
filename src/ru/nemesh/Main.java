package ru.nemesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String input = null;  
        String keyapi = "125633555856622";
        String result = null;

        input = scanner.nextLine();
//        try {
            input = Check.getHownum(input);
//
//        } catch (NumException e) {
//            System.out.println(e.getMessage());
           // continue;
        //}
      result = String.valueOf((Senda.checkOrg(input,keyapi)));
    }
}
