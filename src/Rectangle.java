
public class Rectangle 
{
	int numRows;
	int numCols;
	
	Boolean filled;
	String str;

	
	public Rectangle()
	{
		this.numRows = 1;
		this.numCols = 1;
		this.filled = false;
	}
	public Rectangle(int numRows, int numCols)
	{
		this.numRows = numRows;
		this.numCols = numCols;
	}
	
	
	 
	public int getRows()
	{
		return numRows;
	}
	
	public int getCols()
	{
		return numCols;
	}
	
	public void setRows(int numRows)
	{
		this.numRows = numRows;
	}
	
	public void setCols(int numCols)
	{
		this.numCols = numCols;
	}
	
	
	public String toString()
	{
		for (int i=1; i<numRows; i++)
		{
			for (int j=1; j<numCols; j++)
			{
				str = "#";
			}
		}
		return str;
	}
}
