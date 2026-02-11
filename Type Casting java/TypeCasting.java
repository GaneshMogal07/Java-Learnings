/**
 🔹 What is Type Casting in Java?

 Type Casting means converting one data type into another data type.

In Java, this mostly happens between primitive data types like:

int

double

float

long

char

byte

short


🔹 Why Type Casting is Needed?

Because sometimes:

You want to store a small value into a bigger data type.

Or you want to convert a bigger data type into a smaller one.

Or you want to remove decimal part.

Or you want to perform calculations properly.

🔹 Types of Type Casting in Java

There are 2 types:

✅ Widening Casting (Implicit)

✅ Narrowing Casting (Explicit)


1. Widening Casting (Automatic / Implicit)

👉 Converting smaller data type → larger data type

This happens automatically.

📌 Order of widening:
byte → short → int → long → float → double


2. Narrowing Casting (Manual / Explicit)

👉 Converting larger data type → smaller data type

This must be done manually.

 */

//eg - 1
public class TypeCasting {

    public static void main(String[] args) {

    //1. Widening Casting (Automatic / Implicit 
        int name = 10;
        double result= name;

        System.out.println(name);
        System.out.println(result);

     // Narrowing Casting (Manual / Explicit)
        double testing=10.11;
        int results=(int)testing;

        System.out.println("this final output:" + results);



        int number = 130;
        byte result1 = (byte) number;

        System.out.println("this byte output:"+result1);
    }
    
}

