import java.util.Scanner;
public class Produkten {

		public static void main(String[] args) {
		   
			int tal1, tal2, tal3, produkt;
		    Scanner input =new Scanner(System.in);
		    System.out.println("Ange ett värde för första talet:");
		    tal1 = input.nextInt();
		    System.out.println("Ange ett värde för andra talet:");
		    tal2 = input.nextInt();
		    System.out.println("Ange ett värde för tredje talet:");
		    tal3 = input.nextInt();
		    produkt = tal1 * tal2 * tal3;
		   

		    int högstaTal;
			if (tal1 >= tal2 && tal1 >= tal3) { 
		        högstaTal = tal1; 
		    } else if (tal2 >= tal1 && tal2 >= tal3) {
		        högstaTal = tal2;
		    } else {
		        högstaTal = tal3;

		}
		 System.out.println("Produkten blev:" + produkt);
		 System.out.println("Det hösta talet är:" + högstaTal);
		}
		

	}


