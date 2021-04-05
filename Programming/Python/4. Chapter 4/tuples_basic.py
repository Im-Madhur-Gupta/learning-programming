# Declaraing a TUPLE
t1 = (1,2,3,4) # multi element tuple
t2 = () # empty tuple
t3 = (1,) # single element tuple
# Note - for single element tuple following is wrong - t3 = (1) as this is same as the
# declaration for a integer variable, so we have to add a comma to let the compiler know
# that it's a single element tuple

# tuple ke liye (), aur list ke liye []
# tuple is an immutable datatype (can't be changed) in python

# READING tuple and its elements - 
print(t1)
print(t1[0])
print(t1[1])
print(t2)
print(t3)

# NOTE - 
# 1. ELEMENT WISE modification/altering isn't possible in tuple, t1[1] = 3 --> will give error
# 2. Tuple CAN be modified/altered as a whole, t1 = (2,3,4,5,6) --> will work
# 3. Just like in strings where element wise modification wasn't possible
#    but as a whole it could be altered. 