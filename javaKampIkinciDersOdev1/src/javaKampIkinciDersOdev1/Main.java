package javaKampIkinciDersOdev1;

public class Main {

	public static void main(String[] args) {
		//T�m kurslar 'da kurslar� vermekte kursun ismi, a��klamas�, ��retmen bilgisi var
		//Bu �zellikleri tan�mlamak i�in Course s�n�f� olu�turdum
		//Couse s�n�f�nda constructor olu�turup bu �zellikleri tek tek yazmak yerine parametre olarak g�nderdim
		//Course s�n�f�na kurslar� ekleyelim
		
		Course course1=new Course(1,"C# + ANGULAR","2 ay s�recek yaz�l�m geli�tirme kamp�n�n d�k�manlar�.","Engin Demiro�",0);
		Course course2=new Course(2,"JAVA + REACT","2 ay s�recek yaz�l�m geli�tirme kamp�n�n d�k�manlar�.","Engin Demiro�",25);
		Course course3=new Course(3,"Programlamaya Giri� i�in Temel Kurs","PYTHON,JAVA,C# gibi t�m programlama dilleri i�in temel mant�k dersi.","Engin Demiro�",0);
        
		
		//Olu�turdu�umuz kursu diziye ekleyelim
		Course[] course= {course1,course2,course3};
		//Listeyi yazd�ral�m
		
		for(Course cour:course) {
			System.out.print(cour.name+" - "+cour.detail+" - "+cour.teacher);
			System.out.println();
		}
		
		//Toplam kurs say�s�
		System.out.println(course.length);
		
		//�� metodlar�
		CourseManager courseManager=new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.advanceCourse(course1);

	}

}
