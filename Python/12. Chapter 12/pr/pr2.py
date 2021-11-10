list1 = [1,2,3,4,5,6,7]

for index,item in enumerate(list1):
    if index>0 and index%2==0:
        print(item,end=" ")