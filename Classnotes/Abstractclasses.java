/*
sometimes it is useful to declare classes fro which you never intend to create objects
used only as superclasses in inhertitance hierarchies, so they are sometimes called abstract superclasses.
cannot be used to instantiate objects
*/

/* Concrete classes:

Classes that can be used to instantiate objects
*/
/* Abstract keword:
you make a class abstract by declaring it with keword abstract */

public abstract class Shape { // abstract class
  ...

}

/*
an abstract class normally contains one or more abstract methods

abstract method do not provide implementations  */

/*why a static method could not be an abstract?
if you use a static method you don't need to instantiate any objects*/

/* getClass()  method
every object knows its own class and can acces this information through the getClass method,
which all classes inherit from class object.

The getClass method returns an object of type class
*/

/* Final methods:
a final method in a superclass cannot be overriden in a subclass
- methods that are declared private re implicitly final, because, it's not possible to override them in a subclass.
- methos that are declared static are implicitly final
- a final method's declaration can never change, so all subclasses use the same method implementation, and calls to final
methods are resolved at compile time - this is known as static blinding

*/


/*Final Classes

A final class cannot be extended to create a subclasse
- all methods in a final class are implicitly final
- Attempting to declare a subclass of a final class is a compilation error.
*/
