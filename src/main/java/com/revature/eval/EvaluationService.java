package com.revature.eval;

import java.util.*;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		// TODO Write an implementation for this method declaration
		if (string == null)	return null;
		String reversestr = "";
		for (int i=string.length()-1; i>=0; i--) {
			reversestr += string.charAt(i);
		}
		return reversestr;
	}

	
	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		if (phrase == null) return null;
		String[] phrasesplit = phrase.split("\\W+\\s*");
		String acronym = "";
		for (String word:phrasesplit) {
			word = word.toUpperCase();
			acronym += word.charAt(0);
		}
		return acronym;
	}
	
	
	/**
	 * 3. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) throws RuntimeException {
		// TODO Write an implementation for this method declaration
		int score = 0;
		if (string == null) return 0;
		
		Map<Character, Integer> map = new HashMap<>();
		char[] ones = {'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'};
		for (char letter : ones) {
			map.put(letter, 1);
		}
		map.put('D', 2); map.put('G', 2);
		char[] threes = {'B', 'C', 'M', 'P'};
		for (char letter : threes) {
			map.put(letter, 3);
		}
		char[] fours = {'F', 'H', 'V', 'W', 'Y'};
		for (char letter : fours) {
			map.put(letter, 4);
		}
		map.put('K', 5); map.put('J', 8); map.put('X', 8);
		map.put('Q', 10); map.put('Z', 10);
		
		string = string.toUpperCase();
		for (int i = 0; i<string.length(); i++) {
		    char letter = string.charAt(i);
		    if (!map.containsKey(letter)) throw new RuntimeException("Not in Map!"); 
			score += (int)map.get(letter);
		}
		return score;
	}
	
	
	/**
	 * 4. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return 
	 * 
	 * Linked Hash Map?
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		Map<String, Integer> LHM = new LinkedHashMap<>();
		String[] splitstring = string.split("\\W+\\s*");
		
		for (String word : splitstring) {
			if (!LHM.containsKey(word)) LHM.put(word, 1);
			else {
				int count = LHM.get(word);
				LHM.put(word, count+1);
			}
		}
		
		return LHM;
	}
	
	/**
	 * 5. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	
}
