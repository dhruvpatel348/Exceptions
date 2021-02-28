//Dhruvkumar Patel
//Lab - 6 -program 4
//CSC 162-02

public class OutOfMemory
{
	public static void main(String[] args)
	{
		int size = 20000000;
		try
		{
			byte[] arr = new byte[size];
		}
		catch (OutOfMemoryError Ome)
		{
			System.out.println(Ome.getMessage());
		}
		System.out.println("Go ");
	}
}