package hashmapTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Anukul-PC on 24-07-2018.
 */
public class CategoryProductHashmapList {
    String category;
    private Scanner getInput;
    private ArrayList<CategoryModel> categoryModelArrayList;
    private ArrayList<ProductModel> productModelArrayList;
    private HashMap<String, ArrayList<CategoryModel>> stringCategoryArrayListHashMap;
    private HashMap<String, ArrayList<ProductModel>> stringProductArrayListHashMap;

    CategoryProductHashmapList(){
        getInput = new Scanner(System.in);
        categoryModelArrayList = new ArrayList<>();
        productModelArrayList = new ArrayList<>();
        stringCategoryArrayListHashMap = new HashMap<>();
        stringProductArrayListHashMap = new HashMap<>();
        choice();
    }

    private void choice() {
        int choice;
        System.out.println("");
        System.out.println("1.Add category");
        System.out.println("2.Add Product");
        System.out.println("Exit");
        System.out.println("choose your choice");
        choice = getInput.nextInt();

        switch (choice){
            case 1:
                addcategory();
                choice();
                break;
            case 2:
               addProduct();
                choice();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Wrong choice...!!");
                choice();
                break;
        }
        
    }

    private void addProduct() {
        int categoryId;

        System.out.println("");

        for(CategoryModel categoryModel : categoryModelArrayList){
            System.out.println(categoryModelArrayList.indexOf(categoryModel) + "." + categoryModel.getCategoryName());
        }
        System.out.println("Enter the categoryID or index");
        categoryId = getInput.nextInt();

        addProductItem(categoryId);
    }

    private void addProductItem(int categoryID) {
        String choice;
        final String productName;
        final int productPrice;

        System.out.println("");
        System.out.println("Enter the ProductName");
        productName = getInput.next();

        System.out.println("Enter the ProductPrice");
        productPrice = getInput.nextInt();

        productModelArrayList.add(new ProductModel(productName,productPrice,categoryID));

        System.out.println("Press Y for add product or N for no");
        choice = getInput.next();

        if(choice.equals("Y")){
            addProductItem(categoryID);
        }
        else{
            choice();
        }
    }

    private void addcategory() {
        String categoryName;

        System.out.println("Enter the category");
        categoryName = getInput.next();

        categoryModelArrayList.add(new CategoryModel(categoryName));

        addMoreCategory();

    }

    private void addMoreCategory() {
        String choice;
        String categoryName;
        System.out.println("Press Y for add category or N for no");
        choice = getInput.next();

        if(choice.equals("Y")){
            System.out.println("Enter the category");
            categoryName = getInput.next();
            categoryModelArrayList.add(new CategoryModel(categoryName));
            addMoreCategory();
        }
        else{
            choice();
        }
    }   
}
