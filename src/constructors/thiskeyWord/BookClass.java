package constructors.thiskeyWord;

public class BookClass {
    String title;
    String author;
    int pages;
    char bestseller;

    BookClass (String title, String author,int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;

    }
    BookClass(String title, String author , int pages, char bestseller){
        this(title, author, pages);
        this.bestseller = bestseller;

    }
    void print(){
        System.out.println(title + " by " + author + " has "+pages+ " pages " + bestseller );
    }



    public static void main(String[] args) {
        BookClass bookClass = new BookClass("Eat pray love","Maria",200);
        BookClass bookClass1 = new BookClass("Dracula", "Bram Stoker",300,'A');
        bookClass.print();
        bookClass1.print();

    }


}
