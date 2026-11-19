package library_management_system;

import java.util.ArrayList;

public class Member {
    String memberID;
    String name;
    int maxBooks;
    ArrayList<Book> borrowedBooks;

    public Member(String memberID,String name,int maxBooks){
        this.memberID=memberID;
        this.name=name;
        this.maxBooks=maxBooks;
        this.borrowedBooks=new ArrayList<>();
    }

    public String getMemberID(){
        return this.memberID;
    }
    public String getName(){
        return this.name;
    }
    public int getMaxBooks(){
        return  this.maxBooks;
    }
    public ArrayList<Book> getBorrowedBooks(){
        return this.borrowedBooks;
    }

    public boolean borrowBook(Book book){
        if (this.borrowedBooks.size()>=this.maxBooks){
            return false;
        }
        if (this.getBorrowedBooks().contains(book)){
            return false;
        }
        this.borrowedBooks.add(book);
        return true;
    }

    public boolean returnBook(Book book){
        
        this.borrowedBooks.remove(book);
        return true;
    }
}
