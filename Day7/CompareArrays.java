import java.util.*;

class CompareArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of arrays: ");
        int no = s.nextInt();

        int[] arr1 = new int[no];
        int[] arr2 = new int[no];

      
        System.out.println("Enter elements for Array 1:");
        for (int i = 0; i < no; i++) {
            arr1[i] = s.nextInt();
        }

  
        System.out.println("Enter elements for Array 2:");
        for (int i = 0; i < no; i++) {
            arr2[i] = s.nextInt();
        }

        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Both arrays are not equal.");
        }

        s.close();
    }
}
/
