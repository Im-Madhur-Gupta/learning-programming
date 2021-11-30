# Reduce Function - Apply a function of two arguments cumulatively to the items of a sequence, from left to right, so as to reduce the sequence to a single value.
from functools import reduce

l1 = [1,2,4,-1,21,3,1]

def max(a,b):
    if a>b:
        return a
    else:
        return b

largest = reduce(max,l1)
print(largest)