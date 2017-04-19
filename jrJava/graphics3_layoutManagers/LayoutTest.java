package jrJava.graphics3_layoutManagers;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;


public class LayoutTest {

	private JFrame frame;
	private JPanel panel, smallPanel;
	private JButton[] buttons;
	
	public LayoutTest(){
		
		frame = new JFrame("Layout Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 50, 400, 300);
		
		panel = new JPanel();
		panel.setBackground(Color.white);
		frame.getContentPane().add(panel);
		
		buttons = new JButton[15];
		
		for(int i=0; i<buttons.length; i++){
			buttons[i] = new JButton("Button " + (i+1));
		}
		
		//useFlowLayout();
		useBorderLayout();
		//useGridLayout();
		
		frame.pack();
		frame.setVisible(true);
	}
	
	
	private void useGridLayout(){
		panel.setLayout(new GridLayout(5,2));
		for(int i=0; i<buttons.length; i++) panel.add(buttons[i]);
	}
	
	
	
	
	
	private void useBorderLayout(){
		
		/*
		smallPanel = new JPanel();
		smallPanel.setLayout(new BorderLayout());
		smallPanel.add(buttons[5], BorderLayout.CENTER);
		smallPanel.add(buttons[6], BorderLayout.NORTH);
		smallPanel.add(buttons[7], BorderLayout.SOUTH);
		*/
		
		smallPanel = new JPanel();
		smallPanel.setLayout(new GridLayout(4,2));
		smallPanel.add(buttons[5]);
		smallPanel.add(buttons[6]);
		smallPanel.add(buttons[7]);
		smallPanel.add(buttons[8]);
		smallPanel.add(buttons[9]);
		smallPanel.add(buttons[10]);
		smallPanel.add(buttons[11]);
		smallPanel.add(buttons[12]);
		
		panel.setLayout(new BorderLayout());
		panel.add(smallPanel, BorderLayout.CENTER); // panel.add(buttons[0]);
		//panel.add(smallPanel, BorderLayout.NORTH);
		panel.add(buttons[1], BorderLayout.NORTH);
		panel.add(buttons[2], BorderLayout.SOUTH);
		panel.add(buttons[3], BorderLayout.EAST);
		panel.add(buttons[4], BorderLayout.WEST);
	}
	
	
	
	private void useFlowLayout(){
		panel.setLayout(new FlowLayout()); // This is redundant because this layout is JPanel's default.
		panel.add(buttons[0]);
		panel.add(buttons[1]);
		panel.add(buttons[2]);
		panel.add(buttons[3]);
		panel.add(buttons[4]);
		panel.add(buttons[5]);
		panel.add(buttons[6]);
		panel.add(buttons[7]);
		panel.add(buttons[8]);
		panel.add(buttons[9]);
	}
	
	
	
	public static void main(String[] args) {
		new LayoutTest();
	}

}







