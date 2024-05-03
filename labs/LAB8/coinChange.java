package labs.LAB8;
import java.util.*;

public class coinChange {
    
    public int coinChange(int[] coins, int amount) {
        int count = 0;
        int coinsLength = coins.length - 1;
        Arrays.sort(coins);

        if(amount % coins[coinsLength] == 0){
            return amount / coins[coinsLength];
        }
        if(amount < coins[0]){
            return -1;
        }

        while(amount != 0){
            
        }
        return count;
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;


    }
}
