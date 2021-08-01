import math
def decimalToBinary(n):
    return bin(n).replace("0b", "")
a = int(input())
lis = []
for i in range(a):
    n = int(input())
    val = [int(i) for i in input().split()]
    a = math.floor(n/2)
    val.sort()
    binary=[]
    for i in val:
        binary.append(decimalToBinary(i))
    leng = len(binary[n-1])
    for l in range(n-1):
        if len(binary[l])<leng:
            l = "0"*(leng-len(binary[l])) + l
    x="0"*leng
    x=list(x)
    for j in range(leng):
        num1s=0
        for k in binary:
            if k[j]==1:
                num1s = num1s + 1
        if(num1s==n):
            x[j]="1"
    converted = ""
    for i in x:
        converted = converted + i
    x = int(converted, 2)
    OR = int("1"*leng,2)  
    for m in val:
        OR = OR | (x^m)

    temp = [x,OR]
    lis.append(temp)
for c in lis:
    print(c[0]," ",c[1])