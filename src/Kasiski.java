import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kasiski {

    public static int test(String cypherText) {
        HashMap<String, ArrayList<Integer>> substringPositions = new HashMap<>();

        // count trigrams
        for (int i = 0; i < cypherText.length()-2; i++) {
            String substring = cypherText.substring(i, i+3);

            if (!substringPositions.containsKey(substring))
                substringPositions.put(substring, new ArrayList<>());

            substringPositions.get(substring).add(i);
        }

        // discard unique trigrams
        HashMap<String, ArrayList<Integer>> repeatedPositions = new HashMap<>(substringPositions);
        for (String substring : substringPositions.keySet())
            if (repeatedPositions.get(substring).size() < 2)
                repeatedPositions.remove(substring);

        // get the prime factors of the differences
        HashMap<Integer, Integer> factorCounts = new HashMap<>();
        for (String substring : repeatedPositions.keySet()) {
            ArrayList<Integer> diffs = getDifferences(repeatedPositions.get(substring));
            for (Integer diff : diffs) {

            }
        }

        // estimate the key size
        Integer bestKeySize = null, maxFrequency = 0;
        for (Integer keySize : factorCounts.keySet()) {
            Integer keyFrequency = factorCounts.get(keySize);
            if (keyFrequency > maxFrequency && keySize > 2 && keySize < 15) {
                bestKeySize = keySize;
                maxFrequency = keyFrequency;
            }
        }

        return 13;
    }

    private static ArrayList<Integer> getDifferences(ArrayList<Integer> values) {
        ArrayList<Integer> diffs = new ArrayList<>();

        for (int i = 1; i < values.size(); i++)
            diffs.add(values.get(i)-values.get(i-1));

        return diffs;
    }
}
