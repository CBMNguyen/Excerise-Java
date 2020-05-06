package demo;
import java.util.Scanner;
public class PhanSo {
	private int tu;
	private int mau;
	
//	=======================================================
	public PhanSo(PhanSo A) {
		this(A.tu, A.mau);
	}
	public PhanSo() {
		tu = 0; mau = 1;
	}
	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}
//	=======================================================
	public void setPhanSo(int tu , int mau) {
		this.tu = tu;
		this.mau = mau;
	}
//	=====================SAo Chep Sau=====================
	public PhanSo getCoppy() {
		return new PhanSo(this.tu, this.mau);
	}
//	=================Tim Uoc chung lon nhat===============
	public int ucln(int a , int b) {
		if(b == 0) {
			return a;
		}else {
			return ucln(b ,a % b );
		}
	}
//	=======================================================
	public void toiGianPhanSo() {
		int u = ucln(this.tu , this.mau);
		this.mau/=u;
		this.tu/=u;
	}
//	=======================================================
	public void inPutFraction() {
		Scanner kb = new Scanner(System.in);
		do{
			System.out.println("Nhap vao tu so: ");
			this.tu = kb.nextInt();
			System.out.println("Nhap vao mau so: ");
			this.mau = kb.nextInt();
			if(mau == 0) System.out.println("Mau so phai khac 0.");
		}while(mau == 0);
	}
//	=======================================================
	public void disPlay() {
		if(this.tu < 0 && this.mau < 0) {
			System.out.println("KQ = "+(this.tu*-1)+"/"+(this.mau*-1));
		}else if(this.tu == 0) {
			System.out.println("KQ = "+ 0);
		}else if(this.mau == 1) {
			System.out.println("KQ = "+ this.tu);
		}
		else {
			System.out.println("KQ = "+this.tu+"/"+this.mau);
		}
	}
//	==============Nghich Dao Khong Thay Doi Gia Tri================
	public PhanSo reserve() {
		PhanSo ps = new PhanSo(this);
		if(ps.tu == 0) {
			System.out.println("Sau khi nghich dao la: ");
			System.out.println("KQ = "+ 0);
		}else if(ps.tu == 1) {
			System.out.println("Sau khi nghich dao la: ");
			System.out.println("KQ = "+ ps.mau);
		}
		else {
			System.out.println("Sau khi nghich dao la: ");
			System.out.println("KQ = "+ps.mau+"/"+ps.tu);
		}
		return ps;
	}
//	=========================Tim Gia Tri Phan So======================
	public double giaTriThuc() {
		System.out.println("Gia tri thuc cua phan so:");
		return (this.tu*1.0/this.mau);
	}
//	=============================So Sanh==============================
	public boolean lonHon(PhanSo A) {
		if(this.giaTriThuc() > A.giaTriThuc()) {
			return true;
		}
		else return false;
	}
//	===========================Ham Tinh Tong===========================
	public PhanSo tinhTong(PhanSo A) {
		PhanSo sum = new PhanSo();
		sum.tu = this.tu*A.mau + A.tu*this.mau;
		sum.mau = this.mau * A.mau;
		sum.toiGianPhanSo();
		return sum;
	}
//	==========================Tim Max Phan So============================ SAi
	public PhanSo Max(PhanSo A) {
		if(this.giaTriThuc() < A.giaTriThuc()) 
		{
			this.tu = A.tu;
			this.mau = A.mau;
		} 
		return this;
	}
//	==========================Tinh TOng Phan So============================
	public PhanSo phepTnhPhanSo(PhanSo A) {
		PhanSo a = new PhanSo();
		a.tu = this.tu;
		a.mau = this.mau;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Cong || 2. Tru || 3. Nhan || 4. Chia");
		System.out.println("Hay chon phep toan: ");
		int options = sc.nextInt();
		switch(options) {
			case 1:{
				a.tu = a.tu*A.mau + A.tu * a.mau;
				a.mau = a.mau * A.mau; 
				break;
			}
			case 2:{
				a.tu = a.tu*A.mau - A.tu * a.mau;
				a.mau = a.mau * A.mau;
				break;
			}
			case 3:{
				a.tu = a.tu * A.tu ;
				a.mau = a.mau * A.mau;
				break;
			}
			case 4:{
				a.tu = a.tu*A.mau ;
				a.mau = a.mau * A.tu;
				break;
			}
			default:{
				System.out.println("Sai options");
			}
		}
		System.out.println("Phan so da toi gian la:");
		a.toiGianPhanSo();
		return a;
	}
//	==========================TInh Tong 1 So Random=============================
	public PhanSo phepTinhSoNguyen(int n) {
		PhanSo a = new PhanSo();
		a.tu = this.tu;
		a.mau = this.mau;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Cong || 2. Tru || 3. Nhan || 4. Chia");
		System.out.println("Hay chon phep toan: ");
		int options = sc.nextInt();
		switch(options) {
		case 1:{
			a.tu = a.tu*1 + n * a.mau;
			a.mau = a.mau * 1; 
			break;
		}
		case 2:{
			a.tu = a.tu*1 - n * a.mau;
			a.mau = a.mau * 1;
			break;
		}
		case 3:{
			a.tu = a.tu * n ;
			a.mau = a.mau * 1;
			break;
		}
		case 4:{
			a.tu = a.tu*1 ;
			a.mau = a.mau * n;
			int u = ucln(a.tu, a.mau);
		}
		default:{
			System.out.println("Sai options");
		}
	}
		a.toiGianPhanSo();
		return a;
	}
//	==========================Tinnh Tong DAnh Sach==========================
	public static void tinhTongDanhSach() {
		System.out.println("Nhap vao so phan tu cho danh sach: ");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		PhanSo[] Array = new PhanSo[n];
		for(int i = 0 ; i < Array.length ; i++) {
			System.out.println("Nhap vao phan so thu "+(i+1)+": ");
			Array[i] = new PhanSo();
			Array[i].inPutFraction();
		}
//		=========================Xuat Du Lieu===============================
		for(int i = 0 ; i < Array.length ; i++) {
			System.out.println("Phan so thu "+(i+1)+": ");
			Array[i].disPlay();
		}
//		=============================Tim Sum================================
		PhanSo Arr = new PhanSo();
		Arr = Array[0].getCoppy();
		for(int i = 1 ; i < Array.length ; i++) {
			Arr = Arr.tinhTong(Array[i]);
		}
		System.out.println("Tong Danh Sach la:");
		Arr.disPlay();
//		===========================Tim Max====================================
		PhanSo max = new PhanSo();
		max = Array[0].getCoppy();
		for(int i = 1 ; i < Array.length ; i++) {
			max.Max(Array[i]);
		}
		System.out.println("Max cua danh sach la: ");
		max.disPlay();
//		========================= Sap Xep Tang Dan==============================
		PhanSo tmp = new PhanSo();
		tmp = Array[0].getCoppy();
		for(int i = 0 ; i < Array.length - 1 ; i++) {
			for(int j = Array.length - 1; j > i ; j--) {
				if(Array[j].giaTriThuc() < Array[j-1].giaTriThuc()) 
				{
					tmp = Array[j];
					Array[j] = Array[j-1];
					Array[j-1] = tmp;
				}
			}
		}
//		=======================Hien THi=======================
		System.out.println("Danh sach sap xep tang dan la: ");
		for(int i = 0 ; i < Array.length ; i++) {
			Array[i].disPlay();
		}
	}
}









