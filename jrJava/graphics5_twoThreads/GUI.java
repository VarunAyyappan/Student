package jrJava.graphics5_twoThreads;

import javax.swing.JFrame;

public class GUI {

	private static JFrame frame;
	private static MyPanel panel;
	private static MyButton button;
	
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
	
	

	public static void main(String[] args) throws Exception {
		new GUI();
		
		Thread.currentThread().sleep(1000);
		
		for(int i=0; i<100; i++){
			
			button.changeColor();
			button.changeAlienPosition();
			
			panel.changeBoxLocation();
			panel.repaint();
			
			Thread.currentThread().sleep(40);
		}
		
	}

}










