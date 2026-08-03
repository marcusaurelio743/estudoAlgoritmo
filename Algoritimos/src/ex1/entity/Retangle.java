package ex1.entity;

public class Retangle {
	private Double width;
	private Double height;
	
	public Double area() {
		return width * height;
	}
	
	public Double perimeter() {
		return 2 *( width + height);
	}
	
	public Double diagonal() {
		return Math.sqrt(width * width + height + height);
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	
	

}
