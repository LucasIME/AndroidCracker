import java.util.ArrayList;


public class PermutationGenerator {

    public static ArrayList<ArrayList<Character>> getMostLikelyKey(String cypherText, int keyLength) {
        ArrayList<ArrayList<Character>> likelyKeys= new ArrayList<>();
        for (int i = 0; i < keyLength; i++)
            likelyKeys.add(new ArrayList<>());

        // aggregate by key element
        ArrayList<String> partialCypherTexts = new ArrayList<>(keyLength);
        for (int i = 0; i < keyLength; i++)
            partialCypherTexts.add("");
        for (int i = 0; i < cypherText.length(); i++)
            partialCypherTexts.set(i % keyLength, partialCypherTexts.get(i % keyLength) + cypherText.charAt(i));

        // guess a key, character by character
        for (int i = 0; i < keyLength; i++) {
            // count frequencies in the partial cyphertext
            int[] frequencies = new int[26];
            for (int j = 0; j < partialCypherTexts.get(i).length(); j++) {
                frequencies[partialCypherTexts.get(i).charAt(j) - 'A']++;
            }

            // get the most frequent letter
            int idx = 0;
            for (int j = 1; j < 26; j++) {
                if (frequencies[j] > frequencies[idx])
                    idx = j;
            }

            likelyKeys.get(i).add((char) ('A' + (26 + idx - 4) % 26)); // E
            likelyKeys.get(i).add((char) ('A' + (26 + idx - 20) % 26)); // T
            likelyKeys.get(i).add((char) ('A' + (26 + idx - 0) % 26)); // A
        }
        
        return likelyKeys;
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
