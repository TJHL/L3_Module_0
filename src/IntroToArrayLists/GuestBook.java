package IntroToArrayLists;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	String input;
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton addButton = new JButton("Add Name");
	JButton viewButton = new JButton("View Names");

	public static void main(String[] args)  {
		GuestBook launch = new GuestBook();
	}
	GuestBook(){
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
		if(e.getSource()==addButton){
		input=JOptionPane.showInputDialog("Enter A name");
		System.out.println(input);
		}
	}
		
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
