package com.leecode.string;

import java.util.HashSet;
import java.util.Set;

/*International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
 

Note:

The length of words will be at most 100.
Each words[i] will have length in range [1, 12].
words[i] will only consist of lowercase letters.*/

public class UniqueMorseRepresentations {

	/**
	 * hashset add method will'not add the duplicated object to hashset
	 * @param words
	 * @return
	 */
	public static int uniqueMorseRepresentations(String[] words) {
		String[] letters = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
	
		//ArrayList<String> arrayList = new ArrayList<String>();
		Set<String> strSet=new HashSet();
		for (int i = 0; i < words.length; i++) {
			char[] cha = words[i].toCharArray();
			
			String temp = "";
			for (int j = 0; j < cha.length; j++) {
				int number = cha[j] - 'a';
				temp += letters[number];
			}
			System.out.println(String.valueOf(cha) + " : " + temp);
			
			strSet.add(temp);
			/*if (!arrayList.contains(temp)) {
				arrayList.add(temp);
			}*/

		}
		//return arrayList.size();
		return strSet.size();

	}
}
