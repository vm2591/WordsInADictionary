//Main driver Code

import java.applet.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadWords {
	
	public static void main(String[] args){
		
		//Read Dictionary
		HashSet<String> list = new HashSet<String>();
		
		list = ReadFile.Read("dictionary");
		//Read Input Tiles
		HashSet<String> input = new HashSet<String>();
		
		input = ReadFile.Read("input");
		
		//Runner for each tile set from the input
		for(String str : input){
			HashMap<Character,Integer> tiles = new HashMap<Character, Integer>();
			int space_count = 0; //keeps the space count or wildcards
			
			//Map each character tile to a hashmap with their counts except the wildcards.
			for(int i=0;i<str.length();i++){
				if( str.charAt(i) == ' '){
					space_count++;
				}
				
				else {
					if(!tiles.containsKey(str.charAt(i))){
						tiles.put(str.charAt(i), 1);
					}
					
					else {
						
						int val = tiles.get(str.charAt(i));
						val++;
						tiles.put(str.charAt(i), val);
					}
				}
			}
			//Final ArrayList of total dictionary words that can be made from the given tiles.
			ArrayList<String> total_words = new ArrayList<String>();
			total_words = CheckWords.word_match(tiles, list, space_count);
			System.out.println(total_words);
		}
	}
}
