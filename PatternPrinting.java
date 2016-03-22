package Pattern.Printing;

public class PatternPrinting {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		int q = 1;
		
		for (i = 1; i <=5; i++)
		{
			q=1;
			for(j=1 ; j <=i; j++)

			{
				System.out.print(q + " ");
				q=q+1;
			}
			System.out.println("");
		}
			
				for(j=4; j>0; j--)
				{
					q=1;
					for(i=1;i<=j;i++)
					{
					
					System.out.print(q + " ");
					q=q+1;
					}
					System.out.println("");
				}
	}
	
}
