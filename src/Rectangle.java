
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
	
	public boolean getFilled()
	{
		return filled;
	}
	
	public void setRows(int numRows)
	{
		this.numRows = numRows;
	}
	
	public void setCols(int numCols)
	{
		this.numCols = numCols;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public String toString()
	{
		String s = "Output: \n";
//				"numRows = "+numRows+", numCols = "+numCols+", filled = "+filled+"\n";
		if (filled)
		{
			for (int i=0; i<numRows ; i++)
			{
				for (int j=0; j<numCols; j++)
				{
					s = s + "# ";
				}
				s = s + "\n";
			}
		}
		else
		{
			for (int i=0; i<numRows ; i++)
			{
				for (int j=0; j<numCols; j++)
				{
					if (i==0 || i == numRows-1)
					{
						s = s + "# ";
					}
					else
					{
						if (j==0 || j==numCols-1)
						{
							s = s + "# ";
						}
						else
						{
							s = s + "  ";
						}
					}
				}
				s = s + "\n";
			}
		}
		return s;
	}

//		for (int i=1; i<numRows; i++)
//		{
//			for (int j=1; j<numCols; j++)
//			{
//				str = "#";
//			}
//		}
//		return str;
//	}
}
