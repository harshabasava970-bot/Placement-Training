import java.util.Scanner;

public class Dec2Bin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int num = sc.nextInt();

		if (num == 0) {
			System.out.println("Binary is : 0");
			return;
		}

		boolean negative = num < 0;
		int n = Math.abs(num);

		StringBuilder bits = new StringBuilder();
		while (n > 0) {
			int bit = n % 2;
			bits.append(bit);
			n = n / 2;
		}

		String binary = bits.reverse().toString();
		if (negative) {
			binary = "-" + binary;
		}

		System.out.println("Binary is : " + binary);
	}
}
/
