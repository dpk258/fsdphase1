package firstpakage;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> array = new ArrayList<Integer>() ;
      array.add(20);
      array.add(30);
      array.add(40);
      array.add(50);
      
//      array.set(2, 100) ;
//      System.out.println(array);
//      
//      array.remove(2);
//      
//      System.out.println(array);
//      array.add(0, 500);
//      System.out.println(array);
//      
//      System.out.println(array.size());
//	
      
      for(int i = 0; i< array.size() ; i ++) {
       System.out.println(array.get(i));
      }

	}
}
