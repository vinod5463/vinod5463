import java.util.Arrays;


public class printDiagnoalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		int a[] ={2,3,4,5,1,3,5,10};
		
		 int fbig=0;
		 if(a.length==0)
		 {
			 fbig=a.length/2;
		 }
		 else
		 {
			 fbig=((a.length)/2)+1;
		 }
		 int k=0;
		 for(int i=0;i<fbig && fbig<a.length;i++)
		 {
			 if(a[i]>fbig)
			 {
				 int temp=a[i];
				 a[i]=a[fbig];
				 a[fbig]=temp;
				 fbig++;
				 
				 
			 }
		 }
		 
		 System.out.println( Arrays.toString(a));
	}

}
