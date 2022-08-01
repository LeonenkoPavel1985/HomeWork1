package org.example;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        /*Задание 1  +
        Выведите на экран надпись "Your time is limited, so don’t waste it living someone else’s life" Steve Jobs
        на разных строках. Пример вывода:
        “Your time is limited,
           so don’t waste it
               living someone else’s life”
                   Steve  Jobs */

        /*String text = "\"Your time is limited," + "\n\t" + "so don't waste it" + "\n\t\t" + "living someone else's " +
                "life\"" + "\n\t\t\t" + "Steve Jobs";
        System.out.println(text);*/

        /*Задание 2 +
        Пользователь вводит с клавиатуры два числа. Первое число — это значение, второе число процент, который
        необходимо посчитать. Например, мы ввели с клавиатуры 50 и 10. Требуется вывести на экран 10 процентов от 50.
        Результат: 5 */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number that is the value:");
        double meaning = scanner.nextDouble();
        //scanner.close();
        System.out.println("Enter a second number that is a percentage:");
        double percent  = scanner.nextDouble();
        scanner.close();
        double result;
        result = meaning * percent / 100;
        System.out.println("Calculation result:" + "\n" + Math.round(result));*/

        /*Задание 3 +
        Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. Например,
        если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738. */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one:");
        int number1 = scanner.nextInt();
        System.out.println("Enter number two:");
        int number2 = scanner.nextInt();
        System.out.println("Enter number three:");
        int number3 = scanner.nextInt();
        scanner.close();
        System.out.println("Your total number is: " + number1 + number2 + number3);*/

        /*Задание 4 +
        Пользователь вводит шестизначное число. Необходимо поменять в этом числе первую и шестую цифры, а также
        вторую и пятую цифры. Например, 723895 должно превратиться в 593827.Если пользователь ввел не шестизначное число
        требуется вывести сообщение об ошибке.*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your six-digit number:");
        String string = scanner.next();
        string = string.trim(); // метод trim() удаляет пробелы в начале и конце строки.

        //менее 6 знаков.
        if(string==null || string.length() < 6) {
            System.out.println("Error. You entered an invalid number.");
            return;
        }
        //более 6 знаков.
        if(string.length() > 6) {
            System.out.println("Error. You entered an invalid number.");
            return;
        }
        //не шестизначное число.
        char[] arr=string.toCharArray();
        for (int i=0; i<string.length(); i++){
            if ( !Character.isDigit(arr[i])) {
                System.out.println("Error. You entered an invalid number.");
                return;
            }
        }

        char temp = arr[5];
        arr[5] =arr[0];
        arr[0] = temp;
        temp = arr[4];
        arr[4] = arr[1];
        arr[1] = temp;

        for (int i=0; i<string.length(); i++) System.out.print(arr[i]);
        scanner.close();*/

        /*Задание 5 +
        Пользователь вводит с клавиатуры номер месяца (от 1 до 12). В зависимости от полученного номера месяца
        программа выводит на экран надпись: Winter (если введено  значение 1,2 или 12), Spring (если введено значение
        от 3 до 5), Summer (если введено значение от 6 до 8), Autumn (если введено значение от 9 до 11).
        Если пользователь ввел значение не в диапазоне от 1 до 12 требуется вывести сообщение об ошибке.*/

        /*boolean nice = false;
        System.out.println("Enter the number of the month (from 1 to 12):");
        Scanner scanner = new Scanner(System.in);

        while (!nice){
            int month = scanner.nextInt();

            if (month > 12 || month < 1) {
                System.out.println("Error. You entered the month incorrectly. Try again:");
            } else {
                if (month == 1 || month == 2 || month == 12) System.out.println(month + " - " + "this Winter.");
                else if (month > 2 && month < 6) System.out.println(month + " - " + "this Spring.");
                else if (month > 5 && month < 9) System.out.println(month + " - " + "this Summer.");
                else if (month > 8 && month < 12) System.out.println(month + " - " + "this Autumn.");
                nice = true;
            }
        }
        scanner.close();*/

        /*Задание 6 +
        Пользователь вводит с клавиатуры количество метров. В зависимости от выбора пользователя программа
        переводит метры в мили, дюймы или ярды. */

        /*System.out.println("Enter the number of meters to convert:");
        Scanner scanner = new Scanner(System.in);
        double meters = scanner.nextDouble();
        System.out.println("Choose how much to calculate:");
        System.out.println("1 - Miles.");
        System.out.println("2 - Inches.");
        System.out.println("3 - Yards.");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("In " + meters + " meters " + Math.round (meters * 0.00062137) + " miles.");
                break;
            case 2:
                System.out.println("In " + meters + " meters " + Math.round(meters * 39.37) + " inches.");
                break;
            case 3:
                System.out.println("In " + meters + " meters " + Math.round(meters * 1.0936) + " yards.");
                break;
            default:
                System.out.println("Error. Invalid value entered.");
        }
        scanner.close();*/

        /*Задание 7
        Пользователь вводит с клавиатуры два числа. Нужно показать все нечетные числа в указанном диапазоне. Если
        границы диапазона указаны неправильно требуется произвести нормализацию границ. Например, пользователь
        ввел 20 и 11, требуется нормализация, после которой начало диапазона станет равно 11, а конец 20.*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number in the range:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the two number in the range:");
        int number2 = scanner.nextInt();

        int minimum = number1 < number2 ? number1 : number2;
        int maximum = number1 > number2 ? number1 : number2;

        System.out.println("All odd numbers in the range you specify:");

        for (int i = minimum; i <= maximum; i++)
        if ( i %2 != 0) System.out.print(i + " ");

        scanner.close();*/

        /*Задание 8
        Показать на экран таблицу умножения в диапазоне, указанном пользователем. Например, если пользовательуказал 3
        и 5, таблица может выглядеть так:
        3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
        ……………………………………………………
        5*1 = 5 5 *2 = 10 5 *3 = 15 ………….*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number in the range:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the two number in the range:");
        int number2 = scanner.nextInt();

        System.out.println("Multiplication table in the range you specified:");

        if (number2 > number1) {
            for (int i = number1; i <= number2; i++) {
                for (int j = 1; j < 11; j++)
                    System.out.print(i + "*" + j + "=" +  i * j + " ");
            }
        }
        else {
            for (int i = number2; i <= number1; i++) {
                for (int j = 1; j < 11; j++)
                    System.out.print(i + "*" + j + "=" +  i * j + " ");
            }
        }
        scanner.close();*/

        /*Задание 9 +
        В одномерном массиве, заполненном случайными числами, определить минимальный и максимальный
        элементы, посчитать количество отрицательных элементов, посчитать количество положительных элементов, посчитать
        количество нулей. Результаты вывестина экран.*/

        /*int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = - 5 + rand.nextInt(10);
        }

        System.out.println("Your array filled with random numbers:");


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        int maximum = array[0]; // максимальный элемент.
        int minimum = array[0]; // минимальный элемент.
        int positive = 0; // положительные элементы.
        int negative = 0; // отрицательные элементыю
        int zero = 0; // количество нулей.

        for (int i = 0; i < array.length; i++){
            if(minimum > array[i])
            minimum = array[i];

            if (maximum < array[i])
                maximum = array[i];

            if(array[i] < 0) negative++;

            if (array[i] > 0) positive++;

            if (array[i] == 0) zero++;
        }

        System.out.println("\nMinimum element in an array: " + minimum);
        System.out.println("\nMaximum element in an array: " + maximum);
        System.out.println("\nNumber of negative elements in the array: " + negative);
        System.out.println("\nNumber of positive elements in the array:" + positive);
        System.out.println("\nNumber of zero elements in the array:" + zero);*/

        /*Задание 10 +
        Есть одномерный массив, заполненный случайными числами. На основании данных этого массива нужно:
        ■ Создать одномерный массив, содержащий только четные числа из первого массива;
        ■ Создать одномерный массив, содержащий только нечетные числа из первого массива;
        ■ Создать одномерный массив, содержащий только отрицательные числа из первого массива;
        ■ Создать одномерный массив, содержащий только положительные числа из первого массива.*/

        /*int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = -5 + rand.nextInt(10);
        }

        System.out.println("Your array filled with random numbers:");


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int even = 0; // четные числа.
        int odd = 0;// нечетные числа.
        int positive = 0; // положительные числа.
        int negative = 0; // отрицательные числа.

        int[] arrayEven = new int[even];
        int[] arrayOdd = new int[odd];
        int[] arrayPositive = new int[positive];
        int[] arrayNegative = new int[negative];

        int ev = 0;
        int od = 0;
        int neg = 0;
        int pos = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayOdd[od] = array[i];
                od++;
            } else if (array[i] != 0) {
                arrayEven[ev] = array[i];
                ev++;
            }
            if (array[i] < 0) {
                arrayNegative[neg] = array[i];
                neg++;
            }
            if (array[i] > 0) {
                arrayPositive[pos] = array[i];
                pos++;
            }
        }

        System.out.println("An array containing only even numbers:\n");
        System.out.println(Arrays.toString(arrayEven));
        System.out.println("An array containing only odd numbers:\n");
        System.out.println(Arrays.toString(arrayOdd));
        System.out.println("An array containing only negative numbers:\n");
        System.out.println(Arrays.toString(arrayNegative));
        System.out.println("An array containing only positive numbers:\n");
        System.out.println(Arrays.toString(arrayPositive));*/


        /*Задание 11 +
        Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
        Метод принимает в качестве параметра: длину линии,направление, символ.*/

        /*System.out.println("Vertical line:\n");
        symbolsIsLine(5, 'v', '*');
        System.out.println("Horizontal line:\n");
        symbolsIsLine(5, 'g', '*');*/

        /*Задание 12
        Напишите метод, сортирующий массив по убыванию или возрастанию в зависимости от выбора пользователя.*/
        /*int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = -5 + rand.nextInt(10);
        }

        System.out.println("Your array filled with random numbers:");


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sorting(array, 1);
        System.out.println(Arrays.toString(array));
    }
    /*static void symbolsIsLine(int length, char direction, char symbol){
        if (direction=='v')
            for (int i=0; i<length; i++) System.out.println(symbol);
        if (direction=='g')
            for (int i=0; i<length; i++) System.out.print(symbol);
        System.out.println();
    }*/

    /*static void sorting(int[]arr, int direction) {
        Arrays.sort(arr);
    }*/
    }
}




