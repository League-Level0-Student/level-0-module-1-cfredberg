package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String coffinAnswer = JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
		"Who buys it, has no use for it.\r\n" + 
		"Who uses it can neither see nor feel it.\r\n" + 
		"What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (coffinAnswer.equalsIgnoreCase("a coffin") || coffinAnswer.equalsIgnoreCase("coffin")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score++;
	JOptionPane.showMessageDialog(null, "Your score is: " + score);
}else {
	JOptionPane.showMessageDialog(null, "Wrong!\r\n The correct answer is 'coffin'.");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String stampA = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
if (stampA.equalsIgnoreCase("stamp") || stampA.equalsIgnoreCase("a stamp")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
	JOptionPane.showMessageDialog(null, "Your final score is: " + score);

} else {
	JOptionPane.showMessageDialog(null, "Wrong.\r\n The correct answer is 'stamp'.");
	JOptionPane.showMessageDialog(null, "Your final score is: " + score);
}
		// 2. Make a pop up to show the score.
		
	}
}

