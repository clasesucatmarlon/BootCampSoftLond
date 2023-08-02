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

    public static Long NumberFactorial (long number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static String FibonacciSerie (int termins) {
        int valueCurrent = 0;
        int valueNext = 1;
        String msg = "";
        int fibonacci;
        msg += valueCurrent + ", ";
        msg += valueNext + ", ";

        for (int i = 2; i < termins; i++) {
            fibonacci = valueCurrent + valueNext;
            msg += fibonacci + ", ";
            valueCurrent = valueNext;
            valueNext = fibonacci;
        }
        return msg;
    }

    public static Float AreaTriangleWithHeron(int sideA, int sideB, int sideC) {
        float semiPerimeter = (sideA + sideB + sideC) / 2;
        float radicando =  (semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        return (float) Math.sqrt( radicando );
    }

    public static Boolean NumberIsPrime (int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if((number % i) == 0) {
                count++;
            }
        }
        if (count <= 2) {
            return true;
        } else{
            return false;
        }
    }

    public static Double RoundNumber(float numberToRound, int numberDecimals) {
        double partInteger;
        double result;
        result = numberToRound;
        partInteger = Math.floor(result);
        result = (result - partInteger) * Math.pow(10, numberDecimals);
        result = Math.round(result);
        result = (result / Math.pow(10, numberDecimals)) + partInteger;
        return result;
    }

    public static Boolean NumberIsPerfect (int number) {
        int acum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                acum = acum + i;
            }
        }
        if (acum == number) {
            return true;
        } else {
            return false;
        }
    }


}