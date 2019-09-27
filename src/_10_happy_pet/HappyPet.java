package _10_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	static int happinesslevel = 0;
	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy, dog, dragon, or sloth");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		for (int i = 0; i < 50; i++) {
			
		
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet HAPPY? Try to make your pet's happiness level get to 50. It is currently at "+happinesslevel, "HappyPet", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "cuddle", "food", "water", "take a walk", "groom", "clean up poop" }, null);
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

		// 4. Create methods to handle each of your user selections.
		// Each method should create a pop-up with the pet's response (eg. cat might
		// purr when pet),
		// and INCREMENT the pet's happiness Level.
		
		if (task == (0)) {
			happinesslevel = happinesslevel + 7;
			JOptionPane.showMessageDialog(null, "Your " + pet + " nuzzled your face. Your pet's happiness level is" +happinesslevel);

		}
		else if (task == (1)) {
			happinesslevel = happinesslevel + 10;
			JOptionPane.showMessageDialog(null, "Your " + pet + " grumbles happily! Your pet's happiness level is "+happinesslevel);
		}
		else if (task == (2)) {
			happinesslevel = happinesslevel + 5;
			JOptionPane.showMessageDialog(null,
					"Your " + pet + " slurped up the water. Your pet's happiness level is "+happinesslevel);
		}
		else if (task == (3)) {
			happinesslevel = happinesslevel + 15;
			JOptionPane.showMessageDialog(null, "Your " + pet
					+ " slumped onto it's bed in a heap of exhaustion after your walk. Your pet's happiness level is "+happinesslevel);
		}
		else if (task == (4)) {
			happinesslevel = happinesslevel + 9;
			JOptionPane.showMessageDialog(null, "Your " + pet + " looks snazzy! Your pet's happiness level is "+happinesslevel);
		}
		else if (task == (5)) {
			happinesslevel = happinesslevel + 5;
			JOptionPane.showMessageDialog(null,
					"Your " + pet + " happily walks back into the house. Your pet's happiness level is "+happinesslevel);
		}
		if (happinesslevel >= 50) {
				break;
			}
		}
	}
}

	