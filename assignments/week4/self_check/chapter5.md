# Self-Check Chapter 5

## Self-Check 1
---
### For each of the following *while* loops, state how many times the loop will execute its body. Remember that "zero," "infinity," and "unknown" are legal answers. Also, what is the output of the code in each case?:
> a.  
```java
int x = 1;

while (x < 100) {
    System.out.print(x + " ");
    x += 10;
}
```
> b.
```java
int max = 10;

while (max < 10) {
    System.out.println("count down: " + max);
    max--;
}
```
> c.
```java
int x = 250;

while (x % 3 != 0) {
    System.out.println(x);
}
```
> d.
```java
int x = 2;

while (x < 200) {
    System.out.print(x + " ");
    x *= x;
}
```
> e.
```java
String word = "a";
while (word.length() < 10) {
    word = "b" + word + "b";
}

System.out.println(word);
```
> f.
```java
int x = 100;

while (x > 0) {
    System.out.println(x / 10);
    x = x / 2;
}
```

## Self-Check 2
---
### Convert each of the following *for* loops into an equivalent *while* loop:
> a.
```java
for (int n = 1; n <= max; n++) {
    System.out.println(n);
}
```
> b.
```java
int total = 25;
for (int number = 1; number <= (total / 2); number ++) {
    total = total - number;
    System.out.println(total + " " + number);
}
```
> c.
```java
for (int i = 1; i <= 2; i++) {
    for (int j = 1; j <= 3; j++) {
        for (int k = 1; k <= 4; k++) {
            System.out.print("*");
        }
        System.out.print("!");
    }
    System.out.println();
}
```
> d.
```java
int number = 4;

for (int count = 1; count <= number; count++) {
    System.out.println(number);
    number = number / 2;
}
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
int x = 1;

do {
    System.out.print(x + " ");
    x = x + 10;
} while (x < 100);
```
> b.
```java
int max = 10;

do {
    System.out.println("count down: " + max);
    max--;
} while (max < 10);
```
> c.
```java
int x = 250;

do {
    System.out.println(x);
} while (x % 3 != 0);
```
> d.
```java
int x = 100;

do {
    System.out.println(x);
    x = x / 2;
} while (x % 2 == 0);
```
> e.
```java
int x = 2;

do {
    System.out.print(x + " ");
    x *= x;
} while (x < 200);
```
> f.
```java
String word = "a";

do {
    word = "b" + word + "b";
} while (word.length() < 10);
System.out.println(word);
```
> g.
```java
int x = 100;

do {
    System.out.println(x / 10);
    x = x / 2;
} while (x > 0);
```
> h.
```java
String str = "/\\";

do {
    str += str;
} while (str.length() < 10);
System.out.println(str);
```

## Self-Check 9
---
### Write a *do/while* loop that repeatedly prints a certain message until the user tells the program to stop. The *do/while* loop is appropriate because the message should always be printed at least one time, even if the user types *n* after the first message appears. The message to be printed is as follows:
> She sells seashells by the seashore.
> Do you want to hear it again? *y or n(for yes or no)*
```java

```
