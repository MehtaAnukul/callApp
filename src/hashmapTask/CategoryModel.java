package hashmapTask;

/**
 * Created by Anukul-PC on 24-07-2018.
 */
public class CategoryModel {
    private String categoryName;

    public CategoryModel(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryModel() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
