package entities;

import org.lwjgl.util.Rectangle;

public abstract class AbstractEntity implements Entity {

	protected double x, y, width, height;
	protected Rectangle hitbox = new Rectangle();
	
	public AbstractEntity(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void setX(double x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	@Override
	public void setY(double y) {
		// TODO Auto-generated method stub
		this.y=y;
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub
		this.width = width;
	}

	@Override
	public void setHeight(double height) {
		// TODO Auto-generated method stub
		this.height = height;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public double getHeights() {
		// TODO Auto-generated method stub
		return this.height;
	}

	@Override
	public boolean intersects(Entity other) {
		hitbox.setBounds((int)x, (int)y, (int)width, (int)height);
		Rectangle aux = new Rectangle();
		aux.setBounds((int)other.getX(), (int)other.getY(), (int)other.getWidth(), (int)other.getHeights());
		return hitbox.intersects(aux);
	}

}
