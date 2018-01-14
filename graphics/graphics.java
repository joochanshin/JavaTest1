package graphics;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Rectangle;


public class graphics {

	public static void main (String[] args){
		
		JFrame window = new JFrame();
		window.setSize(10000, 10000);
		window.setTitle("This is jframe");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawingComponent DC = new drawingComponent();
		
		window.add(DC);
		window.setVisible(true);
	}

}
