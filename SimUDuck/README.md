# SimUDuck
SimUDuck is an example for introduction to design pattern. It is based on following principle: 

Design Principle: "Identify the aspects of your application that vary and separate them from what stays the same". It loosely translates to take what varies and encapsulate it so it will not affect the rest of your code. The result? fewer unintended consequences from code changes and more flexibility in your systems!

Also 

Design Principle: "Program to an interface, not an implementation". That is in this example you can see the Duck behaviors will live in a separate class that implements a particular behavior interface. That way, the Duck classes will not need to know any of the implementation details for their own behaviors.
