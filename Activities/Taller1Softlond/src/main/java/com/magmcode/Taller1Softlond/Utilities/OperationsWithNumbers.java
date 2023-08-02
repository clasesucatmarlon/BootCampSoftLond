package com.magmcode.Taller1Softlond.Utilities;

import javax.swing.*;
import java.text.DecimalFormat;


public class OperationsWithNumbers {
    public static Integer add(int a, int b) {
        return a + b;
    }

    public static Integer rest(int a, int b) {
        return a - b;
    }

    public static Integer product(int a, int b) {
        return a * b;
    }

    public static Float cocient(int a, int b) {
        return (float) (a / b);
    }

    public static Boolean isParNumber(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Float AreaCircle(float radiusCircle) {
        return (float) (Math.PI * Math.pow(radiusCircle, 2));
    }

    public static Float PerimeterCircle(float radiusCircle) {
        return (float) (2 * Math.PI * radiusCircle);
    }

    public static Boolean ValidateAge(int agePerson) {
        return (agePerson >= 18) ? true : false;
    }

    public static Integer DetermineLargestNumber(int number1, int number2) {
        int major;
        return (number1 > number2) ? number1 : number2;
    }

    public static String ValidateNumber(int number) {
        if (number > 0) {
            return "POSITIVE";
        } else if (number < 0) {
            return "NEGATIVE";
        } else {
            return "ZERO";
        }
    }

    public static void GenerateTableForNumber(int number) {

        if (number < 0) {
            JOptionPane.showMessageDialog(null, ("The number " + number + " not is positive. \n You must enter a number greater than zero"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String msg = "";
        for (int i = 1; i <= 10; i++) {
            msg += (number + " * " + i + " = " + (number * i) + "\n");
        }
        JOptionPane.showMessageDialog(null, msg, "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    public static Integer generateNumberRandomBetweenTwoValues(int minNumber, int maxNumber) {
        return (int) (Math.random() * (maxNumber - minNumber +1 ) + 1);
    }
}