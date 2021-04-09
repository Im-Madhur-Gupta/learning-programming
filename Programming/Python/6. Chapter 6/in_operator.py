# (in) and (not in) are called membership operators of python
# The ‘in’ operator is used to check if a value exists in a sequence or not.
# similar for (not in)

a = [1, 2, 3, 4]  # a list
b = (1, 2, 3)  # a tuple
c = {1, 2, 3}  # a set
d = {1: 1, 2: 4}  # a dictionary

if(1 in a):
    print("works for list")

if(1 in b):
    print("works for tuple")

if(1 in c):
    print("works for set")

# if({1:1} in d):
#     print("works for a dictionary")
# else:
#     print("doesn't work for a dictionary")


# So, the sequence can be list, tuple and set but not a dictionary.


if(7 not in c):
    print("a check for not in")
