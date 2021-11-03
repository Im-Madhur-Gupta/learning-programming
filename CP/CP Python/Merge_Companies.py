# cook your dish here
MAXN = 100000
K = 20

logg = [0] * (MAXN + 1)
st = [[0] * (K + 1) for _ in range(MAXN)]

if __name__== '__main__':
    logg[1] = 0
    for i in range(2, MAXN + 1):
        logg[i] = logg[i // 2] + 1
    
    n = int(input())
    
    sum = [0] * (n + 1)
    sum[0] = 0
    
    a = list(map(int, input().split()))
    for i in range(n):
        sum[i + 1] = sum[i] + abs(a[i])
    
    for i in range(n):
        st[i][0] = abs(a[i])
    
    for j in range(1, K + 1):
        i = 0
        while i + (1 << j) <= n:
            st[i][j] = min(st[i][j - 1], st[i + (1 << (j - 1))][j - 1])
            i += 1
    
    neg_count = [0]*(n + 1)
    neg_count[0] = 0
    count = 0
    
    for i in range(n):
        if a[i] < 0:
            count += 1
            neg_count[i + 1] = count
        else:
            neg_count[i + 1] = count
    
    q = int(input())
    
    for i in range(q):
        l, r = map(int, input().split())
        
        if r == l:
            print(a[r-1])
        
        elif ((neg_count[r] - neg_count[l-1]) == r - l + 1) or ((neg_count[r] - neg_count[l-1]) == 0):
            j = logg[r - l + 1]
            minimum = min(st[l-1][j], st[(r - 1) - (1 << j) + 1][j])
            
            print(sum[r] - sum[l-1] - minimum * 2)
        
        else:
            print(sum[r] - sum[l-1])
