package _4Usablity;


public class demo {
    public static void main(String[] args){

        System.out.println("Running..1");
        System.out.println("Running..2");
        System.out.println("Running..3");
        System.out.println("Running..4");
        System.out.println("Running..5");

       int a=10;
       int b=0;

       try{
           if (b==0){
               throw new ArithmeticException("Cannot div by 0");
           }
           int div=a/b;
           System.out.println(div);
       }catch (ArithmeticException ex){
           System.out.println("Cannot div By 0");
       }




        System.out.println("Running..7");
        System.out.println("Running..8");
        System.out.println("Running..9");
        System.out.println("Running..10");



        try{
            int result=10/2; //Arithmatic exception
        }catch (ArithmeticException ex){
            System.out.println("Cannot Div by 0");
        }finally {
            System.out.println("Iam Finally..");
        }








        try{
            doPayment();  //Arith
        }catch (ArithmeticException ex){
            System.out.println("Arithmatic Exception");
        }catch (IndexOutOfBoundsException exception){
            System.out.println("IndexOutOfBoundsException pointer exception");
        }catch (NullPointerException exception){
            System.out.println("this is NullPointerException");
        }catch (Exception exception){
            System.out.println("this is Exception handle All");
        }

        System.out.println("Program Finished");

    }

   static void doPayment() throws Exception{

        A obj=null;  //null Pointer exception
        obj.say();


       // int ans=10/0;
        /*int [] number={10,20,30,40};
        System.out.println(number[6]);*/
    }





}



class A{
    void say(){
        System.out.println("Hi Ishwari");
    }
}





