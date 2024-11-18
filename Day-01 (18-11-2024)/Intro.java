import java.awt.*;

public class Intro {

	public static void main(String[] args) {
		int x = 1;
		for( ; x<10; x++) {
			System.out.println(x);
		}
		System.out.println("end");
		///////////////////////////////////////
		/*
		 * 		The lines below will
		 * 		draw a frame on the
		 * 		desktop
		 */
		Frame f = new Frame();
		f.setBounds(200, 150, 600, 500);
		f.setVisible(true);
	}

}
