import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape implements MovableShape {

	private int endX;
	
    private int endY;

    // Constructor, getters, and setters for Line class

    public Line(Color color, int x, int y, int i, int j) {
		super(color, x, y);
		this.endX = endX;
        this.endY = endY;
	}

    public void setEndX(int endX) {
        this.endX = endX;
    }
    
    public void setEndY(int endY) {
        this.endY = endY;
    }

    
	@Override
    public void move() {
        // Implement move logic for Line
		 // For simplicity, let's just change the start and end points randomly
        setX(getX() + (int) (Math.random() * 10 - 5));
        setY(getY() + (int) (Math.random() * 10 - 5));
        setEndX(endX + (int) (Math.random() * 10 - 5));
        setEndY(endY + (int) (Math.random() * 10 - 5));
    }
    
    @Override
    public void repaint(Graphics g) {
        // Implement repaint logic for Line
    	  g.setColor(getColor());
          g.drawLine(getX(), getY(), endX, endY);
    }
}
