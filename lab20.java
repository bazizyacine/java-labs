import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lab20 {
	public static void main(String[] args) {	
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\ex.txt"))) {
			System.out.println(br.readLine());
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
