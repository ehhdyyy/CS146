class Anagram:

    def isAnagram(s,t):
        if len(s) != len(t):
            return False
        else:
            s = s.lower()
            t = t.lower()

            sArray = [char for char in s]
            tArray = [char for char in t]

            sArray.sort()
            tArray.sort()

            for i in range(len(sArray)):
                if sArray[i] != tArray[i]: return False
        return True
    
s = "dog"
t = "gcd"

print(Anagram.isAnagram(s,t))
        