package javaKampIkinciDersOdev1;

public class Course {
	
	public Course(int id,String name,String detail,String teacher,int finish) {
		//Course s�n�f�ndaki  �zelliklere d��ar�dan eri�ilebiliyor
        //Course s�n�f�n�n �zelliklerini parametreye e�itleyece�iz
		this.id=id;
		this.name=name;
		this.detail=detail;
		this.teacher=teacher;
		this.finish=finish;
	}
   //Kursun id si
	int id;
	//Kursun ad�
	String name;
	//kursun a��klamas�
	String detail;
	//Kurs ��retmeni
	String teacher;
	//Kursun tamamlanma y�zdesi
	int finish;
	
}
