package test;
import java.util.*;
public class main 
{
 public static void main(String[]args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("*****Student Grade Calculator******");
	 System.out.println("=============================== ");
	 System.out.println("Enter number of subjects");
	 int ns=sc.nextInt();
	 int total=0;
	 for(int i=1;i<=ns;i++)
	 {
		 System.out.println("Enter marks obtained in subject_"+i+":");
	     int marks=sc.nextInt();
	     total+=marks;
 }
	 	double averP=(double)total/ns;
	 char Grade;
	 if(averP>=90) {
		 Grade='O';
	 }
	 else if(averP>=80) {
		 Grade='E';
	 }
	 else if(averP>=70) {
		 Grade='A';
	 }
	 else if(averP>=60) {
		 Grade='B';
	 }
	 else if(averP>=50) {
		 Grade='C';
	 }
	 else if(averP>=40) {
		 Grade='D';
	 }
	 else {
		 Grade='F';
	 }
	 System.out.println(" ");
	 System.out.println("Total Marks Scored is:"+total);
	 System.out.println("-----------------------------");
	 System.out.println("Average Percentages Gained is:"+averP+"%");
	 System.out.println("Grade :"+Grade);
}
 }
