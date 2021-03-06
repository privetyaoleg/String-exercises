package by.htp.runner;

import by.htp.entity.Sentence;

public class Main { 
	
	public static void main(String[] args) { 
		

			
			String originalSentence = "A regular <expression,> specified as a string, must first be compiled into an "
						+ "instance of this class. The resulting pattern can then be used to create "
						+ "a Matcher object that can match arbitrary character sequences against the regular expression."
						+ " All of the state involved in performing a match resides in the matcher, so many matchers "
						+ "can share the same pattern.";

		
			Sentence sentence = new Sentence(originalSentence);
			
			
			System.out.println(sentence.getOriginalSentence());
			System.out.println(sentence.changeLetter(2, '*'));
			System.out.println(sentence.deleteBlock('<','>'));	
			System.out.println(sentence.isConsonantMore(9));
			System.out.println("Amount words wich start with vowel letter = " + sentence.amountVowelStart());
			System.out.println("Amount of words in sentence = " + sentence.getWords().size());
			System.out.println("Amount of punctuation marks = " + sentence.amountPunctuationMarks());
			
			sentence.printByAlphapetNum();
//			sentence.printWordsAmount();
			
			
	

	}
}