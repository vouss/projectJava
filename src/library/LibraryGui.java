package library;
import javax.swing.*;

public class LibraryGui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click!");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		
		frame.setSize(400,400);
		frame.setVisible(true);
	}

}
