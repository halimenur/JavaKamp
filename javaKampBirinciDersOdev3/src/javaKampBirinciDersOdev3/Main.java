package javaKampBirinciDersOdev3;

public class Main {
       public static void main(String[] args) {
		/* Java Dersi 6
    	   int ogrenciSayisi=12;
    	   String mesaj="��renci sayisi : ";
    	   System.out.println(mesaj + ogrenciSayisi);
	*/
    	   
    	 /* //  Java Dersi 7
    	   //double,float : ondal�kl� say� tutar
    	   //int,long,short,byte : tamsay� tutar
    	   //boolean : true,false
    	   boolean dogruMu=false;
    	   double sayi=12;
    	   System.out.println(sayi);
       */
    	   
    	   // Java Dersi 8
         /*  int sayi=14;
           if(sayi<20)
           {
        	   System.out.println("Say� 20 den k���kt�r");
           }else if(sayi==20){
        	   System.out.println("Say� 20'ye e�ittir.");
           }
        
           else {
        	   System.out.println("Say� 20 den b�y�kt�r.");
           }
          */ 
        // Java Dersi 9
    	   //Elimizde olan 3 say�dan en b�y���n� bulmak
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
    	System.out.println("en b�y�k say�: "+buSayi);
    	 */
    	   
    	   //Java Dersi 10 - Switch
    	   //Switch bloklar�yla dalland�rma yap�l�r
    	   //��rencinin notlar�na g�re kald�n ge�ti yapmak
    	  /* char grade='A';
    	   
    	   switch(grade)
    	   {
    	   case 'A':
    		   System.out.println("M�hemmel ge�tiniz!");
    		   break;
    	   case 'B':
    	   case 'C':
    		   System.out.println("iyi ge�tiniz");
    		   break;
    	   case 'D':
    		   System.out.println("fena de�il ge�tiniz");
    		   break;
    	   case 'F':
    		   System.out.println("Malesef kald�n�z");
    		   break;
    	   default:
    			   System.out.println("Ge�ersiz not girdiniz");
    			   
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
    	   System.out.println("While d�ng�s� bitti");
    	   
    	   //Java Dersi 13 - Do-While D�ng�s�
    	   int j=1;
    	   do {
    		   System.out.println("Logland�");
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
    	   //dizi i�indeki say�lar� toplama
    	   //dizi i�indeki en b�y�k say�y� bulma
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
    	   System.out.println("B�y�k say� : "+max);
    	  */
    	   
    	   //Java Dersi 16 - �ok Boyutlu Diziler
    	/*   String [][] sehirler=new String[3][3];
    	   sehirler[0][0]="�stanbul";
    	   sehirler[0][1]="Bursa";
    	   sehirler[0][2]="Bilecik";
    	   sehirler[1][0]="Ankara";
    	   sehirler[1][1]="Konya";
    	   sehirler[1][2]="Kayseri";
    	   sehirler[2][0]="Diyarbak�r";
    	   sehirler[2][1]="�anl�urfa";
    	   sehirler[2][2]="Gaziantep";
    	   for(int i=0;i<=2;i++) {
    		   System.out.println("---------------");
    		   for(int j=0;j<=2;j++) {
    			   System.out.println(sehirler[i][j]);
    		   }
    	   }
    	   
    	 */
    	   
    	   //Java Dersi 17 - Stringlerle �al��mak
    	   //String mesaj="   Bug�n hava �ok g�zel.    ";
    	  // System.out.println(mesaj);
    	  /* System.out.println("Eleman say�s� : "+mesaj.length());
    	   System.out.println("5.eleman : "+mesaj.charAt(4));
    	   System.out.println("ekleme yapma: "+mesaj.concat("Ya�as�n!"));
    	   System.out.println("A harfi ile mi ba�l�yor "+mesaj.startsWith("A"));
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
    	   System.out.println("De�i�time : "+ yeniMesaj);
    	   
    	   //substring metnin i�erisinden bir par�a almak
    	   //2. indexsinden itibaren geri kalan�n� al�r
    	   System.out.println(mesaj.substring(2,4));
    	   
    	   for(String kelime:mesaj.split(" ")) {
    		   System.out.println(kelime); 
    	   }
    	   System.out.println(mesaj.toLowerCase());
    	   System.out.println(mesaj.toUpperCase());
    	   System.out.println(mesaj.trim());
    	   */
    	   
    	   //Java Dersi-19 :Mini proje 1 - Say� asal m�?
    	  /* int number=25;
    	   int total=0;
    	   for(int i=2;i<number;i++)
    	   {
    		   if(number%i==0) {
    			   System.out.println("say� asal de�il");
    		      total+=1;
    		   }
    		   
    	   }
    	   if(total==0)
    	   {
    		   System.out.println("say� asald�r.");
    	   }
    	   */
    	   
    	   //Java Dersi - 20 
    	  /* char harf='A';
    	   char[] sesliHarf= {'A','E','i','O','�','I','U','�'};
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
    		   System.out.println("m�kemmel say�");
    	   }else {
    		   System.out.println("m�kemmel say� de�il");
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
    		   System.out.println("say� mevcut de�il");
    	   }
    	   
    	   
    	   
       }
}
