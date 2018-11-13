package practice;

class Test1<T>
{
	T obj;
	Test1(T obj)
	{
		this.obj=obj;
	}
	T getObject()
	{
		return obj;
	}
	
	   public static < E > void printArray( E[] inputArray ) {
		      // Display array elements
		      for(E element : inputArray) {
		         System.out.printf("%s ", element);
		      }
		      System.out.println();
		   }
	
}


public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1<Integer> tint = new Test1<Integer>(15);
		System.out.println(tint.getObject());
		
		Test1<String> tstr = new Test1<String>("Hello");
		System.out.println(tstr.getObject());
		
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	      System.out.println("Array integerArray contains:");
	      Test1.printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      Test1.printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      Test1.printArray(charArray);   // pass a Character array
		
	}

}
