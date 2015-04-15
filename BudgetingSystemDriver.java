// Budgeting System Driver Class
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class BudgetingSystemDriver
{

public static void main( String[] args )
{

  	OpeningPage opening = new OpeningPage( );

	JFrame budget = new JFrame("Budgeting Management System"); // creates a new JFrame
	budget.add(opening); // add the panel to the frame
	budget.setSize( 950,750 ); // set the desired size
	budget.setLocation(200,100);
	budget.setVisible( true ); // show the frame
	budget.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	} // END MAIN
	} // END CLASS BudgetSystemDriver