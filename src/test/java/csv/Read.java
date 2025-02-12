package csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter file=new FileWriter("D:\\csv\\deepak.txt");
		
		BufferedWriter bw=new BufferedWriter(file);
		
		bw.write("deepak podile 8712346567");
		
	    System.out.println("finished");
	    
	    bw.close();
	
		
		
		
	}

	
}

	
