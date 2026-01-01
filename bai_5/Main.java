package bai_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CategoryManagement management = new CategoryManagement();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1: Thêm danh mục");
            System.out.println("2: Hiển thị danh mục");
            System.out.println("3: Cập nhật danh mục");
            System.out.println("4: Xóa danh mục");
            System.out.println("5: Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    management.addCategory(new Category());
                    break;
                case 2:
                    management.findAll();
                    break;
                case 3:
                    management.updateCategory(null);
                    break;
                case 4:
                    System.out.print("Nhập ID cần xóa: ");
                    int idDel = Integer.parseInt(sc.nextLine());
                    management.deleteById(idDel);
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Nhập lựa chọn từ 1 - 5");
                    System.out.println("----------------------------");
            }
        }while(true);
    }
}
