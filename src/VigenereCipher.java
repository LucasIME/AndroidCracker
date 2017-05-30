public class VigenereCipher {
    private String cipheredText = "";
    private String decipheredText = "";
	  private String key = "";
		
    public static String decipher(String s, String key){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i ++){
            char decyphered = s.charAt(i) - getShift(key, i) < 65 ? (char)((s.charAt(i) - getShift(key, i)) + 26) : (char)(s.charAt(i) - getShift(key, i));
            builder.append(decyphered);
        }
        return builder.toString();
    }
    private static int getShift(String key, int i) {
        return ((int)key.charAt(i % key.length())) - 65;
    }
    
    public VigenereCipher(String cipheredText, String key){
    	cipheredText = cipheredText.toUpperCase();
    	key = key.toUpperCase();
    	this.setCipheredText(cipheredText);
    	this.setKey(key);
    	this.setDecipheredText(this.decipher(this.getCipheredText(),this.getKey()));
    }
	public String getDecipheredText() {
		return decipheredText;
	}
	public void setDecipheredText(String decipheredText) {
		this.decipheredText = decipheredText;
	}
	public String getCipheredText() {
		return cipheredText;
	}
	public void setCipheredText(String cipheredText) {
		this.cipheredText = cipheredText;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
