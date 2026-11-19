package library_management_system;

import java.util.ArrayList;

public class Library {
    ArrayList<Member> memberList;
     
    public Library(){
       memberList= new ArrayList<>();
    }

    public boolean addMember(Member member){
        if (memberList.contains(member)){
            return false;
        }
        memberList.add(member);
        return true;
    }

    public void printAllMembers(){
        for(int i=0;i<memberList.size();i++){
            System.out.println("Member id :" + memberList.get(i).getMemberID());
            System.out.println("Member name: "+ memberList.get(i).getName());
            System.out.println("Max books : "+ memberList.get(i).getMaxBooks());
            System.out.println("Borrowed books: "+ memberList.get(i).getBorrowedBooks());
        }
    }

    public Member findMember(String memberID){
        for(int i=0;i<memberList.size();i++){
            if (memberList.get(i).getMemberID().equals(memberID)){
                return memberList.get(i);
            }
        }
        return null;
    }

    public boolean borrowBook(Member member, Book book){
        if (!memberList.contains(member)){
            return false;
        }
        for (Member m : memberList){
            if (m.getBorrowedBooks().contains(book)){
                return false;
            }
        }
        return member.borrowBook(book);
    
    }

    public boolean returnBook(Member member , Book book){
        for (Member m : memberList){
            if (m.getMemberID().equals(member.getMemberID())){
                return m.returnBook(book);
            }

        }
        return false;
    }
}
