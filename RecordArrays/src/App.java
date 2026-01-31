import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

record DimensionData(List<Integer> values) {}

public class App {

    public static void main(String[] args) {
        Scanner lagay = new Scanner(System.in);


// wag mo nalang kompyahin kung takot kang ma zero ulit!!

        System.out.print(" dimensions: ");
        int numDimensions = lagay.nextInt();



        System.out.print(" base address (alpha): ");
        int baseAddress = lagay.nextInt();



        System.out.print(" element size: ");
        int elementSize = lagay.nextInt();





        System.out.println("\n");
        List<Integer> upperBoundsList = new ArrayList<>();
        for (int i = 0; i < numDimensions; i++) {
            System.out.print("UB for dimension " + i + ": ");
            upperBoundsList.add(lagay.nextInt());
        }
        DimensionData upperBounds = new DimensionData(upperBoundsList);





        System.out.println("\n");
        List<Integer> targetElementList = new ArrayList<>();
        for (int i = 0; i < numDimensions; i++) {
            System.out.print("Index at dimension " + i + ": ");
            targetElementList.add(lagay.nextInt());
        }
        DimensionData targetElement = new DimensionData(targetElementList);

        int offset = 0;
        for (int i = 0; i < numDimensions; i++) {
            int multiplier = 1;
            for (int j = i + 1; j < numDimensions; j++) {
                multiplier *= upperBounds.values().get(j);
            }
            offset += targetElement.values().get(i) * multiplier;
        }

        int address = baseAddress + (offset * elementSize);

        System.out.println("\noutput: " + address);
    }
}
