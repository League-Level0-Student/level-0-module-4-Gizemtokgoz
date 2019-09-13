package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
         String nickel = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
         int nickelValue = Integer.parseInt(nickel);
         nickelValue*=5;
		// Ask the user how many dimes they have, and convert their answer
         String dime = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
         int dimeValue = Integer.parseInt(dime);
         dimeValue*=10;
         String quarter = JOptionPane.showInputDialog("How many quarters do you have?");
         int quarterValue = Integer.parseInt(quarter);
         quarterValue*=25;
         // Calculate how much money the user has and save it in a double variable 
         double value = nickelValue;
         value	+= dimeValue;
         value  += quarterValue;
         value = value/100.0;
		// Tell the user how much money they have
         JOptionPane.showMessageDialog(null, "You have " + (value) + " dollars in yo bank account, yet you still dont have enough for that 1000 dollar sandwich!");
	}
}

