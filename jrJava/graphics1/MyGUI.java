package jrJava.graphics1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;


public class MyGUI {

	private JFrame frame;
	private JPanel panel, smallPanel;
	private JLabel textLabel;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel imageLabel1, imageLabel2, imageLabel3;
	private JButton button1, button2;
	
	public MyGUI(){
		
		System.out.println("Constuctor:" + Thread.currentThread().getId());
		frame = new JFrame();
		//frame.setSize(500, 300);
		frame.setBounds(200, 100, 500, 400);
		frame.setTitle("Sir's GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.yellow);
		//frame.setLayout(null); 
		
		panel = new JPanel();
		panel.setBounds(20, 10, 460, 360); 
		panel.setBackground(Color.white);
		frame.getContentPane().add(panel); 
		panel.setLayout(null); // Do not forget this.
		
		textLabel = new JLabel(); // textLabel = new JLabel("Type in:");
		textLabel.setText("Type in:");
		textLabel.setBounds(20, 250, 80, 20);
		panel.add(textLabel);
		 
		textField = new JTextField();
		textField.setBounds(20, 270, 300, 20);
		panel.add(textField);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 40, 300, 200);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		smallPanel = new JPanel();
		smallPanel.setBounds(340, 40, 100, 200);
		smallPanel.setBackground(Color.white);
		smallPanel.setLayout(null); 
		panel.add(smallPanel);
		
		ImageIcon icon1 = new ImageIcon("jrJava/graphics1/orangeAlien_1.png");
		imageLabel1 = new JLabel("Alien", icon1, JLabel.CENTER); 
		imageLabel1.setVerticalTextPosition(JLabel.TOP);
		imageLabel1.setHorizontalTextPosition(JLabel.CENTER);
		imageLabel1.setBounds(10, 0, 80, 80);
		smallPanel.add(imageLabel1);
		
		ImageIcon icon2 = new ImageIcon("jrJava/graphics1/torpedo.png");
		imageLabel2 = new JLabel("", icon2, JLabel.CENTER); 
		imageLabel2.setBounds(10, 90, 80, 80);
		smallPanel.add(imageLabel2);
		
		ImageIcon icon3 = new ImageIcon("jrJava/graphics1/ship.png");
		imageLabel3 = new JLabel("", icon3, JLabel.CENTER); 
		imageLabel3.setBounds(10, 130, 80, 80);
		smallPanel.add(imageLabel3);
		
		button1 = new JButton("Shoot");
		button1.setBounds(350, 255, 80, 20);
		panel.add(button1);
		
		button2 = new JButton("Abort");
		button2.setBounds(350, 285, 80, 20);
		panel.add(button2);
		
		OurThing ourThing = new OurThing();
		ourThing.setGUIThings(textField, textArea);
		button1.addActionListener(ourThing);
		//YourThing yourThing = new YourThing();
		//button1.addActionListener(yourThing); 
		 
		frame.setVisible(true); 
	} 
	
	 
	
	
	public static void main(String[] args) {
		System.out.println("main:"+ Thread.currentThread().getId());
		new MyGUI(); 

	}

}








