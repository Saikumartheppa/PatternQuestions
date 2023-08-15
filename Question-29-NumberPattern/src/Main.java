public class Main {
    public static void main(String[] args) {
//       Given int n = 5.You have to print the output as given below.
//                            1
//                        2   0   2
//                    3   0   0   0   3
//                4   0   0   0   0   0   4
//            5   0   0   0   0   0   0   0   5

        int n = 5, num = 1;
        for(int i = 1; i <= n; i++){
            for(int s = 1; s <= n - i; s++){
                System.out.printf("\t");
            }
            for(int j = num; j >= 1; j--){
                if(j == i) {
                    System.out.print(i);
                    System.out.printf("\t");
                }else{
                    System.out.printf("0\t");
                }
            }
            if(i >= num / 2){
                for(int j = 1; j < i ; j++) {
                    if (j == i - 1) {
                        System.out.print(i);
                        System.out.printf("\t");
                    }else{
                        System.out.printf("0\t");
                    }
                }
            }
            num++;
            System.out.println();
        }
    }

}