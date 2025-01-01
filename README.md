# Car Game

## Description

The Car Game is a really simple project for Java beginners. 
These are the objectives of this project:

- The user can type one of the following commands:
    - **run**
    - **stop**
    - **help**
    - **exit**

- If the user types **run**, then there are two possible scenarios:
    - **If the car is already running**, the game must tell the user that the car is already running.
    - **If the car is stopped**, the game must start the car and inform the user that the car has started.

- If the user types **stop**, then there are two possible scenarios:
    - **If the car is already stopped**, the game must tell the user that the car is already stopped.
    - **If the car is running**, the game must stop the car and inform the user that the car has been stopped.

- If the user types **help**, the game must display the rules of the game (commands that can be used).

- If the user types **exit**, the game must print a goodbye message and terminate the program.

- If the user types a command that is not listed above, 
the game must display: "Invalid command. Please try again."

## How I solved the project

To solve the Car Game project, I followed a step-by-step approach. Here’s how I broke down the solution:

### 1. **Creating the `Car` class**  
The `Car` class has properties for the car's brand and its running state. I included methods to start and stop the car, ensuring the state is updated and proper messages are displayed.
For example the method `run` will start the car only if `isStopped` equals `false`.

```java
public void run() {
    if (!isStopped) {
        System.out.println("The car is already running.");
    } else {
        isStopped = false;
        System.out.println("You have started the car!");
    }
}
```

### 2. **Handling user input**  
The main game logic is in the `CarGame` class, where I use a `Scanner` to capture user input. Commands are processed in a loop using a `switch` statement.

```java
switch (userInput.toLowerCase()) {
    case "run" -> userCar.run();
    case "stop" -> userCar.stop();
    case "help" -> showCarGameRules(userCar);
    default -> System.out.println("Invalid command.");
}
```

### 3. **Game rules display**  
The rules of the game are displayed when the user types `help`, using the `showCarGameRules` method.

```java
public static void showCarGameRules(Car car) {
    System.out.println("Type 'run' to start the " + car.getCarBrand());
    System.out.println("Type 'stop' to stop the " + car.getCarBrand());
    ...
}
```

### 4. **Handling exit**  
The game can be exited with the `exit` command, which prints a farewell message, closes the `scanner` object, and terminates the program.

```java
case "exit" -> {
    System.out.println("Goodbye!");
    scanner.close();
    System.exit(0);
}
```

### 5. **Edge cases and validation**  
I ensured the program handles edge cases, such as when the car is already in the desired state, and when an invalid command is entered.




