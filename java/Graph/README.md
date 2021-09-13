# Graphs
## A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph
## Challenge
## Implement a graph data structure

## Approach & Efficiency
## The Graph class itself utilizes an ArrayList of Nodes to be able to easily access a Node and it's properties. Within each Node is its value and an ArrayList of its neighbors, stored as Edges. An Edge holds a pointer to the neighbor for the Node it belongs to, as well as a weight (if provided. Default is 0). With this implementation, each method within the graph class takes O(1) time and space as they utilize the methods on Lists.
## API
## getNodes
### Takes in no arguments, returns an ArrayList of all the Nodes within the Graph.

## getNeighbors
### Takes in a single Node as an argument, and returns an ArrayList of neighbors for that Node, where each value is an Edge that points to a neighbor.

## size
### Takes in no arguments and returns the total number of Nodes in the Graph

## addNode
### Takes in a value and creates a new Node with that value and adds it to the Graph. Returns the new Node.

## addEdge
### Takes in two unique Nodes that are in the Graph as arguments, and can optionally take in an integer value for a weight. It will add an Edge to each of the provided Nodes list of neighbors. If a weight is not specified, the weight will be set to 0 by default. Will throw an exception if the Nodes provided are not both in the graph or are the same Node.

# Breadth First Graph
### Within the Graph class, add a method that takes in a root Node and performs a breadth first traversal from that Node and returns a list of all the Nodes visited.

## Approach & Efficiency
### The approach taken for this method was to utilize a List of Nodes to be returned, a Set of Nodes that had already been seen while traversing, and a Queue to maintain the order of traversal. Starting from the root, it is added to the Queue and the Set of seen Nodes. The algorithm then loops while the Queue is not empty, dequeuing the front value, adding it to the List to return, and then iterating over its list of neighbors. Each neighbor Node is checked to see if it's in the Set of already seen Nodes, and if it is not, then that Node is added to the queue and the Set of seen Nodes. Once the Queue is empty, the List of Nodes is returned. This solution takes both O(n) space and time, as it has to iterate over each Nodes neighbors, and utilize multiple other data structures to track all relevant information.
