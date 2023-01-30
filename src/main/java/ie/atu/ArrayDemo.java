package ie.atu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arrays;
        int i,g;
        arrays = new int[10];

        Scanner input = new Scanner(System.in);

        for(g = 0; g<=10; g++)
        {
            try{
                System.out.println("Enter a number: ");
                arrays[g] = input.nextInt();
            }
            catch(ArrayIndexOutOfBoundsException aiob)
            {
                System.out.println("  index 10 isn't filled    \n");
            }
        }

        for(i=0; i<10; i++)
        {
            System.out.println("Element at index " + i + ": " +arrays[i]);
        }

    }
}
