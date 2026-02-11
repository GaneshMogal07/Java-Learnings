/**
 

Data types are divided into two groups:

1.Primitive data types - includes byte, short, int, long, float, double, boolean and char

2.Non-primitive data types - such as String, Arrays and Classes

Data Type	Description
byte	    Stores whole numbers from -128 to 127
short	    Stores whole numbers from -32,768 to 32,767
int	        Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	    Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
boolean	    tores true or false values
char	    Stores a single character/letter or ASCII values


 */
public class DataTypes {

    public static void main(String[] args) {

        // byte: used to save memory when values are very small
        // Range: -128 to 127
        byte age = 25;
        System.out.println("Byte (age): " + age);

        // short: used for slightly larger whole numbers than byte
        // Range: -32,768 to 32,767
        short salaryInThousands = 30000;
        System.out.println("Short (salaryInThousands): " + salaryInThousands);

        // int: most commonly used for whole numbers
        // Range: -2,147,483,648 to 2,147,483,647
        int population = 1400000000;
        System.out.println("Int (population): " + population);

        // long: used when int is not enough (very large numbers)
        // 'L' at the end is mandatory
        long worldPopulation = 8000000000L;
        System.out.println("Long (worldPopulation): " + worldPopulation);

        // float: used for decimal values where high precision is not required
        // 'f' at the end is mandatory
        float temperature = 36.6f;
        System.out.println("Float (temperature): " + temperature);

        // double: used for decimal values where high precision is required
        // Default type for decimal numbers
        double piValue = 3.141592653589793;
        System.out.println("Double (piValue): " + piValue);

        // boolean: used for true/false conditions
        boolean isJavaFun = true;
        System.out.println("Boolean (isJavaFun): " + isJavaFun);

        // char: used to store a single character or ASCII value
        char grade = 'A';
        System.out.println("Char (grade): " + grade);
    }
}


// output:-

// PS C:\Users\GaneshMogal\Java-Learnings\java Variables> javac DataTypes.java
// PS C:\Users\GaneshMogal\Java-Learnings\java Variables> java DataTypes      
// Byte (age): 25
// Short (salaryInThousands): 30000
// Int (population): 1400000000
// Long (worldPopulation): 8000000000
// Float (temperature): 36.6
// Double (piValue): 3.141592653589793
// Boolean (isJavaFun): true
// Char (grade): A
// PS C:\Users\GaneshMogal\Java-Learnings\java Variables> 




