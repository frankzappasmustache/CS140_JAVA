# Self-Check Chapter 8

## Self-Check 2
---
### What is an object? How is an object different from a Class?
> An object is a programming entity that contains state (data) and behavior (methods).  
> A class is like a blueprint for an object, containing information on what kind of data  
> it will contain, how the object will behave, and how the object will be constructed.  
## Self-Check 5
---
### Imagine that you are creating a class called Calculator. A Calculator object could be used to program a simple mathematical calculator device lik eht eones you have used in math classes in school. What state might a Calculator object have? What might its behavior be?
> I imagine that the caluclator state(data) would store the current numbers being entered, and  
> probably store the results of previous calculations so that one could use them as part of their  
> current calculation. It's behavior(methods), assuming it is a basic calculator, might include  
> multiplication, division, addition, substraction, and a method to clear the current memory if you  
> want to start a fresh calculation.  
## Self-Check 8
---
### What is the difference between an accessor and a mutator? What naming conventions are used with accessors and mutators??
> The accessor allows you to access data in an object, and the mutator lets you change the internal  
> state of an object.  
> Mutators generally begin with the word set, because you are setting (mutating) the object's  
> internal state in some way, and Accessors generally begin with get or is because you are getting  
> information about data in an object, whether that is something like an intgeter (get) or boolean value(is).  
## Self-Check 10
---
### Add a new method to the Point class we developed in this chapter:    
```java
public double distance(Point other)
```  
### Returns the distance between the current Point object and the given other Point object.  
### The distance between two points is equal to the square root of the sum of the squares of the  
### differences of their x- and y-coordinates. In other words, the distance between two pionts  
### (x1, y1) and (x2, y2) can be expressed as the square root of (x2 - x1)^2 + (y2 - y1)^2. Two points  
### with the same (x,y) coordinates should return a distance of 0.0.  
```java
public double distance(Point other)
{
    int deltaX = x - other.x;
    int deltaY = y - other.y;
    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
}

```
## Self-Check 16
---
### Finish the client code so that it constructs two Point objects, translates each, and then prints  
### their coordinates.  
```java
// construct two Point objects, one at (8, 2) and one at (4, 3)
Point point1 = new Point(8, 2);
Point point2 = new Point(4, 3);

// display the two Point objects' state
System.out.println("point1 is " + point1);
System.out.println("point2 is " + point2);

// display point1 distance from origin
System.out.println("point1's distance from origin is " + point1.distanceFromOrigin());

// translate point1 to (9, 4)
// translate point2 to (3, 13)
p1.translate(1, 2); // add 1 to 8 for 9 and 2 to 2 for 4
p2.translate(-1, 10); // subtract 1 from 4 for 3 and add 10 to 3 for 13

// display the two Point objects' state again
System.out.println("point1 is now " + point1);
System.out.println("point2 is now " + point2);
```  
## Self-Check 20
---
### What is the meaning of keyword this? Describe three ways that the keyword can be used.  
> Meaning: A Java keyword that allows you to refer to the implicit parameter inside a class.  
> Use: 
> - More explicit naming conventions  (this.x instead of just x)  
> - More closely match the syntax in client code  (all messages to objects begin with variable.)  
> - To deal with shadowed variables (variables where a field is obscured by another var with the)  
> - same name.  
## Self-Check 21
---
### Add a constructor to the Point class that accepts another Point as a parameter and initializes  
### this new Point to have the same (x, y) values. Use the keyword this in your solution.  
```java
public Point(Point a)
{
    this(a.x, a.y);
}
```   
