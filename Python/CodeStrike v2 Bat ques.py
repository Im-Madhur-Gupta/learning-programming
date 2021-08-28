def calc_m(b, p, l):
    m = 0
    while(b-m*p > L):
        m += 1
    return m

L, K = map(int, input().split())
path = [0 for i in range(0, L)]

for j in range(K):
    p, h, s = input().split()
    p = int(p)
    h = int(h)

    b = int((3**p-1)/2)
    m = calc_m(b, p, L)
    q = b-m*p
    
    if(s == "+"):
        path[p-1] += h
        if(q<L):
            path[q] -= h
    else:
        path[p-1] -= h
        if(q<L):
            path[q] += h


point=path[0]
next_point=path[0]
abs_diff=0
for k in range(1,L):
    next_point += path[k]
    if(abs(point-next_point) > abs_diff):
        abs_diff = abs(point-next_point)
    point = next_point

print(abs_diff)