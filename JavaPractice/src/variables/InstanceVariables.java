package variables;

public class InstanceVariables {

	// this instance variable is visible for any child class.
	   public String name;

	   // salary  variable is visible in Employee class only.
	   private double salary;
	   //age
	   public int age;
//new Comment
	   // The name variable is assigned in the constructor.
	   public InstanceVariables (String empName) {
	      name = empName;
	   }

	   // The salary variable is assigned a value.
	   public void setSalary(double empSal) {
	      salary = empSal;
	   }
	   //age is assigned a value
	   public void setAge(int empAge)
	   {
		   age=empAge;
	   }
	   public static void empAge(InstanceVariables obj)
	  {
		System.out.println("AGE:"+obj.age);   
	   }

	   // This method prints the employee details.
	   public void printEmp() {
		   
	      System.out.println("name  : " + name );
	      System.out.println("salary :" + salary);
	   }

	   public static void main(String args[]) {
		   InstanceVariables empOne = new InstanceVariables("Bhanu");
		empOne.age=21;
	      empOne.setSalary(1000);
	      empOne.salary=2000;
	      empOne.printEmp();
	      empAge(empOne);
	   }
}
