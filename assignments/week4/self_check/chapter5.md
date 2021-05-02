# Self-Check Chapter 5

## Self-Check 1
---
### For each of the following *while* loops, state how many times the loop will execute its body. Remember that "zero," "infinity," and "unknown" are legal answers. Also, what is the output of the code in each case?:
> a.
```java

```
> b.
```java

```
> c.
```java

```
> d.
```java

```
> e.
```java

```
> f.
```java

```

## Self-Check 2
---
### Convert each of the following *for* loops into an equivalent *while* loop:
> a.
```java

```
> b.
```java

```
> c.
```java

```
> d.
```java

```

## Self-Check 3
---
### Consider the following method:
```java
public static void mystery(int x) {
    int y = 0;
    while (x % 2 == 0) {
        y++;
        x = x / 2;
    }
    System.out.println(x + " " + y);
}
```
### For each of the following calls, indicate the output that the preceding method produces:
> mystery(19);
> -
> mystery(42);
> -
> mystery(48);
> -
> mystery(40);
> -
> mystery(64);
> -

## Self-Check 7
---
### Write code that generates a random odd integer (not divisible by 2) between 50 and 99 inclusive:
```java
public class RandomOdd
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
### For each of the *do/while* loops that follow, state the number of times that the loop will execute its body. Remember that "zero," "infinity," and "unknown" are legal answers. Also, what is the output of the code in each case?:
> a.
```java

```
> b.
```java

```
> c.
```java

```
> d.
```java

```
> e.
```java

```
> f.
```java

```
> g.
```java

```
> h.
```java

```

## Self-Check 9
---
### Write a *do/while* loop that repeatedly prints a certain message until the user tells the program to stop. The *do/while* loop is appropriate because the message should always be printed at least one time, even if the user types *n* after the first message appears. The message to be printed is as follows:
> She sells seashells by the seashore.
> Do you want to hear it again? *y or n(for yes or no)*
```java

```
