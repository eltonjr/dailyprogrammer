import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
			final String TEMPLATE = "++--***...";
			final String SPACES = "          ";
			final String INPUT = args[0];
			final String[] LETTERS = new String[]{null, "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

			String output = "";

			String[] chars = INPUT.split("");
			for (String c : chars) {
					if(!c.isEmpty())
							if(c.matches("^[0-9]$")){
									output += SPACES.substring(0, Integer.parseInt(c));
							} else {
									output += TEMPLATE.substring(0, Arrays.asList(LETTERS).indexOf(c)) + "\n";
							}
			}

			System.out.println(Test.transpose(output));
	}

	public static String transpose(String input){
			String[] lines = input.split("\n");
			String result = "";
			for(int i = 20; i >= 0; i--){
					for(String line : lines){
							if(line.length() >= i + 1){
									result += line.charAt(i);
							} else {
									result += " ";
							}
					}
					result += "\n";
			}
			return result;
	}

}
