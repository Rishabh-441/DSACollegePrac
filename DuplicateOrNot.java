package DSAPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DuplicateOrNot {
    public static void main(String[] args) throws IOException {
        Map<Integer,Integer> check = new HashMap<>();
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array: ");
        String[] stringNums  = bi.readLine().split(" ");
        int[] arr = new int[stringNums.length];
        for (int i = 0; i < stringNums.length; i++) {
            arr[i] = Integer.parseInt(stringNums[i]);
        }

        for (var x: arr) {
            check.put(x,0);
        }
        for (var x: arr) {
            check.put(x,check.get(x) + 1);
        }

        for (var x: check.keySet()) {
            if (check.get(x) > 1){
                System.out.println(x + " is present at positions : ");
                for (int i = 0; i < arr.length; i++){
                    if (arr[i] == x){
                        System.out.print(i + "\t");
                    }
                }
                System.out.println();
            }
        }
    }
}
