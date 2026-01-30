package _4Usablity;

class stud{
    int roll=101;
    String name="Ishwari";
    String branch="ECE";

    void getstudentinfo(){
        //TODO print student info
    }

}


class studentmarks extends stud{

    int java=66;
    int pyton=88;
    int c=77;

    void showstudentmarks(){
        //todo print student marks
    }


}

class BookIssued extends stud{
    String book1;
    String book2;
    String getBook3;


    void getIssuedBook(){
        //todo complete this
    }


}





public class code {
    public static void main(String[] args) {

        studentmarks s1=new studentmarks();
        s1.getstudentinfo();
        s1.showstudentmarks();


        BookIssued b1=new BookIssued();
        b1.getstudentinfo();
        b1.getIssuedBook();
    






    }
}




