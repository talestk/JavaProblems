package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PickPeaks {
    public static Map<String,List<Integer>> getPeaks(int[] arr) {

        Map<String,List<Integer>> ans = new HashMap<>() {{
            put("pos", new ArrayList<>());
            put("peaks", new ArrayList<>());
        }};
        int posMax = 0;
        boolean matchAsc = false;

        // we start as index = 1 because we want to compare it to the previous entry
        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i-1] < arr[i]) {
                matchAsc = true;
                posMax = i;
            }

            // if we find the peak then we go ahead and add it to our hashmap
            if (matchAsc && arr[i-1] > arr[i]) {
                matchAsc = false;
                ans.get("pos").add(posMax);
                ans.get("peaks").add(arr[posMax]);
            }
        }
        return ans;
    }
}
