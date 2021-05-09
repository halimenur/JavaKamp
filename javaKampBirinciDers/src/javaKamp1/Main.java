package javaKamp1;

public class Main {

	public static void main(String[] args) {
		
		  //camelCase
		//Don't repeat yourself (kendini tekrar etme)
		  String internetSubeButonu= "Ýnternet Þubesi";
		  double dolarDun=8.20;
		  double dolarBugun=8.20;
		  int vade=36;
		  boolean dustuMu=false;
		  
          System.out.println(internetSubeButonu);
          
          if(dolarBugun<dolarDun)
          {
        	System.out.println("dolar düþtü resmi ");  
          }else if(dolarBugun>dolarDun) {
        	  System.out.println("dolar yükseldi resmi");
          }
          else {
        	  System.out.println("Dolar eþittir resmi");
          }
          
          String kredi1="Hýzlý Kredi";
          String kredi2="Mutlu Emekli Kredi";
          String kredi3="Konut Kredi";
          String kredi4="Çiftçi Kredi";
          String kredi5="Msb Kredi";
          String kredi6="Meb kredisi";
          String kredi7="Kültür bakanlýðý kredisi";
          
          System.out.println(kredi1);
          System.out.println(kredi2);
          System.out.println(kredi3);
          System.out.println(kredi4);
          System.out.println(kredi5);
          System.out.println(kredi6);
          System.out.println(kredi7);
          System.out.println();
          
          String[] krediler= {"Hýzlý Kredi",
        		  "Mutlu Emekli Kredi",
        		  "Konut Kredi",
        		  "Çiftçi Kredi",
        		  "Msb Kredi",
        		  "Meb kredisi",
        		  "Kültür bakanlýðý kredisi"};
          
          for(String kredi:krediler) {
        	  System.out.println(kredi);
          }
          
          System.out.println();
          
          int sayi1=10;
          int sayi2=20;
          sayi1=sayi2;
          sayi2=100;
          System.out.println(sayi1);
          
          
          int [] sayilar= {1,2,3,4,5};
          int [] sayilar1= {10,20,30,40,50};
          sayilar=sayilar1;
          sayilar1[0]=100;
          System.out.println(sayilar[0]);
          
          
	}

}
