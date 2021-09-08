import math
for t in range(int(input())):
    L, K = map(int, input().split())
    llist = [0 for i in range(0, L)]
    ans = 0

    for _ in range(K):

        p, h, s = input().split()
        p = int(p)
        h = int(h)

        b = 3*p
        if(b > L):
            m = math.ceil((b-L)/p)
        else:
            m = 0
        q = b-m*p

        for sub in range(p, q+1):
            if(s == "+"):
                llist[sub-1] += h
            else:
                llist[sub-1] -= h

    for dif in range(L-2):
        if(abs(llist[dif]-llist[dif+1]) > ans):
            ans = abs(llist[dif]-llist[dif+1])

    print(ans)
