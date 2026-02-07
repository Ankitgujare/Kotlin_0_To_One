package _4Usablity;

interface Payment{
    void dopayment(int amount);
    void paybills(int amount);

    void bankTransfer(String AccNumber,int Amount);

}

class PhonePay implements Payment{

    @Override
    public void dopayment(int amount) {
        System.out.println(amount+" paid using PhonePay");
    }

    @Override
    public void paybills(int amount) {
        //Todo implement this
    }

    @Override
    public void bankTransfer(String AccNumber, int Amount) {
        //todo implement this
    }
}


class GooglePay implements Payment{

    @Override
    public void dopayment(int amount) {
        System.out.println(amount +" Paid using Google Pay");
    }

    @Override
    public void paybills(int amount) {
        //Todo implement this
    }

    @Override
    public void bankTransfer(String AccNumber, int Amount) {
        //Todo implement this
    }
}

public class code {

    public static void main(String[] args) {

        PhonePay s1=new PhonePay();
        s1.dopayment(100);

        GooglePay G1=new GooglePay();
        G1.dopayment(200);

    }

}




