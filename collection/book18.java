package collection;

public class book18 {
    public String isbn;
    public String title;

    public book18(){

    }

    public book18(String isbn, String title){
        this.isbn=isbn;
        this.title=title;
    }

    public String toString(){
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}
