# Sorting

## theory

Use Case:
- Sorting is an algorith that converts unsorted set of values to sorted set of values 

## Algorithms 
1. Bubble sort - send the larger element to end of list
2. Insertion sort - 
3. Selection sort - send smaller element to beginning of the list
4. Merge sort (IMP) - 
5. Quick sort (IMP) - 

### in-built sorting : 
Arrays.sort(arr) - Tim/hybrid sort - combination of merger sort and insertion sort
TC : O(NlogN)
SC : O(1)

### Bubble sort - TC : O(N^2)

#### Approach - sending the larger elemets to end
1. if the adject value is not in ascending order then swap

#### Dry run - 
i/p : [5,1,4,2,8]
o/p : [1,2,4,5,8]

[5 1 4 2 8]
 i j

iteration (1) - 5,1,4,2,8 -> 1,5,4,2,8 (swap 5>1) -> 1,4,5,2,8 (swap 5>4) -> 1,4,2,5,8 (swap 5>2) -> 1,4,2,5,8 (no swap 5<8)
iteration (2) - 1,4,2,5,8 -> 1,4,2,5,8 (no swap 1<4) -> 1,2,4,5,8 (swap 4>2) -> 1,2,4,5,8 (no swap 4<5) -> 1,2,4,5,8 (no swap 5<8)
iteration (3) - everything will be sorted (all the other elements are in ascending order)

### Selection sort - TC : O(N^2)

#### Approach - sending the smaller elemets to beginning
1. in the range of 0 to n - find the smallest element and place at index 0
2. in the range of 1 to n - find the smallest element and place at index 1
3. in the range of 2 to n - find the smallest element and place at index 2

#### Dry run - 
i/p : [64,25,12,22,11] length=4
o/p : [11,12,22,25,64]

iteration (1) - smallest element from index 0 to 4 is 11 -> [11,64,25,12,22] 
iteration (2) - smallest element from index 1 to 4 is 12 -> [11,12,64,25,22] 
iteration (3) - smallest element from index 2 to 4 is 22 -> [11,12,22,64,25] 
iteration (4) - smallest element from index 3 to 4 is 25 -> [11,12,22,25,64] output



## COMPARATOR in java
