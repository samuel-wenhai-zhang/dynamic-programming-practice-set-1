# Dynamic Programming Practice Set #1

## Square.java

Problem: 	read in a large square of 1’s and 0’s and find the area of the biggest square consisting of only 1’s

Input: 	The first number in the data file represents the number of data sets to follow. the first line of each data set will consist of a number n, the size of the square. the next n lines will represent one row of the square.

data file: 	square.dat

Output: 	the area of the largest square of 1’s

Assumptions: 	none

Sample Input: 	
```
2
3
1 1 1
0 1 1
0 1 0
8
1 1 1 1 1 1 0 0
0 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1
1 0 1 1 1 1 1 1
1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1
0 1 1 0 1 1 0 0
```

Sample Output: 
```
4
36
```

## DigitSum.java

Problem: 	The digit sum of an integer is the sum of every digit in the integer. Given an integer N, find the sum of all digit sums from 0 to N, inclusive.

Input: 	The first number in the data file represents the number of data sets to follow. The first line of each data set will consist of one integer N, denoting the number of test cases. The next N lines will each consist of a single integer K

data file: 	digitsum.dat

Output: 	output the sum of all digit sums from 0 to N inclusive

Assumptions: 	K <= 10^15, answer <= 2^63 - 1

Sample Input: 	
```
5
6
10
999
456
12345678912
```

Sample Output: 
```
21
46
13500
4809
547782344736
```
