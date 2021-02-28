//Dhruvkumar Patel
//Lab -6 - Program 3
//CSC 162-02

public class BinaryString
{
	public static void main(String[] args)
	{
		System.out.println("1001 converts to " + bin2Dec("1001"));
		System.out.println("141111111 converts to " + bin2Dec("141111111"));
	}
	public static int bin2Dec(String binaryString) throws NumberFormatException
	{
		int decimal = 0;
		for (int indx = 0, indx1 = binaryString.length() - 1;
			indx < binaryString.length(); indx++, indx1--)
			{
			   if (binaryString.charAt(indx) < '0' || binaryString.charAt(indx) > '1')
			   throw new NumberFormatException("The string is not a binary string");
			   decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(indx)))) * Math.pow(2, indx1);
		    }
		return decimal;
	}

}