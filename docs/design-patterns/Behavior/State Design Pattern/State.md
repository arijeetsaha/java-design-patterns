### State Design Pattern

1. Allow objects to behave differently based on the internal state.

2. Define state specific behaviors in separate classes.

3. Operations defined in the class delegate to the current state object's implementation of that behavior.

4. State transitions can be triggered by states themselves - Each state knows about atleast one other state's existence.

####Advantage

New state/behavior can be added without changing the main class.

Client will not aware of the state and it interacts with the main class.

####Example

####Order Management System

An order can be in different states like - New, Paid, InTransit, Cancelled.

There are different functionalities of order depending on its current state and there is transition of order between states.


#####Design Considerations

1. Client can configure context with initial state. After that, the state transition is handled by states or context.

2. We can share states which do not have any instance variables and only encapsulate behavior specific to that state. 
This is done using FlyWeight pattern.

3. State design pattern != State Machine

State Machine -> Focus on state transitions based on input and using tables to map these inputs to states.

State Design Pattern -> Provide behavior specific to state of context object

