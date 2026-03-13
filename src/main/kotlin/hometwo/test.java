package hometwo;
import homeone.demoA;
import org.w3c.dom.ls.LSOutput;

class x{
    int age=12;
    String bankAccountNumner="28382732";

    String getbankAccount(){
        return bankAccountNumner;
    }
}

public class test {
    public static void main(String[] args) {
       x x1=new x();
        System.out.println(x1.age);
        System.out.println(x1.getbankAccount());
        System.out.println(x1.bankAccountNumner);
    }
}









