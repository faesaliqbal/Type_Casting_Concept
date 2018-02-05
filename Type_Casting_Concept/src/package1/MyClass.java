package package1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Type Casting
		 * Assigning a value of one type to a variable of another type is known as Type Casting.
		 * To cast a value to a specific type, place the type in parenthesis and position it in front of the value.
		 */
		int a = (int) 3.14;
		double b = 42.571;
		int c = (int) b;
		
		System.out.println(a);
		System.out.println(c);
		
		/*
		 * Java supports automatic type casting of integers to floating points, since there is no loss of precision.
		 * On the other hand, type casting is mandatory when assigning floating point values to integer variables.
		 */
		
		
		/*
		 * For classes, there are two types of casting.
		 * Upcasting and Downcasting
		 */
		
		/*
		 * Upcasting
		 * You can cast an instance of a subclass to its superclass.
		 */
		Animal an = new Cat(); //Java automatically upcasted the Cat type variable to the Animal type.
		an.makeSound();
		
		/*
		 * Downcasting
		 * Casting an object of a superclass to its subclass.
		 */
		
		Animal an1 = new Cat();
		Cat an2 = (Cat) an1;
		an1.makeSound();
		an2.makeSound();
		
		//This will throw an exception
		//Animal an1 = new Animal();
		//((Cat)an1).makeSound();


	}

}
