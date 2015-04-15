//Employee Budget Page
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class EmployeePage extends JPanel
{
	private String userID;
	private String userPass;

	//Employee Entity Classes
	Employee employeeBudget = new Employee(userID,userPass);


	private JLabel employeeNameLabel = new JLabel(employeeBudget.getFirstName());

	private JLabel welcome = new JLabel("Welcome " +(employeeNameLabel)+" to your Budget Management System! ");
	private JPanel employeeBudgetPanel = new JPanel(new BorderLayout());
	private JPanel employeeBudgetMenuBar = new JPanel(new GridLayout(1,6));
	

	//Student Budget Menu Bar Buttons
	private JButton createEditBudget = new JButton("CREATE/EDIT BUDGET");
	private JButton inputIncome = new JButton("INPUT INCOME");
	private JButton inputExpenses = new JButton("INPUT RECEIPTS");
	private JButton budgetStatus = new JButton("HOW AM I DOING");
	private JButton employeeLogout = new JButton("LOGOUT");
        
        private JPanel employeeimageholder= new JPanel(new BorderLayout());
        private ImageIcon employeeImage = new ImageIcon(getClass().getResource("employeeBudgetImage.jpg")); 
        private JButton employee = new JButton(employeeImage);

	//Labels to Display Current Status
	private JLabel employeeExpenses = new JLabel ("CURRENT EXPENSES: ");
	private JLabel employeeAssets = new JLabel("CURRENT ASSETS: ");
	private JLabel employeeResult = new JLabel ("STATUS: ");
    
    public EmployeePage()
    {
	//Employee Budget Menu Bar
	employeeBudgetMenuBar.add(createEditBudget);
	createEditBudget.addActionListener(new EmployeePageMenuListener());
	employeeBudgetMenuBar.add(inputIncome);
	inputIncome.addActionListener(new EmployeePageMenuListener());
	employeeBudgetMenuBar.add(inputExpenses);
        inputExpenses.addActionListener(new EmployeePageMenuListener());
	employeeBudgetMenuBar.add(budgetStatus);
	budgetStatus.addActionListener(new EmployeePageMenuListener());
	employeeBudgetMenuBar.add(employeeLogout);
        employeeLogout.addActionListener(new EmployeePageMenuListener());
        employeeBudgetPanel.add(welcome,BorderLayout.NORTH);
	employeeBudgetPanel.add(employeeBudgetMenuBar,BorderLayout.CENTER);
        employeeimageholder.add(employee);
        this.setLayout(new BorderLayout());
        this.add(employeeBudgetPanel,BorderLayout.NORTH);
        this.add(employeeimageholder,BorderLayout.CENTER);
    }
private class EmployeePageMenuListener implements ActionListener
{
    public void actionPerformed(ActionEvent employeeMenuButtonClicked)
    {
        if (employeeMenuButtonClicked.getSource() == createEditBudget)
        {
            CreateEditBudgetPage employeeBudget = new CreateEditBudgetPage();
            JFrame budget = new JFrame("YOUR PROPOSED BUDGET"); // creates a new JFrame
            budget.add(employeeBudget); // add the panel to the frame
            budget.setSize( 950,830 ); // set the desired size
            budget.setLocation(200,100);
            budget.setVisible( true ); // show the frame
        }
        else if (employeeMenuButtonClicked.getSource() == inputIncome)
	{
            InputIncome employeeIncome = new InputIncome();
            JFrame budgetIncome = new JFrame("YOUR INCOME OR CONTRIBUTIONS"); // creates a new JFrame
            budgetIncome.add(employeeIncome); // add the panel to the frame
            budgetIncome.setSize( 600,300 ); // set the desired size
            budgetIncome.setLocation(400,300);
            budgetIncome.setVisible( true ); // show the frame
        }        
        else if (employeeMenuButtonClicked.getSource() == inputExpenses)
	{
            InputReceipts employeeExpenses = new InputReceipts();
            JFrame budgetExpenses = new JFrame("YOUR EXPENSES"); // creates a new JFrame
            budgetExpenses.add(employeeExpenses); // add the panel to the frame
            budgetExpenses.setSize( 600,300 ); // set the desired size
            budgetExpenses.setLocation(400,300);
            budgetExpenses.setVisible( true ); // show the frame
        }
	else if(employeeMenuButtonClicked.getSource()== budgetStatus)
	{
            HowAmIDoing status = new HowAmIDoing();
            JFrame budgetStatusFrame = new JFrame("YOUR CURRENT BUDGETED ITEMS"); // creates a new JFrame
            budgetStatusFrame.add(status); // add the panel to the frame
            budgetStatusFrame.setSize( 600,300 ); // set the desired size
            budgetStatusFrame.setLocation(400,300);
            budgetStatusFrame.setVisible( true ); // show the frame
	}
        else if(employeeMenuButtonClicked.getSource()==employeeLogout)
        {
            OpeningPage eLogout = new OpeningPage();
            JFrame logoutFrame = new JFrame("BUDGET MANAGEMENT SYSTEM"); // creates a new JFrame
            
            logoutFrame.add(eLogout); // add the panel to the frame
            logoutFrame.setSize( 950,750 ); // set the desired size
            logoutFrame.setLocation(100,300);
            logoutFrame.setVisible( true ); // show the frame            
        }
    }
}
}
