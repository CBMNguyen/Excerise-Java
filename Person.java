package demo;

public class Person {
	
	public String name;
	private int age;
	public double height;
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void setAge(int age) {
		if (age>=0 && age<=100 ) {
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void getInfo() {
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Height:"+this.height);
	}
	
}
