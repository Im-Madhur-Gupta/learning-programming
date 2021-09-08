ans = []
for i in range(int(input())):
    N = int(input())
    arr = [int(i) for i in input().split()]
    odrprs=0
    
    countMap=dict() # maine dictionary / hash map ka use karke numbers ki freq store karwai.
    for i in range(N):
        if(arr[i] in countMap.keys()):
            countMap[arr[i]]+=1
        else:
            countMap[arr[i]]=1

    for i in countMap: # ek ek karke dictionary ki keys milti jaengi
            count = countMap[i]
            if(count==1):
                odrprs+=1
            else:
                if(count>(i-1)):
                    odrprs+=(i-1)
                else:
                    odrprs+=count
    ans.append(odrprs)
for j in ans:
    print(j)