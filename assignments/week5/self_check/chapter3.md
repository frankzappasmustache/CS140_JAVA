# Self-Check Chapter 3

## Self-Check 1
---
### Which of the following is the correct syntax for a method header with parameters?
```java
public static void example(int x, int y)
```
## Self-Check 3
---
### The following program has 9 mistakes. What are they?
```java
public class Oops3 {
    public static void main() {
        double bubble = 867.5309;
        double x = 10.01;
        printer(double x, double y);
        printer(x);
        printer("barack", "obama");
        System.out.println("z = " + z);
    }

    public static void printer(x, y double) {
        int z = 5;
        System.out.println("x = " + double x + " and y = " + y);
        System.out.println("The value from main is: " + bubble);
    }
}
```
## Self-Check 4
---
### What output is produced by the following program?  
```java
public class Odds {
    public static void main(String[] args) {
        printOdds(3);
        printOdds(17 / 2);

        int x = 25;
        printOdds(37 - x + 1);
    }

    public static void printOdds(int n) {
        for(int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd + " ");
        }
        System.out.println();
    }
}
```  
> 
## Self-Check 5
---
### What is the output of the following program?  
```java
public class Weird {
    public static void main(String[] args) {
        int number = 8;
        halfTheFun(11);
        halfTheFun(2 - 3 + 2 * 8);
        halfTheFun(number);
        System.out.println("number = " + number);
    }

    public static void halfTheFun(int number) {
        number = number / 2;
        for(int count = 1; count <= number; count++) {
            System.out.print(count + " ");
        }
        System.out.println();
    }
}
```  
> 
## Self-Check 7
---
### What is the output of the following program?  
```java
public class MysteryWho {
    public static void main(String[] args) {
        String whom = "her";
        String who = "him";
        String it = "who";
        String he = "it";
        String she = "whom";

        sentence(he, she, it);
        sentence(she, he, who);
        sentence(who, she, who);
        sentence(it, "stu", "boo");
        sentence(it, whom, who);
    }

    public static void sentence(String she, String who, String whom) {
        System.out.println(who + " and " + whom + " like " + she);
    }
}
```  
> 
## Self-Check 10
---
### Write a method called **printStrings** that accepts a String and a number of repetitions as parameters and prints the String the given number of times with a space after each time. For example, the call:
```java
printStrings("abc", 5);
```
### Will print the following output:  
> abc abc abc abc abc  
### My Method:
```java

```
## Self-Check 20
---
### Assuming that the following variables have been declared:
```java
String str1 = "Q.E.D.";
String str2 = "Arcturan Megadonkey";
String str3 = "Sirius Cybernetics Coroporation";
```
### evaluate the following expressions:  
a.  
```java
str1.length();
```  
b.  
```java
str2.length();
```  
c.  
```java
str1.toLowerCase();
```  
d.  
```java
str2.toUpperCase();
```  
e.  
```java
str1.substring(2, 4);
```  
f.  
```java
str2.substring(10, 14);
```  
g.  
```java
str1.indexOf("D");
```  
h.  
```java
str1.indexOf(".");
```  
i.  
```java
str2.indexOf("donkey");
```  
j.  
```java
str3.indexOf("X");
```  
k.  
```java
str2 + str3.charAt(17);
```  
l.  
```java
str3.substring(9, str3.indexOf("e"));
```  
m.  
```java
str3.substring(7, 12);
```  
n.  
```java
str2.toLowerCase().substring(9, 13) + str3.substring(18, str3.length() - 7);
```  

## Self-Check 23

### Write Java code to read an integer from the user, then print that number multiplied by 2. You may assume that the user types a valid integer.  

```java

```  

## Self-Check 24  

### Consider the following program. Modify the code to use a Scanner to prompt the user for the values of **low** and **high**.  
```java
public class SumNumbers {
    public static void main(String[] args) {
        int low = 1;
        int high = 1000;
        int sum = 0;
        for(int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
```  

### Below is a sample execution in which the user asks for the sum of the values 1 through 10:  
> low? 1  
> high? 10  
> sum = 55  

### Here is my modified program:  
```java

```
