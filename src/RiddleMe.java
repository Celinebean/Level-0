import javax.swing.JOptionPane;

public class RiddleMe {

	public static void main(String[] args) {

		int Score = 17;

	
		String Riddle1 = JOptionPane
				.showInputDialog("What has four legs in the morning, two in the afternoon, and three at night?");

	
		if (Riddle1.equals("Human")) {
			JOptionPane.showMessageDialog(null, "Correct! Your score is now "
					+ (Score += 1));

		} else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer was: Human ");
		}

			


			JOptionPane.showMessageDialog(null, Score);
		
	}
}
