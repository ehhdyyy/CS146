# Homework 2 Markdown

## Problem: Suppose you have `n` versions `[1,2,3, ..., n]` and you want to find out the first bad one, which causes all the following ones to be bad. You are given an API `bool isBadVersion(version)` which returns whether `version` is bad. Implement a function to find the first bad version. 

```
Method/Function (firstBadVersion(int n))
    -Create low and high variables (1 and n)
    -Iterative binary search implementation:
        -While loop when low is less than high
            -Get mid of low and high
            -If isBadVersion(mid) is true (a bad version) and previous is not
                -Return mid
            -Else If isBadVersion(mid) is true, make high equal to mid
            -Else low equals mid + 1
    -Return -1 if no bad versions found

```