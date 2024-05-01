# Lab 2 Markdown

## Problem: Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise

```
isAnagram function/def:
    -If length of string s and t are not equal, return false
    -Else:
        -Lower case both string
        -Create a char array for both strings
        -Sort both strings in ascending order
        -Iterate for length of sArray or tArray
            -If the current index of sArray and tArray are not equal, return false
    -Return true
```