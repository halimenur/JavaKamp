
public class Main {

	public static void main(String[] args) {
	  Product product1=new Product(1,"Lenovo V14",15000,"16 GB Ram"); //Örnek oluþturma,referans oluþturma, instance
	  
	  
	  Product product2=new Product(); //Örnek oluþturma,referans oluþturma, instance
	  product2.id=2;
	  product2.name="Lenovo V15";
	  product2.unitPrice=16000;
	  product2.detail="32 GB Ram";
	  
	  Product product3=new Product(); //Örnek oluþturma,referans oluþturma, instance
	  product3.id=3;
	  product3.name="Hp 5";
	  product3.unitPrice=15000;
	  product3.detail="16 GB Ram";
	  
	  
		Product[] products= {product1,product2,product3};
	   System.out.println(products.length);
         	
	  for (Product product : products) {
		System.out.println(product.name);
	}
	  
	  Category category1=new Category();
	  category1.id=1;
	  category1.name="Bilgisayar";
	  
	  Category category2=new Category();
	  category2.id=2;
	  category2.name="Ev Bahça";
			  
	  
	  ProductManager productManager=new ProductManager();
	  productManager.addToCart(product1);
	  
	  productManager.addToCart(product3);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
