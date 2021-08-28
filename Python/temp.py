import math
def knuth(n):
    return int(((3**n)-1)/2)

for i in range(600):
    print(knuth(i),"\n")