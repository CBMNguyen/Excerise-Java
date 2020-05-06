package demo;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;

	public Diem() {
		this.x = 0;
		this.y = 0;
	}
//	public Diem(Diem A) {
//		this.x = -1 * A.x;
//		this.y =-1 * A.y;
//	}
	public Diem(Diem A) {
	this.x = A.x;
	this.y = A.y;
}

	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap x: ");
		x = kb.nextInt();
		System.out.print("Nhap y: ");
		y = kb.nextInt();
	}

	public void hienThi() {
		System.out.print("(" + x + "," + y + ")");
	}
	public String toString() {
		return("(" + x + "," + y + ")");
	}

	public void setDiem(int dx, int dy) {
			this.x = dx;
			this.y = dy;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int layX() {
		return x;
	}

	public int layY() {
		return y;
	}
	
	public void tinhTien(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public double khoangCachToaDo(Diem A) {
		return Math.sqrt((A.x) * (A.x) + (A.y) * (A.y));
	}

	public double khoangCach2Diem(Diem B) {
		return Math.sqrt((this.x - B.x) * (this.x - B.x) + (this.y - B.y) * (this.y - B.y));
	}
}
