//Graphical User Interface for Login
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Login extends JPanel
{
//Profile Frames
private JFrame studentFrame= new JFrame("STUDENT");
private JFrame employeeFrame= new JFrame("EMPLOYEE");


//Variables Passed In To Verify Users
private String userID;
private String userPass;
private int userCategoryID;



//Media Objects of Entities
//Book book = new Book();
//Cd cd= new Cd();
//Movie movie = new Movie();

//Login Variables
private JButton loginButton = new JButton("LOGIN");
private JPanel loginPanel = new JPanel();
private JTextField loginIDText = new JTextField(15);
private JPasswordField passwordText = new JPasswordField(15);
private JLabel userLabel = new JLabel("LOGIN ID: ");
private JLabel passLabel = new JLabel("PASSWORD: ");

    Login()
    {
        loginPanel.add(userLabel);
        loginPanel.add(loginIDText);
        loginPanel.add(passLabel);
        loginPanel.add(passwordText);
	loginPanel.add(loginButton);
	loginButton.addActionListener(new LoginListener());
        //loginPanel.add(category);
        this.add(loginPanel);

    }
private class LoginListener implements ActionListener
{
    public void actionPerformed(ActionEvent loginClicked)
    {
        {
	userID = loginIDText.getText();
        userPass = passwordText.getText();
        //User Objects of Entities
        Student student=new Student(userID,userPass);
        Employee employee = new Employee(userID,userPass);
        
        if(student.isLoggedin())
        {
            StudentPage studentProfile=new StudentPage();
            studentFrame.add(studentProfile); //Add the student Page Panel
            studentFrame.setSize( 950,750); // Set studentFrame Size
            studentFrame.setLocation(200,100);
            studentFrame.setVisible( true ); // Show studentFrame
        }
	else if(employee.isLoggedin())
	{
            EmployeePage employeeBudget=new EmployeePage();
            employeeFrame.add(employeeBudget); //Add the Faculty Page Panel
            employeeFrame.setSize( 950,750 ); // Set facultyFrame Size
            employeeFrame.setLocation(200,100);
            employeeFrame.setVisible( true ); // Show facultyFrame
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid LoginID or Password");
            loginIDText.setText("");
            passwordText.setText("");
            loginIDText.requestFocus();
        }

    }
}
}}



