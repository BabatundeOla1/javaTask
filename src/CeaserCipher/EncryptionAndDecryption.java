package CeaserCipher;

public class EncryptionAndDecryption {

    public String encryption(int number, String word){
        validateNumber(number);
        String newWords = "";
        for(int text = 0; text < word.length(); text++){
            char letter = word.charAt(text);

            if(Character.isUpperCase(letter)) {
                newWords += Character.toString((char) ((letter + number)));
            }
            if(Character.isLowerCase(letter)) {
                newWords += Character.toString((char) ((letter + number)));
            }
            else{
                throw new IllegalArgumentException("Words should be CAPITAL or small letter althrough");
            }
        }
        return newWords;
    }

    public String decryption(int number, String word){
        validateNumber(number);
        String newWords = "";
        for(int text = 0; text < word.length(); text++){
            char letter = word.charAt(text);

            if(Character.isUpperCase(letter)) {
                newWords += Character.toString((char) ((letter - number)));
            }

            else if(Character.isLowerCase(letter)) {
                newWords += Character.toString((char) ((letter - number)));
            }

            else{
                throw new IllegalArgumentException("Words should be CAPITAL or small letter althrough");
            }
        }
        return newWords;
    }

    private void validateNumber(int number){
        if(number < 1 || number > 26){
            throw new IllegalArgumentException("Number can not be less than One.");
        }
    }

}
