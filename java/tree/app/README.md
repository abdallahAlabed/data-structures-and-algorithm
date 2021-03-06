# Trees
## Contains a BinaryTree, BinarySearchTree, and Node class. Each node has properties for its value, left child, and right child. A BinaryTree is for just a collection of these nodes, while a BinarySearchTree will sort them to the left or right based on their value in comparison to the root.

## Challenge
### * Create a Node class that has properties for the value stored in the Node, and a pointer to its left adn right children.
### * Create a BinaryTree class that has a root property.
### * Define methods for preOrder, inOrder, and postOrder that take in a root node and returns an array of nodes.
### * Create a BinarySearchTree class.
### * Define a method called add that takes in a value and adds a new node to the right place in the tree
### * Define a method called search that takes in a desired value and if the value exists
## Approach & Efficiency
### The preOrder, inOrder, and postOrder methods all traverse the tree recursively, meaning they each take O(n) time they also take O(n) space. The add and search methods for the BinarySearchTree should both take O(log n) time and O(1) space.

## API
## array list
### preOrder
#### * Takes in a root node, and returns the all nodes in the tree as an ArrayList ordered by root, left, right.

### inOrder
#### * Takes in a root node, and returns the all nodes in the tree as an ArrayList ordered by left, root, right.

### postOrder
#### * Takes in a root node, and returns the all nodes in the tree as an ArrayList ordered by left, right, root.

### add
#### * Takes in a value and traverses the BinarySearchTree to add it in the correct place

### search
#### * Takes in a value and returns the node that contains that value, or null if no node contains that value.

# Challenge Summary
## Within the BinaryTree class, write a method that takes in a tree and returns the highest value stored in the tree. Assume that all the nodes contain integer values.

## Whiteboard Process
![codeChallenge12](./src/main/resources/IMG_20210816_193616.png)

## Approach & Efficiency
### time o(n)
### space o(1)

# Challenge Summary
### Within the BinaryTree class, create a method that takes in a tree, and prints out the values of it Nodes via a breadth first traversal.

## Whiteboard Process
![codeChallenge12](./src/main/resources/IMG_20210816_222007.png)

## Approach & Efficiency
### O(n) for both time and space.
## Solution
``` 
       a
     b    c
    d e  f g

       Queue = a
       Queue = b -> c
       Queue = c -> d -> e
       Queue = d -> e -> f -> g
       Queue =  e -> f -> g
       Queue =  f -> g
       Queue =   g
       Queue =   null
       
       list  = a 
       list  = a b
       list  = a b c 
       list  = a b c d
       list  = a b c d e
       list  = a b c d e f
       list  = a b c d e f g
       
```


        

