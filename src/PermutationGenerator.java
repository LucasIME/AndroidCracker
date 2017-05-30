import java.util.ArrayList;

/**
 * Created by meire on 29-May-17.
 */

public class PermutationGenerator {

    private static String getMostLikelyKey(String cypherText, Integer keyLength) {
        String key = "";

        // aggregate by key element
        ArrayList<String> partialCypherTexts = new ArrayList<>(keyLength);
        for (int i = 0; i < keyLength; i++)
            partialCypherTexts.set(i, "");
        for (int i = 0; i < cypherText.length(); i++)
            partialCypherTexts.set(i % keyLength, partialCypherTexts.get(i) + cypherText.charAt(i));

        // guess a key
        for (int i = 0; i < keyLength; i++) {
            //int x = get;
            //key += (char) ('A' + )
        }

        return key;
    }

    public static ArrayList<String> GenerateAllPermutationsOfLength(int n){
        if (n == 0) return new ArrayList<>();

        if (n==1){
            ArrayList<String> response = new ArrayList<>();
            char c = 'A';
            while( c <= 'Z'){
                response.add(String.valueOf(c++));
            }
            return  response;
        }

        ArrayList<String> lastPermutations = GenerateAllPermutationsOfLength(n-1);


        ArrayList<String> response = new ArrayList<>();
        char c = 'A';
        while( c <= 'Z'){
            for(int i =0; i < lastPermutations.size(); i++){
                response.add(c + lastPermutations.get(i));
            }
            c++;
        }

        return  response;
    }
}
