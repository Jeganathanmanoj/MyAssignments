package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int i;
		int number=13;
		for (i=2;i<number;i++)
		{
			if(number%i==0)
				System.out.println("NotPrime"+i );
			else 
				System.out.println("Prime"+i);

		}

	}
}
