###Chain of responsibility

1. Avoids coupling between code which send the request and the code which handles the request.

2. We create objects which are chained together by one object knowing reference of object which is next in the chain.
We give request to first object in the chain, if it is not handled, it simply passes the request down the chain.


####Implementation

1. Handler must define a method to accept incoming requests.

2. Handler can define method to access successor in chain. If its abstract class then we can evenmaintain successor.

3. Concrete handler should check if it can handle the request. If not, it should pass the request to next handler.

4. We create the chain of objects. We can do this in client.

5. Client needs to know only the first object i the chain. It will pass the request to this object.


####Implementation COnsideration

1. Define handler as interface as it allows you to implement.

2. Handlers can allow the request to propagate even if they handle the request. 
Servlet filter chain allows request to flow to next filter even if they process the request.

3. Chain can be described using XML or JSON as well so that one can add or remove handlers from chain without code modification.


####Example

Logger
Servlet Filters

