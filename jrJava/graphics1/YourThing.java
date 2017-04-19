package jrJava.graphics1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YourThing implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		System.out.println("another thread:" + Thread.currentThread().getId());
		System.out.println("I am here in YourThing.");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
