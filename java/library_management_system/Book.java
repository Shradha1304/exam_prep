package library_management_system;
import java.util.Objects;
public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;

    public Book(String isbn,String title, String author,int publicationYear){
        validateIsbn(isbn);
        validateTitle(title);
        validateAuthor(author);
        validatePublicationYear(publicationYear);
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    }

    public String getIsbn(){
        return this.isbn;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }

    public void setIsbn(String isbn){
        validateIsbn(isbn);
        this.isbn=isbn;
    }

    public void setTitle(String title){
        validateTitle(title);
        this.title=title;
    }
    public void setAuthor(String author){
        validateAuthor(author);
        this.author=author;
    }
    public void setPublicationYear(int publicationYear){
        validatePublicationYear(publicationYear);
        this.publicationYear=publicationYear;
    }

    public boolean validateIsbn(String isbn){
        if (isbn.length()==0 || isbn.isEmpty()){
            throw new IllegalArgumentException("ISBN cannot be empty");
        }

        return true;
    }

    public boolean validateTitle(String title){
        if (title.length()<2){
            throw new IllegalArgumentException("Title should atleast have 2 charatcers");
        }

        return true;
    }

    public boolean validateAuthor(String author){
        if (author.length()==0 || author.isEmpty()){
            throw new IllegalArgumentException("author name cannot be empty");
        }

        return true;
    }

    public boolean validatePublicationYear(int publicationYear){
        if (publicationYear<1450 || publicationYear>2026){
            throw new IllegalArgumentException("publication year must be between 1450 and 2026");
        }
        return true;
    }

    @Override 
    public String toString(){
        return "Book isbn : " + isbn + "Book title : "+title+ " Book author : "+author+" publication year : "+publicationYear;
    }

    @Override 
    public boolean equals(Object obj){
        if (this ==obj){
            return true;
        }

        if (obj==null || getClass()!=obj.getClass()){
            return false;
        }
        Book other =(Book) obj;
        return this.isbn.equals(other.isbn);
    }

    @Override 
    public int hashCode(){
        return Objects.hash(isbn);
    }

}
