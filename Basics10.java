package laura;
 class Student{
		 int rollNumber;
		 String name;
		 int m1,m2,m3;
		float average;
		 Student(int rollNumber,String name,int m1,int m2,int m3){
		 this.rollNumber = rollNumber;
		 this.name =  name;
		 this.m1 = m1;
		 this.m2 = m2;
		 this.m3 = m3;
		 }
		 public float calculateAverage() {
			 return average = (m1+m2+m3)/3;
		 }
		public void displayDetails(){
			System.out.println("Roll number:" +rollNumber);
			System.out.println("Name:"+name);
			System.out.println("Mark1:"+m1);
			System.out.println("Mark2:"+ m2);
			System.out.println("Mark3:" +m3);
			System.out.println("Average:"+ calculateAverage());
		
			 }
		public class Basics10{
			public static void main(String[]args){
				Student student1 = new Student(30,"Alice",56,78,89);
				
				student1.displayDetails();
				Student student2 = new Student(35,"cia",78,90,45);
				
				student2.displayDetails();
			}
		}
		 }
	 


