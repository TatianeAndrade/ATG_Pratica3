import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
	public static void main(String args[]) throws FileNotFoundException {
		
		File file = new File("/home/tatiane/workspace/ATG_P3/ftc.csv");
		Scanner scanner = new Scanner(file);
		int cont = 0;
		
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
			String[] array = linha.split("~");
			/*for(int i = 0; i < array.length; i++) {
				System.out.println(array[i] + " " + i);
			}*/
			System.out.println(array[0] + " " + cont);
			/*if("\"201801221306204\"".equals(array[0])) {
				System.out.println(array[0]);
			}*/
			cont++;
		}
		scanner.close();
	}
}
