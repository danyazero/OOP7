package UI;

import productsProcessor.Product;
import productsProcessor.ProductsList;

import java.util.List;
import java.util.Scanner;

public interface ProductsFunctions {
    public void showProductsByName(ProductsList products, Scanner sc);
    public void showProductByPrice(ProductsList products, Scanner sc);
    public void addNewProduct(ProductsList products, Scanner scanner);
    public void deleteElementById(ProductsList products, Scanner sc);
    public void showProducts(List<Product> products);
    public void showProductByTerm(ProductsList products, Scanner sc);
    public void createProductsArray(ProductsList products);

    public void getSortedArrayByPrice(List<Product> products);
    public void getSortedProducts(List<Product> products);
}
