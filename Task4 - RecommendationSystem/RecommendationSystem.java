
import java.util.*;

public class RecommendationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] movies = {
                "Avengers",
                "Interstellar",
                "Bahubali",
                "KGF",
                "Inception"
        };

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Sci-Fi");
        System.out.println("3. Drama");

        int choice = sc.nextInt();

        System.out.println("\nRecommended Movies:");

        switch (choice) {

            case 1:
                System.out.println(movies[0]);
                System.out.println(movies[3]);
                break;

            case 2:
                System.out.println(movies[1]);
                System.out.println(movies[4]);
                break;

            case 3:
                System.out.println(movies[2]);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
