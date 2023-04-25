
package model;


public class Entity {
    private final String plainText;
    private final String encodedText;

    public Entity(String plainText, String encodedText) {
        this.plainText = plainText;
        this.encodedText = encodedText;
    }

    public String getPlainText() {
        return plainText;
    }

    public String getEncodedText() {
        return encodedText;
    }
    
}
