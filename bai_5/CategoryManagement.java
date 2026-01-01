package bai_5;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryManagement implements ICRUD{
    ArrayList<Category> categories = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // tìm danh mục bằng id
    private Category findById(int id){
        for (Category category : categories){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Category> findAll(){
        if(categories.isEmpty()){
            System.out.println("Không có dữ liệu danh mục");
        }else{
            System.out.println("Danh sách danh mục: ");
            for (Category category : categories){
                System.out.println(category);
            }
        }
        return categories;
    }

    @Override
    public void addCategory(Category category){
        int id;
        String name;
        String description;

        // tạo id
        System.out.print("Nhập ID danh mục: ");
        id = Integer.parseInt(sc.nextLine());
        category.setId(id);

        // tạo tên
        System.out.print("Nhập tên danh mục: ");
        name = sc.nextLine();
        category.setName(name);

        // tạo mô tả
        System.out.print("Nhập mô tả danh mục: ");
        description = sc.nextLine();
        category.setDescription(description);

        // thêm danh mục
        categories.add(new Category(id, name, description));
        System.out.println("Danh mục đã được thêm");
    }

    @Override
    public void updateCategory(Category category){
        int id;
        String name;
        String description;
        while (true){
            System.out.print("Nhập ID danh mục cần cập nhật: ");
            id = Integer.parseInt(sc.nextLine());
            if(findById(id) == null){
                System.out.println("Không có dữ liệu danh mục");
            }else{
                category = findById(id);
                // cập nhật tên mới
                System.out.print("Nhập tên mới: ");
                name = sc.nextLine();
                category.setName(name);

                // cập nhật mô tả mới
                System.out.print("Nhập mô tả mới: ");
                description = sc.nextLine();
                category.setDescription(description);

                System.out.println("Đã cập nhật mô tả");

                break;
            }
        }
    }

    @Override
    public void deleteById(int id){
        while (true){
            if(findById(id) == null){
                System.out.println("Danh mục không tồn tại");
            }else{
                // xóa danh mục
                categories.remove(findById(id));
                System.out.println("Đã xóa danh mục");
                break;
            }
        }
    }
}
