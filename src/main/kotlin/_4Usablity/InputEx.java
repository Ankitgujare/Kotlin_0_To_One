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




   /*     InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(reader);
        int a= Integer.parseInt(bufferedReader.readLine());
        float b=Float.parseFloat(bufferedReader.readLine());
        String name=bufferedReader.readLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        //String,float,Int, double,Long,byte*/



        /**
         *
         *Scanner class ***
         * USED to take Input from user At runtime
         *
         * 1.create an Obj of Scanner class
         */
        Scanner sc=new Scanner(System.in);
        //int
      /*  int a=sc.nextInt();
        float b=sc.nextFloat();
        long c=sc.nextLong();
        double d=sc.nextDouble();
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(c);*/
        /*char name=sc.next().charAt(0);*/

        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Hi "+name+" Are You smart Press 1 if yes Otherwise 2 to say No");
        int choice=sc.nextInt();
        if (choice!=1){
            //Not smart
            boolean isSmart=false;
            System.out.println(isSmart);
        }else{
            boolean isSmart=true;
            System.out.println(isSmart);
        }











    }


}















