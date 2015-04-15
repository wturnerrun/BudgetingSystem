//Registration Page
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Register extends JPanel
{
	private JLabel userTypeLabel = new JLabel("USER TYPE");
	private JTextField userTypeText = new JTextField(30);
	private JLabel userFirstLabel = new JLabel("FIRST NAME");
	private JTextField userFirstText = new JTextField(30);
	private JLabel userLastLabel = new JLabel("LAST NAME");
	private JTextField userLastText = new JTextField(30);
	private JLabel userIDLabel = new JLabel("User ID");
	private JTextField userIDText = new JTextField(30);
	private JLabel userPassLabel = new JLabel("USER PASSWORD");
	private JTextField userPassText = new JTextField(30);

	private JButton registerSubmit = new JButton("REGISTER");

	private JButton backButton = new JButton("BACK");

	private JPanel addUserMenuBar = new JPanel(new GridLayout(1,5));
	private JPanel addUserPanel = new JPanel(new GridLayout(6,0));



Register()
{
        addUserMenuBar.add(backButton);
        backButton.addActionListener(new RegisterListener());
        addUserPanel.add(userTypeLabel);
        addUserPanel.add(userTypeText);
        addUserPanel.add(userFirstLabel);
        addUserPanel.add(userFirstText);
        addUserPanel.add(userLastLabel);
        addUserPanel.add(userLastText);
        addUserPanel.add(userIDLabel);
        addUserPanel.add(userIDText);
        addUserPanel.add(userPassLabel);
        addUserPanel.add(userPassText);
	addUserPanel.add(registerSubmit);
        registerSubmit.addActionListener(new RegisterListener());

//Add Panels To Add User
this.setLayout(new BorderLayout());
this.add(addUserMenuBar,BorderLayout.NORTH);
this.add(addUserPanel,BorderLayout.CENTER);


}
private class RegisterListener implements ActionListener
{
	public void actionPerformed(ActionEvent registerButtonClicked)
	{

            if (registerButtonClicked.getSource() == registerSubmit)
            {
               if ("student".equals(userTypeText.getText())||"Student".equals(userTypeText.getText()))
		{
                    Student newStudent = new Student();
                    newStudent.setUserCategoryName("student");
                    newStudent.setUserCategoryID(1);
                    newStudent.setID(userIDText.getText());
                    newStudent.setFirstName(userFirstText.getText());
                    newStudent.setLastName(userLastText.getText());
                    newStudent.setPass(userPassText.getText());
                    newStudent.addBudgeter();
                    JOptionPane.showMessageDialog(null,"STUDENT HAS BEEN ADDED TO THE DATABASE");
                    userTypeText.setText("");
		    userFirstText.setText("");
		    userLastText.setText("");
                    userIDText.setText("");
                    userPassText.setText("");
                }
		else if("employee".equals(userTypeText.getText())||"Employee".equals (userTypeText.getText()))
		{
                    Employee newEmployee = new Employee();
                    newEmployee.setUserCategoryName("employee");
                    newEmployee.setUserCategoryID(2);
                    newEmployee.setID(userIDText.getText());
                    newEmployee.setFirstName(userFirstText.getText());
                    newEmployee.setLastName(userLastText.getText());
                    newEmployee.setPass(userPassText.getText());
                    newEmployee.addBudgeter();
                    JOptionPane.showMessageDialog(null,"EMPLOYEE HAS BEEN ADDED TO THE DATABASE");
                    userTypeText.setText("");
		    userFirstText.setText("");
		    userLastText.setText("");
                    userIDText.setText("");
                    userPassText.setText("");
                }
               else
                {
                    JOptionPane.showMessageDialog(null,"Invalid Budgeter Type");
		    userTypeText.setText("");
		    userFirstText.setText("");
		    userLastText.setText("");
                    userIDText.setText("");
                    userPassText.setText("");
                    
                }
            }
            else if (registerButtonClicked.getSource() == backButton)
            {
                OpeningPage opening = new OpeningPage();

                JFrame addNew = new JFrame(); // creates a new JFrame
                addNew.add(opening); // add the panel to the frame
                addNew.setSize( 950,750 ); // set the desired size
                addNew.setVisible( true ); // show the frame
            }

}
}
}
