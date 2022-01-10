package DSAPrac;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Company{
    int products[];

    public Company(int[] products) {
        this.products = products;
    }

    public int totalProd(){
        int total = 0;
        for (var i: products) {
            total += i;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Company{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
public class SalesComp {
    public static void main(String[] args) throws IOException {
        Company salesman[] = new Company[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the sales of 3 items sold by salesman " + i+1 + ": ");
            BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

            // Custom integer array of size 5
            int num[] = new int[3];
            // Array of string type to store input
            String[] strNums;

            // Reading input a string
            strNums = bi.readLine().split(" ");

            for (int j = 0; j < strNums.length; j++) {
                num[j] = Integer.parseInt(strNums[j]);
            }
            salesman[i] = new Company(num);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Total sales by salesman " + i+1 + ": " + salesman[i].totalProd());
        }
        int items[] = new int[3];
        for (var x: salesman) {
            items[0] += x.products[0];
            items[1] += x.products[1];
            items[2] += x.products[2];
        }

        for (var x: items) {
            System.out.println(x);
        }
    }
}
