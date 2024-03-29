package entities;

public interface Entity {
	public void draw();
	public void update(int delta);
	public void setLocation(double x, double y);
	public void setX(double x);
	public void setY(double y);
	public double getX();
	public double getY();
	public void setWidth(double width);
	public void setHeight(double height);
	public double getWidth();
	public double getHeights();
	public boolean intersects(Entity other);
	
}
