public class GradeRange
{
    //Stores the possible grades and their numeric lowest value, then prints them out
    public static void main(String [] args)
    {
        Grade A = new Grade("A", 95);
        Grade lessA = new Grade("A-", 90 );
        Grade moreB = new Grade("B+", 87);
        Grade B = new Grade("B", 83);
        Grade lessB = new Grade("B-", 80);
        Grade moreC = new Grade("C+", 77);
        Grade C = new Grade("C", 73);
        Grade lessC = new Grade("C-", 70);
        Grade moreD = new Grade("D+", 67);
        Grade D = new Grade("D", 63);
        Grade lessD = new Grade("D-", 60);
        Grade F = new Grade("F", 0);
        Grade[] grades = {A, lessA, moreB, B, lessB, moreC, C, lessC, moreD, D, lessD, F};
//        String[] grades = {"A", "A-", "B+","B", "B-", "C+", "C", "C-",
//                "D+", "D", "D-", "F"};
//        int[] cutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};
        for(int index = 0; index < 12; index++)
            System.out.println(grades[index]);
    }//end of main method
}//end of gradeRange class
