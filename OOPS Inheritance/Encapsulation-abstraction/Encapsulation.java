class Author{
     private String name;
     private String email;
     private char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    Author(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author [email=" + email + ", gender=" + gender + ", name=" + name + "]";
    }
   
}

class Book {
    private Author Author;
    private String nameBook;
    private double price;
    private int qtyInStock;

    Book(String nameBook, Author Author, double price, int qtyInStock){
        this.nameBook = nameBook;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.Author = Author;
    }
    

 

    public Author getAuthor() {
        return Author;
    }
    public void setAuthor(Author author) {
        Author = author;
    }
    public String getNameBook() {
        return nameBook;
    }
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    @Override
    public String toString() {
        return "Book [Author=" + Author + ", nameBook=" + nameBook + ", price=" + price + ", qtyInStock=" + qtyInStock
                + "]";
    }
   
    
    
}


public class Encapsulation {
    public static void main(String[] args) {
        Author a = new Author("Zunaira khan", "zunaira2k@gmail.com",'F');
        Book b = new Book("Story Of My Life", a, 500, 1000);
        System.out.println(b);
    }
    
}
