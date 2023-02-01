package model;

public class Category extends MainCategory{
    private String category;

    public Category(String mainCategory, String category) {
        super();
        this.category = category;
    }

    public Category() {
        super();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Category: " + category);
    }
}