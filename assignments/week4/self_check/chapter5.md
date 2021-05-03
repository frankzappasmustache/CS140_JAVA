# Self-Check Chapter 5

## Self-Check 1
---
### For each of the following *while* loops, state how many times the loop will execute its body. Remember that "zero," "infinity," and "unknown" are legal answers. Also, what is the output of the code in each case?:
> a.  
> - Loop will execute 10 times (until it reached 91 -- adding 10 to x at this point would put it at 101)  
> - The output is 1 11 21 31 41 51 61 71 81 91 (x is printed, and then 10 is added to it each subsequent time through the while loop)  
```java
int x = 1;

while (x < 100) {
    System.out.print(x + " ");
    x += 10;
}
```
> b.  
> - This loop will never execute because max is already equal to 10 at the beginning of the loop, and this is the control condition.  
```java
int max = 10;

while (max < 10) {
    System.out.println("count down: " + max);
    max--;
}
```
> c.  
> - This loop will execute an infinite number of times because the remainder of 250 using the modulus operator will always produce a remainder greater than 0.  
> - The output would be:  
>> 250  
>> 250  
>> etc.  
```java
int x = 250;

while (x % 3 != 0) {
    System.out.println(x);
}
```
> d.  
> - This loop will execute 3 times(2 + " " = 2, 2 * 2 = 4 | 4 + " " = 4, 4 * 4 = 16 | 16 + " " = 16, 16 * 16 = 256)  
> - The output of this loop is 2 4 16  
```java
int x = 2;

while (x < 200) {
    System.out.print(x + " ");
    x *= x;
}
```
> e.  
> - This loop will execute 5 times(b + a + b = bab, b + bab + b = bbabb, b + bbabb + b = bbbabbb, b + bbbabbb + b = bbbbabbbb, b + bbbbabbbb + b = bbbbbabbbbb)  
> - The output of this loop is bbbbbabbbbb  
```java
String word = "a";
while (word.length() < 10) {
    word = "b" + word + "b";
}

System.out.println(word);
```
> f.  
> - This loop will execute 7 times.  
> - The output is:  
>> 10  
>> 5  
>> 2  
>> 1  
>> 0  
>> 0  
>> 0  
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
```java
int n = 1;

while (n <= max) {
    System.out.println(n);
    n++;
}
```
> b.  
```java
int total = 25;

for (int number = 1; number <= (total / 2); number++) {
    total = total - number;
    System.out.println(total + " " + number);
}
```
```java
int total = 25;
int number = 1;

while (number <= (total / 2)) {
    total = total - number;
    System.out.println(total + " " + number);
    number++
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
```java
int i = 1;

while (i <= 2) {
    int j = 1;

    while (j <= 3) {
        int k = 1;

        while(k <= 4) {
            System.out.print("*");
            k++;
        }
        System.out.print("!");
        j++;
    }
    System.out.println();
    i++;
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
```java
int number = 4;
int count = 1;

while (count <= number) {
    System.out.println(number);
    number = number / 2;
    count++;
}
```
## Self-Check 3
---
### Consider the following method:
```java
public static void mystery(int x) {
    int y = 1;
    int z = 0;
    while (2 * y <= x) {
        y = y * 2;
        z++;
    }
    System.out.println(y + " " + z);
}
```
### For each of the following calls, indicate the output that the preceding method produces:  

> mystery(1);  
> - 1 0  
> mystery(6);  
> - 4 2  
> mystery(19);  
> - 16 4  
> mystery(39);  
> - 32 5  
> mystery(74);  
> - 64 6  

## Self-Check 7
---
### Write code that generates a random odd integer (not divisible by 2) between 50 and 99 inclusive:
```java
public class RandomOdd
{
    public static void main(String[] args)
    {
        Random randOdd = new Random();
        int oddInt = rand.nextInt(25) * 2 + 51;

        System.out.print(oddInt);
    }
}
```

## Self-Check 8
---
### For each of the *do/while* loops that follow, state the number of times that the loop will execute its body. Remember that "zero," "infinity," and "unknown" are legal answers. Also, what is the output of the code in each case?:
> a.  
> - This loop will execute 10 times (until it reached 91 -- adding 10 to x at this point would put it at 101)  
> - The output is 1 11 21 31 41 51 61 71 81 91 (x is printed, and then 10 is added to it each subsequent time through the while loop)  
```java
int x = 1;

do {
    System.out.print(x + " ");
    x = x + 10;
} while (x < 100);
```
> b.  
> - This loop will execute an infinite number of times because the control condition is while max is less than 10, and 10 is decremented by 1 at the end of each loop.  
> - The output of this loop would be:  
>> count down: 10  
>> count down: 9  
>> count down: 8  
>> count down: 7  
>> count down: 6  
>> etc.  
```java
int max = 10;

do {
    System.out.println("count down: " + max);
    max--;
} while (max < 10);
```
> c.  
> - This will loop infinitely because the remainder of 250 modulus 3 will never be equal to 0.  
> - The loop will output 250 infintely.  
```java
int x = 250;

do {
    System.out.println(x);
} while (x % 3 != 0);
```
> d.  
> - This loop will execute two times, until it reaches 25 % 2, which has a remainder of 1.  
> - The output of this loop would be:  
>> 100  
>> 50  
```java
int x = 100;

do {
    System.out.println(x);
    x = x / 2;
} while (x % 2 == 0);
```
> e.  
> - This loop will execute 3 times(2 + " " = 2, 2 * 2 = 4 | 4 + " " = 4, 4 * 4 = 16 | 16 + " " = 16, 16 * 16 = 256)  
> - The output of this loop is 2 4 16  
```java
int x = 2;

do {
    System.out.print(x + " ");
    x *= x;
} while (x < 200);
```
> f.  
> - This loop will execute 5 times(b + a + b = bab, b + bab + b = bbabb, b + bbabb + b = bbbabbb, b + bbbabbb + b = bbbbabbbb, b + bbbbabbbb + b = bbbbbabbbbb)  
> - The output of this loop is bbbbbabbbbb  
```java
String word = "a";

do {
    word = "b" + word + "b";
} while (word.length() < 10);
System.out.println(word);
```
> g.
> - This loop will execute 7 times.  
> - The output is:  
>> 10  
>> 5  
>> 2  
>> 1  
>> 0  
>> 0  
>> 0  
```java
int x = 100;

do {
    System.out.println(x / 10);
    x = x / 2;
} while (x > 0);
```
> h.
> - This loop would execute 3 times( /\ + /\ = /\/\, /\/\ + /\/\ = /\/\/\/\, /\/\/\/\ + /\/\/\/\ = /\/\/\/\/\/\/\/\)  
> - The output of this loop would be /\/\/\/\/\/\/\/\  
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
public class SeaShells
{
    public static void main(String[] args)
    {
        Scanner shells = new Scanner(System.in);
        String answer;

        do {
            System.out.println("She sells seashells by the seashore.");
            System.out.println("Answer the following question with \"y\" for Yes or \"n\" for No");
            System.out.print("Do you want to hear it again? ");
            answer = shells.nextLine();
        } while (answer.equalsIgnoreCase("y"));
    }
}
```
