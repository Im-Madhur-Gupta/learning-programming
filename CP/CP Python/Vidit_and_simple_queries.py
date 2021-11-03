from bisect import bisect_left
from functools import cmp_to_key
class Node:
    blk=None
    l=None
    r=None
    k=None
    ind=None
    def __init__(self) -> None:
        self.blk=550
        self.l=0
        self.r=0
        self.k=0
        self.ind=0

blk=550
m=[0]*200005
odd1=0
oddg1=0
even2=0
eveng2=0
cnt=0


def compare(a,b):
    if(a.l//blk != b.l//blk):
        return b.l//blk - a.l//blk
    return b.r-a.r

def add(x):
    global odd1,oddg1,even2, eveng2, cnt
    if m[x]<0:
        m[x]+=1
        return
    if m[x] == 0:
        odd1+=1
    elif m[x] == 1:
        odd1-=1
        even2+=1
    elif m[x] == 2:
        even2-=1
        oddg1+=1
    elif m[x] % 2 == 1:
        oddg1-=1
        eveng2+=1
    else:
        eveng2-=1
        oddg1+=1
    m[x]+=1
    if(m[x]%2==1):
        cnt +=1
    else:
        cnt-=1

def remove(x):
    global odd1,oddg1,even2, eveng2, cnt
    if m[x]<=0:
        m[x]-=1
        return
    if m[x] == 1:
        odd1-=1
    elif m[x] == 2:
        odd1+=1
        even2-=1
    elif m[x] == 3:
        even2+=1
        oddg1-=1
    elif m[x] % 2 == 1:
        oddg1-=1
        eveng2+=1
    else:
        eveng2-=1
        oddg1+=1
    m[x]-=1
    if(m[x]%2==1):
        cnt +=1
    else:
        cnt-=1

def get(k,len):
    global odd1,oddg1,even2, eveng2, cnt
    if (abs(cnt-k) & 1) != 0 or k > len:
        return -1
    if k == cnt:
        return 0
    elif k<cnt:
        return (cnt-k)//2
    else:
        delta = k-cnt
        if delta <= 2 * (even2+eveng2):
            return delta//2
        else:
            return delta - eveng2 - even2
    

for _ in range(int(input())):
    [n,q] = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    temp = [x for x in a]
    
    set_ = set(temp)
    temp.clear()
    temp = [x for x in set_]
    temp.sort()
    for i in range(len(temp)):
        m[i] = 0
    for i in range(n):
        a[i] = bisect_left(temp, a[i])
    qry = [0]*q
    for i in range(q):
        qry[i] = Node()
        [qry[i].l, qry[i].r, qry[i].k] = [int(x) for x in input().split()]
        qry[i].l -= 1
        qry[i].r -= 1
        qry[i].ind = i
    # sorted(qry, key=cmp_to_key(compare)) --> slow
    qry.sort(key=cmp_to_key(compare)) # --> fast
    lp=0
    rp=-1
    cnt = odd1 = oddg1 = even2 = eveng2 = 0
    ans = [0]*q
    for i in range(q):
        l = qry[i].l
        r = qry[i].r
        while lp < l:
            remove(a[lp])
            lp+=1
        while l<lp:
            add(a[lp-1])
            lp-=1
        while (rp < r):
            rp+=1
            add(a[rp])
        while (rp > r):
            remove(a[rp])
            rp-=1
        ans[qry[i].ind] = get(qry[i].k,r-l+1)
    for i in range(q):
        print(ans[i])
    
        
    
    