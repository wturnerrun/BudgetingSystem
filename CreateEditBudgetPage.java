import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CreateEditBudgetPage extends JPanel
{

	//LABELS FOR MONTHLY INCOME AND EXPENSES
	private JLabel incomeCategoryLabel = new JLabel("INCOME CATEGORY");
        private JLabel ecurrentAllowanceLabel = new JLabel("CURRENT ALLOWANCE");
        private JLabel echangedAllowanceLabel = new JLabel("NEW ALLOWANCE");
        private JLabel emakeChangesLabel = new JLabel("MAKE CHANGES");
	private JLabel expenseCategoryLabel = new JLabel("EXPENSE CATEGORY");
        private JLabel icurrentAllowanceLabel = new JLabel("CURRENT ALLOWANCE");
        private JLabel ichangedAllowanceLabel = new JLabel("NEW ALLOWANCE");
        private JLabel imakeChangesLabel = new JLabel("MAKE CHANGES");
        
        private JLabel incomeCategoryuLabel = new JLabel("-----------------------------------------------------");
        private JLabel ecurrentAllowanceuLabel = new JLabel("-----------------------------------------------------");
        private JLabel echangedAllowanceuLabel = new JLabel("-----------------------------------------------------");
        private JLabel emakeChangesuLabel = new JLabel("-----------------------------------------------------");
	private JLabel expenseCategoryuLabel = new JLabel("-----------------------------------------------------");
        private JLabel icurrentAllowanceuLabel = new JLabel("-----------------------------------------------------");
        private JLabel ichangedAllowanceuLabel = new JLabel("-----------------------------------------------------");
        private JLabel imakeChangesuLabel = new JLabel("-----------------------------------------------------");
	
        //PANELS FOR CREATE / EDIT BUDGET
        private JPanel budgeterIDPanel = new JPanel(new GridLayout(0,2));
	private JPanel incomePanel = new JPanel(new GridLayout(9,0));
	private JPanel expensePanel = new JPanel(new GridLayout(19,0));
        private JPanel submitPanel = new JPanel(new GridLayout(0,1));
        //Budgeter ID FIELDS
        private JLabel budgeterIDLabel = new JLabel("LOGIN ID");
        private JTextField budgeterIDText = new JTextField(20);
        
	//INPUT FIELDS FOR PROPOSED BUDGETED INCOME
	private JLabel scholarshipLabel = new JLabel("SCHOLARSHIPS: ");
	private JLabel scholarshipAllowance = new JLabel("0.00");
	private JTextField scholarshipText = new JTextField(20);
	private JButton scholarshipSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel grantLabel = new JLabel("GRANTS: ");
	private JLabel grantAllowance = new JLabel("0.00");
	private JTextField grantText = new JTextField(20);
	private JButton grantSetButton = new JButton("UPDATE ALLOWANCE");


	private JLabel financialAidLabel = new JLabel("FINANCIAL AID: ");
	private JLabel financialAidAllowance = new JLabel("0.00");
	private JTextField financialAidText = new JTextField(20);
	private JButton financialAidSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel savingsLabel = new JLabel("SAVINGS: ");
	private JLabel savingsAllowance = new JLabel("0.00");
	private JTextField savingsText = new JTextField(20);
	private JButton savingsSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel familyContributionsLabel = new JLabel("FAMILY CONTRIBUTIONS: ");
	private JLabel familyContributionsAllowance = new JLabel("0.00");
	private JTextField familyContributionsText = new JTextField(20);
	private JButton familyContributionsSetButton = new JButton("UPDATE ALLOWANCE");


	private JLabel wagesLabel = new JLabel("EXPECTED WAGES: ");
	private JLabel wagesAllowance = new JLabel("0.00");
	private JTextField wagesText = new JTextField(20);
	private JButton wagesSetButton = new JButton("UPDATE ALLOWANCE");


	private JLabel otherLabel = new JLabel("OTHER INCOME: ");
	private JLabel otherAllowance = new JLabel("0.00");
	private JTextField otherText = new JTextField(20);
	private JButton otherSetButton = new JButton("UPDATE ALLOWANCE");

	//INPUT FIELDS FOR PROPOSED BUDGETED EXPENSES
	private JLabel autoLabel = new JLabel("AUTOMOBILE: ");
	private JLabel autoAllowance = new JLabel("0.00");
	private JTextField autoText = new JTextField(20);
	private JButton autoSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel bookLabel = new JLabel("BOOKS: ");
	private JLabel bookAllowance = new JLabel("0.00");
	private JTextField bookText = new JTextField(20);
	private JButton bookSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel cellLabel = new JLabel("CELL PHONE: ");
	private JLabel cellAllowance = new JLabel("0.00");
	private JTextField cellText = new JTextField(20);
	private JButton cellSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel clothingLabel = new JLabel("CLOTHING: ");
	private JLabel clothingAllowance = new JLabel("0.00");
	private JTextField clothingText = new JTextField(20);
	private JButton clothingSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel creditLabel = new JLabel("CREDIT CARD: ");
	private JLabel creditAllowance = new JLabel("0.00");
	private JTextField creditText = new JTextField(20);
	private JButton creditSetButton = new JButton("UPDATE ALLOWANCE");


	private JLabel donationsLabel = new JLabel("DONATIONS: ");
	private JLabel donationsAllowance = new JLabel("0.00");
	private JTextField donationsText = new JTextField(20);
	private JButton donationsSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel entertainmentLabel = new JLabel("ENTERTAINMENT: ");
	private JLabel entertainmentAllowance = new JLabel("0.00");
	private JTextField entertainmentText = new JTextField(20);
	private JButton entertainmentSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel foodLabel = new JLabel("FOOD: ");
	private JLabel foodAllowance = new JLabel("0.00");
	private JTextField foodText = new JTextField(20);
	private JButton foodSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel furnitureLabel = new JLabel("FURNITURE / APPLIANCES: ");
	private JLabel furnitureAllowance = new JLabel("0.00");
	private JTextField furnitureText = new JTextField(20);
	private JButton furnitureSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel gasLabel = new JLabel("GAS: ");
	private JLabel gasAllowance = new JLabel("0.00");
	private JTextField gasText = new JTextField(20);
	private JButton gasSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel suppliesLabel = new JLabel("HOUSE SUPPLIES: ");
	private JLabel suppliesAllowance = new JLabel("0.00");
	private JTextField suppliesText = new JTextField(20);
	private JButton suppliesSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel laundryLabel = new JLabel("LAUNDRY: ");
	private JLabel laundryAllowance = new JLabel("0.00");
	private JTextField laundryText = new JTextField(20);
	private JButton laundrySetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel housingLabel = new JLabel("RENT / MORTGAGE: ");
	private JLabel housingAllowance = new JLabel("0.00");
	private JTextField housingText = new JTextField(20);
	private JButton housingSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel tuitionLabel = new JLabel("TUITION: ");
	private JLabel tuitionAllowance = new JLabel("0.00");
	private JTextField tuitionText = new JTextField(20);
	private JButton tuitionSetButton = new JButton("UPDATE ALLOWANCE");

	private JLabel utilitiesLabel = new JLabel("UTILITIES: ");
	private JLabel utilitiesAllowance = new JLabel("0.00");
	private JTextField utilitiesText = new JTextField(20);
	private JButton utilitiesUpdateButton = new JButton("UPDATE ALLOWANCE");

	private JLabel miscLabel = new JLabel("MISCELLANEOUS: ");
	private JLabel miscAllowance = new JLabel("0.00");
	private JTextField miscText = new JTextField(20);
	private JButton miscUpdateButton = new JButton("UPDATE ALLOWANCE");
        
        private JButton submitBudget = new JButton("SUBMIT BUDGET");

    public CreateEditBudgetPage()
	{
                budgeterIDPanel.add(budgeterIDLabel);
                budgeterIDPanel.add(budgeterIDText);
		
                incomePanel.add(incomeCategoryLabel);
                incomePanel.add(icurrentAllowanceLabel);
                incomePanel.add(ichangedAllowanceLabel);
                incomePanel.add(imakeChangesLabel);
                
                incomePanel.add(incomeCategoryuLabel);
                incomePanel.add(icurrentAllowanceuLabel);
                incomePanel.add(ichangedAllowanceuLabel);
                incomePanel.add(imakeChangesuLabel);
                

		incomePanel.add(scholarshipLabel);
		incomePanel.add(scholarshipAllowance);
		incomePanel.add(scholarshipText);
		incomePanel.add(scholarshipSetButton);

		incomePanel.add(grantLabel);
		incomePanel.add(grantAllowance);
		incomePanel.add(grantText);
		incomePanel.add(grantSetButton);

		incomePanel.add(financialAidLabel);
		incomePanel.add(financialAidAllowance);
		incomePanel.add(financialAidText);
		incomePanel.add(financialAidSetButton);

		incomePanel.add(savingsLabel);
		incomePanel.add(savingsAllowance);
		incomePanel.add(savingsText);
		incomePanel.add(savingsSetButton);

		incomePanel.add(familyContributionsLabel);
		incomePanel.add(familyContributionsAllowance);
		incomePanel.add(familyContributionsText);
		incomePanel.add(familyContributionsSetButton);

		incomePanel.add(wagesLabel);
		incomePanel.add(wagesAllowance);
		incomePanel.add(wagesText);
		incomePanel.add(wagesSetButton);

		incomePanel.add(otherLabel);
		incomePanel.add(otherAllowance);
		incomePanel.add(otherText);
		incomePanel.add(otherSetButton);

		expensePanel.add(expenseCategoryLabel);
                expensePanel.add(ecurrentAllowanceLabel);
                expensePanel.add(echangedAllowanceLabel);
                expensePanel.add(emakeChangesLabel);
                expensePanel.add(expenseCategoryuLabel);
                expensePanel.add(ecurrentAllowanceuLabel);
                expensePanel.add(echangedAllowanceuLabel);
                expensePanel.add(emakeChangesuLabel);
                
                

		expensePanel.add(autoLabel);
		expensePanel.add(autoAllowance);
		expensePanel.add(autoText);
		expensePanel.add(autoSetButton);

		expensePanel.add(bookLabel);
		expensePanel.add(bookAllowance);
		expensePanel.add(bookText);
		expensePanel.add(bookSetButton);

		expensePanel.add(cellLabel);
		expensePanel.add(cellAllowance);
		expensePanel.add(cellText);
		expensePanel.add(cellSetButton);

		expensePanel.add(clothingLabel);
		expensePanel.add(clothingAllowance);
		expensePanel.add(clothingText);
		expensePanel.add(clothingSetButton);

		expensePanel.add(creditLabel);
		expensePanel.add(creditAllowance);
		expensePanel.add(creditText);
		expensePanel.add(creditSetButton);

		expensePanel.add(donationsLabel);
		expensePanel.add(donationsAllowance);
		expensePanel.add(donationsText);
		expensePanel.add(donationsSetButton);

		expensePanel.add(entertainmentLabel);
		expensePanel.add(entertainmentAllowance);
		expensePanel.add(entertainmentText);
		expensePanel.add(entertainmentSetButton);

		expensePanel.add(foodLabel);
		expensePanel.add(foodAllowance);
		expensePanel.add(foodText);
		expensePanel.add(foodSetButton);

		expensePanel.add(furnitureLabel);
		expensePanel.add(furnitureAllowance);
		expensePanel.add(furnitureText);
		expensePanel.add(furnitureSetButton);

		expensePanel.add(gasLabel);
		expensePanel.add(gasAllowance);
		expensePanel.add(gasText);
		expensePanel.add(gasSetButton);

		expensePanel.add(suppliesLabel);
		expensePanel.add(suppliesAllowance);
		expensePanel.add(suppliesText);
		expensePanel.add(suppliesSetButton);

		expensePanel.add(laundryLabel);
		expensePanel.add(laundryAllowance);
		expensePanel.add(laundryText);
		expensePanel.add(laundrySetButton);

		expensePanel.add(housingLabel);
		expensePanel.add(housingAllowance);
		expensePanel.add(housingText);
		expensePanel.add(housingSetButton);

		expensePanel.add(tuitionLabel);
		expensePanel.add(tuitionAllowance);
		expensePanel.add(tuitionText);
		expensePanel.add(tuitionSetButton);

		expensePanel.add(utilitiesLabel);
		expensePanel.add(utilitiesAllowance);
		expensePanel.add(utilitiesText);
		expensePanel.add(utilitiesUpdateButton);

		expensePanel.add(miscLabel);
		expensePanel.add(miscAllowance);
		expensePanel.add(miscText);
		expensePanel.add(miscUpdateButton);
                
                submitPanel.add(submitBudget);
                submitBudget.addActionListener(new CreateEditBudgetListener());
                
               


                this.add(budgeterIDPanel);
                this.add(incomePanel);
		this.add(expensePanel);
                this.add(submitPanel);
	}
private class CreateEditBudgetListener implements ActionListener
{
    public void actionPerformed(ActionEvent buttonClicked)
    {
        if (buttonClicked.getSource()==submitBudget)
        {
            Allowances proposed = new Allowances();
            proposed.setBudgeterID(budgeterIDText.getText());
            proposed.setProposedScholarship(Double.parseDouble(scholarshipText.getText()));
            proposed.setProposedGrant(Double.parseDouble(grantText.getText()));
            proposed.setProposedFinancialAid(Double.parseDouble(financialAidText.getText()));
            proposed.setProposedSavings(Double.parseDouble(savingsText.getText()));
            proposed.setProposedFamily(Double.parseDouble(familyContributionsText.getText()));
            proposed.setProposedWages(Double.parseDouble(wagesText.getText()));
            proposed.setProposedOther(Double.parseDouble(otherText.getText()));
            
            proposed.setProposedAuto(Double.parseDouble(autoText.getText()));
            proposed.setProposedBook(Double.parseDouble(bookText.getText()));
            proposed.setProposedCell(Double.parseDouble(cellText.getText()));
            proposed.setProposedClothing(Double.parseDouble(clothingText.getText()));
            proposed.setProposedCredit(Double.parseDouble(creditText.getText()));
            proposed.setProposedDonation(Double.parseDouble(donationsText.getText()));
            proposed.setProposedEntertainment(Double.parseDouble(entertainmentText.getText()));
            proposed.setProposedFood(Double.parseDouble(foodText.getText()));
            proposed.setProposedFurnitureAppliances(Double.parseDouble(furnitureText.getText()));
            proposed.setProposedSupplies(Double.parseDouble(suppliesText.getText()));
            proposed.setProposedHousing(Double.parseDouble(housingText.getText()));
            proposed.setProposedUtilities(Double.parseDouble(utilitiesText.getText()));
            proposed.setProposedLaundry(Double.parseDouble(laundryText.getText()));
            proposed.setProposedGas(Double.parseDouble(gasText.getText()));
            proposed.setProposedTuition(Double.parseDouble(tuitionText.getText()));
            proposed.setProposedMisc(Double.parseDouble(miscText.getText()));
                        
            proposed.setProposedAllowances();
            
            scholarshipAllowance.setText(scholarshipText.getText());
            grantAllowance.setText(grantText.getText());
            financialAidAllowance.setText(financialAidText.getText());
            savingsAllowance.setText(savingsText.getText());
            familyContributionsAllowance.setText(familyContributionsText.getText());
            wagesAllowance.setText(wagesText.getText());
            otherAllowance.setText(otherText.getText());
            
            autoAllowance.setText(autoText.getText());
            bookAllowance.setText(bookText.getText());
            cellAllowance.setText(cellText.getText());
            clothingAllowance.setText(clothingText.getText());
            creditAllowance.setText(creditText.getText());
            donationsAllowance.setText(donationsText.getText());
            entertainmentAllowance.setText(entertainmentText.getText());
            foodAllowance.setText(foodText.getText());
            furnitureAllowance.setText(furnitureText.getText());
            suppliesAllowance.setText(suppliesText.getText());
            housingAllowance.setText(housingText.getText());
            utilitiesAllowance.setText(utilitiesText.getText());
            laundryAllowance.setText(laundryText.getText());
            gasAllowance.setText(gasText.getText());
            tuitionAllowance.setText(tuitionText.getText());
            miscAllowance.setText(miscText.getText());
            JOptionPane.showMessageDialog(null,"YOUR BUDGET HAS BEEN CREATED");
        }
        
    }
    
}
}        




