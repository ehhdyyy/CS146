# Lab 8 Markdown

## Problem: You are given an integer array `coins` representing coins of different denominations and an integer `amount` representing a total amount of money. 

### Return: *Fewest number of coins* you need to make up that *amount.* If that amount of money cannot be made up by any combination of coins, return -1

### Insights: 
* Dynamic Programming Problem, Greedy Algorithm will not work
* Memoization - Storing the minimum coins for each cost until the amount 

***

```
Method/Function (coinChanges):
    >Param: int[] coins, int amount

    -Sort the array of coins
    -Created an array of amount + 1 length
    -Set array[0] = 0, To make 0 amount, you don't need any coins
    -Set the rest of the array with max integer value

    -For Loop iterating for amount + 1 times, starting at index 1
        -For each loop for each coin in coins array 
            -If c is a coin where i (current amount) - c < 0, break
            -If arr[i-c] is not MAX INT
                -arr[i] = min value between (arr[i] and arr[i-c] + 1)
    -Return arr[amount] if not equal to MAX INT, else return -1

```