package homework1.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Juliya Zimenina
 */

/*
1. Заполните двумерный массив случайным числами
 и выведите максимальное, минимальное и среднее значение.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите, пожалуйста, желаемый размер массива: ");
        int size = scanner.nextInt();
        int[][] multiArray = new int[size][size];

        // Fill array the random numbers
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiArray[i][j] = random.nextInt(100);
            }
        }

        Arrays.stream(multiArray).map(Arrays::toString)
                .forEach(System.out::println);
        //max/min
        int min = multiArray[0][0];
        int max = multiArray[0][0];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (multiArray[i][j] < min) {
                    min = multiArray[i][j];
                }
               if (multiArray[i][j] > max){
                    max = multiArray[i][j];
                }
            }
        }
        // average
        int totalSum = 0;
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                totalSum +=multiArray[i][j];
            }
        }

        double average = (double) totalSum/(size*size);


        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Среднеарифметическое всех элементов массива: " + average);
    }
}

