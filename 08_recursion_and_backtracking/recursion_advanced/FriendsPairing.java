import java.util.Scanner;

// Program to calculate total ways to invite friends where each friend can come alone or pair up
public class FriendsPairing {

    // Recursive method to count invitation ways for 'num' friends
    public static int invitationWays(int num) {
        if (num <= 1) {
            return 1; // Base case: 1 friend or none → only 1 way (single or empty)
        }

        int way1 = invitationWays(num - 1); // Friend comes alone

        // Friend pairs up with any of the (num-1) friends,
        // and remaining (num-2) friends invited recursively
        int way2 = (num - 1) * invitationWays(num - 2);

        return way1 + way2; // Total ways: single + pair scenarios
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Number of friends: ");
        int num = sc.nextInt(); // Read number of friends
        sc.close(); // Close scanner

        System.out.println("Total ways to invite '" + num + "' friends: " + invitationWays(num));
    }
}
