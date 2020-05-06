package demo;
import java.util.Scanner;
public class Date {
	public int day;
	public int month;
	public int year;
//	==========================================================================
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date() {
		day = 1;
		month = 12;
		year = 2000;
	}
	
	public Date(Date A) {
		this.day = A.day;
		this.month = A.month;
		this.year = A.year;
	}
//	===========================================================================
	public void disPlay() {
		System.out.println(+this.day+"/"+this.month+"/"+this.year);
	}
//	===================================IsDate => HandMade========================================
	public boolean isDate() {
		int d = 0;
		switch(this.month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			d = 31;
			if(this.year > 0 && (this.month >= 1 && this.month <= 12) && this.day <= d) 
				return true;
			else return false;
		}
		case 4:
		case 6:
		case 9:{
			d = 30;
			if(this.year > 0 && (this.month >= 1 && this.month <= 12) && this.day <= d) 
				return true;
			else return false;
		}
		case 2:{
			if((this.year % 4 == 0 && this.year%100 != 0) || this.year % 400 == 0 )
				d = 29;
			else d = 28;
			if(this.year > 0 && (this.month >= 1 && this.month <= 12) && this.day <= d) 
				return true;
			else return false;
		}
		default:{
			return false;
		}
		}
	}
	
//	=========================================================================================================================
	public void InputDate() {
		Scanner kb = new Scanner(System.in);
		do {
			 System.out.println("Input Day: "); this.day = kb.nextInt();
			 System.out.println("Input Month: "); this.month = kb.nextInt();
			 System.out.println("Input Year: "); this.year = kb.nextInt();
			 if(!IsDate()) System.out.println("Wrong Input,Please Correct Input. ");
			 else break;
		}while(true);
//			 System.out.println("SetDate thanh cong.");
	}
//	==============================================================================================================================================
	public void tomorrow() {
		if(this.month ==2) {
			if((this.year%4 == 0 && this.year%100 != 0)||this.year%400 ==0) {
				if(this.day == 29) {
					{
						this.day = Math.abs(30 - this.day);
					    this.month++;
					    if(this.month > 12) this.month = 14 - this.month;
					}
				}
				else {
					this.day++;
				}
			}
			else {
				if(this.day == 28) {
					{
						this.day = Math.abs(29 - this.day);
					    this.month++;
					    if(this.month > 12) this.month = 14 - this.month;
					}
				}
				else {
					this.day++;
				}
			}
		}
		else if(this.month == 1 ||this.month == 3 ||this.month == 5 ||this.month == 7 ||this.month == 8 ||this.month == 10 ||this.month == 12 ) {
			if(this.day == 31) {
				{
					this.day = 32 -this.day;
					this.month++;
					if(this.month > 12) this.month = 14 - this.month;
				}
			}
			else this.day++;
			
		}
		else {
			if(this.day == 30) {
				{
					this.day = 31 -this.day;
					this.month++;
					if(this.month > 12) this.month = 14 - this.month;
				}
			}
			else this.day++;
		}
		System.out.println("Tomorrow is: "+this.day+"/"+this.month+"/"+this.year);
	}
	
//	====================================================================================================================================
	public void addDay(int n) {
		if(this.month ==2) {
			if((this.year%4 == 0 && this.year%100 != 0)||this.year%400 ==0) {
				if(this.day + n > 29) {
					{
						this.day = (this.day + n - 29);
					    this.month++;
					    if(this.month > 12) {
					    	this.month = 14 - this.month;
					    	this.year++;
					    }
					}
				}
				else {
					this.day+=n;
				}
			}
			else {
				if(this.day + n > 28) {
					{
						this.day = (this.day + n - 28 );
					    this.month++;
					    if(this.month > 12) {
					    	this.month = 14 - this.month;
					    	year++;
					    }
					}
				}
				else {
					this.day+=n;
				}
			}
		}
		else if(this.month == 1 ||this.month == 3 ||this.month == 5 ||this.month == 7 ||this.month == 8 ||this.month == 10 ||this.month == 12 ) {
			if(this.day + n > 31) {
				{
					this.day = (this.day + n - 31);
					this.month++;
					if(this.month > 12) {
				    	this.month = 14 - this.month;
				    	this.year++;
				    }
				}
			}
			else this.day+=n;
			
		}
		else {
			if(this.day + n > 30) {
				{
					this.day = (this.day + n - 30);
					this.month++;
					if(this.month > 12) {
				    	this.month = 14 - this.month;
				    	this.year++;
				    }
				}
			}
			else this.day+=n;
		}
		System.out.println("sau khi them ngay la: ");
	}

//	=====================================================IsDate => Simply====================================================
		public boolean IsDate() {
			if(month > 12) {
				month = 0;
			}
			if(this.day <= 0 || (this.month <= 0 && this.month > 12) || this.year <= 0) return false;
			if(this.day > this.dayOfMonth(this.month)) return false;
			return true;
		}
		
//		=====================================================Day Of Month====================================================
		public int dayOfMonth(int a) {
			int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31}; 
			if((this.year % 4==0 & this.year %100 != 0) || this.year % 400 == 0) arr[2] = 29;
			return arr[a];
		}
//		======================================================Tomorrow=======================================================
		public Date Tomorrow() {
			Date nextDay = new Date(this);
			nextDay.day++;
			if(nextDay.day > nextDay.dayOfMonth(nextDay.month)) {
				nextDay.day = 1;
				nextDay.month++;
				if(nextDay.month > 12) { nextDay.month = 1; nextDay.year++; }
			}
			return nextDay;
		}
//		======================================================Add N Day========================================================
		public Date AddDay(int n) {
			Date Add = new Date(this);
			Add.day += n;
			if(Add.day > Add.dayOfMonth(Add.month)) {
				Add.day = Add.day - dayOfMonth(Add.month) ;
				Add.month++;
				if(Add.month > 12) { Add.month = 1 ; Add.year++; }
			}
			return Add;
		}
			
}