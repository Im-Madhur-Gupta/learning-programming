# A set is a collection of NON-repetitive elements.

# Creating a set -

a = {1,2,3,4}
print(a)
print(type(a))

# OR

b = set() # this line creates an empty set b
          # NOTE - b = {} will create an empty dictionary
          # set_name.add(element) can be used to add elements to a set 


# Repeated Elements in a Set -

c = {1,2,3,4,1,5} 
# won't throw error but any repeated ocuurence of an element is deleted
print(c)

d = set()
d.add(1) 
d.add(2) 
d.add(3) 
d.add(4) 
d.add(1) # won't throw error but 1 is repeated so it won't add
d.add("mad")
print(d)


# NOTE - Set ke andar List, Dictionary nhi dal sakte because they are "unhashable", i.e they
# can be element/key wise modified, Set ke andar Tuple, String dal sakta hu kyoki usme element
# wise modification wasn't possible
# Hashable type matlab wo cheze jinhe apne lifetime me change NHI kiya ja sakta

# Some PPT. of Sets -
# 1. They are unordered --> pehle, dusre, tesre element ka koi sense ni he
# 2. They are unindexed --> kisi index ki madad se mai element ko access ni kar sakta
# 3. There is no way to change items in a Set because they are hashable
#    Indirectly ap change kar sakte ho, pehle item ko .remove() karo phir new item ko .add()
# 4. Set can't contain duplicate items