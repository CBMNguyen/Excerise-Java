//B1809236 Nguyen Minh Hieu Nhom 10
package demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SinhVienCNTT extends SinhVien {
	private String taikhoan;
	private String matkhau;
	private String email;
	
	public SinhVienCNTT() {
		super();
		this.taikhoan = "B1809236";
		this.matkhau  = "357469bm";
		this.email    = "b1809236@student.ctu.edu.vn";
	}
	
	public SinhVienCNTT(SinhVienCNTT S) {
		super(S);
		this.taikhoan = S.taikhoan;
		this.matkhau  = S.matkhau;
		this.email    = S.email;
	}
	
	public String toString() {
		return("Tai Khoan: "+taikhoan+//"\nMat Khau: "+matkhau+"\nEmail: "+email+
		"\nMSSV: "+this.getMSSV()
		+"\nHoTen: " +this.getHoTen()+"\nNgaySinh: "+this.getNgaySinh().day+"/"+this.getNgaySinh().month+"/"+this.getNgaySinh().year
		+"\nSo Luong Hoc Phan Dang Ki: "+this.getSLHP()+"\nHoc Phan Da Dang Ki La: "+this.getHPDK()+"\nDiem Hoc Phan La:"+this.getDiem()
		+"\nDiem Trung Binh: "+this.AVR());
	}
	
	public void setTaiKhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public String getTaiKhoan() {
		return taikhoan;
	}
	
	public void setMatKhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getMatKhau() {
		return matkhau;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
//	=========================================================================
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap Tai Khoan: ");
		taikhoan = kb.nextLine();
		System.out.print("Nhap Mat Khau: ");
		matkhau  = kb.nextLine();
		System.out.print("Nhap Email: ");
		email    = kb.nextLine();
		super.nhap();
	}
//	==========================Danh Sach Sinh Vien============================
	public static void ArraySV() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap vao so luong Sinh Vien: ");
		int n = kb.nextInt();
		ArrayList<SinhVienCNTT> ArrListSv = new ArrayList<SinhVienCNTT>();
		for(int i = 0; i < n; i++) {
			System.out.println("===========Sinh Vien Thu "+(i+1)+"============");
			SinhVienCNTT sv = new SinhVienCNTT();
			sv.nhap();
			sv.nhapDiem();
			ArrListSv.add(sv);
		}
		
		System.out.print("Nhap Vao Email Can Tim Kiem:");
		kb.nextLine();
		String email = kb.nextLine();
		for(int i = 0; i < ArrListSv.size(); i++) {
			if(email.equals(ArrListSv.get(i).email)){
				System.out.println("******************************************");
				System.out.println("***************Ket Qua Do Tim*************");
				System.out.println("******************************************");
				System.out.println(ArrListSv.get(i));
		}
		}
		
//		for(int i = 0; i < ArrListSv.size(); i++) {
//			if(ArrListSv.get(i).AVR() < 0.8f ) {
//				System.out.println("\n******Sinh Vien Bi Canh bao hoc vu******");
//				System.out.println(ArrListSv.get(i));
//			}
//			
//		}
//		float max = ArrListSv.get(0).AVR();
//		int j = 0;
//		for(int i = 1; i < ArrListSv.size(); i++) {
//			if(ArrListSv.get(i).AVR() > max) {
//				max = ArrListSv.get(i).AVR();
//				j = i;
//			}
//		}
//		System.out.println("\n******Sinh Vien Co DTB Cao Nhat******");
//		System.out.println(ArrListSv.get(j));
//
//		ArrayList<String> name = new ArrayList<String>();
//		for(int i = 0; i < ArrListSv.size(); i++ ) {
//			String []hoten = ArrListSv.get(i).getHoTen().split("\\s");
//			name.add( hoten[hoten.length-1] );
//		}
//		
//		Collections.sort(name);//Tach Ten va Sap Xep Lai Ten
//		
//		System.out.println("\n******Danh Sach Sap Xep Theo Ten******:");
//		for(String ten : name) {
//			for(int i = 0; i < ArrListSv.size(); i++ ) {
//				String []hoten = ArrListSv.get(i).getHoTen().split("\\s");
//				 String realName = hoten[hoten.length-1];
//				if(ten.equals(realName)) {
//					System.out.println(ArrListSv.get(i));
//				}
//			}
	
	}
	
}
