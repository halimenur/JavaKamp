
public class Product {
	
  public Product() {
	  System.out.println("ben �al��t�m");
  }
  public Product(int id,String name,double unitPrice,String detail) {
	  this.id=id;
	  this.name=name;
	  this.unitPrice=unitPrice;
	  this.detail=detail;
	 
	  
  }
  //D��ar�dan eri�ilenler
  int id;
  String name;
  double unitPrice;
  String detail;
  
}
