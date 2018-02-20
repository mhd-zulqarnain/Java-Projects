package File;

import java.io.*;

public class Entity {
	FileReader fl;
	BufferedReader br;
	String text, token[];

	public Entity(String fileName) throws FileNotFoundException {
		fl = new FileReader(fileName);
		br = new BufferedReader(fl);
	}

	public void read() {

		try {
			text = br.readLine();
			while (text != null) {
				token = text.split(",");
				System.out.println(token[0]);
				text = br.readLine();
			}
			

		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
}
