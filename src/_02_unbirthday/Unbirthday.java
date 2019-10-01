package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String date = "2/17";
	String bday = JOptionPane.showInputDialog("What is your bday? (example, 7/11)");
	if (bday.contentEquals(date)) {
		JOptionPane.showMessageDialog(null, "Good");
	}else {
		JOptionPane.showMessageDialog(null, "Too bad");
	}
}
}
