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
			//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
			less=Double.parseDouble(JOptionPane.showInputDialog("Helllo"));
			more=Double.parseDouble(JOptionPane.showInputDialog("Helllo too"));
			
			for (int i = 0; i < 100; i++) {
				num.push((a.nextDouble())*100);
				
			}
			for (int i = 0; i < 100; i++) {
				//num.pop();
				if (less<= num.pop() && num.pop() <=more) {
				System.out.println(num.pop());
				}
			}
		}
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	
}