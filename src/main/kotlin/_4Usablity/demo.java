package _4Usablity;


public class demo {
    public static void main(String[] args) {

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




        int age=12;

        try {
                if (age<18){
                    throw new Exception();
                }
                System.out.println("You can Vote");
            }catch (Exception ex){
                System.out.println("age > 18 to Vote");
        }


        System.out.println("Program finished");

    }



}








