//How Am I Doing Class
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class HowAmIDoing extends JPanel
{
	private JPanel howAmIDoingPanel = new JPanel(new GridLayout(3,0));

	private JLabel tuitionUsed = new JLabel("TUITION USED: ");
	private JLabel tuitionRemaining = new JLabel("TUITION REMAINING: ");

	private JLabel housingUsed = new JLabel("HOUSING USED: ");
	private JLabel housingRemaining = new JLabel("HOUSING REMAINING: ");

	private JLabel creditCardUsed = new JLabel("CREDIT CARD USED: ");
	private JLabel creditCardRemaining = new JLabel("CREDIT CARD REMAINING: ");

	private JLabel foodUsed = new JLabel("FOOD USED: ");
	private JLabel foodRemaining = new JLabel("FOOD REMAINING: ");

	private JLabel houseSuppliesUsed = new JLabel("HOUSE SUPPLIES USED: ");
	private JLabel houseSuppliesRemaining = new JLabel("HOUSE SUPPLIES REMAINING: ");

	private JLabel schoolSuppliesUsed = new JLabel("SCHOOL SUPPLIES USED: ");
	private JLabel schoolSuppliesRemaining = new JLabel("SCHOOL SUPPLIES REMAINING: ");

	private JLabel booksUsed = new JLabel("BOOKS USED: ");
	private JLabel booksRemaining = new JLabel("BOOKS REMAINING: ");

	private JLabel utilitiesUsed = new JLabel("UTILITIES USED: ");
	private JLabel utilitiesRemaining = new JLabel("UTILITIES REMAINING: ");

	private JLabel cellPhoneUsed = new JLabel("CELLPHONE USED: ");
	private JLabel cellPhoneRemaining = new JLabel("CELLPHONE REMAINING: ");

	private JLabel automobileUsed = new JLabel("AUTO USED: ");
	private JLabel automobileRemaining = new JLabel("AUTO REMAINING: ");

	private JLabel gasUsed = new JLabel("FUEL USED: ");
	private JLabel gasRemaining = new JLabel("FUEL REMAINING: ");

	private JLabel clothingUsed = new JLabel("FOOD USED: ");
	private JLabel clothingRemaining = new JLabel("FOOD REMAINING: ");

	private JLabel laundryUsed = new JLabel("FOOD USED: ");
	private JLabel laundryRemaining = new JLabel("FOOD REMAINING: ");

	private JLabel miscUsed = new JLabel("MISCELLANEOUS USED: ");
	private JLabel miscRemaining = new JLabel("MISCELLANEOUS REMAINING: ");

	private JLabel savingsUsed = new JLabel("SAVINGS USED: ");
	private JLabel savingsRemaining = new JLabel("SAVINGS REMAINING: ");

	private JLabel totalExpenses = new JLabel("TOTAL EXPENSES: ");


	private JLabel totalAssets = new JLabel("TOTAL ASSESTS: ");
	private JLabel totalResult = new JLabel("REMAINING BALANCE: ");

	public HowAmIDoing()
	{
		howAmIDoingPanel.add(totalExpenses);
		howAmIDoingPanel.add(totalAssets);
		howAmIDoingPanel.add(totalResult);
		howAmIDoingPanel.add(totalExpenses);
		howAmIDoingPanel.add(totalAssets);
		howAmIDoingPanel.add(totalResult);
		howAmIDoingPanel.add(totalExpenses);
		howAmIDoingPanel.add(totalAssets);
		howAmIDoingPanel.add(totalResult);
		howAmIDoingPanel.add(totalExpenses);
		howAmIDoingPanel.add(totalAssets);
		howAmIDoingPanel.add(totalResult);
		howAmIDoingPanel.add(totalExpenses);
		howAmIDoingPanel.add(totalAssets);
		howAmIDoingPanel.add(totalResult);
		howAmIDoingPanel.add(totalExpenses);
		howAmIDoingPanel.add(totalAssets);
		howAmIDoingPanel.add(totalResult);
		howAmIDoingPanel.add(totalExpenses);
		howAmIDoingPanel.add(totalAssets);
		howAmIDoingPanel.add(totalResult);
		howAmIDoingPanel.add(totalExpenses);
		howAmIDoingPanel.add(totalAssets);
		howAmIDoingPanel.add(totalResult);
	this.add(howAmIDoingPanel);
	}
}
