# Assignment 3 - Bridge Pattern

## Campus Access System

This project demonstrates the Bridge structural design pattern in Java.

The system represents campus passes and different methods of access verification.

## Project Structure

### Abstraction
- CampusPass

### Refined Abstractions
- StudentPass
- StaffPass

### Implementor
- AccessMethod

### Concrete Implementors
- QRScanner
- NFCReader

### Client
- Main

## How It Works

CampusPass contains a reference to the AccessMethod interface.

Because of this, the type of campus pass and the access verification method can change independently.

For example:

- StudentPass can use QRScanner
- StudentPass can use NFCReader
- StaffPass can use QRScanner
- StaffPass can use NFCReader

The implementation can also be changed at runtime without changing the CampusPass class.

## Clean Code Principles

1. Meaningful class and method names.
2. Each class has one main responsibility.
3. Abstraction and implementation are separated.
4. The code depends on the AccessMethod interface instead of concrete implementations.
5. New access methods can be added without changing the existing pass classes.
6. Classes are small and focused.

## Example

```java
CampusPass studentPass = new StudentPass(new QRScanner());

studentPass.enterBuilding("Anuar");

studentPass.setAccessMethod(new NFCReader());

studentPass.enterBuilding("Anuar");
