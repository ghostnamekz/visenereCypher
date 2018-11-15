
public class main {
    public static void main(String[] args) throws StringIndexOutOfBoundsException {
        String key = "becon";
        String text = "meet me at seven near a museum";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String cipher = "";
        text = text.replaceAll(" ", "" );
        int lengthKey = key.length();
        int lengthText = text.length();
        int modulo = lengthText % lengthKey;
        String stringKey = key;
        for ( int i = 1; i < ( lengthText / lengthKey ); i++) {
            key = key + stringKey;
        }
        key = key + key.substring(0, modulo);
        for ( int j = 0; j < lengthText; j++ ) {
            cipher = cipher + alphabet.charAt((alphabet.indexOf(key.charAt(j)) + alphabet.indexOf(text.charAt(j))) % 26);
        }
        cipher = cipher.toUpperCase();
        System.out.println( "cipherText: " + cipher );
        cipher = cipher.toLowerCase();
        String decipher = "";
        for ( int r = 0; r < lengthText; r++ ) {
            decipher = decipher + alphabet.charAt((( alphabet.indexOf( cipher.charAt ( r )) -
                    alphabet.indexOf( key.charAt( r ))) + 26 ) % 26 );
        }
        System.out.println( "decipher: " + decipher );
    }
}