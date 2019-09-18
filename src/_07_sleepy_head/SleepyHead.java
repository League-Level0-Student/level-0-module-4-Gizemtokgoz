package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		// Ask the user for these values using a confirm dialog like the one below

		// weekday boolean
		int Answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if (Answer == 0) {
			isWeekday = true;

		} else {
			isWeekday = false;

		}

		// vacation boolean
		isVacation = false;
		
		if (isWeekday) {
			Answer = JOptionPane.showConfirmDialog(null, "Is it vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
			if (Answer == 0) {
				isVacation = true;
			} else {
				isVacation = false;
			}
		}
		// dialog
		if (isWeekday) {
			if (isVacation) {
				JOptionPane.showMessageDialog(null, "Enjoy your vacation and sleep in!");
			} else {
				JOptionPane.showMessageDialog(null, "Get to work!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Sleep in.");
		}

		/*
		 * String Day = JOptionPane.showInputDialog(null,
		 * "Is it a weekday, weekend, or vacation for you?"); if (Day.equals("weekday"))
		 * { JOptionPane.showMessageDialog(null, "Get up lazyhead!"); } if
		 * (Day.equals("weekend")) { JOptionPane.showMessageDialog(null, "Sleep in."); }
		 * if (Day.equals("vacation")) { JOptionPane.showMessageDialog(null,
		 * "Enjoy your vacation and sleep in!"); }
		 * 
		 * /* Print “sleep in�? if it is a vacation or a weekend. If it’s a
		 * weekday, print “get up lazybones!�? If it is a weekday, and we are on
		 * vacation, print “sleep in�?.
		 */
	}
}
