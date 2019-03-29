package problems;

import java.io.*;
import java.util.*;
import java.util.HashMap;
/**
 * 
 * @author Mounika Reddy
 *
 */
public class Sparse_Arrays {
	/**
	 * For each query string, we are determining how many times it occurs in the list of input strings 
	 * and storing in frequency array.
	 * @param strings
	 * @param queries
	 * @return array of  frequency 
	 */
      static int[] matchingStrings(String[] strings, String[] queries) {
        HashMap<String,Integer> hm=new HashMap<>();
        int[] frequency=new int[queries.length];
        for(int i=0;i<strings.length;i++)
        {
            hm.put(strings[i],hm.getOrDefault(strings[i],0)+1);
        }
        for(int i=0;i<queries.length;i++)
        {
            frequency[i]=hm.getOrDefault(queries[i],0);
        }
        return frequency;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
