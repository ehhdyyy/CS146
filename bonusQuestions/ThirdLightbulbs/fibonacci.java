package bonusQuestions.ThirdLightbulbs;

public class fibonacci {
    
    public static int fibonacciNum(int n) {
        int prevPrev = 0, prev = 1, sum = 0;
        if(n <= 1){
            return n;
        }
        else{
            for(int i = 2; i < n; i++){
                sum = prev + prevPrev;
                prevPrev = prev;
                prev = sum;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int ans = fibonacciNum(7); //Fibonacci Sequence: 0,1,1,2,3,5,8,13,21
        System.out.println(ans);
    }
}
