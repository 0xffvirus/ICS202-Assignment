# Java Data Structures Implementation

This repository contains implementations of fundamental data structures in Java, specifically a Priority Queue for emergency room patient management and a generic Singly Linked List.

## 📁 Project Structure

```
HM2/
├── PriorityQueue.java          # Emergency room priority queue implementation
├── ProiorityQueue_driver.java  # Priority queue demonstration driver
├── SLL.java                    # Generic singly linked list implementation
├── SLL_driver.java             # Singly linked list demonstration driver
└── README.md                   # This file
```

## 🏥 Priority Queue Implementation

### Overview
The `PriorityQueue` class implements a priority queue specifically designed for emergency room patient management. Patients are assigned priority levels and served based on their urgency.

### Priority Levels
- **CRITICAL (0)** - Highest priority, served first
- **SERIOUS (1)** - Medium priority
- **FAIR (2)** - Lowest priority, served last

### Features
- ✅ Add patients with specified priority levels
- ✅ Serve patients in priority order (Critical → Serious → Fair)
- ✅ Check next patient in queue without removing them
- ✅ Get count of patients waiting
- ✅ Check if queue is empty
- ✅ Maintain queue size

### Key Methods
```java
// Add a patient to the queue
public void addPatient(String name, int priority)

// Serve the next highest priority patient
public String serveNextPatient()

// Peek at the next patient without removing them
public String nextPatientInQueue()

// Get the number of patients waiting
public int patientsWaitingList()

// Check if queue is empty
public boolean isEmpty()

// Get current queue size
public int size()
```

### Usage Example
```java
PriorityQueue er = new PriorityQueue();
er.addPatient("Alice", er.FAIR);
er.addPatient("Bob", er.CRITICAL);
er.addPatient("Charlie", er.SERIOUS);

System.out.println("Serving next patient: " + er.serveNextPatient()); // Bob (Critical)
System.out.println("Next patient: " + er.nextPatientInQueue());       // Charlie (Serious)
```

## 🔗 Singly Linked List Implementation

### Overview
The `SLL` class is a generic singly linked list implementation that provides comprehensive functionality for list operations.

### Features
- ✅ Generic type support (`SLL<T>`)
- ✅ Add elements to head or tail
- ✅ Delete elements from head or tail
- ✅ Delete specific elements
- ✅ Search for elements
- ✅ Check if list contains an element
- ✅ Reverse the list
- ✅ Get list size
- ✅ Check if list is empty
- ✅ String representation

### Key Methods
```java
// Add element to the beginning of the list
public void addToHead(T el)

// Add element to the end of the list
public void addToTail(T el)

// Remove and return the first element
public T deleteFromHead()

// Remove and return the last element
public T deleteFromTail()

// Remove a specific element
public void delete(T el)

// Search for an element and return the node
public SLLNode<T> search(T el)

// Check if list contains an element
public boolean contains(T el)

// Reverse the list
public void reverse()

// Get the number of elements
public int size()

// Check if list is empty
public boolean isEmpty()
```

### Usage Example
```java
SLL<Integer> list = new SLL<>();
list.addToHead(1);
list.addToHead(2);
list.addToHead(3);
System.out.println(list); // [ 3 2 1 ]

list.deleteFromHead();
System.out.println(list); // [ 2 1 ]

list.reverse();
System.out.println(list); // [ 1 2 ]
```

## 🚀 How to Run

### Compile and Run Priority Queue Demo
```bash
javac PriorityQueue.java ProiorityQueue_driver.java
java ProiorityQueue_driver
```

### Compile and Run Singly Linked List Demo
```bash
javac SLL.java SLL_driver.java
java SLL_driver
```

## 📋 Sample Output

### Priority Queue Demo Output
```
Serving next patient: Bob
Serving next patient: Ethan
Next patient in queue: Charlie
----------------------------
Patients waiting list: 3
----------------------------
Serving next patient: Charlie
Serving next patient: Alice
Serving next patient: Diana
No patients to serve.
```

### Singly Linked List Demo Output
```
true
[ 3 2 1 ]
[ 2 1 ]
[ 1 2 ]
```

## 🛠️ Technical Details

### Priority Queue Implementation
- Uses a singly linked list structure internally
- Maintains patients in priority order (lower numbers = higher priority)
- Handles same-priority patients with FIFO ordering
- Efficient insertion and removal operations

### Singly Linked List Implementation
- Uses a dummy head node for simplified operations
- Maintains both head and tail references for efficient operations
- Generic implementation supports any comparable type
- Includes comprehensive error handling for edge cases

## 📝 Notes

- The Priority Queue is specifically designed for emergency room scenarios
- Both implementations include comprehensive driver programs for testing
- All methods include proper null checking and edge case handling
- The code follows Java naming conventions and best practices

## 🤝 Contributing

Feel free to submit issues, fork the repository, and create pull requests for any improvements.

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
