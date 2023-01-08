# Task2
Class InputParser in Utility packahge is used in task 1 and 2 to get input from user and create ArrayList.
PairFinder contains one method which sorts list ofIntegers, creates list of Pairs, then filters all pairs based on condition that sum is 13. Class uses Stream API. 
In this aproach we find all pairs then only filter them, making redundant pairs. 

Another aproach that will save number of operation is to sort list, and checks if pair sums up to 13 before creating pair. 
