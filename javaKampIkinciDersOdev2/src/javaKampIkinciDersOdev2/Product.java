package javaKampIkinciDersOdev2;

public class Product {
	public Product(int id,String name,String description,double price,int stockAmount,String renk) {
		System.out.println("yapýcý metod parametreli çalýþtý");
	      this._id=id;
	      this._renk=renk;
	      this._name=name;
	      this._price=price;
	      this._description=description;
	      this._stockAccout=stockAmount;
	}
	public Product() {
		System.out.println("yapýcý metod çalýþtý");
	}
	
 private int _id;
private String _name;
private String _description;
private double _price;
private int _stockAccout;
private String _renk;
private String _kod;


public int getId() {
	return _id;
}
 public void setId(int id) {
	 this._id=id;
	 
 }
 public String getname() {
	return _name;
}
 public void set_name(String name) {
	this._name = name;
}
 public String get_description() {
	return _description;
}
 public void set_description(String description) {
	this._description = description;
}
 public double get_price() {
	return _price;
}
 public void set_price(double price) {
	this._price = price;
}
 public int get_stockAccout() {
	return _stockAccout;
}
 public void set_stockAccout(int stockAccout) {
	this._stockAccout = stockAccout;
}
 public String get_renk() {
	return _renk;
}
 public void set_renk(String renk) {
	this._renk = renk;
}
 public String get_kod() {
	return this._name.substring(0, 1)+_id;
}


}
