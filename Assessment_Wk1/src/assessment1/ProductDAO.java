package assessment1;
import java.util.Scanner;

public class ProductDAO {
	Scanner sc = new Scanner(System.in);
	
	public Product[] create(Product[] products, int count) {
		
		for(int i=0; i<count; i++) {
			Product product = new Product();
			
			System.out.println("Please enter the ID for Product #" + (i+1));
			product.setProductId(Integer.parseInt(sc.nextLine()));
			System.out.println("Please enter the Name for Product #" + (i+1));
			product.setProductName(sc.nextLine());
			System.out.println("Please enter the Price for Product #" + (i+1));
			product.setProductPrice(Float.parseFloat(sc.nextLine()));
			
			products[i] = product;
		}
		
		return products;
	}
	
	public void read(Product[] products) {
		System.out.printf("%-25.25s %-25.25s %-25.25s\n", "Product ID", "Product Name", "Product Price");
		for(Product p: products) {
			if(p!=null) {
				System.out.printf("%-25d %-25.25s $%-25.2f\n", p.getProductId(), p.getProductName(), p.getProductPrice());
			}
		}
	}
	
	public void update(Product[] products, int pId) {
		for(int i=0; i<products.length;i++) {
			if(products[i]!=null) {
				if(products[i].getProductId()==pId) {
					int selection = 0;
					
					do {
						System.out.println("What would you like to update?");
						System.out.println("1- Product ID");
						System.out.println("2- Product Name");
						System.out.println("3- Product Price");
						System.out.println("4- Return to main menu");
						
						selection = Integer.parseInt(sc.nextLine());
						
						switch(selection) {
							case 1:
								System.out.println("What is the new Product ID?");
								products[i].setProductId(Integer.parseInt(sc.nextLine()));
								break;
							case 2:
								System.out.println("What is the new Product Name?");
								products[i].setProductName(sc.nextLine());
								break;
							case 3:
								System.out.println("What is the new Product Price?");
								products[i].setProductPrice(Float.parseFloat(sc.nextLine()));
								break;
							case 4:
								break;
						}
					} while(selection!=4);
			}
			
			}
		}
	}
	
	public void delete(Product[] products, int pId) {
		for(int i=0; i<products.length; i++) {
			if(products[i]!=null) {
				if(products[i].getProductId()==pId) {
					products[i]=null;
					System.out.println("*********Record Deleted Successfully*********");
				}
			}
		}
	}
}
