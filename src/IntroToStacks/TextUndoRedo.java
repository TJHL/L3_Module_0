package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Suck lead, not actually commusist scum!");
	public static void main(String[] args) {
		TextUndoRedo a= new TextUndoRedo();
	}
	TextUndoRedo(){
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			label.setText(label.getText()+"\n");
		}
		label.setText(label.getText()+e.getKeyChar());
			
		
		
	}
	
	public void keyReleased(KeyEvent e){}public void keyTyped(KeyEvent e) {}
	
}
