# Hashing


Hashing is the process of taking an input (or 'message') and applying a mathematical function (hash function) to it to produce a fixed-size string of characters, which is typically a hexadecimal number. This output is called a hash value, hash code, or simply hash.

### Key Characteristics of Hashing:
1. **Deterministic**: For the same input, the hash function always produces the same hash value.
2. **Fast Computation**: Hash functions are designed to be computationally efficient, allowing them to process large amounts of data quickly.
3. **Fixed Output Size**: Regardless of the size of the input, the hash function produces a hash value of fixed size.
4. **Pre-image Resistance**: It should be computationally impractical to reverse the hash value to obtain the original input (one-way function).

### Uses of Hashing:
- **Data Integrity**: Hash functions are commonly used to verify data integrity. By comparing hashes before and after transmission or storage, one can check if the data has been altered.
- **Data Retrieval**: Hash tables use hash functions to map data (keys) to specific locations in memory, allowing for efficient retrieval.
- **Password Storage**: Hash functions are used to securely store passwords. Instead of storing passwords directly, systems store their hash values. During authentication, if the computed hash matches the stored hash, the password is considered correct.
- **Cryptographic Applications**: Hash functions are used in digital signatures, message authentication codes (MACs), and various cryptographic protocols.


---

A **hash collision** occurs when two different inputs into a hash function produce the same hash value as output. 
In other words, the hash function maps two distinct inputs to the same hash value, creating a collision.

### Key Points about Hash Collisions:
1. **Unavoidable with Finite Output**: Since hash functions map an infinite number of possible inputs to a finite number of hash values (due to the fixed size of the hash output), collisions are theoretically unavoidable.

2. **Probability**: A good hash function minimizes the likelihood of collisions occurring for any given set of inputs. This is achieved through properties like uniformity (where each output hash value is equally likely) and avalanche effect (where small changes in input produce drastically different hash outputs).

3. **Impact**: In many applications, such as cryptographic algorithms or hash tables used for data storage and retrieval, collisions are undesirable because they can lead to unexpected behavior or security vulnerabilities. For example, in a hash table, collisions can slow down retrieval times if not handled efficiently.

4. **Hash Function Quality**: The quality of a hash function is often assessed by its resistance to collisions. Cryptographically secure hash functions are designed to make it computationally difficult to find collisions intentionally.

5. **Handling Collisions**: Techniques like chaining (using linked lists or other structures to handle multiple entries with the same hash value) or open addressing (finding alternative slots for colliding entries within the same hash table) are used to manage collisions in hash tables.


### How to handle Hash Collisions
Hash collisions occur when two different inputs to a hash function produce the same hash value. Handling hash collisions depends on the specific hashing technique being used. Here are common approaches to handle collisions:

1. **Separate Chaining (Hash Table with Linked Lists)**:
    - Maintain a data structure like a linked list at each bucket of the hash table.
    - When a collision occurs, append the new key-value pair to the linked list at the corresponding bucket.
    - Lookup involves computing the hash, then searching the linked list for the key.

2. **Open Addressing**:
    - In open addressing, all elements are stored in the hash table itself, usually by probing into other slots if a collision occurs.
    - Common probing techniques include Linear Probing, Quadratic Probing, and Double Hashing.
    - When inserting, if a collision occurs, the algorithm searches for the next open slot (according to the probing strategy) to place the item.

