//WAP to make a StudentMarksheet
public class StudentMarksheet
{
    //creating the object of the StudentMarksheet class
    static StudentMarksheet studentmarksheet = new StudentMarksheet();
    static int total;

    static String name = "Khushbu";

    public void totalMarks(int maths, int sci, int eng)
    {
        total=maths+sci+eng;
        System.out.println(total);
    }

    public static void main(String[] args)
    {
        studentmarksheet.totalMarks(20,14,24);
    }
//    public static void main(String[] args)
//    {
//
//        int maths = 89;
//        int sci = 70;
//        int eng = 80;
//        studentmarksheet.totalMarks(89,70,80);
//    }
//     void   totalMarks(int maths, int sci , int eng)
//     {
//        System.out.println("");
//
//
//
//     }


}

