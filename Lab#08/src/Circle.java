import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape implements MovableShape {

    // Constructor, getters, and setters for Circle class
    private int radius;

    

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }
    
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
    @Override
    public void move() {
        // Implement move logic for Circle
    	
    	// For simplicity, let's just change the position randomly
        setX(getX() + (int) (Math.random() * 10 - 5));
        setY(getY() + (int) (Math.random() * 10 - 5));
    	
    	
    	
    }
    
    @Override
    public void repaint(Graphics g) {
        // Implement repaint logic for Circle
    	g.setColor(getColor());
        g.fillOval(getX() - radius, getY() - radius, 2 * radius, 2 * radius);
    }
    	
}
