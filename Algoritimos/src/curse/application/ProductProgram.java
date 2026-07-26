package curse.application;

import java.util.Locale;
import java.util.Scanner;

import curse.application.entity.Product;

public class ProductProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter Product Data:");
		Product product = new Product();
		System.out.println("Name:");
		product.setNome(sc.nextLine());
		//sc.next();
		System.out.println("price:");
		product.setPrice(sc.nextDouble());
		System.out.println("quantity:");
		product.setQuantity(sc.nextInt());
		
		System.out.println();
		System.out.printf("Product data %s $ %.4f, quantity: %d, total: %.4f ",product.getNome(),product.getPrice(),product.getQuantity(),product.totalValueInStock());
		System.out.println("Enter the number of product to be added in in stok");
		product.addProduct(sc.nextInt());
		System.out.printf(" Update data %s $ %.4f, quantity: %d, total: %.4f ",product.getNome(),product.getPrice(),product.getQuantity(),product.totalValueInStock());
		
		System.out.println("Enter the number of product to be remove in in stok");
		product.removeProduct(sc.nextInt());
		
		System.out.printf(" Update data %s $ %.4f, quantity: %d, total: %.4f ",product.getNome(),product.getPrice(),product.getQuantity(),product.totalValueInStock());
		sc.close();
	}

}
