import java.util.Scanner;

class bignumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter a: ");
    int a = sc.nextInt();
    System.out.print("Enter b: ");
    int b = sc.nextInt();
    System.out.print("Enter c: ");
    int c = sc.nextInt();
    System.out.println(a>b && a>c?"a is big":b>c?"b is big":"c is big");
    }
}
/
