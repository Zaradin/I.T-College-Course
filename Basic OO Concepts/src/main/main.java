package main;

public class main {

	private static Shape[] arrayOfShapes = new Shape[5];

	public static void main(String args[]) {
		
		Shape shapeOne = new Circle();
		shapeOne.Draw();
		
		for(int i = 0; i < 5; i++)
		{
			arrayOfShapes[i] = new Square();
		}
		
		for(int j = 0; j < 5; j++)
		{
			arrayOfShapes[j].Draw();
		}
	}

}
