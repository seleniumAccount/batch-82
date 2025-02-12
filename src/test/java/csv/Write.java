package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("D:\\csv\\resume.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}
   
	
      
}
