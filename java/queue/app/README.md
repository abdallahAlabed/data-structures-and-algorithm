# Challenge Summary
## Implement a Pseudo Queue class that acts just like a Queue but operates internally using two stacks. It should include an enqueue and dequeue method that work under the first in first out basis.
## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency
The Big O efficiency for this method is O(n) time and space.

![codeChallenge11](./src/main/resources/IMG_20210809_025637_edit_197615624818283.jpg)
## Solution
"NULL"
pseudoQueue.enqueue(1);
"[1]->NULL"
pseudoQueue.enqueue(2);
"[2]->[1]->NULL"
pseudoQueue.enqueue(3);
"[3]->[2]->[1]->NULL"
pseudoQueue.enqueue(4);
"[4]->[3]->[2]->[1]->NULL"
pseudoQueue.dequeue();
"[4]->[3]->[2]->NULL"