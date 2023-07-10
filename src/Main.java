class LibraryItem {
    private int id;
    String title;
    int year;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Book extends LibraryItem{
    String author;

}
class Magazine extends LibraryItem{
    int issue;
    private String publication;
    void getDetails(int id,String title,int year,int issue,String publication){
        this.setId(id);
        this.title=title;
        this.year=year;
        this.issue=issue;
        this.setPublication(publication);
    }
    void printDetails(){
        System.out.println("ID :"+this.getId()+" | Title :"+this.title+" | Year :"+this.year+" | Issued :"+this.issue+" | Publication :"+this.getPublication());
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }
}
public class Main{
    public static void main(String[] args) {
    Book book1=new Book();
    book1.setId(001);
    book1.title="Harry Potter";
    book1.year=2001;
    book1.author="JK.Rowling";
    book1.setPrice(1000);
    System.out.println("ID :"+book1.getId()+" | Title :"+book1.title+" | Year :"+book1.year+" | Author :"+book1.author+" | Price :"+book1.getPrice());
    Magazine magazine1=new Magazine();
   magazine1.getDetails(002,"ICC World cup",2021,2020,"Star Sports");
   magazine1.printDetails();
    }
}
