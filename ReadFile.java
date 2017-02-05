//Java Class to Read Files , i.e. Dictionary and Input
//HashSet is used instead of ArrayList in order to remove the duplicates from the list

import java.util.*;
import java.io.*;



public class ReadFile {
//	public HashMap<Integer,ArrayList<String>> MapDictionary(){
		public static HashSet<String> Read(String fileName){ 
			try {
				File file = new File(fileName + ".txt");
				FileReader fileReader = new FileReader(file);
				HashSet<String> list = new HashSet<String>();
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String line;
				
				//Scanner s = new Scanner(fileReader);
				while((line = bufferedReader.readLine()) != null){
					//Perform Sanity check for Words longer than the desired Length. Can be Edited to suit to different problem needs.
					if(line.length()<=7){
						list.add(line);
					}
					
					
				}
				bufferedReader.close();
				
				return list;
			}
			
			catch (IOException e) {
				e.printStackTrace();
				return null;
			}
			
		}
//	}
		
}
