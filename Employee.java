//Student Class is a child class of Budgeter
public class Employee extends Budgeter 
{
//constructor
    public Employee(String employeeID, String employeePass)
    {
        super(2, employeeID, employeePass);
    }
    public Employee()
    {
    super();
    this.setUserCategoryID(2);
    }

}
