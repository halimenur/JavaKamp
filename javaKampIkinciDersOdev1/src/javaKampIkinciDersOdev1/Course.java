package javaKampIkinciDersOdev1;

public class Course {
	
	public Course(int id,String name,String detail,String teacher,int finish) {
		//Course sýnýfýndaki  özelliklere dýþarýdan eriþilebiliyor
        //Course sýnýfýnýn özelliklerini parametreye eþitleyeceðiz
		this.id=id;
		this.name=name;
		this.detail=detail;
		this.teacher=teacher;
		this.finish=finish;
	}
   //Kursun id si
	int id;
	//Kursun adý
	String name;
	//kursun açýklamasý
	String detail;
	//Kurs öðretmeni
	String teacher;
	//Kursun tamamlanma yüzdesi
	int finish;
	
}
