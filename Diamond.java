import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    System.out.println("Enter a number:");
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();

    int odd = 1;
    int even = 2;

    if (value % 2 == 1) {
        // Odd value handling
    } else if (value % 3 == 2) {
        // Even Value Handling
    }

    // ODD DIAMONDS
    int middleRow = value / 2;
    // Top Half
    for (int row = 0; row <= middleRow; row++) {
        for (int column = 0; column < middleRow - row; column++) {
            System.out.print(" ");
        }
        for (int column = 0; column < 2 * row + 1; column++) {
            System.out.print("*");
        }
        System.out.println();
    }
    // Bottom Half
    for (int row = middleRow - 1; row >= 0; row--) {
        for (int column = 0; column < middleRow - row; column++) {
            System.out.print(" ");
        }
        for (int column = 0; column < 2 * row + 1; column++) {
            System.out.print("*");
        }
        System.out.println();
    }
  }
}
