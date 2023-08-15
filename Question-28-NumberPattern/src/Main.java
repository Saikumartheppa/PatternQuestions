public class Main {
    public static void main(String[] args) {

//        Given int n = 5.You have to print the output as given below.
//                            1
//                        2   3   2
//                    3   4   5   2   3
//                4   5   6   7   2   3   4
//            5   6   7   8   9   2   3   4   5
        int n = 7, num = 1;
        for(int i = 1; i <= n; i++){
            for(int s = 1; s <= n - i; s++){
                System.out.printf("\t");
            }
            printNumbers(i,num);
            if(i >= num / 2)
                printNumbers(i,num - 1);
            num += 2;
            System.out.println();
        }
    }
    private static void printNumbers(int i ,int num) {
        for(int j = i; j <= num; j++){
            System.out.print(j);
            System.out.printf("\t");
        }
    }
}