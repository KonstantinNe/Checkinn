package ru.nemesh;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("Введите ИНН");
        Scanner scanner = new Scanner(System.in);
        String input = null;   
        String keyapi = "125633555856622";
        String result = null;

        JButton button = new JButton("Найти");
        ActionListener actionListener = new ToActionListener();
        button.addActionListener(actionListener);
        input = scanner.nextLine();
//        try {
        input = String.valueOf(Check.getHownum(input));
//
//        } catch (NumException e) {
//            System.out.println(e.getMessage());
           // continue;
        //}
      result = String.valueOf((Senda.checkOrg(input,keyapi)));
        System.out.println("Информация по организации" + result);
    }
}
