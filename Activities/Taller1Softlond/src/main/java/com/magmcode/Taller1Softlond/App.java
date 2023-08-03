package com.magmcode.Taller1Softlond;

import com.magmcode.Taller1Softlond.Utilities.OperationsWithNumbers;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                    "19) Convertir cadena a min y may.                   20) Invertir cadena. \n" +
                    "21) Contar letra dentro de palabra.                   22) Frase es palíndrome?. \n" +
                    "23) Contar palabras dentro de oración.            24) Remplace letras de una palabra. \n" +
                    "25) Mostrar palabras de una frase.                   26) Contar caracteres de frase. \n" +
                    "27) Ordenar palabras de una frase.                   28) Sumar elementos de un array. \n" +
                    "29) Número máximo de un arreglo.                  30) Eliminar elementos duplicados de un array. \n" +
                    "31) Ordenamiento por burbuja.                         32) Buscar número en array y mostrar índice. \n" +
                    "33) Frecuencia de apariciones.                         34) . \n" +
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
                case 20:
                    inverseString();
                    break;
                case 21:
                    countLettersIntoStr();
                    break;
                case 22:
                    isPalindromo();
                    break;
                case 23:
                    countWordsIntoPhrase();
                    break;
                case 24:
                    replaceLetterIntoPhrase();
                    break;
                case 25:
                    showWordsIntoPhrase();
                    break;
                case 26:
                    countCharsWithoutBlanks();
                    break;
                case 27:
                    sortWordsOfPhrase();
                    break;
                case 28:
                    sumElementsArray();
                    break;
                case 29:
                    maxValueOfArray();
                    break;
                case 30:
                    deleteDuplicates();
                    break;
                case 31:
                    sortBubble();
                    break;
                case 32:
                    findNumberIntoArray();
                    break;
                case 33:
                    frecuencyElementosIntoArray();
                    break;
                case 0:
                    showMenu = false;
                    break;
            }
        } while (showMenu);
    }

    private static void frecuencyElementosIntoArray() {
        ArrayList<Integer> arrayNumbers = new ArrayList<>(Arrays.asList(12, 200, 112, 30, 2, 2, 12, 200, 112, 30, 200, 1, 2, 12, 1, 5));
        JOptionPane.showMessageDialog(null, ("The frequency of elements of array: \n" + arrayNumbers + "\n" +  OperationsWithNumbers.frequencyElementosInArray(arrayNumbers)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void findNumberIntoArray() {
        ArrayList<Integer> arrayNumbers = new ArrayList<>(Arrays.asList(12, 200, 112, 30, 2, 2, 12, 200, 112, 30, 200, 1, 2, 12, 1, 5));
        Integer numberFind = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number to find: ", "SORT WORDS OF A PHRASE  ", JOptionPane.INFORMATION_MESSAGE));

        ArrayList<Integer> listIndex = OperationsWithNumbers.findElementInArray(arrayNumbers, numberFind);
        if (listIndex.size() == 0) {
            JOptionPane.showMessageDialog(null, ("The number " + numberFind + " Not is into array"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, ("The number " + numberFind + " is in the positions: " + listIndex), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void sortBubble() {
        ArrayList<Integer> arrayNumbers = new ArrayList<>(Arrays.asList(12, 200, 112, 30, 2, 2, 12, 200, 112, 30, 200, 1, 2, 12, 1, 5));
        JOptionPane.showMessageDialog(null, ("The new Array is  " + OperationsWithNumbers.sortArrayByBubble(arrayNumbers)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void deleteDuplicates() {
        List<Integer> arrayNumbers = new ArrayList<>(Arrays.asList(12, 200, 112, 30, 2, 2, 12, 200, 112, 30, 200, 1, 2, 12, 1, 5));
        JOptionPane.showMessageDialog(null, ("The new Array is  " + OperationsWithNumbers.deleteDuplicatesInArray(arrayNumbers)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void maxValueOfArray() {
        List<Integer> arrayNumbers = Arrays.asList(12, 200, 112, 30);
        JOptionPane.showMessageDialog(null, ("The max value of " + arrayNumbers + " is: " + OperationsWithNumbers.maxValueInArray(arrayNumbers)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    private static void sortWordsOfPhrase() {
        String str = JOptionPane.showInputDialog(null, "Input a phrase: ", "SORT WORDS OF A PHRASE  ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ("The words of the phrase \"" + str + "\" are: \n" + OperationsWithNumbers.sortWordsOfPhrase(str)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void sumElementsArray() {
        // ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        // listNumbers.add(12);
        // listNumbers.add(2);
        // listNumbers.add(112);
        // listNumbers.add(30);
        List<Integer> arrayNumbers = Arrays.asList(12, 2,112, 30);
        JOptionPane.showMessageDialog(null, ("The sum of numbers " + arrayNumbers + " is: " + OperationsWithNumbers.sumElementsArray(arrayNumbers)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void countCharsWithoutBlanks() {
        String str = JOptionPane.showInputDialog(null, "Input a phrase o word: ", "COUNT CHARS INTO PHRASE WITHOUT BLANK SPACES  ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ("The phrase \"" + str + "\" have: " + OperationsWithNumbers.countCharsPhraseWithoutBlank(str) + " characters"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void showWordsIntoPhrase() {
        String str = JOptionPane.showInputDialog(null, "Input a phrase o word: ", "SHOW LETTERS INTO PHRASE  ", JOptionPane.INFORMATION_MESSAGE);
        String[] arrayWords = OperationsWithNumbers.splitPhrase(str);
        String msg = "";
        for (String word : arrayWords) {
            msg += word + "\n";
        }
        JOptionPane.showMessageDialog(null, ("The words of the phrase \"" + str + "\" are: \n" + msg), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void replaceLetterIntoPhrase() {
        String str = JOptionPane.showInputDialog(null, "Input a phrase o word: ", "REPLACE LETTER INTO PHRASE  ", JOptionPane.INFORMATION_MESSAGE);
        String letterOld = JOptionPane.showInputDialog(null, "Input letter to be replaced: ", "REPLACE LETTER INTO PHRASE  ", JOptionPane.INFORMATION_MESSAGE);
        String letterNew = JOptionPane.showInputDialog(null, "Input new letter to be replaced: ", "REPLACE LETTER INTO PHRASE  ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ("The phrase \"" + str + "\" was replaced and the new phrase is \"" + OperationsWithNumbers.replaceLettersInPhrase(str, letterOld, letterNew) + "\""), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void countWordsIntoPhrase() {
        String str = JOptionPane.showInputDialog(null, "Input a phrase o word: ", "COUNT WORDS INTO PHRASE  ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ("The phrase \"" + str + "\" have " + OperationsWithNumbers.countWordIntoString(str) + " words"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void isPalindromo() {
        // example tes: A mamá, Roma le aviva el amor a papá y a papá, roma le aviva el amor a mamá
        String str = JOptionPane.showInputDialog(null, "Input a phrase o word: ", "DETERMINE PALINDROMO  ", JOptionPane.INFORMATION_MESSAGE);
        Boolean isPalindromo = OperationsWithNumbers.isPalindromo(str);
        if (isPalindromo) {
            JOptionPane.showMessageDialog(null, ("The phrase \"" + str + "\" is palindromo"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, ("The phrase \"" + str + "\" not is palindromo"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void countLettersIntoStr() {
        String str = JOptionPane.showInputDialog(null, "Input a text: ", "COUNT LETTER INTO TEXT  ", JOptionPane.INFORMATION_MESSAGE);
        String letter = JOptionPane.showInputDialog(null, "Input letter: ", "COUNT LETTER INTO TEXT  ", JOptionPane.INFORMATION_MESSAGE);
        int count = OperationsWithNumbers.countLettersIntoString(str, letter);
        JOptionPane.showMessageDialog(null, ("The letter " + letter + " appear " + count + " times in the string " + str), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void inverseString() {
        String str = JOptionPane.showInputDialog(null, "Input a text: ", "LOWERCASE STRING  ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ("The inverse of " + str + " is: " + OperationsWithNumbers.invertString(str)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
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
