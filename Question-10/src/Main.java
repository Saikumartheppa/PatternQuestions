public class Main {
    public static void main(String[] args) {
//        Given n = 5.You have to print the output given below.
//                  * 	*	*	*	*	*	*	*	*
//                    	*	*	*	*	*	*   *
//                          *   *   *	*	*
//                              *   * 	*
//                                  *
        int n = 5;
        int star = n * 2 - 1;
        int space = 0;
        for(int i = 0; i < n; i++){
            for(int s = 0; s < space; s++){
                System.out.printf("\t");
            }
            for(int s = 0; s < star;s++){
                System.out.printf("*\t");
            }
            star -= 2;
            space++;
            System.out.println("\t");
        }
    }
}