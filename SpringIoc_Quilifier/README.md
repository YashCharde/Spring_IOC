# Spring IoC with @Qualifier Example

## Overview

This project demonstrates the use of **Spring IoC (Inversion of Control)** along with the **@Qualifier** annotation to resolve ambiguity when injecting dependencies into Spring beans.

The Spring IoC container manages the lifecycle and configuration of application objects. With the help of annotations like **@Autowired** and **@Qualifier**, Spring allows for automatic dependency injection.

The `@Qualifier` annotation helps when you have multiple beans of the same type, ensuring that the correct bean is injected into a field.

## Technologies Used

- **Java 8+**
- **Spring Framework** (Spring Core)
- **Maven** for dependency management and build automation

## Features

- Spring IoC container setup.
- **@Autowired** for automatic dependency injection.
- **@Qualifier** to specify which bean to inject when multiple beans of the same type exist.

