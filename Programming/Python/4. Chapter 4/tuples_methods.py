# 1. tuple_name.count(value) -
# counts the number of times given value occurs in the tuple
t1 = (1,2,3,4,True,True,False,1.0)
print(t1.count(1))
# as True = 1 = 1.0 (vice-versa) and False = 0 = 0.0 (vice-versa)


# 2. tuple_name.index(value) -
# returns the index of first ocuurence of the given value
# if the value isn't present it returns an error
# as True = 1 = 1.0 (vice-versa) and False = 0 = 0.0 (vice-versa)
t2= (1,2,3,True,False,0)
print(t2.index(True))
print(t2.index(3))
print(t2.index(0))