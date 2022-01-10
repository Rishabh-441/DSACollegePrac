package DSAPrac;

// Simple operations that we perform on array

// insert value into the array
// traverse/print the array
// accessing particular element from the array
// search for the element in given array
// delete a particular value from the array
// delete the entire array

import java.util.Arrays;
import java.util.Scanner;

// Integer.MIN_VALUE = -2147483648
// Integer.MAX_VALUE = 2147483647
//
public class Sdarray {
    int[] arr;
    // Array initialization using the constructor
    public Sdarray(int size)
    {
        arr = new int[size];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }
    public void traverse()
    {
        // you can use any looping structure ( either for loop or forEach loop or any other)

        // here i traverse the array by using the for each loop
        for (int res:arr) {
            System.out.println(res);
        }
    }
    // method to insert value in the array
    public void insert(int location, int value )
    {
        try
        {
            if(arr[location]== Integer.MIN_VALUE)
            {
                arr[location]= value;
            }
            else
            {
                System.out.println("already filled");
            }
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid index");
        }
    }
    // method to delete a particular index value from the array
    public void delete(int index) {
        int i = 0;
        try {
            for (i = index; i < arr.length - 1; i++)

                arr[i] = arr[i + 1];

            arr[i] = 0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid index");
        }
    }
    // method to access a particular element from the array
    public void accessingCell(int index)
    {
        try
        {
            System.out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index");
        }
    }
    // search for the element in the given array
    // in this method i will pass value and find that value inside the array
    public void searchInAnArray(int searchvalue)
    {
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == searchvalue)
            {
                System.out.println("value found at index= "+ i);
                return;
            }
        }
        System.out.println("value not found");
    }

    //Method to delete the entire array
    public void deleteArray()
    {
        // array are considered as reference data type in java programming language
        // to delete the array I am initializing it with null value
        arr = null;
        System.out.println("Array Deleted");
    }
}
class Check
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        Sdarray obj = new Sdarray(size);
        while(true){
            System.out.println("Enter the key according to the menu : ");
            System.out.println("1 : Insertion");
            System.out.println("2 : Traversal");
            System.out.println("3 : Deleting the a single element");
            System.out.println("4 : Searching in array");
            System.out.println("5 : Access the cell");
            System.out.println("6 : Deleting the whole array");
            System.out.println("7 : Exit");

            int x = sc.nextInt();
            if (x == 1){
                System.out.print("enter the index: ");
                int ind = sc.nextInt();
                System.out.print("enter the value: ");
                int val = sc.nextInt();
                obj.insert(ind, val);
            }
            else if (x == 2){
                obj.traverse();
            }
            else if (x == 3){
                System.out.print("enter the index no. to delete: ");
                int ind = sc.nextInt();
                obj.delete(ind);
            }
            else if (x == 4){
                System.out.print("enter the value that you want to search in array: ");
                int val = sc.nextInt();
                obj.searchInAnArray(val);
            }
            else if (x == 5){
                System.out.print("enter the index that you want to access: ");
                int ind = sc.nextInt();
                obj.accessingCell(ind);
            }
            else if (x == 6){
                obj.deleteArray();
            }
            else break;
        }

    }
}