import java.util.Scanner;
class Book
{
          int isbn;//instance/object variable
           String title;
           String author;   //instance variable
           double price; 
    Book(int isbn,String title,String author,double price)
   {
    this.isbn=isbn;
    this.title=title;
    this.author=author;
    this.price=price;
   }
       
       public double discountPrice(double price, double discountprice)  //user defined method
       {
        this.price=price;
               double temp,discount;
        temp=price;
             discount =(temp*discountprice)/100;
               return price-discount;
       }
    void displyDetails()
       {
      double discountprice=discountPrice(price, 10.00);
          System.out.println("book Details:isbn ="+isbn+" Book Title = "+title+" Author = "+author+" Price = "+price+"discount price="+discountprice);
       }
   }
   public class bookdetails
{
       public static void main(String args[])
       {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter Book details: isbn/title/author/price");
                    int  isbn=sc.nextInt();
                String title=sc.next();
                    String author=sc.next();
        double price=sc.nextDouble();
   
      Book b1 =new Book(isbn, title, author, price);
                    b1.displyDetails();
            }
       }
}
