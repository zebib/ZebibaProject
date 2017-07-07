package Texample;

import java.io.FileOutputStream;
import java.io.IOException;

public class Empty {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("empty.txt");
		// fout.flush();
		// fout.write(65);
		// fout.close();

	}
}
