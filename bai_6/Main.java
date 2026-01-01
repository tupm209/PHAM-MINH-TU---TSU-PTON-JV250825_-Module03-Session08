package bai_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager manager = new BookManager();
        int choice;

        do {
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Thoát");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    System.out.print("Nhập tiêu đề: ");
                    String title = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String author = sc.nextLine();
                    System.out.print("Nhập ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int year = Integer.parseInt(sc.nextLine());
                    Book book = new Book(title, author, isbn, year);
                    manager.addBook(book);
                    System.out.println("Đã thêm sách: " + book.getDetails());
                    break;
                case 2:
                    System.out.println("Danh sách sách: ");
                    manager.displayBooks();
                    break;
                case 3:
                    System.out.print("Nhập ISBN sách cần xóa: ");
                    String delByIsbn = sc.nextLine();
                    manager.removeBook(delByIsbn);
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("hãy nhập từ 1 - 4");
            }
        }while (true);
    }
}
