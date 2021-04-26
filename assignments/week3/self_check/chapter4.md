# Self-Check Chapter 4

## Self-Check 1
### Translate each of the following English statements into logical tests that could be used in an if/else statement. Write the appropriate if statement with your logical test. Assume that three int variables x, y, and z have been declared:
```java
System.out.println();
```

## Self-Check 2
### Given the variable declarations:
```java
    int x = 4;
    int y = -3;
    int z = 4;
```
### What are the results of the following expressions? 
> a. x == 4  
> b. x == y  
> c. x == z  
> d. y == z  
> e. x + y > 0  
> f. x - z != 0  
> g. y * y <= z  
> h. y / y == 1  
> i. x * (y + 2) > y - (y + z) * 2  
## Self-Check 3
### Which of the following if statement headers uses the correct syntax?
> a. if x = 10 then {  
> b. if [x == 10] {  
> c. if (x => y) {  
> d. if (x equals 42) {  
> e. if (x == y) {  

## Self-Check 7
### Write Java code to read an integer from the user, then print even if that number is an even number or odd otherwise. You may assume that the user types a valid integer.
```java

```

## Self-Check 8
### The following code contains a logic error:
```java
Scanner console = new Scanner(System.in);
System.out.print("Type a number: ");
int number = console.nextInt();
if (number % 2 == 0) {
	if (number % 3 == 0) {
		System.out.println("Divisible by 6.");
	} else {
		System.out.println("Odd.");
	}
}
```
### Examine the code and describe a case in which the code would print something that is untrue about the number that was entered. Explain why. Then correct the logic error in the code
> This is a filler answer  

## Self-Check 9
### Describe a problem with the following code:
```java
Scanner console = new Scaner(System.in);
System.out.print("What is your favorite color?");
String name = console.next();
if (name == "blue") {
	System.out.println("Mine, too!");
}
```
> This is also a filler answer  