# Stack
**Resizing array vs Linked list**
- **Tradeoffs:** Can implement a stack with either resizing array or linked list; client can use interchangeably.
    - Linked-list implementation, if I want to guarantee each operation will be fast.
    - Resizing-array implementation, if I only care about the total amount of time consumed.
- Linked-list implementation
    - Every operation takes constant time in the worst case.
    - Uses extra time and space to deal with the links.
- Resizing-array implementation
    - Every operation takes constant amortized time.
    - Less wasted space.
    
## Stack applications
- compiler
    - Function call: push local environment and return address.
    - Return: pop return address and local environment.
- Arithmetic expression evaluation
    - (1+((2+3)*(4*5)))
    - Two-stack algorithm
        - Value: push onto the value stack.
        - Operator: push onto the operator stack.
        - Left parenthesis: ignore.
        - Right parenthesis: pop operator and two values; push the reuslt of applying that operator to those values onto the operand stack.