package graphics;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;

public class drawingComponent extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		// Paint the background Yellow

		Rectangle rect = new Rectangle(1000, 1000);
		g2.setColor(Color.YELLOW);
		g2.fill(rect);

		// Create the head

		Ellipse2D.Double head = new Ellipse2D.Double(100, 100, 800, 800); 
		g2.setColor(Color.BLACK);
		g2.fill(head);
		int xPoints[] = {125, 400, 200};
		int yPoints[] = {50, 200, 400};
		
		int xPoints1[] = {875, 600, 800};
		int yPoints1[] = {50, 200, 400};
		g2.fillPolygon(xPoints, yPoints, 3);
		g2.fillPolygon(xPoints1, yPoints1, 3);
		
		// Creating ears
		
		Shape leftEar = new Arc2D.Double(40, -20, 250, 250, -30, -45, Arc2D.PIE);
		Shape rightEar = new Arc2D.Double(710, -20, 250, 250, 210, 45, Arc2D.PIE);
		
		g2.setColor(Color.PINK);
		g2.fill(leftEar);
		g2.fill(rightEar);
		

		// Create the eyes for the cat

		g2.setColor(Color.WHITE); 
		Ellipse2D.Double leftEye = new Ellipse2D.Double(300, 300, 100, 100);
		Ellipse2D.Double rightEye = new Ellipse2D.Double(600, 300, 100, 100);
		Ellipse2D.Double nose = new Ellipse2D.Double(470, 500, 60, 50);
		
		g2.fill(leftEye);
		g2.fill(rightEye);
		
		// LT-RB Wiskers
		
		g2.setStroke(new BasicStroke(2));
		Point2D.Double LT =  new Point2D.Double(200,450);
		Point2D.Double RB = new Point2D.Double(800, 600);
		g2.draw(new Line2D.Double(LT, RB)); 


		// LB-RT Wiskers
		
		g2.setStroke(new BasicStroke(2));
		Point2D.Double LB = new Point2D.Double(200, 600);
		Point2D.Double RT = new Point2D.Double(800, 450);
		g2.draw(new Line2D.Double(LB, RT)); 

		// ML-MR Wiskers
		
		g2.setStroke(new BasicStroke(2));
		Point2D.Double ML = new Point2D.Double(200, 525);
		Point2D.Double MR = new Point2D.Double(800, 525);
		g2.draw(new Line2D.Double(ML, MR)); 
		
		g2.setColor(Color.PINK); 
		g2.fill(nose);
		
		// Mouth
		Shape leftMouth = new Arc2D.Double(425, 550, 75, 75, 180, 180, Arc2D.OPEN);
		Shape rightMouth = new Arc2D.Double(500, 550, 75, 75, 180, 180, Arc2D.OPEN);
		
		g2.draw(leftMouth);
		g2.draw(rightMouth);
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	}
	
}
