package assessment1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductDAO dao = new ProductDAO();
		Product[] products = new Product[10];
		int choice, id = 0;
		
		do {
			
			System.out.println("**********Menu**********");
			System.out.println("1- Create Records");
			System.out.println("2- Read Records");
			System.out.println("3- Update Records");
			System.out.println("4- Delete Records");
			System.out.println("5- Exit");
			choice = Integer.parseInt(sc.nextLine());
			
			
			switch(choice) {
				case 1:
					System.out.println("How many Product records would you like to create? (10 Maximum)");
					int count = Integer.parseInt(sc.nextLine());
					dao.create(products, count);
					break;
				case 2:
					dao.read(products);
					break;
				case 3:
					System.out.println("Please enter the ID of the Product you wish to update");
					id = Integer.parseInt(sc.nextLine());
					dao.update(products, id);
					break;
				case 4:
					System.out.println("Please enter the ID of the Product you wish to delete");
					id = Integer.parseInt(sc.nextLine());
					dao.delete(products, id);
					break;
				case 5:
					break;
			}
			
		} while(choice!=5);
	}

}
