package variables;

public class LocalVariables {

	
		   public void pupAge() {
		      int age = 0;
		      age = age + 7;
		      System.out.println("Puppy age is : " + age);
		   }

		   public static void main(String args[]) {
			   LocalVariables test = new LocalVariables();
		      test.pupAge();
		   }
//		   public void pupAge() {
//			      int age;
//			      age = age + 7;
//			      System.out.println("Puppy age is : " + age);
//			   }
//
//			   public static void main(String args[]) {
//			      Test test = new Test();
//			      test.pupAge();
//			   }
		   
		}

