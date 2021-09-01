import math

l = 55
p = 30
# m = (3**p - l - 2) / (2 * p)
# if (m < 0):
#     m = 0
# else:
#     m = math.ceil(m)
#     print(m)
# q = int((3**p-1)/2) - m * p

b = int((3**p-1)/2)
if(b > l):
    print("b>l")
    m = math.ceil((b-l)/p)
    print(m)
else:
    m = 0
q = b-m*p

# 151970818238211616 cpp
# if m>((b-1)/p):
#     print(True)

print(q)
