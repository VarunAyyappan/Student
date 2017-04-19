package jrJava.graphics4_myOwnComponents;

import javax.swing.JFrame;

public class GUI {

	private JFrame frame;
	private MyPanel panel;
	private MyButton button;
	
	public GUI(){
		frame = new JFrame("My Own Things");
		frame.setBounds(200, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new MyPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		button = new MyButton();
		button.setBounds(180, 120, 100, 30); 
		panel.add(button);
		
		frame.setVisible(true); 
	}
	
	

	public static void main(String[] args) {
		new GUI();
	}

}
