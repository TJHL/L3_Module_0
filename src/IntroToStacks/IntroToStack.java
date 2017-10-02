package IntroToStacks;

import java.util.Random;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class IntroToStack {
	
	JFrame frame = new JFrame();
	JPanel panel= new JPanel();
	Random a= new Random();
	Double less;
	Double more;
	Stack<Double> num = new Stack<Double>();
	
	public static void main(String[] args) {
		
		IntroToStack s =new IntroToStack();
		s.numberOperating();
	}
		IntroToStack() {
			frame.add(panel);
			
		}
		void numberOperating(){
			less=Double.parseDouble(JOptionPane.showInputDialog("Enter a number between 0 and 100"));
			more=Double.parseDouble(JOptionPane.showInputDialog("Enter a number greater than your first number"));
			
			for (int i = 0; i < 100; i++) {
				num.push((a.nextDouble())*100);
				
			}
			
			for (int i = 0; i < 100; i++) {
				double d=num.pop();
				if (less<= d && d <=more) {
				System.out.println(d);
				}
			}
		}
	
}