package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		
		for (int i=0; i<4; i++) {
		// 1. Get 2 numbers from the user and convert them to integer.
		String num1 = JOptionPane.showInputDialog("Give me a number.");
		String num2 = JOptionPane.showInputDialog("Give me another number.");
		int numie1 = Integer.parseInt(num1); 
		int numie2 = Integer.parseInt(num2); 
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What would you like to do to these numbers.", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);
			System.out.println(operation);
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if (operation == 0) {
			double add = addition (numie1, numie2);
		}
		else if (operation == 1) {
			double sub = subtract (numie1, numie2);
		}
		else if (operation == 2) {
			double mul = multiply (numie1, numie2);
		}
		else if (operation == 3) {
			double div = division (numie1, numie2); 
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
		}
	}
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
		
	
		static int addition (int num1, int num2) {
			JOptionPane.showMessageDialog(null, num1+ "+" +num2+ "=" +(num1 + num2));
			return num1 + num2;
		}
		static int subtract (int num1, int num2) {
			JOptionPane.showMessageDialog(null, num1+ "-" +num2+ "=" +(num1 - num2));
			return num1 - num2;
		}
		static int multiply (int num1, int num2) {
			JOptionPane.showMessageDialog(null, num1+ "*" +num2+ "=" +(num1 * num2));
			return num1 * num2;
		}
		static int division (int num1, int num2) {
			JOptionPane.showMessageDialog(null, num1+ "/" +num2+ "=" +(num1 / num2));
			return num1 / num2;
		}
	// 4. Create similar methods for subtraction, multiplication and division.
	
}