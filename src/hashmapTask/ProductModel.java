package hashmapTask;

/**
 * Created by Anukul-PC on 24-07-2018.
 */
public class ProductModel {
    private String productName;
    private int productPrice;
    private int categoryId;

    public ProductModel(String productName, int productPrice, int categoryId) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.categoryId = categoryId;
    }

    public ProductModel() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
