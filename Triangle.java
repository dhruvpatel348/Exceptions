//Dhruvkumar Patel
//Lab- 6 Program 2
//CSC 162-02

public class Triangle
{
		private double s1;
		private double s2;
		private double s3;

		public Triangle()
		{
			s1 = 0.0;
			s2 = 0.0;
			s3 = 0.0;
		}
		public Triangle(double side1, double side2, double side3)
			throws IllegalTriangleException
		{
			if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
				throw new IllegalTriangleException(side1, side2, side3);
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
		public double getArea()
		{
			double s = (s1 + s2 + s3) / 2;
			return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		}
		public double getPerimeter()
		{
			return s1 + s2 + s3;
		}

		public String toString()
		{
			return "Triangle: side1 = " + s1 + " side 2 = " + s2 +
				" side3 = " + s3;
		}
}