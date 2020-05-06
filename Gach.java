package demo;

import java.util.Scanner;

public class Gach {
	private String maso;
	private String mau;
	private int soluong1hop;
	private int chieudai;
	private int chieungang;
	private long giaban;

public Gach() {
	maso = "MenThuong1";
	mau = "trang";
	soluong1hop = 4;
	chieudai = 50;
	chieungang = 50;
	giaban = 100000;
}

public Gach(String maso, String mau, int soluong, int chieudai, int chieungang, long giaban) {
	this.maso = maso;
	this.mau = mau;
	this.soluong1hop = soluong;
	this.chieudai = chieudai;
	this.chieungang = chieungang;
	this.giaban = giaban;
}

public Gach getCopy() {
	return new Gach(this.maso, this.mau, this.soluong1hop, this.chieudai, this.chieungang, this.giaban);
}

public String getMaSo() {
	return maso;
}
public long getGiaBan() {
	return giaban;
}
public void nhap() {
	Scanner kb = new Scanner(System.in);
	System.out.print("Nhap vao ma so Gach:");
	maso = kb.nextLine();
	System.out.print("Nhap vao mau Gach: ");
	mau = kb.nextLine();
	System.out.print("Nhap vao so luong Gach trong hop: ");
	soluong1hop = kb.nextInt();
	System.out.print("Nhap vao chieu dai vien Gach: ");
	chieudai = kb.nextInt();
	System.out.print("Nhap vao chieu ngang cho vien gach: ");
	chieungang = kb.nextInt();
	System.out.print("Nhap vao gia ban hop gach:");
	giaban = kb.nextInt();
}
public void hienthi() {
	System.out.println("Ma so cua Gach la: "+maso);
	System.out.println("Mau cua Gach la: "+mau);
	System.out.println("So luong vien Gach trong hop la: "+soluong1hop);
	System.out.println("Chieu dai vien Gach la: "+chieudai);
	System.out.println("Chieu ngang vien Gach la: "+chieungang);
	System.out.println("Gia ban cua 1 hop la: "+this.giaban+"/"+this.dienTichNen1hop()+" m2");
}
public float giaBanLe() {
	float giaBanLai = this.giaban*(float)120/100;
	return giaBanLai/(float)soluong1hop;
}
public float dienTichNen1hop() {
	return (float)chieudai/100 * (float)chieungang/100*soluong1hop;
}

public float giaNen() {
	return (float)soluong1hop / dienTichNen1hop();
}

public int soLuongHop(int D, int N) {
	float dienTichNen = (float)D/100 * (float)N/100;
	int count = 0;
	float sum = 0;
	float dienTichNen1hop = this.dienTichNen1hop();
	if(dienTichNen1hop >= dienTichNen) count = 1;
	while(sum < dienTichNen) {
		count++;
		sum+=dienTichNen1hop;
	}
	return count;
}
//public int soLuongHop(int D, int N) {
//	int SL = (int) (Math.ceil(D/chieudai)*Math.ceil(N/chieungang));
//	return (int) Math.ceil(SL/soluong1hop);
//}
public static Gach reNhat(Gach[] Array) {
	Gach gach = new Gach();
	for(int i = 0; i < Array.length-1; i++) {
		if(Array[i].giaNen() < Array[i+1].giaNen()) {
			gach = Array[i];
		}
		else gach = Array[i+1];
	}
	return gach;
}
}