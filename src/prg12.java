
public class prg12
{
public static void main(String args[])
{
	String input="Vinod Kumar12344";
	String str=input.replaceAll("[^a-z A-Z]","");
	String digit=input.replaceAll("[^0-9]", "");
	String Cp=input.replaceAll("[^A-Z]", "");
	System.out.println(str);
	System.out.println(digit);
	System.out.println(Cp);
	
	int num=6;
	for(int i=0;i<num;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println(" ");
	}
			
}
}
