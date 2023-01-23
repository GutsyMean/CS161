import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab1ADriver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("C:\\Users\\timot\\git\\CS161\\src\\rectangleData.txt"));
		Rectangle[] rectangle = new Rectangle[sc.nextInt()];
		for (int i = 0; i<rectangle.length; i++)
		{
			int rows = sc.nextInt();
			int cols = sc.nextInt();
			String filled = sc.next();
			
			rectangle[i] = new Rectangle(rows, cols);
			
			if (filled.equals("filled"))
			{
				rectangle[i].setFilled(true);
			}
			else
			{
				rectangle[i].setFilled(false);
			}
			
			System.out.println(rectangle[i].toString());
		}
	}
}
