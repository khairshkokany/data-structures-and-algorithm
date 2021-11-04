# Hashtables
## Challenge

1. addHash

Arguments: key, value
- Returns: nothing
- This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
2. hashGet
- Arguments: key
- Returns: Value associated with that key in the table
3. contains

- Arguments: key
- Returns: Boolean, indicating if the key exists in the table already.

4. hash

- Arguments: key
- Returns: Index in the collection for that key

## Approach & Efficiency
For each method I took the approach that was most efficient:
- AddHash - Big O space of n (linear) and time of O(1).
- getHash - Big O space of 1 (Constant) and time of O(1).
- contains - Big O space of 1 (Constant) and time of O(1).
- hash - Big O space of 1 (Constant) and time of O(1).

## API
* .addHash Return nothing .
* .getHash Return Value associated with that key in the table .
* .contains Return indicating if the key exists in the table already.
* .hash Return Index in the collection for that key.


