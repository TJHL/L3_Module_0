package IntroToArrayLists;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	ArrayList<String> guests = new ArrayList<String>();
	String input;
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton addButton = new JButton("Add Name");
	JButton viewButton = new JButton("View Names");

	public static void main(String[] args) {
		GuestBook launch = new GuestBook();

	}

	GuestBook() {
		frame.add(panel);
		panel.add(addButton);
		panel.add(viewButton);
		addButton.addActionListener(this);
		viewButton.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == addButton) {
			input = JOptionPane.showInputDialog("Enter A name");
			guests.add(input + "\n");

		}
		
		if (e.getSource() == viewButton) {
			String guestPosition= "";
			for (int i = 0; i < guests.size(); i++) {
			guestPosition+="Guest #"+(i+1)+": "+guests.get(i);
				
			}
			JOptionPane.showMessageDialog(null, "Guests \n" + guestPosition);
		}
	}
}