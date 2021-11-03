from queue import Queue

# *************************************************************************
def recamanUntil(p):
    n = 1
    r = 0  # First term of series
    rs = [r]
    seen = set(rs)
    blnNew = True
    while not p(seen, n, r, blnNew):
        r = recamanSucc(seen, n, r)
        blnNew = r not in seen
        seen.add(r)
        rs.append(r)
        n = 1 + n
    return rs

def recamanSucc(seen, n, r):
    back = r - n
    return n + r if 0 > back or (back in seen) else back
# *************************************************************************

def recaman(n_temp):
    return recamanUntil(lambda seen, n, r, _: n_temp == n)

t = int(input())
while(t>0):
    t = t - 1
    [n, k, y] = (int(x) for x in input().split())
    rec_seq_set = recaman(n)
    rec_seq_list = list(rec_seq_set)
    min_pair = [1000000,1000000]
    ans = "-1"
    for i in range(n):
        q = Queue(maxsize = 2*k)
        for j in range(i-k,i+k+1):
            if(i==j or j<0 or j>=n):
                continue
            q.put([rec_seq_list[i],rec_seq_list[j]])
        while (not q.empty()):
            temp = q.get()
            if((y-temp[0]*temp[1]) in rec_seq_set):
                # TBC
                # a_temp = min(temp[0],temp[1])
                # b_temp = max(temp[0],temp[1])
                a_temp = temp[0]
                b_temp = temp[1]
                if (min_pair[0] * min_pair[1] > temp[0] * temp[1]):
                    min_pair[0] = a_temp
                    min_pair[1] = b_temp
                elif (min_pair[0] * min_pair[1] == temp[0] * temp[1]):
                    if(min_pair[0]>a_temp):
                        min_pair[0] = a_temp
                        min_pair[1] = b_temp
                    elif(min_pair[0]==a_temp and min_pair[1]>b_temp):
                        min_pair[0] = a_temp
                        min_pair[1] = b_temp
                ans = str(min_pair[0]) + " " + str(min_pair[1]) + " " + str(y - min_pair[0] * min_pair[1])
    print(ans)