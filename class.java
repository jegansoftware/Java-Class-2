// file name should be as BuyPen.java
package pen;
import java.util.*;
public class BuyPen {
	public int i=0;
	public int n=0;
	public int de=0;
	public int s=0;
	public int sum=0;
	public int mul=1;
	Scanner ji=new Scanner(System.in);
	void jegan()
	{
	// Get First Value from user
	System.out.printf("\nEnter first Number:");
	i=ji.nextInt();
	
	//Get Last Value From User
	System.out.printf("\nEnter Last Number1 :");
	n=ji.nextInt();
	
	//get Decrement
	System.out.printf("\nHow many should number be incremented? :");
	de=ji.nextInt();
	
	for(s=i;s<=n;s+=de)
	{
		System.out.printf("\n%d", s);
		sum=sum+s;
		mul=mul*s;
	}
	
	System.out.printf("\nSum of Series :%d",sum);
	System.out.printf("\nMultiply of Series :%d", mul);
	
	System.out.printf("\n\nValues have been displayed Successfully");
}
}
