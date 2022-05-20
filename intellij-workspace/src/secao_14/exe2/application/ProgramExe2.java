package secao_14.exe2.application;

import secao_14.exe2.entities.ImportedProduct;
import secao_14.exe2.entities.Product;
import secao_14.exe2.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramExe2 {

    public static void run() {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<Product>();

        System.out.printf("Enter the number of products: ");
        int amount = sc.nextInt();

        for (int i = 1; i <= amount; i++) {

            System.out.printf("\nCommon, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            String name;
            Double price;

            switch (productType) {
                case 'c':
                    System.out.printf("Name: ");
                    name = sc.next();

                    System.out.printf("Price: ");
                    price = sc.nextDouble();

                    productList.add(new Product(name, price));
                    break;
                case 'u':
                    System.out.printf("Name: ");
                    name = sc.next();

                    System.out.printf("Price: ");
                    price = sc.nextDouble();

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.printf("Manufactured date (DD/MM/YYYY): ");
                    Date manufacturedDate = null;
                    try {
                        manufacturedDate = sdf.parse(sc.next());
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    productList.add(new UsedProduct(name, price, manufacturedDate));
                    break;
                case 'i':
                    System.out.printf("Name: ");
                    name = sc.next();

                    System.out.printf("Price: ");
                    price = sc.nextDouble();
                    System.out.printf("Custom free: ");
                    Double customFree = sc.nextDouble();

                    productList.add(new ImportedProduct(name, price, customFree));
                    break;
                default:
                    System.out.println("Wrong operations");
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product product : productList) {
            System.out.println(product.priceTag());
        }
    }
}
