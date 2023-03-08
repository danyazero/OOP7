package main;


import IO.IO;
import IO.IOProcessor;
import UI.ProductsFunctionProcessor;
import UI.ProductsFunctions;
import productsProcessor.ProductsList;

import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {

    public static void main(String[] args) {
        new Main().run();
    }

    private void menu() {
        println("[0] Read file from JSON");
        println("[1] Read file from Binary");
        println("[2] Show all entries");
        println("[3] Filter products by name");
        println("[4] Filter by Name & Price");
        println("[5] Filter by Term");
        println("[6] Add new product");
        println("[7] Delete Element By Id");
        println("[8] Save in Binary File");
        println("[9] Add few Products to Array");
        println("[10] Save in JSON file");
        println("[11] Filter");
        println("[12] Exit");
        System.out.print(">> ");
    }

    private void run() {
        ProductsList products = new ProductsList();
        IO io = new IOProcessor();
        ProductsFunctions funs = new ProductsFunctionProcessor();
        loop:
        while (true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            switch (m) {

                case -1 -> funs.getSortedProducts(products.getProducts());
                case 0 -> products.setProductsList(io.readObjectsFromJSON());
                case 1 -> products.setProductsList(io.readObjects());
                case 2 -> funs.showProducts(products.getProducts());
                case 3 -> funs.showProductsByName(products, scanner);
                case 4 -> funs.showProductByPrice(products, scanner);
                case 5 -> funs.showProductByTerm(products, scanner);
                case 6 -> funs.addNewProduct(products, scanner);
                case 7 -> funs.deleteElementById(products, scanner);
                case 8 -> io.writeObjects(products);
                case 9 -> funs.createProductsArray(products);
                case 10 -> io.writeObjectsToJson(products);
                case 11 -> funs.getSortedArrayByPrice(products.getProducts());
                case 12 -> {
                    break loop;
                }
            }
        }

    }

    private void println(String value) {
        System.out.println(value);
    }
}