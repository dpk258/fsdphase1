package firstpakage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
public class linklistrunner {

	public static void main(String[] args) {
		LinkedList <String> animal = new LinkedList<String>();
		
		animal.offer("DOG");
		animal.offer("CAt");
		animal.add("lion");
		
		System.out.println(animal);
		//System.out.println(animal.remove());
		System.out.println(animal.element());
		System.out.println(animal.peek());
		System.out.println(animal.getLast());
	}

}
