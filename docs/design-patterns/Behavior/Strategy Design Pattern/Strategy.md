### Design Pattern

1. Allows encapsulate algorithm in a class

2. Define separate algorithms in separate classes.

3. Helpful if many possible variations of an algorithms

4. Applicability indication -
If we have multiple diff algorithms/behaviors in our methods selected with conditional statements (if-else or switch)

5. Implemented in an inheritance hierarchy so that any implementation can be chosen and it works on the main context as the interface is same for all implementations.


#####Design Considerations

1. Strategy does not have any state in it. COntext provides it with all the data.

2. Context class provides a way to configure it with one of the strategy implementation.

3. We can implement our context where strategy object is optional. We can have default implementation provided.

4. If lot of arguments need to be provided to the strategy objects, we can pass an interface reference to the strategy.

5. Strategies are stateless objects which make them perfect candidates for sharing between context objects.

6. Can make use of inheritence to factor out common functionalities by keeping it in base classes.


#####Example

java.util.Comparator

