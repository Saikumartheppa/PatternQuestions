public class Main {
    public static void main(String[] args) {

//        Given int n = 5.You have to print the output as given below.
//                          1
//                      2 	3	2
//                  3   4   5	4	3
//              4	5	6	7	6	5	4
//          5   6   7	8	9	8	7	6	5


//        int n = 5, num = 1;
//        for(int i = 1; i <= n; i++){
//            for(int s = 1; s <= n - i; s++){
//                System.out.printf("\t");
//            }
//            for(int j = i; j <= num; j++){
//                System.out.print(j);
//                System.out.printf("\t");
//            }
//            if(i >= num / 2) {
//                for (int j = num - 1; j >= i; j--) {
//                    System.out.print(j);
//                    System.out.printf("\t");
//                }
//            }
//            num += 2;
//            System.out.println();
//        }
        int n = 5,non = 1;
        for(int i = 0; i < n; i++){
            int num = i + 1;
            for(int s = 1; s < n - i; s++){
                System.out.printf("\t");
            }
            for(int j = 0; j < non; j++){
                System.out.print(num);
                System.out.printf("\t");
                if(j < non / 2) num++;
                else num--;
            }
            non += 2;
            System.out.println();
        }
    }
}