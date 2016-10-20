import java.util.HashSet;
import java.util.Scanner;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashSet declaration
		Scanner user_input = new Scanner( System.in );
		String word;
	      HashSet<String> hset = 
	               new HashSet<String>();
	      // Adding elements to the HashSet
	      hset.add("Apples");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apples");
	      hset.add("Mango");
	      hset.add("Mangoz");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.print("Type Apples: ");
	      word = user_input.next( );
	      hset.add(word);
	      System.out.println(hset.hashCode());
	      
	      System.out.println(hset);
	      System.out.println(hset.size());
	      System.out.println(hset.contains("Mango"));
	}

}
