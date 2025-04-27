MyHashTable.java
Custom implementation of a HashTable without using Java’s built-in collections like HashMap.

Uses separate chaining (linked lists) to resolve collisions.

Supports basic operations:

put(K key, V value) — Insert key-value pair.

get(K key) — Retrieve value by key.

remove(K key) — Delete key-value pair.

contains(V value) — Check if value exists.

getKey(V value) — Retrieve key associated with a value.

size() — Return the number of stored key-value pairs.

printBucketSizes() — Print the number of elements in each bucket for distribution analysis.

MyTestingClass.java
Custom class for testing HashTable.

Implements its own hashCode() method (not using Objects.hash() or any built-in methods).

Designed to provide a uniform distribution of hash codes for effective hash table performance.

TestHashTable.java
Adds 10,000 random objects into the HashTable.

Prints the number of elements in each bucket to check the hash code distribution.

Tests basic operations such as insertion and retrieval.

Part 2 — Binary Search Tree (BST<K, V>)
BST.java
Custom Binary Search Tree implementation without using recursion for major operations.

Supports:

put(K key, V value) — Insert key-value pair.

get(K key) — Retrieve value by key.

delete(K key) — Remove a node with a given key.

size() — Return the total number of elements.

Implements a non-recursive in-order traversal using a stack (BSTIterator).

Provides a custom iterator to iterate over key-value pairs in ascending key order.

Defines an inner Entry<K,V> class to easily access both key and value during iteration.

TestBST.java
Tests:

Insertion of elements into BST.

Retrieval of specific keys.

In-order traversal using for-each loop.

Deletion of a node and re-traversal to confirm correct structure.

Size validation after operations.

Key Concepts and Algorithms
HashTable:
A hash function is used to compute an index in an array where data is stored.

If multiple keys hash to the same index, a linked list (chaining) is used to store multiple entries at that index.

Binary Search Tree:
BST maintains the property:

Left subtree contains keys less than the parent key.

Right subtree contains keys greater than the parent key.

In-order traversal yields elements in ascending order.

No recursion is used in traversal or insertion/deletion operations — only loops and stacks.

How to Run
Open IntelliJ IDEA.

Create a new Java Project.

Copy all .java files into the src folder.

Run:

TestHashTable.java to test HashTable functionality.

TestBST.java to test BST functionality.

Additional Notes
HashTable is optimized for uniform distribution using a well-designed hashCode() method.

BST is capable of providing sorted traversal and easy access to both keys and values during iteration.

No recursion is used anywhere — explicit loops and stacks are applied.
