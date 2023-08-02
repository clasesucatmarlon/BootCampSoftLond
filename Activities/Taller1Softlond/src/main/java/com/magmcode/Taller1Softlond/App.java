package com.magmcode.Taller1Softlond;

import com.magmcode.Taller1Softlond.Utilities.OperationsWithNumbers;

import javax.swing.*;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        boolean showMenu = true;
        do {
            String msgMenu = "Seleccione opción: \n" +
                    "1) Operaciones matemáticas.                            2) Número es par?.\n" +
                    "3) Área y perímetro de círculo.                          4) Es mayor de edad?.\n" +
                    "5) Número mayor.                                                6) Validar número. \n" +
                    "7) Generar tabla hasta el 10 de un número.      8) Adivinar número entre 1 y 100. \n" +
                    "9) Calcular factorial.                                            10) Primeros n términos de fibonacci. \n" +
                    "11) Área de triángulo con Herón.                      12) Número es primo?. \n" +
                    "13) Redondear número a n decimales.            14) Número es perfecto?. \n" +
                    "15) Número es capicúa?.                                   16) Primeros n términos de fibonacci. \n" +
                    "17) Números primos entre m y n.                     18) Generar password. \n" +
                    "19) Convertir cadena a min y may.                     20) . \n" +
                    "0) Salir. \n";
            Integer option = Integer.parseInt(JOptionPane.showInputDialog(null, msgMenu, "MENU ", JOptionPane.INFORMATION_MESSAGE));
            switch (option) {
                case 1:
                    operations();
                    break;
                case 2:
                    isPar();
                    break;
                case 3:
                    areaAndPerimeterCircle();
                    break;
                case 4:
                    isMajor();
                    break;
                case 5:
                    numberMajor();
                    break;
                case 6:
                    validateNumber();
                    break;
                case 7:
                    generateTable();
                    break;
                case 8:
                    guessNumber();
                    break;
                case 9:
                    factorial();
                    break;
                case 10, 16:
                    fibonacci();
                    break;
                case 11:
                    areaTriangleWithHeron();
                    break;
                case 12:
                    numberIsPrime();
                    break;
                case 13:
                    roundNumber();
                    break;
                case 14:
                    numberPerfect();
                    break;
                case 15:
                    numberCapicua();
                    break;
                case 17:
                    listNumbersPrimes();
                    break;
                case 18:
                    generatePassword();
                    break;
                case 19:
                    changeStrUppercaseLowercase();
                    break;
                case 0:
                    showMenu = false;
                    break;
            }
        } while (showMenu);
    }

    private static void changeStrUppercaseLowercase() {
        String str = JOptionPane.showInputDialog(null, "Input a text: ", "LOWERCASE STRING  ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ("The string " + str + " in lowercase is: " + str.toLowerCase()), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ("The string " + str + " in uppercase is: " + str.toUpperCase()), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void generatePassword() {
        JOptionPane.showMessageDialog(null, ("Method with array: \nThe password is: " + OperationsWithNumbers.generatePassword2(8)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ("Method with ASCII: \nThe password is: " + OperationsWithNumbers.generatePassword(8)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void listNumbersPrimes() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number1: ", "PRIMES NUMBERS  ", JOptionPane.INFORMATION_MESSAGE));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number2: ", "PRIMES NUMBERS  ", JOptionPane.INFORMATION_MESSAGE));
        String msg = "";
        for (int i = number1; i <= number2; i++) {
            if ( OperationsWithNumbers.NumberIsPrime(i)) {
                msg += i + ", ";
            }
        }
        JOptionPane.showMessageDialog(null, ("The numbers primes between" + number1 + " and " + number2 + "are: \n" + msg ), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void numberCapicua() {
        long number = Long.parseLong(JOptionPane.showInputDialog(null, "Input a number: ", "CAPICUA NUMBER  ", JOptionPane.INFORMATION_MESSAGE));
        boolean isCapicua = OperationsWithNumbers.isCapicua(number);
        if (isCapicua) {
            JOptionPane.showMessageDialog(null, ("The number " + number + " is Capicua"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, ("The number " + number + " not is Capicua"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void numberPerfect() {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: ", "PERFECT NUMBER  ", JOptionPane.INFORMATION_MESSAGE));
        boolean isPerfect = OperationsWithNumbers.NumberIsPerfect(number);
        if (isPerfect) {
            JOptionPane.showMessageDialog(null, ("The number " + number + " is Perfect"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, ("The number " + number + " not is Perfect"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void roundNumber() {
        float numberToRound = Float.parseFloat(JOptionPane.showInputDialog(null, "Input a number to round: ", "ROUND NUMBER  ", JOptionPane.INFORMATION_MESSAGE));
        int numberDecimals = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number of positions decimals: ", "ROUND NUMBER  ", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, ("The number round with " + numberDecimals + " positions decimals is: " + OperationsWithNumbers.RoundNumber(numberToRound, numberDecimals)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void numberIsPrime() {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: ", "NUMBER PRIME  ", JOptionPane.INFORMATION_MESSAGE));
        boolean isPrime = OperationsWithNumbers.NumberIsPrime(number);
        if (isPrime) {
            JOptionPane.showMessageDialog(null, ("The number " + number + " is prime" ), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, ("The number " + number + " not is prime" ), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void areaTriangleWithHeron() {
        int sideA = Integer.parseInt(JOptionPane.showInputDialog(null, "Input side A: ", "AREA TRIANGLE USING HERON  ", JOptionPane.INFORMATION_MESSAGE));
        int sideB = Integer.parseInt(JOptionPane.showInputDialog(null, "Input side B: ", "AREA TRIANGLE USING HERON  ", JOptionPane.INFORMATION_MESSAGE));
        int sideC = Integer.parseInt(JOptionPane.showInputDialog(null, "Input side C: ", "AREA TRIANGLE USING HERON  ", JOptionPane.INFORMATION_MESSAGE));
        String msg = "The area of triangle of sides: A = " + sideA + ", B = " + sideB + " C = " + sideC + " is ";
        JOptionPane.showMessageDialog(null, (msg + OperationsWithNumbers.AreaTriangleWithHeron(sideA, sideB, sideC)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void fibonacci() {
        int numbers = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers you want to generate: ", "FIBONACCI SERIE ", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, ("The first " + numbers + " elements of fibonacci serie are: \n" + OperationsWithNumbers.FibonacciSerie(numbers)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void factorial() {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: ", "NUMBER FACTORIAL ", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, ("The factorial of " + number + " is " + OperationsWithNumbers.NumberFactorial(number)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void validateNumber() {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number: ", "VALIDATE NUMBER ", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, ("The number " + number + " is: " + OperationsWithNumbers.ValidateNumber(number)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void guessNumber() {
        int number;
        int countAttempts = 1;
        int numberRandom = OperationsWithNumbers.generateNumberRandomBetweenTwoValues(21, 100);
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Attempts: " + countAttempts + "\nInput number for guess: ", "GUESS A NUMBER ", JOptionPane.INFORMATION_MESSAGE));
            if (number > numberRandom) {
                JOptionPane.showMessageDialog(null, ("The number " + number + " is greater than the random number"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
            } else if (number < numberRandom) {
                JOptionPane.showMessageDialog(null, ("The number " + number + " is less than the random number"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, ("CONGRATULATIOS!!!!.  you guessed the number in " + countAttempts + " attempts"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
            }
            countAttempts++;
        } while (numberRandom != number);
    }

    private static void generateTable() {
        int numberInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number positive: ", "GENERATE TABLE FOR A NUMBER ", JOptionPane.INFORMATION_MESSAGE));
        OperationsWithNumbers.GenerateTableForNumber(numberInput);
    }

    private static void numberMajor() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number 1:", "DETERMINE LARGEST NUMBER ", JOptionPane.INFORMATION_MESSAGE));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number 2:", "DETERMINE LARGEST NUMBER ", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, ("The number major between " + number1 + " and " + number2 + " is:  " + OperationsWithNumbers.DetermineLargestNumber(number1, number2)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void isMajor() {
        int agePerson = Integer.parseInt(JOptionPane.showInputDialog(null, "Input age:", "VALIDATE AGE OF A PERSON ", JOptionPane.INFORMATION_MESSAGE));
        boolean personIsMajor = OperationsWithNumbers.ValidateAge(agePerson);
        if (personIsMajor) {
            JOptionPane.showMessageDialog(null, "The person is of legal age.", "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The person is under age.", "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void areaAndPerimeterCircle() {
        float radiusCircle = Float.parseFloat(JOptionPane.showInputDialog(null, "Input radius of circle:", "DETERMINE AREA AND PERIMETER OF A CIRCLE ", JOptionPane.INFORMATION_MESSAGE));
        float area = OperationsWithNumbers.AreaCircle(radiusCircle);
        float perimeter = OperationsWithNumbers.PerimeterCircle(radiusCircle);
        DecimalFormat formatTemplete = new DecimalFormat("#.##");
        String msg = "Area: " + formatTemplete.format(area) + "\n" +
                "Perimeter: " + formatTemplete.format(perimeter);
        JOptionPane.showMessageDialog(null, msg, "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void isPar() {
        Integer number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number:", "DETERMINE IF A NUMBER IS PAR OR NOT ", JOptionPane.INFORMATION_MESSAGE));
        Boolean response = OperationsWithNumbers.isParNumber(number);
        String msg = "The number " + number;
        if (response) {
            JOptionPane.showMessageDialog(null, (msg + " is PAIR."), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, (msg + " not is PAIR."), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void operations() {
        Integer number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Number 1:", "OPERATIONS WITH NUMBERS ", JOptionPane.INFORMATION_MESSAGE));
        Integer number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Number 2:", "OPERATIONS WITH NUMBERS ", JOptionPane.INFORMATION_MESSAGE));

        DecimalFormat formatTemplete = new DecimalFormat("#.##");
        String msg =
                "  1) Add: " + (OperationsWithNumbers.add(number1, number2)) + "\n" +
                "  2) Rest: " + (OperationsWithNumbers.rest(number1, number2)) + "\n" +
                "  3) Product: " + (OperationsWithNumbers.product(number1, number2)) + "\n" +
                "  4) Cocient: " + (formatTemplete.format(OperationsWithNumbers.cocient(number1, number2))) + "\n";
        JOptionPane.showMessageDialog(null, msg, "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }
}
