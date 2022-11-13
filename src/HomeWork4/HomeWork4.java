package HomeWork4;

import java.util.Arrays;
import java.util.Random;

public class HomeWork4 {
        public static void main (String[]args){
            int[] array = new int[100_000];
            fillRay(array);
            long startTime = System.currentTimeMillis();
            selectSort (array);
            long endTime = System.currentTimeMillis();
            System.out.println("Это наш собственный алгоритм и он выполнялся" + " " + (endTime - startTime));
            int[] array2 = new int[100_000];
            fillRay(array2);
            startTime = System.currentTimeMillis();
            Arrays.sort(array2);
            endTime = System.currentTimeMillis();
            System.out.println("Это алгоритм Java и он выполнялся" + " " + (endTime - startTime));
            //printArray(array);
        }
        private static void selectSort(int[] array){
            boolean Sorted = false;
            while (!Sorted) {
                Sorted = true;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        Sorted = false;
                    }
                }
                // printArray(array);
            }
        }
        private static void printArray(int[] arr) {
            System.out.println(" ");
            for (int i = 0;i < arr.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
            }
        }
        private static void fillRay(int[] array){
            for (int i = 0; i < array.length; i++){
               array[i] = new Random().nextInt();
            }
        }


    }





