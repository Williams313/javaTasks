

public class PatternDisplay2 {
    public static void main(String[] args) {
        String[][] array = {
            {"X", "0", "X"},
            {"0", "0", "0"},
            {"X", "0", "X"}
        };

            for (int i = 0; i < array[0].length * 3 + 3; i++) {
          }

        System.out.println();

            for (String[] row : array) {
            System.out.print("| ");
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println("|");
        }
      }
}



