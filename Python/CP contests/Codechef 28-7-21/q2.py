import math
# odd even wali approach sahi ni he, gcd approach is best.
a = int(input())
l = []
for i in range(a):
    val = [int(i) for i in input().split()]
    a = val[0]
    b = val[1]
    if math.gcd(a,b)>1:
        num_of_incr=0
    elif math.gcd(a+1,b)>1 or math.gcd(a,b+1)>1:
            num_of_incr = 1
    else: # ye sirf (1,1) wala ni he
        num_of_incr=2
    l.append(num_of_incr)
for j in l:
    print(j)