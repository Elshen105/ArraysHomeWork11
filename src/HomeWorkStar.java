public class HomeWorkStar {
    public static void main(String[] args) {

        int input = 5;

        for (int i = 0; i < input; i++) {
            for (int j = input - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = input - i - 1; k < input; k++) {
                System.out.print("*");
            }
            for (int t = input - i; t < input; t++) {
                System.out.print("*");
            }



            System.out.println();



        }

    }
}
