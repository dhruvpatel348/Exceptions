//Dhruvkumar Patel
//Lab- 6 Program 2
//CSC 162-02

import java.util.Scanner;

public class TestTriangle
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);


			System.out.print("Enter three side of the triangle: ");
			double s1 = keyboard.nextDouble();
			double s2 = keyboard.nextDouble();
			double s3 = keyboard.nextDouble();

			try
			{
				Triangle triangle = new Triangle(s1, s2, s3);

				System.out.println(triangle.toString());
				System.out.println("Area: " + triangle.getArea());
				System.out.println("Perimeter: " + triangle.getPerimeter());
			}
			catch (IllegalTriangleException Itex)
			{
				System.out.println(Itex.getMessage());
			}


	}
}