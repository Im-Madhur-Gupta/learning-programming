# List Comprehension -

list1 = [1,2,3,4,5,6]

list2 = [x for x in list1 if x%2==0]
print(list2)

list3 = [x for x in list1 if x>2]
print(list3)

list4 = [(x,y) for x in list1 for y in list1 if x%2==0 and y%2!=0]
print(list4)

list5 = [(x,y,z) for x in list1 for y in list1 for z in list1 if x%2==0 and y%2!=0 and z==3]
print(list5)


# Set Comprehension - Remember set doesnt allow duplicate values.

list_temp = [1,2,4,1,2,4,6,2,3]
set1 = {x for x in list1 if x%2==0}
print(set1)


# Dictionary Comprehension - Remember dictionary syntax - { key0:value0 , key1:value1 , .....}

dict1 = {x:y for x in list1 for y in list1 if x+y==5}
print(dict1)