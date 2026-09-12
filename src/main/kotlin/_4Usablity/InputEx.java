package _4Usablity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputEx {
    public static void main(String[] args)throws IOException {
        //out ->PrintStream class
      /*  System.out.println("Enter the Number");
        //Take input from User
        int input= System.in.read();
        int realInput=input-48;
        System.out.println("Entered Number is "+realInput);*/


        /*InputStreamReader rs=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(rs);
        System.out.println("Enter the N1");
        int n1=Integer.parseInt(bf.readLine());
        System.out.println("Enter the N2");
        int n2=Integer.parseInt(bf.readLine());
        int sum=n1+n2;
        System.out.println(sum);*/


        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(reader);

        System.out.println("Input something");
        int x=Integer.parseInt(bufferedReader.readLine());
        System.out.println(x);

        /**
         *
         *Scanner class ***
         */


    }


}















