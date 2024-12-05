public class Driver {

    public static void border() {
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 80; j++) {
                if (i == 0 || i == 29 || j == 0 || j == 79) {
                    Text.color(Text.CYAN + 10);


                    System.out.print("*");
                    System.out.print(Text.RESET);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printRandomNumbers() {
        int[] randomNumbers = new int[3];
      for(int i = 0; i < 3; i++){
        randomNumbers[i] = (int) (Math.random() * 100);
      }


        Text.go(2, 1);

        for (int i = 0; i < 3; i++) {
            if (randomNumbers[i] < 25) {
                Text.color(Text.RED + 60);
            } else if (randomNumbers[i] > 75) {
                Text.color(Text.GREEN + 60);
            } else {
                Text.color(Text.WHITE);
            }
            System.out.print("   " + randomNumbers[i]);
        }
        System.out.print(Text.RESET);
        System.out.println();
    }

    public static void printSeparator() {

        Text.go(2, 1);

        for (int i = 1; i < 80; i++) {
            Text.color(Text.CYAN + 10);
            System.out.print("-");
        }
        System.out.println();
    }

    public static void moveCursorToLine31() {
        Text.go(31, 1);
    }

    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        border();
        printRandomNumbers();
        printSeparator();
        moveCursorToLine31();

        System.out.println(Text.RESET);
        System.out.print(Text.SHOW_CURSOR);
    }
}
