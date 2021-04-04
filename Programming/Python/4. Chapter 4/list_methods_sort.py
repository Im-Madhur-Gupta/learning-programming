# list sort - arranges the elemets in increasing/ascending order (by default)
# it changes the actual list
l1 = [1,4,6,True,False,894,7,2,1,0,-8]
# as True = 1 (vice-versa) and False = 0 (vice-versa)
l1.sort() # l1 has been sorted and modified for storage purpose
print(l1)
# l1_sorted = l1.sort() --> is invalid
# sort() function has return value None (void)

# For sorting in Descending/decreasing order-
l2=[1,2,4,6,89,1,3,0.1,-11,-2]
l2.sort(reverse=True)
# by defualt the reverse arguement of sort remained False (ascending/increasing)
print(l2)
# this could have also been achieved using using default sort then a reverse.