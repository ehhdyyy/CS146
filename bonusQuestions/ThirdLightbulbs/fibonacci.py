def fibonacciNum(n):
    prevPrev, prev, sum = 0,1,0
    if n <= 1: return n
    else:
        for i in range(2,n):
            sum = prev + prevPrev
            prevPrev = prev
            prev = sum
    return sum

ans = fibonacciNum(7)
print(ans)