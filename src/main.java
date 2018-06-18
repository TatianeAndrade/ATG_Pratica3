import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
	
	private static String path = System.getProperty("user.dir");
	
	public static Map<String,Integer> anv() throws FileNotFoundException {
		Map<String, Integer> result = new HashMap<>();
		File anv = new File(path + "/anv.csv");
		Scanner scanner = new Scanner(anv);
		
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
			String[] array = linha.split("~");
			String key = array[4];
			if(result.containsKey(key)) {
				Integer valor = result.get(key);
				result.put(key, ++valor);
			}else {
				result.put(key, 1);
			}
		}
		scanner.close();
		return result;
	}
	
	public void ftc() throws FileNotFoundException {
		
		File ftc = new File(path + "/ftc.csv");
		Scanner scanner = new Scanner(ftc);
		int cont = 0;
		
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
			String[] array = linha.split("~");
			/*for(int i = 0; i < array.length; i++) {
				System.out.println(array[i] + " " + i);
			}*/
			System.out.println(array[0] + " " + cont);
			if("\"201801221306204\"".equals(array[0])) {
				System.out.println(array[0]);
			}
			cont++;
		}
		scanner.close();

	}
	
	public static void oco() throws FileNotFoundException {
		
		File oco = new File(path + "/oco.csv");
		Scanner scanner = new Scanner(oco);
		int cont = 0;
		
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
			String[] array = linha.split("~");
			/*for(int i = 0; i < array.length; i++) {
				System.out.println(array[i] + " " + i);
			}*/
			System.out.println(array[0] + " " + cont);
			if("\"201801221306204\"".equals(array[0])) {
				System.out.println(array[0]);
			}
			cont++;
		}
		scanner.close();
	}
	
	public static Map<String, Integer> rec() throws FileNotFoundException {
		Map<String, Integer> result = new HashMap<>();
		File rec = new File(path + "/rec.csv");
		Scanner scanner = new Scanner(rec);
		
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
			String[] array = linha.split("~");
			String key = array[4];
			if(result.containsKey(key)) {
				Integer valor = result.get(key);
				result.put(key, valor++);
			}else {
				result.put(key, 1);
			}
		}
		scanner.close();
		return result;
	}
	
	public static void main(String args[]) throws FileNotFoundException {
		
		Map<String, Integer> anv = anv();
		int cont = 0;
		for (String key : anv.keySet()) {
			System.out.println(key + " " + anv.get(key));
			cont++;
		}
	}
}
