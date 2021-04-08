# 1. set_name.add(element)
# adds an element to a set
# if the element is already present then the new entry is discarded


# 2. To obtain number of elements in a set-
# len(set_name)
a = {1,2,3,4,1}
print(len(a))


# 3. To remove an item -
# set_name.remove(item)
# it removes an item from the actual set
# agr aisi value remove karne ki koshish ki jo set me he hi ni to error ayega
a.remove(2)
print(a)


# 4. set_name.pop() 
# removes an arbitary/random element and also returns it
temp=a.pop()
print(a)
print(temp)
# if the set is empty then it will throw error


# 5. set_name.clear()
# will remove all elements of the set


# 6. UNION Of Two or More Sets -
# union_of_sets = set1_name.union( set2_name , set3_name , ......)
# .union() returns a new set that is the union of the given sets
# if no arguements are passed to set_name.union(), it returns a copy of set_name
# Union can also be found using OR operator ' | '
b={1,2,3,4}
c={2,5,6}
d={7,2,3}
union_of_sets = b.union(c,d) # alt - union_of_sets = b | c | d 
print(union_of_sets)
# original sets ko koi pharak ni padega


# 7. INTERSECTION Of Two or More Sets -
# intersec_of_sets = set1_name.intersection( set2_name , set3_name , .......)
# .intersection() returns a new set that is the intersection of the given sets
# intersection could also be found using AND operator ' & '
# if no arguements are passed to set_name.intersection(), it returns a copy of set_name
print(b & c & d)
# original sets ko koi pharak ni padega


# 8. DIFFERENCE of Two or More Sets -
# set1_name.difference( set2_name , set3_name , .......)
# Difference could also be found using ' - '
# it returns a set that is diff. of (1st - 2nd - 3rd - ........)
# original sets ko koi pharak ni padega
diff1 = b-c
print(diff1)
print(b.difference(c,d)) # alt - print(b-c-d)