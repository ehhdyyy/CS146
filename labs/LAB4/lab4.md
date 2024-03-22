# Lab 4 Markdown 

## Problem: Given the `root` of a binary tree, invert the tree and return *its* root


```
Notes:
    - invertTree returns root
    - Parameter: root
    - Recursively traverse binary tree and swap left and right TreeNodes

Method/Function invertTree:
    Base Case: If root is null, return root
    Swapping:
        Create temp variable
        Set temp variable equal to left child node
        Set left child equal to right child node
        Set right child equal to left child node (temp variable)
    Return root
```