import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String[] hexs = input.split(" ");
		for (String hex : hexs) {
			String binary = Integer.toBinaryString(Integer.parseInt(hex, 16));
			String result = fillWithZeros(binary);
			System.out.println(result.replaceAll("1", "X").replaceAll("0", " "));
		}
	}
	
	private static String fillWithZeros(String binary){
		if(binary.length() >= 8)
			return binary;
		else
			return fillWithZeros("0" + binary);
	}
}
