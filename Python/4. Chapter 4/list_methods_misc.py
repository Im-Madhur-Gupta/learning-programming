# LENGTH OF LIST
l1 = [1, 4, 6, 8, 7]
print(len(l1))
# len(list_name) returns the num. of elements of the list



# DELETING ALL ELEMENTS OF A LIST IN 1 COMMAND
l2 = [1, 24, 687, 979, True]
l2.clear()
print(l2)



# COUNTING THE NUMBER OF TIMES X APPEARS IN THE LIST
l3 = [False, 1, 2, 1, 1, 1, 0, 4, 3, 2, True, True]
print(l3.count(1))
print(l3.count(0))
print(l3.count(2))
print(l3.count(True))
print(l3.count(False))
# as True = 1 = 1.0 (vice-versa) and False = 0 = 0.0 (vice-versa)
# while counting 1 we get 6
# while counting 0 we get 2
# while counting True we get 6
# while counting False we get 2



# FINDING THE INDEX CORRESPONDING TO A VALUE IN LIST
# list_name.index(value, start index(included), end index(excluded))
# the start and end index are just like in slicing

l4= [1,2,3,4,6,8,9,True]
# as True = 1 = 1.0 (vice-versa) and False = 0 = 0.0 (vice-versa)
print(l4.index(True))

# print(l4.index(8,1,5)) --> will return an error as 8 isn't in the specified start and end
print(l4.index(8,1,6)) # --> will return 5
# The return index is computed relative to the
# beginning of the full list rather than that corresponding to start index.




# TO SUM THE NUMBERS IN A LIST/TUPLE -
# sum(list_name,start index)
# start index is optional, default 0