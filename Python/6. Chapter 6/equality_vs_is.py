# ' == ' --> equality check, checks whether values are same or not
# ' is ' operator checks whether both the operands point to the same obejct in memory or not
#        i.e whether they have same memory address or not

# ( object_1 is object_2 ) is same as ( id(object_1) == id(object_2) )

l1 = [1, 2, 3, 4]
l2 = [1, 2, 3, 4]

if l1 == l2:  # True will be printed as values and their order in list are same
    print(True)
else:
    print(False)


if l1 is l2:  # False will be printed as both the list/operands point to different objects in memory
    print(True)
else:
    print(False)

# (not is) is just negation of (is)

x = 5
if(type(x) is int):  # or (type(x) == int)
    print("yes")

a = True
b = False
if(a is not b):
    print("yes")

