package jrJava.graphics1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class OurThing implements ActionListener {

	private JTextField tf;
	private JTextArea ta;
	
	
	public void setGUIThings(JTextField tf, JTextArea ta){
		this.tf = tf;
		this.ta = ta;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("another thread:" + Thread.currentThread().getId());
		System.out.println("I am here in OurThing.");
		
		String content = tf.getText();
		System.out.println(content);
		ta.setText(content);
	}


}
