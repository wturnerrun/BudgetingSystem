//Parent of Income Entity Classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AllIncome
{
    private Connection con;
    private String budgeterID;
    private String incomeNumber;
    private String contributor;
    private int incomeType = 0;
    private String incomeName;
    private double earnings;
    private double allowance;
    private String url = ("jdbc:mysql://www.wrtprogramming.com/wrturner_BudgetingSystem");

    public void setBudgeterID(String userID)
    {
       budgeterID = userID;
    }
    public String getBudgeterID()
    {
        return budgeterID;
    }
    public int getIncomeType()
    {
        return incomeType;
    }
    public void setIncomeType(int eType)
    {
	incomeType = eType;
    }

    public String getIncomeName()
    {
        return incomeName;
    }

    public void setIncomeName(String eName)
    {
        incomeName = eName;
    }

    public String getIncomeNumber()
    {
        return incomeNumber;
    }

    public void setIncomeNumber(String rNumber)
    {
        incomeNumber = rNumber;
    }

    public String getContributorName()
    {
        return contributor;
    }

    public void setContributorName(String cName)
    {
        contributor = cName;
    }

    public double getEarnings()
    {
        return earnings;
    }

    public void setEarnings(double wage)
    {
        earnings = wage;
    }
    public double getAllowance()
    {
        return allowance;
    }

    public void setAllowance(double allow)
    {
        allowance = allow;
    }

    public Connection getCon()
    {
        return con;
    }

    public void setCon(Connection con)
    {
        this.con = con;
    }

    	//CREATE CONNECTION TO DATABASE.
    public boolean isConnected()
    {
        try
        {
            setCon(DriverManager.getConnection(url,"wrturner", "turn#1802"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //CONNECTION IS CLOSED.
    public boolean isClosed()
    {
        try
        {
            getCon().close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
     public boolean addIncome()
    {
        if(this.isConnected())
            
        {
            try
            {
                //CREATE A STATEMENT
                Statement stmt = getCon().createStatement();

                //QUERY THE budgeterType TABLE
                stmt.executeUpdate("INSERT INTO "+this.getIncomeName()+"(incomeNumber, contributor, earnings, allowance,budgeterID) VALUES('"+this.getIncomeNumber() +"','"+ this.getContributorName() +"', '" +this.getEarnings()+"','"+this.getAllowance()+"','"+ this.getBudgeterID() +"')");

                //CLOSE THE CONNECTION.
                 this.isClosed();
            }
            catch(Exception e)
            {
                System.out.println("Failed To Locate Income");
                e.printStackTrace();
                //We close the connection.
                this.isClosed();
                return false;
            };

            return true;
        }
            return false;
    }

    public void findIncomeName(int expenseType)
    {
        try
        {
        //QUERY TO FIND expenseName USING THE expenseType
        Statement stmt = getCon().createStatement();

        //QUERY THE expenseType TABLE
        ResultSet set = stmt.executeQuery("SELECT * from incomeType WHERE receiptID = '"+getIncomeType() +"';");
        set.next();
        setIncomeName(set.getString("incomeTypeName"));

        //SET THE expenseName TO THE ONE FOUND BY USING THE receiptID.
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    //UPDATE COMPANY NAME
    public boolean updateContributorName(String cName)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY expenseType TABLE
             stmt.executeUpdate("UPDATE TABLE " + getIncomeName() + " SET companyName = '" + cName + "' WHERE companyName = " + this.getContributorName() + ";");

            this.isClosed();
            return true;

        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }

        return false;
    }

    public boolean updateIncomeNumber(String rNumber)
    {
        if(this.isConnected())
        {
            try
            {
                //CREATE A STATEMENT
                Statement stmt = getCon().createStatement();

                //QUERY THE expenseType TABLE
                stmt.executeUpdate("UPDATE TABLE " + getIncomeName() + " SET receiptNumber = '" + rNumber + "' WHERE receiptNumber = " + this.getIncomeNumber() + ";");

                this.isClosed();
                return true;
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return false;
            }

        }
		return false;
    }

    public boolean updateEarnings(double cost)
    {
        if(this.isConnected())
        {
            try
            {
                //CREATE A STATEMENT
                Statement stmt = getCon().createStatement();

                //QUERY THE expenseType TABLE
                stmt.executeUpdate("UPDATE TABLE " + getIncomeName() + " SET price = '" + cost + "' WHERE price = " + this.getEarnings() + ";");

                this.isClosed();
                return true;
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
    public AllIncome()
    {
        
    }
    public AllIncome(int incomeType, String incomeNumber, String contributor)
    {
        //SET UP AN EXPENSE TYPE
        this.setIncomeType(incomeType);
        if(this.isConnected())
        {
        this.findIncomeName(this.getIncomeType());
        this.isClosed();
        }
        else
        {
            System.out.println("ERROR, THE CONNECTION FAILED.");
        }

    }
}
