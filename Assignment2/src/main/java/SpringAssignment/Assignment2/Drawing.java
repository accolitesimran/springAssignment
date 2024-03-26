package SpringAssignment.Assignment2;

public class Drawing {
	private int canvasLength;
	private int canvasWidth;
	private int brushSize;
	public int getCanvasLength() {
		return canvasLength;
	}
	public void setCanvasLength(int canvasLength) {
		this.canvasLength = canvasLength;
	}
	public int getCanvasWidth() {
		return canvasWidth;
	}
	public void setCanvasWidth(int canvasWidth) {
		this.canvasWidth = canvasWidth;
	}
	public int getBrushSize() {
		return brushSize;
	}
	public void setBrushSize(int brushSize) {
		this.brushSize = brushSize;
	}
	@Override
	public String toString() {
		return "Drawing [canvasLength=" + canvasLength + ", canvasWidth=" + canvasWidth + ", brushSize=" + brushSize
				+ "]";
	}
	
}
