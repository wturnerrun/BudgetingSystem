//Student Class is a child class of Budgeter
public class Student extends Budgeter 
{
//constructor
    public Student(String studentID, String studentPass)
    {
        super(1, studentID, studentPass);
    }
    public Student()
    {
    super();
    this.setUserCategoryID(1);
    }

}
