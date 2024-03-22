# Homework 9 Markdown 

## Problem: Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

### Constraints:
* The number of nodes in the tree is in the range <code>[2,10<sup>5</sup>]</code>
* <code>-10<sup>9</sup> <= Node.val <= 10<sup>9</sup> </code>
* All values are unique
* `p != q`
* `p` and `p` will exist in the BST

***

```
Notes:
    - LCAofTwoNodes returns TreeNode
    - Three parameters: root, p, q
    - Recursively traverse binary tree until current node is between both p and q

Method/Function:
    Base Case: If root is null, return null
    If current node is less than both p and q, traverse to right child, recurse
    If current node is greater than both p and q, traverse to the left child, recurse
    Return root , covers case where p or q is parent and other is child

```


