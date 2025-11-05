import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO A1: Create a File object for "products.txt"
        //double count=0;
        File myFile= new File("products.txt");
        // TODO B1: Create a Scanner to read from the file
        Scanner input = new Scanner(myFile);
        // TODO C1: Print "Product List:"
       try{
        System.out.println("Product List: ");
        // TODO C2: Use a while loop to read each product name and print it
        double Count=0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
            Count++;
        }
        // TODO D1: Keep track of how many products were listed

        // TODO D2: After the loop, print "Total products: <count>"
        System.out.println("Total products: " + Count);
       } catch (Exception e) {
           // TODO C1: Print "File not found!" if grades.txt is missing
           System.out.println("File not found");
       }

    }
}

