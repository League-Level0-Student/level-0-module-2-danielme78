package extra;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
String answer = JOptionPane.showInputDialog("How old are you??");
int age = Integer.parseInt(answer);

if (age>=18) { JOptionPane.showMessageDialog(null, "You can Vote, Choose Wisely!!");

}
else { JOptionPane.showMessageDialog(null, "No one cares about you...sorry for being a worm like creature aka a snake.");
	

}
}
}
