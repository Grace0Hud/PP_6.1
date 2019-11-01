public class Grade
{
    //instance variables
    private String gradeLetter;
    private int cutoff;

    public Grade(String gradeLetter, int cutoff)
    {
        this.gradeLetter = gradeLetter;
        this.cutoff = cutoff;
    }//end multi-arg constructor
    public String toString()
    {
        String output = gradeLetter + "\t" + cutoff;
        return output;
    }//end of toString
}//end of grade class
