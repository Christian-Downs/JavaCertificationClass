
package Assignment;

public class customeCheckedException {
	public boolean isCapitalised(String word) throws FirstLetterNotCapitalized {
		if(!Character.isUpperCase(word.charAt(0))) {
			throw new FirstLetterNotCapitalized(word + " is not capitalized");
		}
		
		return true;
	}
}
