package _5_Functional_Programing.extension_functions;

import java.util.Scanner;

public class extnesionfunNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("enter the element in array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("the existing array");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

        System.out.println("enter the element you want to delete");
        int input = sc.nextInt();
        int loc = 0;
        int flage = 0;
        // loop for searching the index value of the element user given

        for (int i = 0; i < size; i++) {
            if (input == array[i]) {
                flage = 1;
                loc = i;
                break;

            }
        }

        for (int i = loc + 1; i <= size - 1; i++) {
            array[i - 1] = array[i];
        }
        size--;

        System.out.println("array after deletion");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }


    }
}
