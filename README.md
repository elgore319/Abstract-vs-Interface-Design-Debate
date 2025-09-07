# Abstract-vs-Interface-Design-Debate

Level 1:
    *Abstract class Shape is created with a getName(), getArea(), describeProperties(), and draw() methods.

    *The abstract class has the properties of color and name.

    *Created 2 subclasses Circle and Rectangle. and added extented the abstratct classes.

    *Created interfaces Drawable, Calculable and Describable. And implemented them into the concrete classes.

Honestly I don't see the point in using interfaces in this assignment. Aren't interfaces only to be used if there is a method that is needed to be used but isn't able to fit all subclasses but it also doesn't have a specific behavior of just one subclass, so it cannot be used in the abstract class or a singular subclass. So an interface is created to fill the gap. All methods in this assignment are applicable to all the subclasses, so the methods should be in an abstract class. All shapes can be drawn, areas calculated, named, and described.

The abstract class makes a better use of these methods, makes the code more simple without the need to import and implement a interfaces just to use a method that could have been in the abstact class. So the Abstract class scales better for our specific situation and would be the better approach in a real system.

No AI was used in this assignment.

Level 2:

    * A third shape, Triangle, was added. and all abstract methods and interface was added to the subclass.

I don't know if im just not getting it but polymorphism wasnt necessary in this assignment. other than the use of abstract class methods being overrided and used in subclasses. I think keeping it simple and keeping all the methods in the Abstract class would have been a better idea, instead of using interfaces. that would make this code more maintainable. i guess.

Level 3: 

    * Files were packaged into Interfacedesign, Abstractdesign, Shapes and Main. A main class never specified in the assigment, but I added one anyways. How else would you know if your methods are working as intended?

    *Added JavaDoc

How to run each version? I didn't do the assignment as told on canvas, i didn't see that i was supposed to do the assignment twice (i think), but i can compare interfaces and abstract classes regardless. I've already explained why abstract classes are better for this assignment and that interfaces are unnecessary for all methods used are applicible to all concrete classes, so an abstract class would be better.

For running the abstract class version, you would have an abstract class with the getArea, getName, draw and describe methods, and 3 subclasses that extends the abstract one. and a main for running commands.

For running the interface version, you would have 3 interfaces, drawable, calculable, and Describable and the 3 concrete classes that implement the interfaces and override their methods for use. and then create a main class to create objects and call methods.

Abstract would be easier than interfaces adn generally neater as you will have less files to manage and less time spent importing and implementing the inferfaces into all concrete classes.

No Ai was used in this assignment.