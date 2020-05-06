package demo;

import java.util.Scanner;

public class DoanThang{
	private Diem A;
	private Diem B;
	
	public DoanThang() {
		this.A = new Diem(0,0);
		this.B = new Diem(0,0);
	}
	
	public DoanThang(Diem A, Diem B) {
		this.A = new Diem(A);
		this.B = new Diem(B);
	}
	
	public DoanThang(int Ax, int Ay, int Bx, int By) {
		this.A = new Diem(Ax, Ay);
		this.B = new Diem(Bx, By);
	}
	
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap vao Diem Dau: ");
		A.nhap();
		System.out.println("Nhap vao Diem Cuoi: ");
		B.nhap();
	}
	public void hienThi() {
		System.out.println("Doan Thang: "+A+","+B);
	}
	public void tinhTien(int dx, int dy) {
		A.tinhTien(dx, dy);
		B.tinhTien(dx, dy);
	}
	public float khoangCach() {
		return (float)A.khoangCach2Diem(B);
	}
}
