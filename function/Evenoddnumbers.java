public class Evenoddnumbers {
        public static void main(String[] args) {
            System.out.println("Even numbers between 1 and 100:");
            for (int i = 2; i <= 100; i += 2) {
                System.out.print(i + " ");
            }
            
            System.out.println("\nOdd numbers between 1 and 100:");
            for (int i = 1; i <= 100; i += 2) {
                System.out.print(i + " ");
            }
        }
    }