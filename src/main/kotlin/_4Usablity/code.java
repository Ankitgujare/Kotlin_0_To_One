package _4Usablity;


import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;



//with Class
class person{

  public String bankAccountNumber="3483438474dasda";
  public String password="asdasdasda";

  void test(){
      System.out.println(bankAccountNumber);
      System.out.println(password);
  }

}


public class code {
    public static void main(String[] args) {

        person s1=new person();
        System.out.println(s1.bankAccountNumber);

    }

}




