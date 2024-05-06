package labs.LAB8;
import java.util.*;

public class coinChange {
    
    public int coinChanges(int[] coins, int amount) {
        
        Arrays.sort(coins);

        int[] minCoinsPerAmount = new int[amount + 1];
        Arrays.fill(minCoinsPerAmount, Integer.MAX_VALUE);
        minCoinsPerAmount[0] = 0;

        for(int i = 1; i <= amount; i++){
            for(int c : coins){
                if(i - c < 0){
                    break;
                }
                if(minCoinsPerAmount[i-c] != Integer.MAX_VALUE){
                    minCoinsPerAmount[i] = Math.min(minCoinsPerAmount[i], minCoinsPerAmount[i-c] + 1);
                }
            }
        }
        return minCoinsPerAmount[amount] != Integer.MAX_VALUE ? minCoinsPerAmount[amount] : -1;

    }

    public static void main(String[] args) {
        int[] coins = {3,2,5,10};
        int amount = 13;
        
        coinChange test = new coinChange();
        System.out.println("Minimum Coins: " + test.coinChanges(coins,amount));
    }
}

