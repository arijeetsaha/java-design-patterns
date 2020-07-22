### Command Design Pattern

1. Represent a request or method call as an object. Information about parameters passed and the actual operation is encapsulated in an object called command.

####Advantage

1. What would have been a method call is now an object which can be stored for later execution or sent to other parts of the code.

2. We can queue our command objects and execute them later.


#####Steps

1. Write Command Interface - which defines method which executes the command.

2. Need to implement this in concrete classes for each request or operation type we want to implement.
Command needs to support undo operation if the system needs it.

3. Client creates the command instance and sets up receiver and all required parameters.

4. Command instance gets ready to be sent to other parts of the code.

5. Invoker is the code which actually uses command instance and invokes the execute on the command.


####Example

####Order Management System

An order can be in different states like - New, Paid, InTransit, Cancelled.

There are different functionalities of order depending on its current state and there is transition of order between states.


#####Design Considerations

1. Support "undo" and "redo" functionality. Really useful for systems with complex user interactions.

2. If command simply hides functinaly and its argument, we can reuse same command object for same type of request if the request objects are immutable.

3. Commands can inherit from other commands to resuse portions of code.

4. "Macro" commands can be created which is a composition of multiple commands. whjich will be executed in sequence.

5. "Undo" feature can make use of "memento" pattern



#####Example

java.lang.Runnable 


#####Pitfalls

1. When it comes to returning values and error handling with command.

2. Error handling is diff to implement without coupling the command with the client.

3. Invoker is running in a diff thread, error handling and returning values is more complicated.



