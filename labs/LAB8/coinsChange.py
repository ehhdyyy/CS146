class coinChange:
    def coinChanges(coinsList, amount):
        coinsList.sort()

        minCoinsPerAmount = [float('inf')] * (amount + 1)

        minCoinsPerAmount[0] = 0

        for i in range(1, amount + 1):
            for c in coinsList:
                if i - c < 0:
                    break
                if minCoinsPerAmount[i-c] != float('inf'):
                    minCoinsPerAmount[i] = min(minCoinsPerAmount[i],minCoinsPerAmount[i-c] + 1)
        return minCoinsPerAmount[amount] if minCoinsPerAmount[amount] != float('inf') else -1            
    

coins = [12,13,1,0]
amount = 12

test = coinChange
print("Minimum Coins: " + str(test.coinChanges(coins,amount)))