//Input Receipts
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class InputIncome extends JPanel
{
        //Input Receipt variables
        Budgeter current = new Budgeter();
        private int budgeterID;
	private int incomeTypeID;
	private String incomeTypeName;
        private String incomeID;
	private String contributorName;
	private double earnings;
	private double allowance;
        private String[] incomeTypes = {"SCHOLARSHIP", "GRANT", "FINANCIAL AID", "SAVINGS", "FAMILY CONTRIBUTIONS", "WAGES", "OTHER INCOME"};
	
        private JFrame inputIncomeStudentFrame = new JFrame("STUDENT BUDGET MANAGEMENT");
        private JFrame inputIncomeEmployeeFrame = new JFrame("EMPLOYEE BUDGET MANAGEMENT");
        
        //Input Receipt GUI Variables
        private JPanel inputIncomePanel=new JPanel(new GridLayout(6,0));
	
        private JButton inputIncomeHomeButton = new JButton("HOME");
	private JLabel incomeIDLabel = new JLabel("DEPOSIT NUMBER:");
	private JTextField incomeIDText= new JTextField(30);
	private JLabel contributorLabel= new JLabel("CONTRIBUTOR: ");
	private JTextField contributorText= new JTextField(30);
	private JLabel earningsLabel = new JLabel("AVAILABLE FUNDS: $");
	private JTextField earningsText = new JTextField(30);
        private JLabel budgeterIDLabel = new JLabel("USER ID");
        private JTextField budgeterIDText = new JTextField(30);
        
        private JComboBox iTypes = new JComboBox(incomeTypes);
        private JButton addIncomeButton = new JButton("ADD DEPOSIT");
	

        InputIncome()
        {	
            inputIncomePanel.add(incomeIDLabel);
            inputIncomePanel.add(incomeIDText);
            inputIncomePanel.add(contributorLabel);
            inputIncomePanel.add(contributorText);
            inputIncomePanel.add(earningsLabel);
            inputIncomePanel.add(earningsText);
            inputIncomePanel.add(budgeterIDLabel);
            inputIncomePanel.add(budgeterIDText);
            inputIncomePanel.add(iTypes);
            iTypes.addActionListener(new InputIncomeListener());
            inputIncomePanel.add(addIncomeButton);
            addIncomeButton.addActionListener(new InputIncomeListener());
            inputIncomePanel.add(inputIncomeHomeButton);
            inputIncomeHomeButton.addActionListener(new InputIncomeListener());
           
            this.setLayout(new BorderLayout());
            this.add(inputIncomePanel,BorderLayout.NORTH);

        }
private class InputIncomeListener implements ActionListener
{
            private JComboBox type;
        public void actionPerformed(ActionEvent incomeCategoryChosen)
        {
            if (incomeCategoryChosen.getSource()==addIncomeButton)
            {
                if(iTypes.getSelectedItem().equals("SCHOLARSHIP"))
		{
                    Scholarship newScholarshipIncome = new Scholarship();
                    newScholarshipIncome.setBudgeterID(budgeterIDText.getText());
                    newScholarshipIncome.setIncomeName("scholarship");
                    newScholarshipIncome.setIncomeType(1);
                    newScholarshipIncome.setIncomeNumber(incomeIDText.getText());
                    newScholarshipIncome.setContributorName(contributorText.getText());
                    newScholarshipIncome.setEarnings(Double.parseDouble(earningsText.getText()));
                    newScholarshipIncome.addIncome();
                    
                    JOptionPane.showMessageDialog(null,"GRANT INCOME HAS BEEN ADDED TO THE DATABASE");
		    incomeIDText.setText("");
		    contributorText.setText("");
                    earningsText.setText("");
                }
                else if(iTypes.getSelectedItem().equals("GRANT"))
		{
                    Grant newGrantIncome = new Grant();
                    newGrantIncome.setBudgeterID(budgeterIDText.getText());
                    newGrantIncome.setIncomeName("grant");
                    newGrantIncome.setIncomeType(2);
                    newGrantIncome.setIncomeNumber(incomeIDText.getText());
                    newGrantIncome.setContributorName(contributorText.getText());
                    newGrantIncome.setEarnings(Double.parseDouble(earningsText.getText()));
                    newGrantIncome.addIncome();
                    
                    JOptionPane.showMessageDialog(null,"GRANT INCOME HAS BEEN ADDED TO THE DATABASE");
		    incomeIDText.setText("");
		    contributorText.setText("");
                    earningsText.setText("");
                }                    
                else if(iTypes.getSelectedItem().equals("FINANCIAL AID"))
		{
                    FinancialAid newFinancialAidIncome = new FinancialAid();
                    newFinancialAidIncome.setBudgeterID(budgeterIDText.getText());
                    newFinancialAidIncome.setIncomeName("financialAid");
                    newFinancialAidIncome.setIncomeType(3);
                    newFinancialAidIncome.setIncomeNumber(incomeIDText.getText());
                    newFinancialAidIncome.setContributorName(contributorText.getText());
                    newFinancialAidIncome.setEarnings(Double.parseDouble(earningsText.getText()));
                    newFinancialAidIncome.addIncome();
                    
                    JOptionPane.showMessageDialog(null,"GRANT INCOME HAS BEEN ADDED TO THE DATABASE");
		    incomeIDText.setText("");
		    contributorText.setText("");
                    earningsText.setText("");
                }
                else if(iTypes.getSelectedItem().equals("SAVINGS"))
		{
                    Savings newSavingsIncome = new Savings();
                    newSavingsIncome.setBudgeterID(budgeterIDText.getText());
                    newSavingsIncome.setIncomeName("savings");
                    newSavingsIncome.setIncomeType(4);
                    newSavingsIncome.setIncomeNumber(incomeIDText.getText());
                    newSavingsIncome.setContributorName(contributorText.getText());
                    newSavingsIncome.setEarnings(Double.parseDouble(earningsText.getText()));
                    newSavingsIncome.addIncome();
                    
                    JOptionPane.showMessageDialog(null,"SAVINGS INCOME HAS BEEN ADDED TO THE DATABASE");
		    incomeIDText.setText("");
		    contributorText.setText("");
                    earningsText.setText("");
                }
               else if(iTypes.getSelectedItem().equals("FAMILY CONTRIBUTIONS"))
		{
                    Family newFamilyIncome = new Family();
                    newFamilyIncome.setBudgeterID(budgeterIDText.getText());
                    newFamilyIncome.setIncomeName("family");
                    newFamilyIncome.setIncomeType(5);
                    newFamilyIncome.setIncomeNumber(incomeIDText.getText());
                    newFamilyIncome.setContributorName(contributorText.getText());
                    newFamilyIncome.setEarnings(Double.parseDouble(earningsText.getText()));
                    newFamilyIncome.addIncome();
                    
                    JOptionPane.showMessageDialog(null,"FAMILY CONTRIBUTION INCOME HAS BEEN ADDED TO THE DATABASE");
		    incomeIDText.setText("");
		    contributorText.setText("");
                    earningsText.setText("");
                } 
                else if(iTypes.getSelectedItem().equals("WAGES"))
		{
                    Wages newWagesIncome = new Wages();
                    newWagesIncome.setBudgeterID(budgeterIDText.getText());
                    newWagesIncome.setIncomeName("wages");
                    newWagesIncome.setIncomeType(6);
                    newWagesIncome.setIncomeNumber(incomeIDText.getText());
                    newWagesIncome.setContributorName(contributorText.getText());
                    newWagesIncome.setEarnings(Double.parseDouble(earningsText.getText()));
                    newWagesIncome.addIncome();
                    
                    JOptionPane.showMessageDialog(null,"WAGES INCOME HAS BEEN ADDED TO THE DATABASE");
		    incomeIDText.setText("");
		    contributorText.setText("");
                    earningsText.setText("");
                }
                else if(iTypes.getSelectedItem().equals("OTHER INCOME"))
		{
                    Other newOtherIncome = new Other();
                    newOtherIncome.setBudgeterID(budgeterIDText.getText());
                    newOtherIncome.setIncomeName("other");
                    newOtherIncome.setIncomeType(7);
                    newOtherIncome.setIncomeNumber(incomeIDText.getText());
                    newOtherIncome.setContributorName(contributorText.getText());
                    newOtherIncome.setEarnings(Double.parseDouble(earningsText.getText()));
                    newOtherIncome.addIncome();
                    
                    JOptionPane.showMessageDialog(null,"OTHER INCOME HAS BEEN ADDED TO THE DATABASE");
		    incomeIDText.setText("");
		    contributorText.setText("");
                    earningsText.setText("");
                }
            }
            else if(incomeCategoryChosen.getSource() == inputIncomeHomeButton)
            {
                    Student student=new Student(current.getID(),current.getPass());
                    Employee employee = new Employee(current.getID(),current.getPass());
                if(student.isLoggedin())
		{
                    StudentPage inputIncomeStudentBudget=new StudentPage();
                    inputIncomeStudentFrame.add(inputIncomeStudentBudget); 
                    inputIncomeStudentFrame.setSize( 950,750 ); 
                    inputIncomeStudentFrame.setLocation(0,100);
                    inputIncomeStudentFrame.setVisible( true ); 
                }
                else if(employee.isLoggedin())
		{
                    EmployeePage inputIncomeEmployeeBudget=new EmployeePage();
                    inputIncomeEmployeeFrame.add(inputIncomeEmployeeBudget); 
                    inputIncomeEmployeeFrame.setSize( 950,750 ); 
                    inputIncomeEmployeeFrame.setLocation(0,100);
                    inputIncomeEmployeeFrame.setVisible( true ); 

					}
            }
	}
    }
}
