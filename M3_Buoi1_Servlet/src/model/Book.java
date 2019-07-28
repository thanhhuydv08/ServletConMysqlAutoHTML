package model;

public class Book {
String nameBook, nameAuthor,nameCompany, price;

public Book(String nameBook, String nameAuthor, String nameCompany, String price) {
	super();
	this.nameBook = nameBook;
	this.nameAuthor = nameAuthor;
	this.nameCompany = nameCompany;
	this.price = price;
}

public String getNameBook() {
	return nameBook;
}

public void setNameBook(String nameBook) {
	this.nameBook = nameBook;
}

public String getNameAuthor() {
	return nameAuthor;
}

public void setNameAuthor(String nameAuthor) {
	this.nameAuthor = nameAuthor;
}

public String getNameCompany() {
	return nameCompany;
}

public void setNameCompany(String nameCompany) {
	this.nameCompany = nameCompany;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

}
