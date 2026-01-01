package bai_5;

import java.util.ArrayList;

public interface ICRUD {
    ArrayList<Category> findAll();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteById(int id);
}
