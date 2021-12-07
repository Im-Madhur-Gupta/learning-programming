# zip function is used to create an iterator of tuple pairs.
list1=[1,2,3,4,5]
list2=["A","B","C","D","E"]

x = zip(list1,list2) # The tuple pairs would be formed using the elements in the given lists.
print(x)
print(type(x))

# now we can type cast the zip object to types like list, tuple, set etc.
answer = list(x)
print(answer)