import java.util.Scanner;
 class Student{
	 int id;
	 String SName;
	 int age;
	 int phy,chem,math,bio;
void read(){
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Student ID- ");
	id=obj.nextInt();
	System.out.println("Enter Name of the Student- ");
	SName=obj.next();
	System.out.println("Enter Age of the Student-");
	age=obj.nextInt();
	System.out.println("Enter marks in Physics,Chemistry,Maths,Biology: ");
	phy=obj.nextInt();
	chem=obj.nextInt();
	math=obj.nextInt();
	bio=obj.nextInt();
	}
	void calculateGrade(){
		 int total=phy+chem+math+bio;
		 int average=total/4;
		if(average>=90)
		{
			System.out.println("Grade is A+.");
		}
		else if(average>=80)
		{
			System.out.println("Your Grade is A.");
		}
		else if(average>=70)
		{
			System.out.println("Your Grade is B.");
		}
		
		else if(average>=55)
		{
			System.out.println("Your Grade is C.");
			
		}
		else{
			System.out.println("Your Grade is D");
		}
	 } 
	 void display()
	 {
		 System.out.println("Student's Id is-"+id);
		 System.out.println("Name of Student-"+SName);
		 System.out.println("Age-"+age);
		 
	 }
}
class StudentTest extends Student{
public static void main(String args[])
{
	 System.out.println("How many student details do you want to store-");
	 Scanner obj= new Scanner(System.in);
	 int n=obj.nextInt();
	 Student stud[]=new Student[n];
		for(int i=0;i<n;i++) {
			stud[i]=new Student();
			stud[i].read();
}
		for(int i=0;i<n;i++){
			stud[i].display();
			stud[i].calculateGrade();
          }
}
}
