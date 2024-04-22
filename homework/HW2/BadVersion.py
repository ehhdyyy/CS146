class BadVersion:

    def firstBadVersion(n):
        low = 1
        high = n
        while low <= high:
            mid = low + (high - low) / 2

            if(isBadVersion(mid) == True and isBadVersion(mid - 1) == False): return mid
            elif(isBadVersion(mid) == True): high = mid
            else: low = mid + 1
        return -1
    
