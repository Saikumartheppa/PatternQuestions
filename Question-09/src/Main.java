public class Main {
    public static void main(String[] args) {
//        Given  n = 5. You need to print the output given below.
//                            *
//                        *   *   *
//                    *   *   *   *   *
//                *   *   *   *   *   *   *
//            *   *   *   *   *   *   *   *   *
        int n = 5;
        int space  = n - 1;
        int star = 1;
        for(int i = 0; i < n; i++){
                for(int s = 0; s < space; s++){
                    System.out.print("\t");
                }
                for(int st = 0; st < star; st++){
                    System.out.print("*\t");
                }
                    star += 2;
                    space--;
            System.out.println();
        }
    }
}