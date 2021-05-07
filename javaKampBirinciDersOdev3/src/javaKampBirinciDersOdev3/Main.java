package javaKampBirinciDersOdev3;

public class Main {
       public static void main(String[] args) {
		/* Java Dersi 6
    	   int ogrenciSayisi=12;
    	   String mesaj="Öðrenci sayisi : ";
    	   System.out.println(mesaj + ogrenciSayisi);
	*/
    	   
    	 /* //  Java Dersi 7
    	   //double,float : ondalýklý sayý tutar
    	   //int,long,short,byte : tamsayý tutar
    	   //boolean : true,false
    	   boolean dogruMu=false;
    	   double sayi=12;
    	   System.out.println(sayi);
       */
    	   
    	   // Java Dersi 8
         /*  int sayi=14;
           if(sayi<20)
           {
        	   System.out.println("Sayý 20 den küçüktür");
           }else if(sayi==20){
        	   System.out.println("Sayý 20'ye eþittir.");
           }
        
           else {
        	   System.out.println("Sayý 20 den büyüktür.");
           }
          */ 
        // Java Dersi 9
    	   //Elimizde olan 3 sayýdan en büyüðünü bulmak
    	/*   int sayi1=15;
    	   int sayi2=45;
    	   int sayi3=3;
    	   int buSayi=sayi1;
    	if(buSayi<sayi2)
    	{
    		buSayi=sayi2;
    	}
    	if(buSayi<sayi3)
    	{
    		buSayi=sayi3;
    	}
    	System.out.println("en büyük sayý: "+buSayi);
    	 */
    	   
    	   //Java Dersi 10 - Switch
    	   //Switch bloklarýyla dallandýrma yapýlýr
    	   //öðrencinin notlarýna göre kaldýn geçti yapmak
    	  /* char grade='A';
    	   
    	   switch(grade)
    	   {
    	   case 'A':
    		   System.out.println("Mühemmel geçtiniz!");
    		   break;
    	   case 'B':
    	   case 'C':
    		   System.out.println("iyi geçtiniz");
    		   break;
    	   case 'D':
    		   System.out.println("fena deðil geçtiniz");
    		   break;
    	   case 'F':
    		   System.out.println("Malesef kaldýnýz");
    		   break;
    	   default:
    			   System.out.println("Geçersiz not girdiniz");
    			   
    	   }
    	   
    	   */
    	   //Java Ders 11- For
    	  /* for(int i=0;i<10;i++)
    	   {
    		   System.out.println(i);
    	   }
    	  */
    	   
    	   //Java Dersi 12-While
    	 /*  int i=1;
    	   while(i<10)
    	   {
    		   System.out.println(i);
    		   i++;
    	   }
    	   System.out.println("While döngüsü bitti");
    	   
    	   //Java Dersi 13 - Do-While Döngüsü
    	   int j=1;
    	   do {
    		   System.out.println("Loglandý");
    		  System.out.println(j);
    		  j+=2;
    	  }while(j<10);
    	  
    	   */
    	   
    	   //Java Dersi 14 - Diziler
    	 /*  String[] ogrenciler=new String[3];
    	   ogrenciler[0]="Halime";
    	   ogrenciler[1]="Aysun";
    	   ogrenciler[2]="Ebru";
    	   
    	   for(int i=0;i<ogrenciler.length;i++) {
    		   System.out.println(ogrenciler[i]);
    	   }
    	   for(String ogrenci:ogrenciler) {
    		   System.out.println(ogrenci);
    	   }
    		  
    	   */
    	   
    	   //Java Dersi 15 - ReCap Demo 2
    	   //dizi içindeki sayýlarý toplama
    	   //dizi içindeki en büyük sayýyý bulma
    	 /*  double [] myList= {1.2,1.3,1.4,5.6}; 
    	   double total=0;
    	   double max=myList[0];
    	   for(double sayi:myList) {
    		   total+=sayi;
    		   if(max<sayi) {
    			   max=sayi;
    		   }
    	   }
    	   System.out.println("Toplam:"+total);
    	   System.out.println("Büyük sayý : "+max);
    	  */
    	   
    	   //Java Dersi 16 - Çok Boyutlu Diziler
    	/*   String [][] sehirler=new String[3][3];
    	   sehirler[0][0]="Ýstanbul";
    	   sehirler[0][1]="Bursa";
    	   sehirler[0][2]="Bilecik";
    	   sehirler[1][0]="Ankara";
    	   sehirler[1][1]="Konya";
    	   sehirler[1][2]="Kayseri";
    	   sehirler[2][0]="Diyarbakýr";
    	   sehirler[2][1]="Þanlýurfa";
    	   sehirler[2][2]="Gaziantep";
    	   for(int i=0;i<=2;i++) {
    		   System.out.println("---------------");
    		   for(int j=0;j<=2;j++) {
    			   System.out.println(sehirler[i][j]);
    		   }
    	   }
    	   
    	 */
    	   
    	   //Java Dersi 17 - Stringlerle Çalýþmak
    	   //String mesaj="   Bugün hava çok güzel.    ";
    	  // System.out.println(mesaj);
    	  /* System.out.println("Eleman sayýsý : "+mesaj.length());
    	   System.out.println("5.eleman : "+mesaj.charAt(4));
    	   System.out.println("ekleme yapma: "+mesaj.concat("Yaþasýn!"));
    	   System.out.println("A harfi ile mi baþlýyor "+mesaj.startsWith("A"));
    	   System.out.println(". ile mi bitiyor : "+mesaj.endsWith("."));
    	   char [] karakterler=new char[5];
    	   //karakterler dizisine ekleme yapma
    	   
    	   mesaj.getChars(0,4 ,karakterler,0);
    	   System.out.println(karakterler);
    	   
    	   System.out.println(mesaj.indexOf('a'));
    	   System.out.println(mesaj.lastIndexOf("e"));
    	   */
    	   
    	   //Java Dersi 18 : String 2
    	  /* String yeniMesaj=mesaj.replace(' ','-');
    	   System.out.println("Deðiþtime : "+ yeniMesaj);
    	   
    	   //substring metnin içerisinden bir parça almak
    	   //2. indexsinden itibaren geri kalanýný alýr
    	   System.out.println(mesaj.substring(2,4));
    	   
    	   for(String kelime:mesaj.split(" ")) {
    		   System.out.println(kelime); 
    	   }
    	   System.out.println(mesaj.toLowerCase());
    	   System.out.println(mesaj.toUpperCase());
    	   System.out.println(mesaj.trim());
    	   */
    	   
    	   //Java Dersi-19 :Mini proje 1 - Sayý asal mý?
    	  /* int number=25;
    	   int total=0;
    	   for(int i=2;i<number;i++)
    	   {
    		   if(number%i==0) {
    			   System.out.println("sayý asal deðil");
    		      total+=1;
    		   }
    		   
    	   }
    	   if(total==0)
    	   {
    		   System.out.println("sayý asaldýr.");
    	   }
    	   */
    	   
    	   //Java Dersi - 20 
    	  /* char harf='A';
    	   char[] sesliHarf= {'A','E','i','O','Ö','I','U','Ü'};
    	   boolean durum=false;
    	   for(char arama:sesliHarf) {
    		   if(arama==harf) {
    			   durum=true;
    		   } 
    	   }
    	   if(durum) {
    		   System.out.println("sesli harf");
    	   }
    	   else {
    		   System.out.println("sessiz harf");
    	   }
    	   
    	  */ 
    	   
    	   //Java Dersi - 21 
    	  /* int sayi=29;
    	   int total=0;
    	   for(int i=1;i<sayi;i++)
    	   {
    		   if(sayi%i==0) {
    			   total+=i;
    		   }
    	   }
    	   if(total==sayi) {
    		   System.out.println("mükemmel sayý");
    	   }else {
    		   System.out.println("mükemmel sayý deðil");
    	   }
    	   */
    	   
    	   //Java Dersi - 23
    	   int [] sayilar=new int[] {1,2,5,7,9,0};
    	   int aranacak=5;
    	   boolean durum=false;
    	   for(int sayi:sayilar) {
    		   if(sayi == aranacak) {
    			   durum=true;
    			   break;
    		   }
    	   }
    	   if(durum) {
    		   System.out.println("sayi mevcut.");
    	   }else {
    		   System.out.println("sayý mevcut deðil");
    	   }
    	   
    	   
    	   
       }
}
