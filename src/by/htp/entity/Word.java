package by.htp.entity;
import java.util.ArrayList;
import java.util.List;

public class Word {
	
	private final String name;
	private List<Character> symbols = new ArrayList<>();
	

	public Word(String name) {
		this.name = name;
		wordToSymbols(this);
	}
	
	
	public String changeLetter (char symbol, int position){
		
		List<Character> changingSymbols = new ArrayList<>();
		changingSymbols.addAll(symbols);
		
		if (changingSymbols.size() > position) {
			changingSymbols.set(position, symbol);
			
		}
 
		return symbolsToWord(changingSymbols);
		
	}
	
	
	public List<Character> getSymbols() {
		return symbols;
	}


	public void wordToSymbols(Word word){
		for (Character ch : word.getName().toCharArray()){
			symbols.add(ch);
		}
	}
	
	public String symbolsToWord(List<Character> symbols){
		
		StringBuilder builder = new StringBuilder(symbols.size());
	    for(Character ch: symbols){
	        builder.append(ch);
	    }
	    
	    return builder.toString();
		
	}
	
	
	public String getName() {
		return name;
	}


	
	

}
