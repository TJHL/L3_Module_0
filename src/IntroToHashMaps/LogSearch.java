package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	  HashMap<Integer, String> idList = new HashMap<Integer, String>();
	  JFrame frame = new JFrame();
	  JPanel panel = new JPanel();
	  JButton AddEntry = new JButton("Add Entry");
	  JButton SearchID = new JButton("Search by ID");
	  JButton ViewList = new JButton("View List");
  public static void main(String[] args) {
	  
	  LogSearch a = new LogSearch();
  }
  
	  LogSearch() {
	  frame.add(panel);
	  panel.add(AddEntry);
	  panel.add(SearchID);
	  panel.add(ViewList);
	  frame.pack();
	  frame.setVisible(true);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  AddEntry.addActionListener(this);
	  SearchID.addActionListener(this);
	  ViewList.addActionListener(this);
	  
	  }

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==AddEntry) {
			int newID=Integer.parseInt(JOptionPane.showInputDialog("Enter a identificationiser number"));
			String newName=JOptionPane.showInputDialog("Enter a name for the identificationiser number");
			idList.put(newID, newName);
			System.out.println(idList);
			
		}
		if(e.getSource()==SearchID) {
			int checkID= Integer.parseInt(JOptionPane.showInputDialog("Enter a identificationiser number"));
			if(idList.containsKey(checkID) == true) {
	    		JOptionPane.showMessageDialog(null, "Id number: "+" ,User name: "+"");
			}
			else JOptionPane.showMessageDialog(null, "Who the hell are you trying to kindap?!");
			
		}
		if(e.getSource()==ViewList) {
			JOptionPane.showMessageDialog(null,"All ");
			
				for(String s : idList.values()){
						System.out.println(s);
						}
			
		}
		
	}

	
	/* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
}
