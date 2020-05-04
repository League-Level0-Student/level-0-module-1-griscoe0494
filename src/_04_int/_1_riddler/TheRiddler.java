package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer=JOptionPane.showInputDialog(null,"What can travel around the world while staying in a corner?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equals("A stamp")) {
	JOptionPane.showMessageDialog(null,"Correct!"); score++;

}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong");
	JOptionPane.showMessageDialog(null,"A stamp");
}
		// 6. Add some more riddles
String second=JOptionPane.showInputDialog(null,"Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
if(second.equals("A coffin")) {
	JOptionPane.showMessageDialog(null,"Correct!"); score++;

}

else {
	JOptionPane.showMessageDialog(null,"Wrong");
	JOptionPane.showMessageDialog(null,"A coffin");
}
		// 2. Make a pop up to show the score.

	}
}

