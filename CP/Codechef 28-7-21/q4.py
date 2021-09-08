import math


def decimalToBinary(n):
    return bin(n).replace("0b", "")


ans = []

for i in range(int(input())):
    n = int(input())
    arr = [int(i) for i in input().split()]
    arr.sort()

    leng = len(decimalToBinary(arr[n-1]))

    # MVP Point -
    # sari ith bits 0 to x ki ith bit 0, sari ith bits 1 to x ki ith bit 1, kuch ith bits 0 aur kuch 1 to x ki ith bit kuch bhi ho sakti he doesn't matter
    # So, x is just the bitwise AND of all elements of array. (Actually OR bhi kar sakte he)
    x = int("0b"+leng*"1", 2)
    for k in arr:
        x = x & k

    OR = 0b0
    for m in arr:
        OR = OR | (x ^ m)

    ans.append([x, OR])

for c in ans:
    print(c[0], " ", c[1])
