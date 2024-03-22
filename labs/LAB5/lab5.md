# Lab 5 Markdown 

## Problem: Given the `root` of a binary tree, determine if it is a valid binary search tree (BST)

### Definition of BST: 
* The left subtree node contains only nodes with keys **less than** the node's key
* The right subtree node contains only nodes with keys **greater than** the node's key

***

```
Notes:
    - isValidBST returns boolean
    - Parameter: root
    - Check if current node is greater than root on right subtree
    - Check if current node is less than root on left subtree


Method/Function isValidBST:
    Call other method
    Create another method with 3 parameters: root, min, max:
        Base Case: If root is null, return True
        If Statement:
            Checks if there is min and if current node is less than min
            Checks if there is max and if current node is greater than max
                If one is false, return false
        Return recursion, travel both sides of tree, connect with and(&&)
            -For left, set max as node value
            -For right, set min as node value

```