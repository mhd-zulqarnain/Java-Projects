import java.io.*;
public class IOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileReader fr= new FileReader(FileDescriptor.in);
		BufferedReader br= new BufferedReader(fr);
			try{
		FileWriter fw= new FileWriter("test.txt");
		PrintWriter pr= new PrintWriter(fw);
		String outputL,inputL;
		int i=1;
		do{
			
			inputL=br.readLine();
			if(inputL.equals(""))break;
			outputL=i+" "+inputL;
			
			pr.println(outputL);
			i++;
		}while(true);
		
		pr.flush();
		pr.close();
		br.close();
		fr.close();
		
			}catch(Exception e){
				System.out.println("Execption");
			}
	}

}
