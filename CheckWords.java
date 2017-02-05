//Function to match each word from the dictionary to available tile letters.
import java.util.*;

public class CheckWords {
	public static ArrayList<String> word_match (HashMap<Character,Integer> map , HashSet<String> set, int spaces){
		ArrayList<String> match_words = new ArrayList<String>();
		
		for(String word : set){
			HashMap<Character, Integer> new_map = new HashMap<Character,Integer>(map);
			//for each dictionary word, check if we have sufficient letters and spaces to form that word
			int char_found =0;
			for(int i=0;i<word.length();i++){
				if(new_map.containsKey(word.charAt(i))){
					char_found++;
					int val = new_map.get(word.charAt(i));
					val--;
					if(val > 0){
						new_map.put(word.charAt(i), val);
					}
					else {
						new_map.remove(word.charAt(i));
					}
					
				}
			}
			
			if(char_found + spaces >= word.length()){
				match_words.add(word);
			}
		}
		
		return match_words;
		
		
	}
	
}
