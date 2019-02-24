package mobilidade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Investigation {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/home/camilo/eclipse-workspace/geral/src/mobilidade/RealityConnectionTraceFinal.txt";
		String linha;
		String[] data_str;
		int[] data_int = new int[5];
		BufferedReader buffRead = new BufferedReader(new FileReader(path)); 
		linha = buffRead.readLine();
		
		//This code reads all the file and store in an integer vector the values readed.
		while(linha != null){
			//System.out.println(linha);
			data_str = linha.split(" ");
			
			data_int[0] = Integer.parseInt(data_str[0]);
			data_int[1] = Integer.parseInt(data_str[2]);
			data_int[2] = Integer.parseInt(data_str[3]);
			
			//System.out.println(data_int[1]+ " + " + data_int[2]);

//			System.out.println(data_str[4]);
			
			
			
			linha = buffRead.readLine();
		}
		
		
		
	}

}
