//Input Receipts
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class InputReceipts extends JPanel
{
        //Input Receipt variables
        Budgeter current = new Budgeter();
        private int budgeterID;
	private int receiptTypeID;
	private String receiptTypeName;
        private String receiptID;
	private String companyName;
	private double price;
	private double allowance;
        private String[] receiptTypes = {"AUTO", "BOOK", "CELLPHONE", "CLOTHING", "CREDIT CARD", "DONATIONS", "ENTERTAINMENT", "FOOD", "FURNITURE - APPLIANCES", "HOUSE SUPPLIES", "HOUSING", "UTILITIES", "LAUNDRY", "GAS", "TUITION", "MISCELLANEOUS"};
	
        private JFrame inputReceiptsStudentFrame = new JFrame("STUDENT BUDGET MANAGEMENT");
        private JFrame inputReceiptsEmployeeFrame = new JFrame("EMPLOYEE BUDGET MANAGEMENT");
        
        //Input Receipt GUI Variables
        private JPanel inputReceiptsPanel=new JPanel(new GridLayout(6,0));
	
        private JButton addReceiptsHomeButton = new JButton("HOME");
	private JLabel receiptIDLabel = new JLabel("RECEIPT NUMBER:");
	private JTextField receiptIDText= new JTextField(30);
	private JLabel companyLabel= new JLabel("COMPANY NAME: ");
	private JTextField companyText= new JTextField(30);
	private JLabel priceLabel = new JLabel("PRICE: $");
	private JTextField priceText = new JTextField(30);
        private JLabel budgeterIDLabel = new JLabel("USER ID");
        private JTextField budgeterIDText = new JTextField(30);
        
        private JComboBox rTypes = new JComboBox(receiptTypes);
        private JButton addReceiptsButton = new JButton("ADD RECEIPT");
	

        InputReceipts()
        {	
            inputReceiptsPanel.add(receiptIDLabel);
            inputReceiptsPanel.add(receiptIDText);
            inputReceiptsPanel.add(companyLabel);
            inputReceiptsPanel.add(companyText);
            inputReceiptsPanel.add(priceLabel);
            inputReceiptsPanel.add(priceText);
            inputReceiptsPanel.add(budgeterIDLabel);
            inputReceiptsPanel.add(budgeterIDText);
            inputReceiptsPanel.add(rTypes);
            rTypes.addActionListener(new InputReceiptsListener());
            inputReceiptsPanel.add(addReceiptsButton);
            addReceiptsButton.addActionListener(new InputReceiptsListener());
            inputReceiptsPanel.add(addReceiptsHomeButton);
            addReceiptsHomeButton.addActionListener(new InputReceiptsListener());
            
            this.setLayout(new BorderLayout());
            this.add(inputReceiptsPanel,BorderLayout.NORTH);

        }
private class InputReceiptsListener implements ActionListener
{
    public void actionPerformed(ActionEvent expenseCategoryChosen)
    {
            if (expenseCategoryChosen.getSource()==addReceiptsButton)
            {
                if(rTypes.getSelectedItem().equals("AUTO"))
		{
                    Auto newAutoReceipt = new Auto();
                    newAutoReceipt.setBudgeterID(budgeterIDText.getText());
                    newAutoReceipt.setExpenseName("automobile");
                    newAutoReceipt.setExpenseType(1);
                    newAutoReceipt.setReceiptNumber(receiptIDText.getText());
                    newAutoReceipt.setCompanyName(companyText.getText());
                    newAutoReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newAutoReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"AUTO RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                } 
                else if(rTypes.getSelectedItem().equals("BOOK"))
		{
                    Book newBookReceipt = new Book();
                    newBookReceipt.setBudgeterID(budgeterIDText.getText());
                    newBookReceipt.setExpenseName("books");
                    newBookReceipt.setExpenseType(2);
                    newBookReceipt.setReceiptNumber(receiptIDText.getText());
                    newBookReceipt.setCompanyName(companyText.getText());
                    newBookReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newBookReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"BOOK RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }                    
                else if(rTypes.getSelectedItem().equals("CELLPHONE"))
		{
                    Cell newCellReceipt = new Cell();
                    newCellReceipt.setBudgeterID(budgeterIDText.getText());
                    newCellReceipt.setExpenseName("cellPhone");
                    newCellReceipt.setExpenseType(3);
                    newCellReceipt.setReceiptNumber(receiptIDText.getText());
                    newCellReceipt.setCompanyName(companyText.getText());
                    newCellReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newCellReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"CELLPHONE RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("CLOTHING"))
		{
                    Clothing newClothingReceipt = new Clothing();
                    newClothingReceipt.setBudgeterID(budgeterIDText.getText());
                    newClothingReceipt.setExpenseName("clothing");
                    newClothingReceipt.setExpenseType(4);
                    newClothingReceipt.setReceiptNumber(receiptIDText.getText());
                    newClothingReceipt.setCompanyName(companyText.getText());
                    newClothingReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newClothingReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"CLOTHING RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("CREDIT CARD"))
		{
                    Credit newCreditReceipt = new Credit();
                    newCreditReceipt.setBudgeterID(budgeterIDText.getText());
                    newCreditReceipt.setExpenseName("creditCard");
                    newCreditReceipt.setExpenseType(5);
                    newCreditReceipt.setReceiptNumber(receiptIDText.getText());
                    newCreditReceipt.setCompanyName(companyText.getText());
                    newCreditReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newCreditReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"CREDIT CARD RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                } 
                else if(rTypes.getSelectedItem().equals("DONATIONS"))
		{
                    Donations newDonationsReceipt = new Donations();
                    newDonationsReceipt.setBudgeterID(budgeterIDText.getText());
                    newDonationsReceipt.setExpenseName("donations");
                    newDonationsReceipt.setExpenseType(6);
                    newDonationsReceipt.setReceiptNumber(receiptIDText.getText());
                    newDonationsReceipt.setCompanyName(companyText.getText());
                    newDonationsReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newDonationsReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"DONATIONS RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("ENTERTAINMENT"))
		{
                    Entertainment newEntertainmentReceipt = new Entertainment();
                    newEntertainmentReceipt.setBudgeterID(budgeterIDText.getText());
                    newEntertainmentReceipt.setExpenseName("entertainment");
                    newEntertainmentReceipt.setExpenseType(7);
                    newEntertainmentReceipt.setReceiptNumber(receiptIDText.getText());
                    newEntertainmentReceipt.setCompanyName(companyText.getText());
                    newEntertainmentReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newEntertainmentReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"ENTERTAINMENT RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("FOOD"))
		{
                    Food newFoodReceipt = new Food();
                    newFoodReceipt.setBudgeterID(budgeterIDText.getText());
                    newFoodReceipt.setExpenseName("food");
                    newFoodReceipt.setExpenseType(8);
                    newFoodReceipt.setReceiptNumber(receiptIDText.getText());
                    newFoodReceipt.setCompanyName(companyText.getText());
                    newFoodReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newFoodReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"FOOD RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                } 
                else if(rTypes.getSelectedItem().equals("FURNITURE - APPLIANCES"))
		{
                    FurnitureAppliances newFurnitureReceipt = new FurnitureAppliances();
                    newFurnitureReceipt.setBudgeterID(budgeterIDText.getText());
                    newFurnitureReceipt.setExpenseName("furniture-appliances");
                    newFurnitureReceipt.setExpenseType(9);
                    newFurnitureReceipt.setReceiptNumber(receiptIDText.getText());
                    newFurnitureReceipt.setCompanyName(companyText.getText());
                    newFurnitureReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newFurnitureReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"FURNITURE - APPLIANCE RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("HOUSE SUPPLIES"))
		{
                    HouseSupplies newSuppliesReceipt = new HouseSupplies();
                    newSuppliesReceipt.setBudgeterID(budgeterIDText.getText());
                    newSuppliesReceipt.setExpenseName("houseSupplies");
                    newSuppliesReceipt.setExpenseType(10);
                    newSuppliesReceipt.setReceiptNumber(receiptIDText.getText());
                    newSuppliesReceipt.setCompanyName(companyText.getText());
                    newSuppliesReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newSuppliesReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"HOUSE SUPPLIES RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("HOUSING"))
		{
                    Housing newHousingReceipt = new Housing();
                    newHousingReceipt.setBudgeterID(budgeterIDText.getText());
                    newHousingReceipt.setExpenseName("rent-own");
                    newHousingReceipt.setExpenseType(11);
                    newHousingReceipt.setReceiptNumber(receiptIDText.getText());
                    newHousingReceipt.setCompanyName(companyText.getText());
                    newHousingReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newHousingReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"HOUSING RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("UTILITIES"))
		{
                    Utilities newUtilitiesReceipt = new Utilities();
                    newUtilitiesReceipt.setBudgeterID(budgeterIDText.getText());
                    newUtilitiesReceipt.setExpenseName("utilities");
                    newUtilitiesReceipt.setExpenseType(12);
                    newUtilitiesReceipt.setReceiptNumber(receiptIDText.getText());
                    newUtilitiesReceipt.setCompanyName(companyText.getText());
                    newUtilitiesReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newUtilitiesReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"UTILITIES RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("LAUNDRY"))
		{
                    Laundry newLaundryReceipt = new Laundry();
                    newLaundryReceipt.setBudgeterID(budgeterIDText.getText());
                    newLaundryReceipt.setExpenseName("laundry");
                    newLaundryReceipt.setExpenseType(13);
                    newLaundryReceipt.setReceiptNumber(receiptIDText.getText());
                    newLaundryReceipt.setCompanyName(companyText.getText());
                    newLaundryReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newLaundryReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"LAUNDRY RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("GAS"))
		{
                    Gas newGasReceipt = new Gas();
                    newGasReceipt.setBudgeterID(budgeterIDText.getText());
                    newGasReceipt.setExpenseName("gas");
                    newGasReceipt.setExpenseType(14);
                    newGasReceipt.setReceiptNumber(receiptIDText.getText());
                    newGasReceipt.setCompanyName(companyText.getText());
                    newGasReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newGasReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"GAS RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("TUITION"))
		{
                    Tuition newTuitionReceipt = new Tuition();
                    newTuitionReceipt.setBudgeterID(budgeterIDText.getText());
                    newTuitionReceipt.setExpenseName("tuition");
                    newTuitionReceipt.setExpenseType(15);
                    newTuitionReceipt.setReceiptNumber(receiptIDText.getText());
                    newTuitionReceipt.setCompanyName(companyText.getText());
                    newTuitionReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newTuitionReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"TUITION RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
                else if(rTypes.getSelectedItem().equals("MISCELLANEOUS"))
		{
                    Misc newMiscReceipt = new Misc();
                    newMiscReceipt.setBudgeterID(budgeterIDText.getText());
                    newMiscReceipt.setExpenseName("miscellaneous");
                    newMiscReceipt.setExpenseType(16);
                    newMiscReceipt.setReceiptNumber(receiptIDText.getText());
                    newMiscReceipt.setCompanyName(companyText.getText());
                    newMiscReceipt.setPrice(Double.parseDouble(priceText.getText()));
                    newMiscReceipt.addReceipt();
                    
                    JOptionPane.showMessageDialog(null,"MISCELLANEOUS RECEIPT HAS BEEN ADDED TO THE DATABASE");
		    receiptIDText.setText("");
		    companyText.setText("");
                    priceText.setText("");
                }
            }
            else if(expenseCategoryChosen.getSource() == addReceiptsHomeButton)
            {
                    Student student=new Student(current.getID(),current.getPass());
                    Employee employee = new Employee(current.getID(),current.getPass());
                if(student.isLoggedin())
		{
                    StudentPage inputReceiptsStudentBudget=new StudentPage();
                    inputReceiptsStudentFrame.add(inputReceiptsStudentBudget); 
                    inputReceiptsStudentFrame.setSize( 950,750 ); 
                    inputReceiptsStudentFrame.setLocation(0,100);
                    inputReceiptsStudentFrame.setVisible( true ); 
                }
                else if(employee.isLoggedin())
		{
                    EmployeePage inputReceiptsEmployeeBudget=new EmployeePage();
                    inputReceiptsEmployeeFrame.add(inputReceiptsEmployeeBudget); 
                    inputReceiptsEmployeeFrame.setSize( 950,750 ); 
                    inputReceiptsEmployeeFrame.setLocation(0,100);
                    inputReceiptsEmployeeFrame.setVisible( true ); 
                }
            }
	}
    }
}





