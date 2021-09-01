import math
abs_diff = []

for t in range(int(input())):
    L, K = map(int, input().split())
    path = [0]*L

    for j in range(K):
        p, h, s = input().split()
        p = int(p)
        h = int(h)

        b = int((((3**p) % (7+10**9))-1)/2)
        if(b > L):
            m = math.ceil((b-L)/p)
        else:
            m = 0
        q = b-m*p

        if(s == "+"):
            path[p-1] += h
            if(q < L):
                path[q] -= h
        else:
            path[p-1] -= h
            if(q < L):
                path[q] += h

    point = path[0]
    next_point = path[0]
    ans = 0
    for k in range(1, L):
        next_point += path[k]
        if(abs(point-next_point) > ans):
            ans = abs(point-next_point)
        point = next_point

    print(ans)
