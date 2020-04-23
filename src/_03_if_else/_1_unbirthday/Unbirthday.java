package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
    public static void main(String[] args) {

String answer=JOptionPane.showInputDialog(null,"When is your birthday?");
if(answer.equals("04/23")) {
	JOptionPane.showMessageDialog(null,"Happy Birthday!");
}
else {
	JOptionPane.showMessageDialog(null, "Very Merry Unbirthday");
}
}
}
	//Ask the user for their birthday (mm/dd), e.g. 06/09        04/23
	//If it matches today's date, wish them a happy birthday
	//otherwise, wish them a very merry UNbirthday 