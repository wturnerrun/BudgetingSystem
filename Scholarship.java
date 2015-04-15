//Entity Class Scholarship
//Scholarship is a child of super class AllIncome


public class Scholarship extends AllIncome
{
    public Scholarship()
    {
        super();
    }
    public Scholarship(String incomeNumber, String contributor)
    {
            super(1,incomeNumber, contributor);
    }

    
}