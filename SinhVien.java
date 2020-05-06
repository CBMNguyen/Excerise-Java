package demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class SinhVien {
	private String MSSV;
	private String HoTen;
	private Date NgaySinh;
	private int SLHP;
	private ArrayList<String> HPDK;
	private ArrayList<String> Diem;

public SinhVien() {
	MSSV = new String("Sv1");
	HoTen = new String("unknow");
	NgaySinh = new Date();
	SLHP = 0;
	HPDK = new ArrayList<String>();
	Diem = new ArrayList<String>();
}

public SinhVien(SinhVien A) {
	this.MSSV = A.MSSV;
	this.HoTen = A.HoTen;
	this.NgaySinh = new Date(A.NgaySinh);
	this.SLHP = A.SLHP;
	this.HPDK = new ArrayList<String>(A.HPDK);
	this.Diem = new ArrayList<String>(A.Diem);
}

public void nhap() {
	Scanner kb = new Scanner(System.in);
	System.out.print("Nhap MSSV: ");
	MSSV = kb.nextLine();
	System.out.print("Nhap Ho va Ten: ");
	HoTen = kb.nextLine();
	System.out.println("Nhap ngay thang nam sinh: ");
	NgaySinh.InputDate();
	System.out.print("Nhap So luong hoc phan dang ki: ");
	SLHP = kb.nextInt();
	kb.nextLine();
	for(int i = 0; i < SLHP; i++) {
		System.out.print("Hoc phan thu "+(i+1)+": ");
		HPDK.add(kb.nextLine()) ;
	}
}

public void nhapDiem() {
	Scanner kb = new Scanner(System.in);
	System.out.println("Nhap vao diem hoc phan: ");
	for(int i = 0; i < SLHP; i++) {
		System.out.print(HPDK.get(i)+": ");
		Diem.add(kb.nextLine()) ;
	}
}

public void  hienThi() {
	System.out.println("=======================================");
	System.out.println("- MSSV: "+MSSV);
	System.out.println("- HoTen: " +HoTen);
	System.out.print("- NgaySinh: ");
	NgaySinh.disPlay();
	System.out.println("- So luong hoc phan dang ki: "+SLHP);
	System.out.println("- Hoc phan da dang ki la: ");
	for(int i = 0; i < HPDK.size(); i++) {
		System.out.println("  Hoc phan thu "+(i+1)+": "+HPDK.get(i));
	}
	System.out.println("- Diem hoc phan la: ");
	for(int i = 0; i < Diem.size(); i++) {
		System.out.print(" ["+" "+HPDK.get(i)+": "+Diem.get(i)+" ]");
	}
	System.out.println("\n- Diem Trung Binh la: "+this.AVR());
	System.out.println("=======================================");
}
//  ==================================================================
	public void setHoTen(String HoTen) {
		this.HoTen = HoTen;
	}
	
    public void setMSSV(String MSSV) {
		this.MSSV = MSSV;
	}
    
    public void setNgaySinh(Date NgaySinh) {
		this.NgaySinh = new Date(NgaySinh);
	}
    
    public void setSLHP(int SLHP) {
		this.SLHP = SLHP;
	}
    
    public void setHPDK(ArrayList<String> HPDK) {
		this.HPDK = new ArrayList<String>(HPDK);
	}
    
    public void setDiem(ArrayList<String> Diem) {
		this.Diem = new ArrayList<String>(Diem);
	}

	public String getMSSV() {
		return MSSV;
	}
	
	public String getHoTen() {
		return HoTen;
	}
	
	public Date getNgaySinh() {
		return NgaySinh;
	}
	
	public int getSLHP() {
		return SLHP;
	}
	
	public ArrayList<String> getHPDK() {
		return HPDK;
	}
	
	public ArrayList<String> getDiem() {
		return Diem;
	}
//	==================================================================
	public String toString() {
	return("MSSV: "+MSSV+"\nHoTen: " +HoTen+"\nNgaySinh: "+NgaySinh.day+"/"+NgaySinh.month+"/"+NgaySinh.year+"\nSo luong hoc phan dang ki: "+SLHP+"\nHoc phan da dang ki la: "+HPDK+"\nDiem hoc phan la:"+Diem);
}	
//  ==================================================================
	public float layDiem(String DiemHP) {
		int diem;
		switch(DiemHP) {
		case"A":{
			return 4.0f;
		}
		case"B+":{
			return 3.5f;
		}
		case"B":{
			return 3f;
		}
		case"C+":{
			return 2.5f;
		}
		case"C":{
			return 2f;
		}
		case"D+":{
			return 1.5f;
		}
		case"D":{
			return 1f;
		}
		default:{
			return 0f;
		}
	}
		}
//	============================Diem Trung Binh===========================
	public float AVR(){
		float sum = 0;
		for(int i = 0; i < Diem.size(); i++) {
			sum += layDiem(Diem.get(i));
		}
		return sum/Diem.size();
		}
//  ============================Them Hoc Phan=============================
	public void themHP() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap vao so luong hoc phan can them: ");
		int amounts = kb.nextInt();
		kb.nextLine();
			for(int i = 0; i < amounts; i++) {
				System.out.print("Hoc phan thu "+(++SLHP)+": ");
				HPDK.add(kb.nextLine());
				System.out.print("Diem hoc phan thu "+(SLHP)+": ");
				Diem.add(kb.nextLine());
			}
		}
//  =============================Xoa Hoc Phan=============================
	public void xoaHP() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap vao so luong hoc phan can xoa: ");
		int amounts = kb.nextInt();
		kb.nextLine();
		for(int j = 1; j <= amounts; j++) {
			System.out.println("Nhap vao hoc phan thu "+(j)+":");
			String hp = kb.nextLine();
			for(int i = 0; i < HPDK.size(); i++) {
				if(hp.equals(HPDK.get(i))) {
					Diem.remove(i);
					HPDK.remove(i);
					SLHP--;
				}
			}
			
		}
		System.out.println("**********Sau Khi Xoa Hoc Phan***********");
			}
//	==========================Danh Sach Sinh Vien============================
	public static void ArraySV() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap vao so luong Sinh Vien: ");
		int n = kb.nextInt();
		ArrayList<SinhVien> ArrListSv = new ArrayList<SinhVien>();
		for(int i = 0; i < n; i++) {
			System.out.println("===========Sinh Vien Thu "+(i+1)+"============");
			SinhVien sv = new SinhVien();
			sv.nhap();
			sv.nhapDiem();
			ArrListSv.add(sv);
		}
		
		for(int i = 0; i < ArrListSv.size(); i++) {
			if(ArrListSv.get(i).AVR() < 0.8f ) {
				System.out.println("******Sinh Vien Bi Canh bao hoc vu******");
				ArrListSv.get(i).hienThi();;
			}
		
		}
		
		float max = ArrListSv.get(0).AVR();
		int j = 0;
		for(int i = 1; i < ArrListSv.size(); i++) {
			if(ArrListSv.get(i).AVR() > max) {
				max = ArrListSv.get(i).AVR();
				j = i;
			}
		}
		System.out.println("******Sinh Vien Co DTB Cao Nhat******");
		ArrListSv.get(j).hienThi();

		ArrayList<String> name = new ArrayList<String>();
		for(int i = 0; i < ArrListSv.size(); i++ ) {
			String []hoten = ArrListSv.get(i).HoTen.split("\\s");
			name.add( hoten[hoten.length-1] );
		}
		
		Collections.sort(name);//Tach Ten va Sap Xep Lai Ten
		
		System.out.println("******Danh Sach Sap Xep Theo Ten******:");
		for(String ten : name) {
			for(int i = 0; i < ArrListSv.size(); i++ ) {
				String []hoten = ArrListSv.get(i).HoTen.split("\\s");
				 String realName = hoten[hoten.length-1];
				if(ten.equals(realName)) {
					ArrListSv.get(i).hienThi();
				}
			}
		}
		
	}
		
}









