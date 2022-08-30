package homework1.task2;

/*
2. Отсортируйте массив [5,6,3,2,5,1,4,9]
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] sortArray = {5,6,3,2,5,1,4,9};
        boolean sort = false;
        int changeVar; // exchange variable
        while (!sort){
            sort = true;
            for (int i = 0; i < sortArray.length-1; i++) {
                if (sortArray [i] > sortArray[i+1]){
                    sort = false;

                    changeVar = sortArray[i];
                    sortArray[i] = sortArray[i+1];
                    sortArray[i+1] = changeVar;
                }
            }
        }
        System.out.println(Arrays.toString(sortArray));
    }
}

