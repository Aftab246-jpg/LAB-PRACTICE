import java.util.Scanner;
class Salary
{
	public static void main(String arg[])	
	{
	    double s,it,pt,pf,netSalary;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter salary");
                   s=sc.nextDouble();
	    System.out.println("HRA %");
                   it=sc.nextDouble();
	    System.out.println("special allowance %");
                   pt=sc.nextDouble();
	     System.out.println("PF deducion %");
	pf=sc.nextDouble();
	     pf=pf*(s/100);
	     it=it*(s/100);
	     pt=pt*(s/100);
	     netSalary=s-it-pt-pf;
	     System.out.println("Net Salary is="+netSalary);
                   }
}