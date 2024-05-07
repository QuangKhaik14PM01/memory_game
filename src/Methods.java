import java.util.Random;

public class Methods {
	
	public static String toString(int a)
	{
		return String.valueOf(a);
	}
	
	public static int[] randomArray(int a, int b) 
	{
		int A[] = new int [a*b];
		int digit = 1;
		Random random = new Random();
		for(int i = 0 ; i< a*b;i=i+2)
		{
			
			A[i] = digit;
			A[i+1] = digit;
			digit++;
		}
		for(int i = 0 ; i< a*b;i++)
		{
			int index = random.nextInt(a*b);
			int swap = A[index];
		    A[index] = A[i];
		    A[i] = swap;
		}
		return A;
	}
}
