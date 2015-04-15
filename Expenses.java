//EXPENSES CONTROL CLASS
//CHILDREN ARE AUTO, BOOK, CELL, CLOTHING, CREDIT, DONATIONS, ENTERTAINMENT, FOOD, FURNITUREAPPLIANCES, HOUSESUPPLIES, HOUSING, UTILITIES, LAUNDRY, GAS, TUITION, SAVINGS, AND MISC

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Expenses
{
    private Connection con;
    private String budgeterID;
    private String receiptNumber;
    private String company;
    private int expenseType;
    private String expenseName;
    private double price;
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
    public int getExpenseType()
    {
        return expenseType;
    }
    public void setExpenseType(int eType)
    {
	expenseType = eType;
    }

    public String getExpenseName()
    {
        return expenseName;
    }

    public void setExpenseName(String eName)
    {
        expenseName = eName;
    }

    public String getReceiptNumber()
    {
        return receiptNumber;
    }

    public void setReceiptNumber(String rNumber)
    {
        receiptNumber = rNumber;
    }

    public String getCompanyName()
    {
        return company;
    }

    public void setCompanyName(String cName)
    {
        company = cName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double cost)
    {
        price = cost;
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
        public boolean addReceipt()
    {
        if(this.isConnected())
            
        {
            try
            {
                //CREATE A STATEMENT
                Statement stmt = getCon().createStatement();

                //QUERY THE budgeterType TABLE
                stmt.executeUpdate("INSERT INTO "+this.getExpenseName()+"(receiptID, companyName, price, allowance, budgeterID) VALUES('"+this.getReceiptNumber() +"','"+ this.getCompanyName() +"', '" +this.getPrice()+"','"+this.getAllowance()+"','"+ this.getBudgeterID() +"' )");
                //CLOSE THE CONNECTION.
                 this.isClosed();
            }
            catch(Exception e)
            {
                System.out.println("FAILED TO ADD RECEIPT");
                e.printStackTrace();
                //We close the connection.
                this.isClosed();
                return false;
            };

            return true;
        }
            return false;
    }

    public boolean removeReceipt()
    {
        if(this.isConnected())
        {
            try
            {
                //we create the statement
                Statement stmt = getCon().createStatement();

                //we query the category table
                stmt.executeUpdate("DELETE FROM " + this.getExpenseName() +" WHERE budgeterID = '" + this.getBudgeterID() + "'AND WHERE receiptID ='"+this.getReceiptNumber()+"');" );

                //We close the connection.
                this.isClosed();

            }
            catch(Exception e)
            {
                System.out.println("FAILED TO REMOVE RECEIPT");
                e.printStackTrace();
                //We close the connection.
                this.isClosed();
                return false;
            };
            return true;
        }
            return false;
    } 

    public void findExpenseName(int expenseType)
    {
        try
        {
        //QUERY TO FIND expenseName USING THE expenseType
        Statement stmt = getCon().createStatement();

        //QUERY THE expenseType TABLE
        ResultSet set = stmt.executeQuery("SELECT * from expenseType WHERE receiptID = '"+getExpenseType() +"';");
        set.next();
        setExpenseName(set.getString("expenseTypeName"));

        //SET THE expenseName TO THE ONE FOUND BY USING THE receiptID.
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    //UPDATE COMPANY NAME
    public boolean updateCompanyName(String cName)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY expenseType TABLE
             stmt.executeUpdate("UPDATE TABLE " + getExpenseName() + " SET companyName = '" + cName + "' WHERE companyName = " + this.getCompanyName() + ";");

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

    public boolean updateReceiptNumber(String rNumber)
    {
        if(this.isConnected())
        {
            try
            {
                //CREATE A STATEMENT
                Statement stmt = getCon().createStatement();

                //QUERY THE expenseType TABLE
                stmt.executeUpdate("UPDATE TABLE " + getExpenseName() + " SET receiptNumber = '" + rNumber + "' WHERE receiptNumber = " + this.getReceiptNumber() + ";");

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

    public boolean updatePrice(double cost)
    {
        if(this.isConnected())
        {
            try
            {
                //CREATE A STATEMENT
                Statement stmt = getCon().createStatement();

                //QUERY THE expenseType TABLE
                stmt.executeUpdate("UPDATE TABLE " + getExpenseName() + " SET price = '" + cost + "' WHERE price = " + this.getPrice() + ";");

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
    public Expenses()
    {
        
    }
    public Expenses(int expenseType, String receiptID, String company)
    {
        //SET UP AN EXPENSE TYPE
        this.setExpenseType(expenseType);
        if(this.isConnected())
        {
        this.findExpenseName(this.getExpenseType());
        this.isClosed();
        }
        else
        {
            System.out.println("ERROR, THE CONNECTION FAILED.");
        }

    }
}
