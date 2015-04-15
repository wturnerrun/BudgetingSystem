//Student Budget Page
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class StudentPage extends JPanel
{
	private String userID;
	private String userPass;

	//Student Entity Classes
	Student studentBudget = new Student(userID,userPass);
        private JLabel studentNameLabel = new JLabel(studentBudget.getFirstName());

	private JLabel welcome = new JLabel("Welcome " +(studentNameLabel)+" to your Budget Management System! ");
	private JPanel studentBudgetPanel = new JPanel(new BorderLayout());
	private JPanel studentBudgetMenuBar = new JPanel(new GridLayout(1,6));
	
        private JPanel studentimageholder= new JPanel(new BorderLayout());
        private ImageIcon studentImage = new ImageIcon(getClass().getResource("studentBudgetImage.jpg")); 
        private JButton student = new JButton(studentImage);

	//Student Budget Menu Bar Buttons
	private JButton createEditBudget = new JButton("CREATE / EDIT BUDGET");
	private JButton inputIncome = new JButton("INPUT INCOME");
	private JButton inputExpenses = new JButton("INPUT RECEIPTS");
	private JButton budgetStatus = new JButton("HOW AM I DOING");
	private JButton studentLogout = new JButton("LOGOUT");

	//Labels to Display Current Status
	private JLabel studentExpenses = new JLabel ("CURRENT EXPENSES: ");
	private JLabel studentAssets = new JLabel("CURRENT ASSETS: ");
	private JLabel studentResult = new JLabel ("STATUS: ");
    
    public StudentPage()
    {
	//Employee Budget Menu Bar
	studentBudgetMenuBar.add(createEditBudget);
	createEditBudget.addActionListener(new StudentPageMenuListener());
	studentBudgetMenuBar.add(inputIncome);
	inputIncome.addActionListener(new StudentPageMenuListener());
	studentBudgetMenuBar.add(inputExpenses);
        inputExpenses.addActionListener(new StudentPageMenuListener());
	studentBudgetMenuBar.add(budgetStatus);
	budgetStatus.addActionListener(new StudentPageMenuListener());
	studentBudgetMenuBar.add(studentLogout);
        studentLogout.addActionListener(new StudentPageMenuListener());
        studentBudgetPanel.add(welcome,BorderLayout.NORTH);
	studentBudgetPanel.add(studentBudgetMenuBar,BorderLayout.CENTER);
        studentimageholder.add(student);
        this.setLayout(new BorderLayout());
        this.add(studentBudgetPanel,BorderLayout.NORTH);
        this.add(studentimageholder);
    }

private class StudentPageMenuListener implements ActionListener
{
    public void actionPerformed(ActionEvent studentMenuButtonClicked)
    {
        if (studentMenuButtonClicked.getSource() == createEditBudget)
        {
            CreateEditBudgetPage studentBudget = new CreateEditBudgetPage();
            JFrame budget = new JFrame("YOUR PROPOSED BUDGET"); // creates a new JFrame
            budget.add(studentBudget); // add the panel to the frame
            budget.setSize( 950,830 ); // set the desired size
            budget.setLocation(200,100);
            budget.setVisible( true ); // show the frame
        }
        else if (studentMenuButtonClicked.getSource() == inputIncome)
	{
            InputIncome studentIncome = new InputIncome();
            JFrame budgetIncome = new JFrame("YOUR INCOME OR CONTRIBUTIONS"); // creates a new JFrame
            budgetIncome.add(studentIncome); // add the panel to the frame
            budgetIncome.setSize( 600,300 ); // set the desired size
            budgetIncome.setLocation(400,300);
            budgetIncome.setVisible( true ); // show the frame
        }        
        else if (studentMenuButtonClicked.getSource() == inputExpenses)
	{
            InputReceipts studentExpenses = new InputReceipts();
            JFrame budgetExpenses = new JFrame("YOUR EXPENSES"); // creates a new JFrame
            budgetExpenses.add(studentExpenses); // add the panel to the frame
            budgetExpenses.setSize( 600,300 ); // set the desired size
            budgetExpenses.setLocation(400,300);
            budgetExpenses.setVisible( true ); // show the frame
        }
	else if(studentMenuButtonClicked.getSource()== budgetStatus)
	{
            HowAmIDoing status = new HowAmIDoing();
            JFrame budgetStatusFrame = new JFrame("YOUR CURRENT BUDGETED ITEMS"); // creates a new JFrame
            budgetStatusFrame.add(status); // add the panel to the frame
            budgetStatusFrame.setSize( 600,300 ); // set the desired size
            budgetStatusFrame.setLocation(400,300);
            budgetStatusFrame.setVisible( true ); // show the frame
	}
        else if(studentMenuButtonClicked.getSource()==studentLogout)
        {
            
            OpeningPage sLogout = new OpeningPage();
            JFrame logoutFrame = new JFrame("BUDGET MANAGEMENT SYSTEM"); // creates a new JFrame
            
            logoutFrame.add(sLogout); // add the panel to the frame
            logoutFrame.setSize( 950,750 ); // set the desired size
            logoutFrame.setLocation(200,100);
            logoutFrame.setVisible( true ); // show the frame            
        }
    }
}
}