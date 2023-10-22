import java.awt.Color;
import java.awt.Graphics;

public class Text extends Shape implements Repaintable {
	
	  private String text;

    // Constructor, getters, and setters for Text class

	  public Text(Color color, int x, int y, String text) {
	        super(color, x, y);
	        this.text = text;
	    }
	  
	    public void setText(String text) {
	        this.text = text;
	    }

	    @Override
	    public void repaint(Graphics g) {
	        g.setColor(getColor());
	        g.drawString(text, getX(), getY());
	    }
}
