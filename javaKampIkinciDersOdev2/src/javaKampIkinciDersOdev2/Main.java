package javaKampIkinciDersOdev2;

public class Main {

	public static void main(String[] args) {
		//Java Dersi 24 - Metodlarý Anlamak
	/*	sayiBulmaca();
		

	}
	public static void sayiBulmaca() {
		int [] sayilar=new int[] {1,2,3,4,5,6};
		int aranacak=6;
		boolean varMi=false;
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			mesajVer("sayý mevcuttur :" + aranacak);
		}
		else {
			mesajVer("sayý mevcut deðildir :"+aranacak);
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
*/
		
		
		//Java Dersi 25-26-Parametreli Metodlarý Anlamak
       /* String mesaj="Bugün hava çok güzel.";
        String yeniMesaj=sehirVer();
     System.out.println(yeniMesaj);
     int sayi=topla(5,8);
     System.out.println(sayi);
     int toplam=topla2(5,7,9);
     System.out.println(toplam);
     
	}
	public static void ekle() {
		
	}
	public static void sil() {
		
	}
	public static void guncelle() {
		
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	//Birden fazla deðer gönderme variable arguments
	//bunu yapmak için deðiþken sonuna ... koyulur
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	*/
	     	
		
		//Java Dersi 27-28:Class Nedir?
		//CustomerManager oluþturuldu
		/* CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
        System.out.println(sayilar2[0]);
	
	}	
	*/
		
		//Java Dersi 30-Recap Demo Classlarla Çalýþmak
		//DortIslem classý kullanýldý
		
		/*DortIslem dortIslem=new DortIslem();
		int sonuc=dortIslem.Topla(3, 4);
		System.out.println(sonuc);
		*/
		
		//Java Dersi-31 Field ve Attribute ile çalýþmak
		/*Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"siyah");
		Product product1=new Product();
		
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		System.out.println(product.get_kod());
		*/
		//Ders 32-Encapsulation
		
//Ders 35
		DortIslem dortIslem=new DortIslem();
		System.out.println(dortIslem.Topla(5, 7));
		System.out.println(dortIslem.Topla(5, 7,9));
}
}