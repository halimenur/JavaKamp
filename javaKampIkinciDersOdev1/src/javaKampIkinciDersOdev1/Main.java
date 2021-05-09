package javaKampIkinciDersOdev1;

public class Main {

	public static void main(String[] args) {
		//Tüm kurslar 'da kurslarý vermekte kursun ismi, açýklamasý, öðretmen bilgisi var
		//Bu özellikleri tanýmlamak için Course sýnýfý oluþturdum
		//Couse sýnýfýnda constructor oluþturup bu özellikleri tek tek yazmak yerine parametre olarak gönderdim
		//Course sýnýfýna kurslarý ekleyelim
		
		Course course1=new Course(1,"C# + ANGULAR","2 ay sürecek yazýlým geliþtirme kampýnýn dökümanlarý.","Engin Demiroð",0);
		Course course2=new Course(2,"JAVA + REACT","2 ay sürecek yazýlým geliþtirme kampýnýn dökümanlarý.","Engin Demiroð",25);
		Course course3=new Course(3,"Programlamaya Giriþ için Temel Kurs","PYTHON,JAVA,C# gibi tüm programlama dilleri için temel mantýk dersi.","Engin Demiroð",0);
        
		
		//Oluþturduðumuz kursu diziye ekleyelim
		Course[] course= {course1,course2,course3};
		//Listeyi yazdýralým
		
		for(Course cour:course) {
			System.out.print(cour.name+" - "+cour.detail+" - "+cour.teacher);
			System.out.println();
		}
		
		//Toplam kurs sayýsý
		System.out.println(course.length);
		
		//Ýþ metodlarý
		CourseManager courseManager=new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.advanceCourse(course1);

	}

}
