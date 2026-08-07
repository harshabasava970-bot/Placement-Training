
import java.util.Scanner;

class divisible5and7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No: ");
        int no = sc.nextInt();
        if (no%5!=0&&no%7==0){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
/
