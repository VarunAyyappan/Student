package jrJava.graphics2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MyGUI implements ActionListener {

	private JFrame frame;
	private JPanel panel, smallPanel;
	private JLabel textLabel;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel imageLabel1, imageLabel2, imageLabel3;
	private JButton button1, button2;
	
	private JMenuBar menuBar;
	private JMenu menu1, menu2;
	private JMenuItem item1, item2, item3, item4;
	private JMenuItem item11, item12;
	
	private int scrollPaneX = 20, scrollPaneY = 40;
	
	
	
	public MyGUI(){
		
		System.out.println("Constuctor:" + Thread.currentThread().getId());
		frame = new JFrame();
		//frame.setSize(500, 300);
		frame.setBounds(200, 100, 500, 400);
		frame.setTitle("Sir's GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.yellow);
		//frame.setLayout(null); 
		
		formMenuBar();
		formMainPanel();
		 
		frame.setLayout(new BorderLayout()); // redundant!!
		frame.getContentPane().add(panel, BorderLayout.CENTER); 
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		frame.setVisible(true); 
	} 
	 
	
	private void formMenuBar(){
		menuBar = new JMenuBar();
		menu1 = new JMenu("Move");
		menu2 = new JMenu("Help");
		item1 = new JMenuItem("Up");
		item2 = new JMenuItem("Down");
		item3 = new JMenuItem("Left");
		item4 = new JMenuItem("Right");
		item11 = new JMenuItem("Search");
		item12 = new JMenuItem("About");
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menu2.add(item11);
		menu2.add(item12);
		
		item1.addActionListener(this); 
		item2.addActionListener(this); 
		item3.addActionListener(this); 
		item4.addActionListener(this); 
		
	}
	
	 
	private void formMainPanel(){
		panel = new JPanel();
		panel.setBounds(20, 10, 460, 360); 
		panel.setBackground(Color.white);
		panel.setLayout(null); // Do not forget this.
		
		textLabel = new JLabel(); // textLabel = new JLabel("Type in:");
		textLabel.setText("Type in:");
		textLabel.setBounds(20, 250, 80, 20);
		panel.add(textLabel);
		 
		textField = new JTextField();
		textField.setBounds(20, 270, 300, 20);
		panel.add(textField);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(scrollPaneX, scrollPaneY, 300, 200);
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
		button1.addActionListener(this); 
		
		button2 = new JButton("Abort");
		button2.setBounds(350, 285, 80, 20);
		panel.add(button2);
		button2.addActionListener(this); 
	}
	
	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(button1)){  // we will learn this later. equals() 
			imageLabel2.setBounds(10, 40, 80, 80);
			imageLabel1.setText("Fired!"); 
			textArea.setText(textField.getText() + "\n" + textField.getText() + "\n" + textField.getText());

			//smallPanel.setVisible(false);
			//button2.setVisible(false);
		}
		else if(e.getSource().equals(button2)){
			imageLabel2.setVisible(false);
			textField.setText("Aborted!");
			textArea.setText("Aborted!");
			imageLabel1.setText("Aborted");
		}
		
		if(e.getSource().equals(item1)){ scrollPaneY -= 10; }
		else if(e.getSource().equals(item2)){ scrollPaneY++; }
		else if(e.getSource().equals(item3)){ scrollPaneX--; }
		else if(e.getSource().equals(item4)){ scrollPaneX++; }
		
		scrollPane.setBounds(scrollPaneX, scrollPaneY, 300, 200);
		//frame.repaint();
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main:"+ Thread.currentThread().getId());
		new MyGUI(); 

	}

}











