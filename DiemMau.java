//B1809236 Nguyen Minh Hieu Nhom 10
package demo;
import java.util.Scanner;

public class DiemMau extends Diem {
	private String mau;
	
	public DiemMau() {
		super();
		this.mau = "Purple";
	}
	
	public DiemMau(int x, int y, String mau) {
		super(x, y);
		this.mau = mau;
	}
	
	public DiemMau(DiemMau A) {
		super(A);
		mau = A.mau;
	}
	
	public void setMau(String mau) {
		this.mau = mau;
	}
	
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap mau: ");
		mau = kb.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.println("-> color: "+mau);
	}
	
	public void tinhTien(int dx, int dy) {
		int x = this.layX();
		int y = this.layY();
		this.setX(x + dx);
		this.setY(y + dy);
	}
}
