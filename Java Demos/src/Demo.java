import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of customers");
		int customercount=sc.nextInt();
		String names[]=new String[customercount];
		sc.nextLine();
		for(int i=0;i<customercount;i++)
		{
			System.out.println("Enter name for customer "+(i+1));
			names[i]=sc.nextLine();
			System.out.println("Enter items for "+names[i]);
			int noofitems=sc.nextInt();
			int amount[]=new int[noofitems];
			int sum=0;
			for(int j=0;j<noofitems;j++)
			{
				System.out.println("Enter cost of item "+(i+1));
				amount[j]=sc.nextInt();
				sum+=amount[j];
			}
			System.out.println("Names "+names[i]);
			System.out.println("Total "+sum);
		}

	}

}
