//Allowances CONTROL CLASS


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Allowances
{
    //VARIABLE TO LINK BUDGETER TO ALLOWANCES
    private String budgeterID;
    //INCOME ALLOWANCES
    private double scholarship = 0.00;
    private double grant = 0.00;
    private double financialAid = 0.00;
    private double savings = 0.00;
    private double family = 0.00;
    private double wages = 0.00;
    private double other = 0.00;
    //EXPENSE ALLOWANCES
    private double auto = 0.00;
    private double book = 0.00;
    private double cell = 0.00;
    private double clothing = 0.00;
    private double credit = 0.00;
    private double donation = 0.00;
    private double entertainment = 0.00;
    private double food = 0.00;
    private double furnitureAppliances = 0.00;
    private double supplies = 0.00;
    private double housing = 0.00;
    private double utilities = 0.00;
    private double laundry = 0.00;
    private double gas = 0.00;
    private double tuition = 0.00;
    private double misc = 0.00;    
    private Connection con;
    private String url = ("jdbc:mysql://www.wrtprogramming.com/wrturner_BudgetingSystem");

    public void setBudgeterID(String userID)
    {
       budgeterID = userID;
    }
    public String getBudgeterID()
    {
        return budgeterID;
    }
    public double getProposedScholarship()
    {
        return scholarship;
    }
    public void setProposedScholarship(double aScholarship)
    {
	scholarship = aScholarship;
    }
    public double getProposedGrant()
    {
        return grant;
    }
    public void setProposedGrant(double aGrant)
    {
	grant = aGrant;
    }
    public double getProposedFinancialAid()
    {
        return financialAid;
    }
    public void setProposedFinancialAid(double aFinancialAid)
    {
	financialAid = aFinancialAid;
    }
    public double getProposedSavings()
    {
        return savings;
    }
    public void setProposedSavings(double aSavings)
    {
	savings = aSavings;
    }
    public double getProposedFamily()
    {
        return family;
    }
    public void setProposedFamily(double aFamily)
    {
	family = aFamily;
    }
    public double getProposedWages()
    {
        return wages;
    }
    public void setProposedWages(double aWages)
    {
	wages = aWages;
    }
    public double getProposedOther()
    {
        return other;
    }
    public void setProposedOther(double aOther)
    {
	other = aOther;
    }
    public double getProposedAuto()
    {
        return auto;
    }
    public void setProposedAuto(double aAuto)
    {
	auto = aAuto;
    }
    public double getProposedBook()
    {
        return book;
    }
    public void setProposedBook(double aBook)
    {
	book = aBook;
    }
    public double getProposedCell()
    {
        return cell;
    }
    public void setProposedCell(double aCell)
    {
	cell = aCell;
    }
    public double getProposedClothing()
    {
        return clothing;
    }
    public void setProposedClothing(double aClothing)
    {
	clothing = aClothing;
    }
    public double getProposedCredit()
    {
        return credit;
    }
    public void setProposedCredit(double aCredit)
    {
	credit = aCredit;
    }
        public double getProposedDonation()
    {
        return donation;
    }
    public void setProposedDonation(double aDonation)
    {
	donation = aDonation;
    }
    public double getProposedEntertainment()
    {
        return scholarship;
    }
    public void setProposedEntertainment(double aEntertainment)
    {
	entertainment = aEntertainment;
    }
    public double getProposedFood()
    {
        return food;
    }
    public void setProposedFood(double aFood)
    {
	food = aFood;
    }
    public double getProposedFurnitureAppliances()
    {
        return furnitureAppliances;
    }
    public void setProposedFurnitureAppliances(double aFurnitureAppliances)
    {
	furnitureAppliances = aFurnitureAppliances;
    }
    public double getProposedSupplies()
    {
        return supplies;
    }
    public void setProposedSupplies(double aSupplies)
    {
	supplies = aSupplies;
    }
    public double getProposedHousing()
    {
        return housing;
    }
    public void setProposedHousing(double aHousing)
    {
	housing = aHousing;
    }
    public double getProposedUtilities()
    {
        return utilities;
    }
    public void setProposedUtilities(double aUtilities)
    {
	utilities = aUtilities;
    }
    public double getProposedLaundry()
    {
        return laundry;
    }
    public void setProposedLaundry(double aLaundry)
    {
	laundry = aLaundry;
    }
    public double getProposedGas()
    {
        return gas;
    }
    public void setProposedGas(double aGas)
    {
	gas = aGas;
    }
    public double getProposedTuition()
    {
        return tuition;
    }
    public void setProposedTuition(double aTuition)
    {
	tuition = aTuition;
    }
    public double getProposedMisc()
    {
        return misc;
    }
    public void setProposedMisc(double aMisc)
    {
	misc = aMisc;
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
    public void findProposedAllowances()
    {
        try
        {
        //we run query to find table using the categoryID
        Statement stmt = getCon().createStatement();

        //we query the category table
        ResultSet rscholarship = stmt.executeQuery("SELECT scholarship FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rgrant = stmt.executeQuery("SELECT grant FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rfinancialAid = stmt.executeQuery("SELECT financialAid FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rsavings = stmt.executeQuery("SELECT savings FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rfamily = stmt.executeQuery("SELECT family FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rwages = stmt.executeQuery("SELECT wages FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rother = stmt.executeQuery("SELECT other FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        
        ResultSet rauto = stmt.executeQuery("SELECT auto FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rbook = stmt.executeQuery("SELECT book FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rcell = stmt.executeQuery("SELECT cell FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rclothing = stmt.executeQuery("SELECT clothing FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rcredit = stmt.executeQuery("SELECT credit FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rdonation = stmt.executeQuery("SELECT donation FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rentertainment = stmt.executeQuery("SELECT entertainment FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rfood = stmt.executeQuery("SELECT food FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rfurniture = stmt.executeQuery("SELECT furniture-appliances FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rsupplies = stmt.executeQuery("SELECT supplies FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rhousing = stmt.executeQuery("SELECT housing FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rutilities = stmt.executeQuery("SELECT utilities FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rlaundry = stmt.executeQuery("SELECT laundry FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rgas = stmt.executeQuery("SELECT gas FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rtuition = stmt.executeQuery("SELECT tuition FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        ResultSet rmisc = stmt.executeQuery("SELECT misc FROM allowances WHERE budgeterID = '"+getBudgeterID() +"';");
        
        
        setProposedScholarship (Double.parseDouble(rscholarship.getString("scholarship")));
        setProposedGrant (Double.parseDouble(rgrant.getString("grant")));
        setProposedFinancialAid (Double.parseDouble(rfinancialAid.getString("financialAid")));
        setProposedSavings (Double.parseDouble(rsavings.getString("savings")));
        setProposedFamily (Double.parseDouble(rfamily.getString("family")));
        setProposedWages (Double.parseDouble(rwages.getString("wages")));
        setProposedOther (Double.parseDouble(rother.getString("other")));
        
        setProposedAuto (Double.parseDouble(rauto.getString("auto")));
        setProposedBook (Double.parseDouble(rbook.getString("book")));
        setProposedCell (Double.parseDouble(rcell.getString("cell")));
        setProposedClothing (Double.parseDouble(rclothing.getString("clothing")));
        setProposedCredit (Double.parseDouble(rcredit.getString("credit")));
        setProposedDonation (Double.parseDouble(rdonation.getString("donation")));
        setProposedEntertainment (Double.parseDouble(rentertainment.getString("entertainment")));
        setProposedFood (Double.parseDouble(rfood.getString("food")));
        setProposedFurnitureAppliances (Double.parseDouble(rfurniture.getString("furniture")));
        setProposedSupplies (Double.parseDouble(rsupplies.getString("supplies")));
        setProposedHousing (Double.parseDouble(rhousing.getString("housing")));
        setProposedUtilities (Double.parseDouble(rutilities.getString("utilities")));
        setProposedLaundry (Double.parseDouble(rlaundry.getString("laundry")));
        setProposedGas (Double.parseDouble(rgas.getString("gas")));
        setProposedTuition (Double.parseDouble(rtuition.getString("tuition")));
        setProposedMisc (Double.parseDouble(rmisc.getString("misc")));
        
        
        //we set the userCategoryName to the one found by using the ID
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    //CREATE A BUDGET PLAN OF ALLOWANCES
    public boolean setProposedAllowances()
    {
        if(this.isConnected())
            
        {
            try
            {
                //CREATE A STATEMENT
                Statement stmt = getCon().createStatement();

                //QUERY THE budgeterType TABLE
                stmt.executeUpdate("INSERT INTO allowances VALUES('"+this.getBudgeterID() +"','"+ this.getProposedScholarship() +"', '" +this.getProposedGrant()+"','"+this.getProposedFinancialAid()+"','"+this.getProposedSavings() +"','"+this.getProposedFamily() +"','"+this.getProposedWages() +"','"+this.getProposedOther() +"','"+this.getProposedAuto() +"','"+this.getProposedBook() +"','"+this.getProposedCell() +"','"+this.getProposedClothing() +"','"+this.getProposedCredit() +"','"+this.getProposedDonation() +"','"+this.getProposedEntertainment() +"','"+this.getProposedFood() +"','"+this.getProposedFurnitureAppliances() +"','"+this.getProposedSupplies() +"','"+this.getProposedHousing() +"','"+this.getProposedUtilities() +"','"+this.getProposedLaundry() +"','"+this.getProposedGas() +"','"+this.getProposedTuition() +"','"+ this.getProposedMisc() +"' )");
                //CLOSE THE CONNECTION.
                 this.isClosed();
            }
            catch(Exception e)
            {
                System.out.println("FAILED TO SUBMIT BUDGET");
                e.printStackTrace();
                //We close the connection.
                this.isClosed();
                return false;
            };

            return true;
        }
            return false;
    }
    //UPDATE SCHOLARSHIP ALLOWANCE
    public boolean updateScholarshipAllowance(double aScholarship)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET scholarship = '" + scholarship + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE GRANT ALLOWANCE
    public boolean updateGrantAllowance(double aGrant)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET grant = '" + grant + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
        //UPDATE FINANCIAL AID ALLOWANCE
    public boolean updateFinancialAidAllowance(double aFinancialAid)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET financialAid = '" + financialAid + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE SCHOLARSHIP ALLOWANCE
    public boolean updateSavingsAllowance(double aSavings)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET savings = '" + savings + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE FAMILY CONTRIBUTION ALLOWANCE
    public boolean updateFamilyAllowance(double aFamily)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET family = '" + family + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE SCHOLARSHIP ALLOWANCE
    public boolean updateWagesAllowance(double aWages)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET wages = '" + wages + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE OTHER ALLOWANCE
    public boolean updateOtherAllowance(double aAuto)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET other = '" + other + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE AUTO ALLOWANCE
    public boolean updateAutoAllowance(double aAuto)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET auto = '" + auto + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE BOOK ALLOWANCE
    public boolean updateBookAllowance(double aBook)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET book = '" + book + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE CELLPHONE ALLOWANCE
    public boolean updateCellAllowance(double aCell)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET cell = '" + cell + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
        //UPDATE CLOTHING ALLOWANCE
    public boolean updateClothingAllowance(double aClothing)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET clothing = '" + clothing + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
     //UPDATE CREDIT ALLOWANCE
    public boolean updateCreditAllowance(double aCredit)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET credit = '" + credit + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
     //UPDATE DONATIONS ALLOWANCE
    public boolean updateDonationsAllowance(double aDonation)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET donation = '" + donation + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE ENTERTAINMENT ALLOWANCE
    public boolean updateEntertainmentAllowance(double aEntertainment)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET entertainment = '" + entertainment + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
        //UPDATE FOOD ALLOWANCE
    public boolean updateFoodAllowance(double aFood)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET food = '" + food + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE FURNITURE APPLIANCES ALLOWANCE
    public boolean updateFurnitureAppliancesAllowance(double aFurniture)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET furniture-appliances = '" + furnitureAppliances + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    //UPDATE HOUSE SUPPLIES ALLOWANCE
    public boolean updateSuppliesAllowance(double aSupplies)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET supplies = '" + supplies + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
        //UPDATE HOUSING ALLOWANCE
    public boolean updateHousingAllowance(double aHousing)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET housing = '" + housing + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
        //UPDATE UTILITIES ALLOWANCE
    public boolean updateUtilitiesAllowance(double aUtilities)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET utilities = '" + utilities + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
     //UPDATE LAUNDRY ALLOWANCE
    public boolean updateLaundryAllowance(double aLaundry)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET laundry = '" + laundry + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
        //UPDATE GAS ALLOWANCE
    public boolean updateGasAllowance(double aGas)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET gas = '" + gas + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
        //UPDATE TUITION ALLOWANCE
    public boolean updateTuitionAllowance(double aTuition)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET tuition = '" + tuition + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
        //UPDATE MISCELLANEOUS ALLOWANCE
    public boolean updateMiscAllowance(double aMisc)
    {
    if(this.isConnected())
    {
        try
        {
            //CREATE A STATEMENT
            Statement stmt = getCon().createStatement();

            //QUERY ALLOWANCE TABLE
             stmt.executeUpdate("UPDATE allowances SET misc = '" + misc + "' WHERE budgeterID = " + this.getBudgeterID() + ";");

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
    public Allowances()
    {
        
    }
    
}
