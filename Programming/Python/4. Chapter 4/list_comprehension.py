# name se samajh aa araha he , ki we are trying to make a list

list1 = [x for x in range(11)]  # a list with numbers from 0 to 10
print(list1)
# we can also add any condition on x,
# a list with numbers from 0 to 10 which are even -
list2 = [x for x in range(11) if x % 2 == 0]
print(list2)

list3 = [[x, y] for x in range(1, 6) for y in range(1, 4) if x+y == 3]
# it basically helps us to create all required permutations easily and we can also apply any condition on it.
print(list3)

list4 = [[x,y,z] for x in range(1,3) for y in range(1,3) for z in range(1,2) if x+y+z != 4]
print(list4)

# SAME THING CAN BE DONE USING LOOPS, but it would require effort.    