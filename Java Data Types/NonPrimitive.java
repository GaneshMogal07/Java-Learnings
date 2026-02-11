/**

Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

The main differences between primitive and non-primitive data types are:

Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
Primitive types always hold a value, whereas non-primitive types can be null.

*/
//Non-primitive means:

// It does NOT store actual value directly.
// It stores reference (address) of value.

//Simple meaning:

// Primitive → stores value
// Non-Primitive → stores object
public class NonPrimitive {

    public static void main(String[] args) {
        String name = "Ganesh";
        int age = 23 ;
        int[] numbers = {10, 20, 30};


           System.out.println(numbers[1]);
           System.out.println(name.length());

        System.out.println("student name :"+ name + ("age of the student: " + age));
    }
}
