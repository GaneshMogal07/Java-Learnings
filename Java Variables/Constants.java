/**
 
Constants (final)

If you don’t want value to change, use final.

🔹 Syntax:
final datatype VARIABLE_NAME = value;

The final keyword in Java is a non-access modifier used to apply 
restrictions on variables, methods, and classes, essentially making them unchangeable. 

 */

public class Constants {
    public static void main(String[] args) {

        final double PI = 3.14;

        System.out.println(PI);

        // PI = 3.14159; ❌ ERROR (cannot change)
    }
}
