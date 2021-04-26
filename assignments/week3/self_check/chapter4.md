# Self-Check Chapter 4  

## Self-Check 1
---
### Translate each of the following English statements into logical tests that could be used in an if/else statement. Write the appropriate if statement with your logical test. Assume that three int variables x, y, and z have been declared:  
> a. z is odd.  
```java
if(z % 2 == 1) {
	System.out.println(z + " is odd.");
}
```
> b. z is not greater than y's square root.  
```java
if(z <= Math.sqrt(y)) {
	System.out.println(z + " is less than or equal to " + y "'s square root.");
}
``` 
> c. y is positive.  
```java
if(y > 0) {
	System.out.println(y + " is a positive number.");
}
```
> d. Either x or y is even, and the other is odd.  
```java
if(x % 2 != y % 2) {
	System.out.println("Either " + x " is even or " + y " is even.");
}
```
> e. y is a multiple of z.  
```java
if(y % z == 0) {
	System.out.println(y + " is a multiple of " + z);
}
```
> f. z is not even.  
```java
if(z % 2 != 0) {
	System.out.println(z + " is not an even number.");
}
```
>> I am confused by the answer given on the website for this one.
>> - z != 0 would not necessarily evaluate to z is not even,
>> because in this case, z could still be odd, but not equal to 0.
> g. y is greater in magnitude than z.  
```java
if(Math.abs(y) > Math.abs(z)) {
	System.out.println(y + " is greater in magnitude than " + z);
}
```
> h. x and z are of opposite signs.  
```java
if((x => 0) && (z < 0) || (z >= 0) && (x < 0)) {
	System.out.println(x + " and " + z + " are of opposite sign(+, -)");
} else {
	System.out.println(x + " and " z + " are of the same sign(+, -)");
}
``` 
> i. y is a nonnegative one-digit number.  
```java
if(y % 10 == y) {
	System.out.println(y + " is a nonnegative one-digit number.");
}
``` 
> j. z is nonnegative.  
```java
if(z >= 0) {
	System.out.println(z + " is a nonnegative number.");
}
```  
> k. x is even.  
```java
if(x % 2 == 0) {
	System.out.println(x + " is an even number.");
}
```
> l. x is closer in value to y than z is.  
```java
if(Math.abs(x - y) < Math.abs(z - y)) {
	System.out.println(x + " is closer in value to " + y + " than " + z " is.");
}
``` 

## Self-Check 2
---
### Given the variable declarations:
```java
    int x = 4;
    int y = -3;
    int z = 4;
```
### What are the results of the following expressions?  
> a. x == 4  
> - TRUE  
>
> b. x == y  
> - FALSE  
>
> c. x == z  
> - TRUE  
>
> d. y == z  
> - FALSE  
>
> e. x + y > 0  
> - TRUE  
>
> f. x - z != 0  
> - FALSE  
>
> g. y * y <= z  
> - FALSE  
>
> h. y / y == 1  
> - TRUE  
>
> i. x * (y + 2) > y - (y + z) * 2  
> - TRUE  

## Self-Check 3
---
### Which of the following if statement headers uses the correct syntax?
> a. if x = 10 then {  
> b. if [x == 10] {  
> c. if (x => y) {  
> d. if (x equals 42) {  
> <pre><b>e. if (x == y) {</b></pre>  
## Self-Check 7
---
### Write Java code to read an integer from the user, then print even if that number is an even number or odd otherwise. You may assume that the user types a valid integer.
```java
public class EvenOrOdd
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Type an integer(e.g. 4 or 8): ");

		int num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}
	}
}
```

## Self-Check 8
---
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
> If a number such as 10 evaluated to true in the first if statement,  
> it would be passed to the second if statement, evaluate to false,  
> and then be passed to the else statement, which would erroneously  
> classify it as an odd number.  
### Corrected logic error:
```java
Scanner console = new Scanner(System.in);
System.out.print("Type a number: ");
int number = console.nextInt();
if (number % 2 == 0) {
	if (number % 3 == 0) {
		System.out.println("Divisible by 6.");
	} 
} else {
		System.out.println("Odd.");
	}
``` 
> In this corrected version, the else statement is isolated from the  
> second nested if statement, so we can reliably trust when a number  
> does not pass the test of equality in the first if statement it it is  
> not an even number, and execution is passed to the else statement,  
> which properly classifies it as "odd".  
## Self-Check 9
---
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