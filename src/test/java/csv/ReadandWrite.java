package csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadandWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter file=new FileWriter("D:\\csv\\resume.txt");
		
		BufferedWriter bw=new BufferedWriter(file);
		
		bw.write("deepak podile 8712346567");
		
	    System.out.println("finished");
	    
	    bw.close();
	}

	
	public static void main1(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter file=new FileWriter("D:\\csv\\Deepak.txt");
		
		BufferedWriter bw=new BufferedWriter(file);
		
		bw.write("deepak podile 8712346567");
		
	    System.out.println("finished");
	    
	    bw.close();
}
	
}

