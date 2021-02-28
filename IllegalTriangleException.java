//Dhruvkumar Patel
//Lab- 6 Program 2
//CSC 162-02

public class IllegalTriangleException extends Exception
{
	private double s1;
	private double s2;
	private double s3;

	public IllegalTriangleException(double side1, double side2, double side3)
	{
		super("Illegal sides " + side1 + " " + side2 + " " + side3);
		s1 = side1;
		s2 = side2;
		s3 = side3;
	}

	public double getSide1()
	{
		return s1;
	}
	public double getSide2()
	{
		return s2;
	}

	public double getSide3()
	{
		return s3;
	}
}