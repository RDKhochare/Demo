package numberpattern;

public class num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		int count =0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count = count +1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}

}
