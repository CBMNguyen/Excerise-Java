package demo;
import java.util.Scanner;

public class ConVat {
	private String name;
	private String type;
	private String color;
	private int weight;
	private int age;
	
	public ConVat() {
		name = "Animal";
		type = "Cow";
		color= "White";
		weight = 100;
		age = 3;
	}
	
	public ConVat(String name, String type, String color, int weight, int age) {
		this.name = name;
		this.type = type;
		this.color = color;
		this.weight = weight;
		this.age = age;
	}
	
	public ConVat(ConVat A) {
		this.name = A.name;
		this.type = A.type;
		this.color = A.color;
		this.weight = A.weight;
		this.age = A.age;
	}
	
//	public abstract  void Shout();
	public static int i;
	public void Nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap ten con vat: ");
		name = kb.nextLine();
		System.out.print("Nhap giong: ");
		type = kb.nextLine();
		System.out.print("Nhap mau sac: ");
		color = kb.nextLine();
		System.out.print("Nhap can nang: ");
		kb.nextInt();
		System.out.print("Nhap tuoi: ");
		kb.nextInt();
	}
}
	