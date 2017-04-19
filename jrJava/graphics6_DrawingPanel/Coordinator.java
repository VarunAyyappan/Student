package jrJava.graphics6_DrawingPanel;

public class Coordinator {

	
	public static void main(String[] args) throws InterruptedException {
		
		DrawingPanel2 panel = new DrawingPanel2();
		
		Thread.currentThread().sleep(50);
		
		while(true) {
			if(!panel.getMouseBusy())
				panel.move();
			
			panel.repaint();
			Thread.currentThread().sleep(50);
		}
	}

}
