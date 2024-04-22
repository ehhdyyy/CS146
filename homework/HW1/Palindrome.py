import re
class Palindrome:

    def isPalindrome(s):
        s = s.lower()
        s = re.sub("[^a-z0-9]", "", s)
        print(s)
        length = len(s)
        palindrome = True

        for i in range(length//2):
            if s[i] != s[length -1 - i]:
                palindrome = False
                break
        
        return palindrome
    
myPalindrome = "@#!aaaBbaaa"
print("Palindrome: ", Palindrome.isPalindrome(myPalindrome))
        
