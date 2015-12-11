package com.hz.algorithem.string_array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;



/**
 *Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that only one letter can be changed at a time and each intermediate word must exist in the dictionary. For example, given:
 *start = "hit"
 *end = "cog"
 *dict = ["hot","dot","dog","lot","log"]
 *One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", the program should return its length 5.
 * 
 * ȡ�����ֵ��д�Ϊ��ת�ʣ����·��
 * 
 * @author huang_z
 *
 */
public class WordLadder1 {

	
	private void ladder(String startWord, String endWord, Set<String> dic){
		LinkedList<WordNode> queue = new LinkedList<WordNode>();
		dic.add(endWord);
		// ��¼·���е�һ��Ԫ��
		WordNode topWord = new WordNode(startWord);
		queue.add(topWord);
		// ������ַ�����startWord��endWord�ȶ�
		char[] chars = startWord.toCharArray();
		char[] endChars = endWord.toCharArray();
		
		for(int i = 0; i < chars.length; i++){
			if(chars[i] != endChars[i]){
				// ����ȣ���26��ĸ���֮
				for(char k = 'a'; k <= 'z'; k++){
					char temp = chars[i];
					if(chars[i] != k){
						chars[i] = k;
					}
					String newWord = new String(chars);
//					System.out.println(newWord);
					// �Ƿ����ֵ��д���
					if(dic.contains(newWord) && k == endChars[i]){
						WordNode nextWordNode = new WordNode(newWord);
						queue.add(nextWordNode);
						dic.remove(newWord);
						break;
					}
					chars[i] = temp;
				}
			}
		}
		
		// ·���������queue��
		for(int i = 0; i < queue.size(); i++){
			System.out.println("queue -- " + queue.get(i).word);
		}
		
	}
	
	class WordNode{
		public String word;
		
		public WordNode(String word){
			this.word = word;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordLadder1 wordLadder = new WordLadder1();
		HashSet set = new HashSet<String>();
		set.add("hot");
		set.add("dot");
		set.add("log");
		set.add("lot");
		set.add("dog");
		
		wordLadder.ladder("hit", "cog", set);
	}

}
