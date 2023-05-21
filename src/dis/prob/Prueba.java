package dis.prob;
import java.io.FileReader;
import java.io.BufferedReader;


public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		try {
			FileReader input = new FileReader("signal1.txt");
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(input);
			String line = br.readLine();
			int i = 0;
			while (line != null) {
				i++;
				System.out.println(line);
				line = br.readLine();
			}
			System.out.println(i);
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}

}
