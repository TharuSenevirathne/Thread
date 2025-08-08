# Java Threads Learning Repository

This repository contains a series of Java examples and exercises focused on multithreading concepts. The examples are organized into different directories, each covering specific threading topics in Java.

## Introduction
This project serves as a comprehensive learning resource for understanding Java's multithreading capabilities. It includes practical examples demonstrating various threading concepts, from basic thread creation to advanced thread synchronization techniques.

## Module Descriptions

### 01-introduction
- **Purpose**: Introduction to basic thread concepts in Java
- **Key Concepts**:
  - Creating threads by extending the `Thread` class
  - Implementing the `Runnable` interface
  - Basic thread lifecycle and execution
- **Example**: Simple thread creation and execution

### 02-Extend-Thread-Class
- **Purpose**: Demonstrates thread creation by extending the `Thread` class
- **Key Concepts**:
  - Creating custom thread classes
  - Overriding the `run()` method
  - Starting threads with `start()`
- **Example**: `MyThread` class extending `Thread`

### 03-Implement-Runnable-Interface
- **Purpose**: Shows thread creation using the `Runnable` interface
- **Key Concepts**:
  - Implementing `Runnable` interface
  - Creating `Thread` objects with `Runnable` instances
  - Multiple threads execution
- **Example**: Multiple threads printing different characters

### 04-Lambda-Expression
- **Purpose**: Using lambda expressions for concise thread creation
- **Key Concepts**:
  - Lambda expressions with `Runnable`
  - Simplified thread creation syntax
  - Concurrent execution demonstration
- **Example**: Multiple threads using lambda expressions

### 05-Join-isAlive
- **Purpose**: Understanding thread joining and lifecycle methods
- **Key Concepts**:
  - `join()` method for thread synchronization
  - `isAlive()` method to check thread status
  - Thread coordination and execution flow
- **Example**: Demonstrating thread joining and status checking

### 06-Thread-Priority
- **Purpose**: Managing thread execution priority
- **Key Concepts**:
  - Setting thread priorities (`MIN_PRIORITY`, `NORM_PRIORITY`, `MAX_PRIORITY`)
  - Thread scheduling
  - Priority impact on execution order
- **Example**: Threads with different priorities printing characters

### 07-Synchronized-Keyword
- **Purpose**: Thread synchronization with `synchronized` keyword
- **Key Concepts**:
  - Race conditions
  - Synchronized methods and blocks
  - Thread safety
- **Example**: Counter increment with thread synchronization

### 08-Inter-Thread-Communication
- **Purpose**: Implementing producer-consumer pattern
- **Key Concepts**:
  - `wait()` and `notify()` methods
  - Thread communication
  - Thread coordination
- **Example**: Producer-consumer with proper thread communication

### 09-My-Runnable
- **Purpose**: Custom `Runnable` implementations
- **Key Concepts**:
  - Custom runnable classes
  - Thread creation with custom runnables
  - Advanced thread patterns
- **Example**: Custom runnable implementation
