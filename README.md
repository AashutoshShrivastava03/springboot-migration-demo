<div align="center">

# 🚀 Spring Boot Migration Demo

### Java 8 → 17 | Spring Boot 2.7 → 3.2

*A practical walkthrough of upgrading a Spring Boot application while maintaining stability.*

</div>

---

## 📌 Overview

This project demonstrates a **real-world migration of a backend application** from an older technology stack to a modern one.

Instead of directly upgrading versions, the migration was performed **incrementally**, ensuring that the application remained stable and functional at every stage.

---

## 🎯 Objective

* Upgrade Java from **8 → 17**
* Upgrade Spring Boot from **2.7 → 3.2**
* Handle breaking changes introduced in newer versions
* Validate the system with a working REST API

---

## ⚙️ Migration Strategy

The migration was executed in controlled steps:

### 1️⃣ Baseline Setup

* Spring Boot 2.7 + Java 8
* Verified successful build and test execution

---

### 2️⃣ Java Upgrade

* Updated project to Java 17
* Ensured compatibility with Spring Boot 2.7 before proceeding

---

### 3️⃣ Spring Boot Upgrade

* Upgraded Spring Boot to 3.2
* Identified breaking changes during build

---

### 4️⃣ Breaking Changes Handling

#### 🔴 Major Change:

```text
javax.* → jakarta.*
```

Example:

```java
// Before
import javax.persistence.Entity;

// After
import jakarta.persistence.Entity;
```

This change affects:

* JPA (Persistence)
* Validation APIs
* Servlet-related components

---

### 5️⃣ Functional Validation

* Implemented a simple CRUD API
* Verified application behavior post-migration

---

## 🧪 API Endpoints

| Method | Endpoint    | Description        |
| ------ | ----------- | ------------------ |
| POST   | `/products` | Create a product   |
| GET    | `/products` | Fetch all products |

---

## 🛠 Tech Stack

```
Java 17          → Runtime
Spring Boot 3.2  → Application framework
Spring Data JPA  → Persistence layer
Hibernate 6      → ORM
H2 Database      → In-memory database
Maven            → Build tool
```

---

## 🚧 Challenges Encountered

* Dependency compatibility issues during upgrades
* Handling `javax → jakarta` namespace migration
* Resolving build failures after version changes
* Managing Git conflicts while synchronizing project history

---

## 🧠 Key Learnings

* Migration should be **incremental, not direct**
* Always ensure a **stable build before moving to next step**
* Framework upgrades often introduce **breaking changes**
* Debugging dependency and configuration issues is a critical part of backend development
* Validating with real functionality is essential after migration

---

## 🧭 How to Approach This as a Learner

For developers learning backend systems, a structured approach helps:

1. Start with a **working project on an older version**
2. Upgrade **Java first**, then the framework
3. Run the application after each change
4. Identify and fix breaking changes one by one
5. Validate with a simple feature (like CRUD)

This approach helps in understanding **why things break during upgrades**, not just how to fix them.

---

## 🚀 How to Run

```bash
mvn clean install
mvn spring-boot:run
```

---

## 📊 Migration Outcome

* Application successfully upgraded to **Spring Boot 3.2**
* Running on **Java 17**
* REST APIs functional
* No breaking issues after migration

---

<div align="center">

**Developed by Aashutosh Shrivastava**

</div>
