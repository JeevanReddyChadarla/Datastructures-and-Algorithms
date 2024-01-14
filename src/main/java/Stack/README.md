# Stack

## theory

Use Case:
- Most Recently Used Element in O(1) Time


LIFO Order:
- Last In First Out 
(Last Inserted, First Deleted)


Real Life Example:
- Packet of Bread

OPEN:


____5____: TOP: PICK - Most Recently Used Element
____4____
____3____
____2____
____1____

100 Breads below 1


Breads are placed one above another in a Stack Order

First Bread: Top of Packet
5 Breads: 1 to 5

5th Bread on Top - Open the Packet - Access the 5th Bread First

To Access the Top Most Element (5th Bread)
------> No Iterations


TC: O(1): Constant Time

Not Dependent upon Stack Size

________________________________________________________________________________________________________________________

### ------> Applications:

(1) Ctrl + Z: Undo
    Ctrl + Y: Redo
    
STACK:

5 - TOP                     4 - TOP                      5 - TOP
4                           3                            4
3  Ctrl + Z (UNDO)          2  Ctrl + Y (REDO)           3
2   (POP)                   1                            2
1                                                        1


Ans: 2 Stacks : 1 Stack for Actual Data , 1 Stack for temp variables


Use of Storing temp values after popping from Stack -> RESTORE (Redo operation)



Ctrl + Z 
stack.pop();

5: Pushed into Temp Stack

Ctrl + Y
stack.push(temp);

 (2) Browser History/ Youtube History / Streaming History:
 (3) Recursion
 (4) Graphs Algo:BFS - Queues,DFS - Stacks

______________________________________________________________________________________________________________________

## Code - 

CODE:

import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("Stack Empty: " + st.isEmpty()); //true
        
        st.push(1); // insertion
        st.push(2);
        st.push(3); // top
        
        // Stack: TOP: 3 2 1
        System.out.println("Top Element: " + st.peek()); // 3
        System.out.println("Stack: " + st); // [1 2 3: TOP]
        System.out.println("Size: " + st.size()); // 3
        
        System.out.println("Popped Element: " + st.pop()); // 3
        
        // Stack: TOP: 2 1
        System.out.println("Top Element: " + st.peek()); // 2
        System.out.println("Stack: " + st); // [1 2: TOP]
        System.out.println("Size: " + st.size()); // 2
        
        System.out.println("Stack Empty: " + st.isEmpty()); //false
        
    }
}


### Questions:
- Reverse Array/String
- Balanced Parenthesis: Flipkart, Amazon, Google
- Variations of Balanced Parenthesis : Google
- NGE
- Area of Histogram/ Trapping Rainwater
