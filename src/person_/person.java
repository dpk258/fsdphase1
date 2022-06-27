package person_;

public class person {
	String name ;
	int age;
	
	protected void print () {
		System.out.println("Name :-"+ this.name +"Age:-" + this.age);
	}
  public void setnanda (String name , int age) {
	 this.name = name ;
	 this.age = age ;
 }
}
