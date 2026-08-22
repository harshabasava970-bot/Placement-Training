import java.util.*;

class Accenture_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = 10;  // Jar capacity
        int K = 5;   // Minimum candies
        int jar = N;

        int order = sc.nextInt();

        if (order <= 0 || order > jar) {
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF CANDIES LEFT : " + jar);
        }
        else {
            jar = jar - order;

            // Refill jar if candies go below K
            if (jar < K) {
                jar = N;
            }

            System.out.println("NUMBER OF CANDIES SOLD : " + order);
            System.out.println("NUMBER OF CANDIES AVAILABLE : " + jar);
        }

        sc.close();
    }
}
