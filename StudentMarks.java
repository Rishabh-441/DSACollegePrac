package DSAPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StudentMarks {
    public static void main(String[] args) throws IOException {
        int[][] marks = new int[4][5];
        for (int i = 0; i < 4; i++) {
            BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter marks : ");
            String[] stringNums  = bi.readLine().split(" ");
            int[] arr = new int[stringNums.length];
            for (int j = 0; j < stringNums.length; j++) {
                arr[j] = Integer.parseInt(stringNums[j]);
            }
            marks[i] = arr;
        }

        //average marks obtained in each subject:
        System.out.println("average marks obtained in each subject:");
        System.out.println(Arrays.toString(subAvg(marks)));

        //average marks obtained by every student:
        System.out.println("average marks obtained by every student:");
        System.out.println(Arrays.toString(stuAvg(marks)));

        //no.of students who scored below 50 in their average:
        System.out.println("no.of students who scored below 50 in their average:");
        int total = 0;
        for (var x:stuAvg(marks)) {
            if (x < 50){
                total += 1;
            }
        }
        System.out.println(total);

        //scores obtained by every student:
        System.out.println("scores obtained by every student:");
        for (var x: marks) {
            System.out.println(Arrays.toString(x));
        }

    }
    public static float[] subAvg(int[][] marks){
        float[] arr = new float[marks[0].length];
        for (int i = 0; i < marks[0].length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                arr[j] += marks[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]/marks[0].length;
        }
        return arr;
    }

    public static float[] stuAvg(int[][] marks){
        float[] arr = new float[marks.length];
        int i = 0;
        for (var x: marks) {
            int avg = 0;
            for (var z: x) {
                avg += z;
            }
            arr[i] = avg/(x.length);
            i++;
        }
        return arr;
    }
}
