//Dhruvkumar Patel
//Lab -6 Program 1
//CSC 162-02

import java.util.Scanner;

public class OutOfBounds
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		int[] arr = array();

		System.out.print("Enter the index of array: ");
		int index = keyboard.nextInt();

		try
		{
			System.out.println("The Corresponding element is: " + arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException Aiobe)
		{
			System.out.println("Out of Bounds");
		}
	}
	public static int[] array()
	{
		int[] arr = new int[100];

		for(int indx = 0; indx<arr.length;indx++)
		{
			arr[indx] = (int)(Math.random() * 10000);
		}

		return arr;
	}

}