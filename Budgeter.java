//Budgeter Class
//Children are Employee and Student
import java.sql.*;
import javax.swing.JOptionPane;

public class Budgeter 
{
        private String firstName;
        private String lastName;
        private String password;
        private String username;
        private int userCategoryID;
        private String userCategoryName;
        private String error = null;
        private String url = ("jdbc:mysql://www.wrtprogramming.com/wrturner_BudgetingSystem");
        Connection connection;
        private String budgeterInfo;
        private String budgeterType;

    //SET BUDGETER CATEGORY ID
    public void setUserCategoryID(int uCategoryID) 
    {
        userCategoryID = uCategoryID;
    }    
    //RETRIEVE THE BUDGETER CATEGORY ID
    public int getUserCategoryID() 
    {
        return userCategoryID;
    }
    public void setUserCategoryName(String uCategoryName) 
    {
        userCategoryName = uCategoryName;
    }
    public String getUserCategoryName() 
    {
        return userCategoryName;
    }
    public void setCon(Connection con) 
    {
        connection = con;
    }
    public Connection getCon() 
    {
        return connection;
    }
    public void setPass(String pass) 
    {
        password = pass;
    }    
    public String getPass() 
    {
        return password;
    }
    public void setID(String ID) 
    {
        username = ID;
    }    
    public String getID() 
    {
        return username;
    }
    public void setFirstName(String fName) 
    {
        firstName = fName;
    }
    public String getFirstName() 
    {
        return firstName;
    }
    public void setLastName(String lName) 
    {
        lastName = lName;
    }    
    public String getLastName() 
    {
        return lastName;
    }
        //SET THE ERROR MESSAGE
    public void setError(String err) 
    {
        error = err;
    } 
    //RETRIEVE THE ERROR MESSAGE
    public String getError() 
    {
        return error;
    }


    //CONNECT TO MYSQL DATABASE AT wrtprogramming.com
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

    public void findBudgeterTypeTable(int userCategoryID)
    {
        try
        {
        //we run query to find table using the categoryID
        Statement stmt = getCon().createStatement();

        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT userCategoryName from budgeterType where userCategoryID = '"+getUserCategoryID() +"';");
        set.next();
        setUserCategoryName(set.getString("userCategoryName"));

        //we set the userCategoryName to the one found by using the ID
        }catch(Exception e){
            e.printStackTrace();
        }
    }


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

    public void setUser()
    {
        try
        {
            Statement stmt = getCon().createStatement();

            //EXECUTE A QUERY TO LOCATE BUDGETER
            ResultSet set = stmt.executeQuery("SELECT *, COUNT(*) as 'count' FROM "+ getUserCategoryName() +" WHERE id ='" +getID() + "' AND pass = '"+getPass()+"';");

            //IF THE QUERY RAN AND HAS MORE CONTENT THAN AN ARRAY OF 1
            set.next();

            if("0".equals(set.getString("count")))
            {
                setError("THE LOGIN ID AND PASSWORD DO NOT MATCH");
            }
            else
            {
                setFirstName(set.getString("firstName"));
                setLastName(set.getString("lastName"));
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    //If we have no errors then we know we have been loggedin
    public boolean isLoggedin()
    {
        if(getError() == null)
        {
            return true;
        }
        else
        {
            System.out.println(getError());
            return false;
        }
    }
     
    public boolean addBudgeter()
    {
        if(this.isConnected())
            
        {
          try
            {
                //CREATE A STATEMENT
                Statement stmt = getCon().createStatement();

                //QUERY THE budgeterType TABLE
                stmt.executeUpdate("INSERT INTO " +this.getUserCategoryName()+"(ID, firstName, lastName, pass) VALUES('"+ this.getID() +"', '"+this.getFirstName() +"','"+ this.getLastName() +"','" +this.getPass()+"')");

                //CLOSE THE CONNECTION.
                 this.isClosed();

            }
            catch(Exception e)
            {

                System.out.println("ADD BUDGETER WAS CALLED BUT FAILED");
                e.printStackTrace();
                //We close the connection.
                this.isClosed();
                return false;
            };

            return true;
        }
            return false;
    }

    public boolean remove()
    {
        if(this.isConnected())
        {
            try
            {
                //we create the statement
                Statement stmt = getCon().createStatement();

                //we query the category table
                stmt.executeUpdate("DELETE FROM " + this.getUserCategoryName() +" WHERE ID = '" + this.getID() + "';" );

                //We close the connection.
                this.isClosed();

            }
            catch(Exception e)
            {
                System.out.println("the exception in searchByGenre was called.");
                e.printStackTrace();
                //We close the connection.
                this.isClosed();
                return false;
            };
            return true;
        }
            return false;
    } 
 
    public Budgeter()
    {
    }
    public Budgeter(int categoryID, String ID,String pass)
    {
        //Check to make sure all fields are not null
        if(categoryID != 0 && ID != null && pass != null)
        {
            //create connection to database.
            if(isConnected())
            {

            //we need to find out if the user actually exist in the database
            setUserCategoryID(categoryID);
            findBudgeterTypeTable(categoryID);
            setPass(pass);
            setID(ID);
            //we need to validate the password.

            setUser();

            //close the connection to the database
            isClosed();
            }
            else
            {
            setError("Could not connect to the database.!");

            }
        }
    }
}
