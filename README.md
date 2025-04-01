# Secret Message Ciphers

## Overview

This project is a Java console-based program that allows users to encrypt or decrypt text messages using two classical ciphers: the **Caesar Cipher** and the **Vigenère Cipher**. It was developed as part of coursework to reinforce Java programming fundamentals in the context of computer networking and cryptography.

## Features

- Encrypt and decrypt messages using:
  - Caesar Cipher (with user-defined shift)
  - Vigenère Cipher (with keyword input)
- Interface-based design using Java OOP principles
- Robust input validation and error handling
- Modular structure with multiple Java classes

## Project Structure

```
secret-message-ciphers/
├── encryption/
│   ├── Caesar.java         // Caesar cipher implementation
│   ├── Vigenere.java       // Vigenère cipher implementation
│   ├── Cipher.java         // Cipher interface
│   └── SecretMessage.java  // Main application logic
├── Makefile                // Compilation automation
└── .gitignore              // Standard Java ignore rules
```

## How to Compile and Run

### Requirements

- Java Development Kit (JDK)
- GNU Make (or manually compile with `javac`)

### Compile

```bash
make
```

### Run

```bash
java encryption.SecretMessage
```

### Clean Up

```bash
make clean
```

## Key Concepts Demonstrated

- Classical encryption algorithms
- Object-Oriented Programming (Java Interfaces and Classes)
- Manual input parsing and user interaction
- Java file and package organization
- Use of Makefile for compilation automation

## Attribution

Portions of this codebase—specifically the interface structure and portions of the Caesar cipher logic—were provided as part of an educational assignment for **CSCI3363: Computer Networks**, taught by **Professor Wiseman** at **Boston College**. The remaining logic, structure, and implementation details were developed by myself as part of the assignment's requirements. This version has been refactored and organized for public demonstration and portfolio purposes.

## License

This project is shared for educational and portfolio purposes. No portion of this work should be submitted for academic credit without proper authorization and citation.
