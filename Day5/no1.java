import java.util.Scanner;
class no1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No: ");
        int no = sc.nextInt();
        int sum=0;
        for (int i = 0; i <= no; i++) {
            sum=sum+i ;
        }
        System.out.println("Sum of Natural Numbers: "+ sum);
    }
}
/
