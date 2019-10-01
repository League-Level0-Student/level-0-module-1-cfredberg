package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String charlie = "He loves coding";
String dean = "He likes drawing";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Type a name.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (name.equalsIgnoreCase("charlie")) {
	JOptionPane.showMessageDialog(null, charlie);
}else if (name.equalsIgnoreCase("dean")){
	JOptionPane.showMessageDialog(null, dean);
}else {
	JOptionPane.showMessageDialog(null, "Type a different name.");
}
	}
}

