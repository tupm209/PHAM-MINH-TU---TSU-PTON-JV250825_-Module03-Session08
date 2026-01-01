package bai_6;

import java.util.Scanner;

public class BookManager implements IBookManager{
    private Book[] books = new Book[5];
    private int count = 0;

    @Override
    public void addBook(Book book){
        if(count < books.length){
            books[count] = book;
            count++;
        }else{
            System.out.println("Bộ nhớ đầy");
        }
    }

    @Override
    public void removeBook(String isbn){
        int findIndex = -1;
        for (int i = 0; i < count; i++) {
            if(books[i].getIsbn().equals(isbn)){
                findIndex = i;
                break;
            }
        }

        if(findIndex != -1){
            for (int i = findIndex; i < count - 1; i++) {
                books[i] = books[i + 1];
            }
            books[count - 1] = null;
            count--;
            System.out.println("Đã xóa sách có ISBN là: " + isbn);
        }else{
            System.out.println("Không tìm thấy sách");
        }
    }

    @Override
    public void displayBooks(){
        if(count == 0){
            System.out.println("Không có dữ liệu sách");
        }else{
            for (int i = 0; i < count; i++) {
                System.out.println(books[i].getDetails());
            }
        }
    }
}
