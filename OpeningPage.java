//Budget System Opening Page
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class OpeningPage extends JPanel
{
	private JPanel frontpage = new JPanel(new BorderLayout());
	private JPanel menubar = new JPanel(new GridLayout(6,1));
	private JPanel searchbar = new JPanel(new GridLayout(1,2));
	private JPanel sidemenu = new JPanel(new GridLayout (3,1));
	private JPanel topimageholder= new JPanel(new BorderLayout());
        private ImageIcon openingImage = new ImageIcon(getClass().getResource("budgetingSystemImage.jpg")); 
        private JButton opening = new JButton(openingImage);
       

	private JButton searchButton=new JButton("SEARCH");
	private JTextField searchText=new JTextField(30);
	private JButton loginButton = new JButton("LOGIN");
	private JPanel panel = new JPanel();
	private JTextField loginIDText = new JTextField(15);
	private JTextField passwordText = new JPasswordField(15);
	private JLabel userLabel = new JLabel("LOGIN ID: ");
	private JLabel passLabel = new JLabel("PASSWORD: ");

	private JButton nUser = new JButton("REGISTER");
        private JButton eUser = new JButton("LOGIN");
        private JButton reserved = new JButton("RESERVED");
        private JButton history = new JButton("HISTORY");
        private JButton ask = new JButton("ASK");
        private JButton myAccount = new JButton("MY ACCOUNT");


	// Class BudgetingSystemFrontPage Constructor
    public OpeningPage()
    {
	//Menu Bar
	menubar.add(eUser);
  	eUser.addActionListener(new MenuListener());
  	menubar.add(nUser);
  	nUser.addActionListener(new MenuListener());
        
        topimageholder.add(opening);
       

	//Add Panels To Front Page
  	frontpage.add(searchbar, BorderLayout.SOUTH);
  	frontpage.add(menubar,BorderLayout.CENTER);

	//Add Panels To Main Panel
	this.setLayout(new BorderLayout());
	this.add(frontpage,BorderLayout.CENTER);
	this.add(topimageholder,BorderLayout.NORTH);
        

    }
private class MenuListener implements ActionListener
{
    public void actionPerformed (ActionEvent buttonClicked)
    {
	if (buttonClicked.getSource()== eUser)
	{
            Login login = new Login();
            JFrame myBudgetLogin = new JFrame("My Budget Login"); // creates a new JFrame
            myBudgetLogin.add(login); // add the panel to the frame
            myBudgetLogin.setSize( 600,200 ); // set the desired size
            myBudgetLogin.setLocation(400,300);
            myBudgetLogin.setVisible( true ); // show the frame
	}
	else if(buttonClicked.getSource()==nUser)
	{
            Register register = new Register();
            JFrame myBudgetRegistration = new JFrame("My Budget Registration"); // creates a new JFrame
            myBudgetRegistration.add(register); // add the panel to the frame
            myBudgetRegistration.setSize( 600,200 ); // set the desired size
            myBudgetRegistration.setLocation(400,300);
            myBudgetRegistration.setVisible( true ); // show the frame

	}
    }
}
}





























