package com.magmcode.Taller1Softlond.Utilities;

import javax.swing.*;

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
        if (count == 2) {
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

    public static Boolean isCapicua (long number) {
        long rest;
        long invert = 0;
        long copyNumber = number;
        while(number != 0) {
            rest = number % 10;
            invert = (invert * 10) + rest;
            number = number / 10;
        }
        if (invert == copyNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static String generatePassword2(int size) {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

        String msg = "";
        for (int i = 0; i < size; i++)
        {
            int randomIndex = generateNumberRandomBetweenTwoValues(0, chars.length - 1);
            msg += chars[randomIndex];
        }
        return msg;
    }

    public static String generatePassword(int size) {
        String msg = "";
        for (int i = 0; i < size; i++) {
            int rand = (int)(Math.random() * 62);  // 10 numbers, 26 uppercase letter, 26 lowercase letters
            if(rand <= 9) {
                int number = rand + 48; // Number (48-57 in ASCII)
                msg += (char)(number);
            } else if(rand <= 35) { //Uppercase letter (65-90 in ASCII)
                int uppercase = rand + 55; // 65 - 10 = 55
                msg += (char)(uppercase);
            } else { //Lowercase letter (97-122 in ASCII)
                int lowercase = rand + 61; // 97 - 10 num - 26 uppercase letters = 61
                msg += (char)(lowercase);
            }
        }
        return msg;
    }


    public static String invertString (String str) {
        char[] chars = str.toCharArray();
        String strInvert = "";
        int index = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            strInvert += chars[index];
            index--;
        }
        return strInvert;
    }


    public static Integer countLettersIntoString (String str, String letter) {
        int index = 0;
        int countAppears = 0;
        //se busca la primera vez que aparece
        index = str.indexOf("a");
        while (index != -1) {
            countAppears++;
            index = str.indexOf("a", index + 1);
        }
        return countAppears;
    }

    public static Boolean isPalindromo (String str) {
        str = str.replace(" ", "");
        str = str.replace(",", "");
        str = str.replace(".", "");
        str = str.replace("/", "");
        str = str.replace("á", "a");
        str = str.replace("é", "é");
        str = str.replace("í", "í");
        str = str.replace("ó", "ó");
        str = str.replace("ú", "ú");
        String strInvert = invertString(str);
        if (strInvert.toUpperCase().equals(str.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

    public static Integer countWordIntoString (String str) {
        String[] arrayWords = str.split(" ");
        return arrayWords.length;
    }

    public static String replaceLettersInPhrase (String phrase, String letterOld, String letterNew) {
        phrase = phrase.replace(letterOld, letterNew);
        return phrase;
    }

}