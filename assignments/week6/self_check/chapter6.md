# Self-Check Chapter 6  

## Self-Check 2  
---
### What is wrong with the following line of code?  
```java
Scanner input = new Scanner("test.dat");
```
> Assuming the file was not created in a previous part of the code,  
> the line should read as follows:  
```java
Scanner input = new Scanner(new File("test.dat"));
```

## Self-Check 3  
---
### Which of the following is the correct syntax to declare a Scannerto read the  
### file *example.txt* in the current directory?  
```java
Scanner input = new Scanner(new File("example.txt"));
```
