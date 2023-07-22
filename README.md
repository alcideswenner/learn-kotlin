# learn-kotlin
## Kotlin Playground - Example of Functions

This repository contains a Kotlin program that demonstrates various functions in action, such as checking if a number is even or odd, summing a list of integers, filtering strings with more than 5 characters, calculating the area of a rectangle, and simulating the "Rock, Paper, Scissors" game against the computer.

### How to Run the Program

1. Make sure you have the Kotlin environment set up on your machine. If you don't have it, you can use the Kotlin Playground online or install the Kotlin CLI on your machine.

2. Copy and paste the provided code into the Kotlin Playground or a file with the .kt extension.

3. Execute the program to see the results printed in the console.

### Code Description

The program is organized as follows:

1. The `verifyEvenOrOdd(num: Int)` function takes an integer and prints "Even" if the number is even, or "Odd" if the number is odd.

2. The `sumList(list: List<Int>): Int` function takes a list of integers and returns the sum of all elements in the list.

3. The `filterStringsByLength(strings: List<String>): List<String>` function takes a list of strings and returns a new list containing only strings with more than 5 characters.

4. The `Person` class is defined with the attributes `name` and `age`.

5. The `Rectangle` class is defined with the attributes `height` and `width`, and it has the `calculateArea()` method that returns the area of the rectangle.

6. The `playRockPaperScissors(userChoice: String): String` function takes the user's choice (Rock, Paper, or Scissors) and simulates the game against the computer, generating a random choice for the computer and returning the game result.

7. The `main()` function is the main entry point that calls all other functions to demonstrate their behaviors.

### Running the Program

When you run the program, you will see the results of the functions printed in the console:

- The result of checking whether the number 8585 is even or odd.
- The sum of the list of numbers [1, 37, 37, 49, 73, 3838].
- The strings with more than 5 characters from the list ["Kotlin", "Java", "Python", "C#", "JavaScript"].
- The names of the people contained in the `people` list.
- The area of the rectangle with height 10.0 and width 50.0.
- Instructions for playing the "Rock, Paper, Scissors" game against the computer.

### Experiment and Have Fun!

Feel free to modify the code, add new functions, or expand the program with your own ideas! Enjoy coding in Kotlin!
