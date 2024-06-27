# Bitwise Operator

### Binary number representation]

**Example 1**
> 8 in binary **1 0 0 0**    
> = 1 x (2^3) + 0 x (2^2) + 0 x (2^1) + 0 x (2^0)   
> = 8 + 0 + 0 + 0


**Example 2**
> 6 in binary **1 1 0**     
> = 1 x (2^2) + 1 x (2^1) + 0 x (2^0)   
> = 4 + 2 + 0

**Example 3**
> 9 in binary  **1 0 0 1**     
> = 1 x (2^3) + 0 x (2^2) + 0 x (2^1) + 1 x (2^0)   
> = 8 + 0 + 0 + 1


---

### AND (&)

Returns a bit-wise AND of two integers. Each bit of the result is 1 if both corresponding bits of the operands are 1;
  otherwise, it's 0.


| Operand 1 | Operand 2 | Result |
|-----------|-----------|--------|
| 0         | 0         | 0      |
| 0         | 1         | 0      |
| 1         | 0         | 0      |
| 1         | 1         | 1      |


**Note: '&' is useful in finding mod value** 

    9 % 10 == 9 & 9
    9 & 3) == 9 % 4


---

### OR (|)

Returns a bit-wise OR of two integers. Each bit of the result is 0 if both corresponding bits of the operands are 0;
  otherwise, it's 1.

| Operand 1 | Operand 2 | Result |
|-----------|-----------|--------|
| 0         | 0         | 0      |
| 0         | 1         | 1      |
| 1         | 0         | 1      |
| 1         | 1         | 1      |


---

### XOR (^)

- Returns a bit-wise XOR (exclusive OR) of two integers. Each bit of the result is 1 if the corresponding bits of the
  operands are different; otherwise, it's 0.

| Operand 1 | Operand 2 | Result |
|-----------|-----------|--------|
| 0         | 0         | 0      |
| 0         | 1         | 1      |
| 1         | 0         | 1      |
| 1         | 1         | 0      |


**Note**

1. **Number XOR with same number will be Zero (5^5 = 0)**
2. **Any number XOR with zero will be same number (5^0 = 5)**
---

### Negation (~)

- Inverts all the bits of its operand. If the operand is `x`, then `~x` is equal to `-x - 1`.

| Operand | Result | 
|---------|--------|
| 0       | -1     |
| 1       | -2     |
| 2       | -3     |
| ...     | ...    |



---

### Left Shift (<<)
**8 in binary is 1000** 

**Example 1**
> 1000 << 1 = 10000 (16)

**Example 2**
> 1000 << 2 = 100000 (32)

 **Note: Left shift by 1 mean multiply by 2**

---

### Right Shift (>>)
**8 in binary is 1000**

**Example 1**
>1000 >> 1 = 0100 (4)

**Example 2**
>1000 >> 2 = 0010 (2)

### Note: Right shift by 1 means dividing by 2

---

### Addition in Binary numbers

Each bit is added according to standard binary addition rules, where:

- 0 + 0 = 0
- 0 + 1 = 1
- 1 + 0 = 1
- 1 + 1 = 10 (carry 1 to the next higher bit)

|  Binary   | Decimal |
|:---------:|:-------:|
|   0011    |    3    |
|  + 0101   |    5    |
| --------- | ------- |
|   1000    |    8    |

### Subtraction in Binary numbers

To do subtraction **9 and 3** we need to take **2's** compliment of the second number

- Step 1: Negate all bit (0011) = 1100 **(4 digit if required prefix 1 to form 8 digit)**
- Step 2: Add **1** to it become 1101
- Step 3: Add binary both numbers

|  Binary   | Decimal |
|:---------:|:-------:|
|   1001    |    9    |
|  - 1101   |    3    |
| --------- | ------- |
|   0110    |    6    |


