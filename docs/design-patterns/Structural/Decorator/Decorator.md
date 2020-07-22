####Decorator

1. When we want to enhance the behavior of our existing object dynamically as and when required.

2. Decorator wraps an object within itself and provides same interface as wrapped object.
So client of original object does not need to change.

3. Decorator provides alternative to subclassing for extending functionality of existing classes.


#####Implementation

1. Component defines interface needed or used by client.

2. Concrete Component implements the component.

3. We define our decorator. Decorator implements the component and has a reference to the concrete component.

4. In decorator methods, we provide additional behavior on top f the behavior provided by concrete component.

5. Decorator can be abstract class as well.


