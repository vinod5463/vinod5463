
public class averagePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,4,5};
		int b[][]={{1,2,4},{2,4,6},{5,7,9}};
		int sum=0;
		double avg=0.00;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/a.length;
		}
		
		System.out.println((float)avg);

 	
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
		{
			if(i==0 ||i==2 || j==0 || j==2)
			{
				System.out.print(b[i][j]+" ");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println( );
		System.out.println("Added one line" );
	}
}

}
