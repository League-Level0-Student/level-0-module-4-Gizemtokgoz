import javax.swing.JOptionPane;

public class TestScore {
 public static void main(String[] args) {
	 String score = JOptionPane.showInputDialog("What was your test score?");
     int scoreNum = Integer.parseInt(score);
     double value = scoreNum;
     
     if (value < 50) {
    	 JOptionPane.showMessageDialog(null, "You are not intelligient!");
     }
     
     else if (50 < value && value < 100) {
    	 JOptionPane.showMessageDialog(null, "You are smart, keep up the good work!");
     }
 }
}
