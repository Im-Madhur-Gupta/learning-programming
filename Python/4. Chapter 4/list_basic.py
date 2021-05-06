# A List in python is an array that can store dissimilar or similar data.

# list with similar data -
a = [1,2,3,4]

# a list with dissimilar data -
b = [1,"Madhur",False,9.7,44]

# printing a list
print(a)
print(b)
print(a, b)

# printing a list index wise
print(a[0])
print(a[1])
print(a[2])
print(a[3])
print(b[0])
print(b[1])
print(b[2])
print(b[3])

# slicing a list (similar to what was done in strings)
print(a[0:2])
# note - a[_:_] wale teeno case same work kar rahe he
# also b ke liye bhi same kar sakte he

# slicing with skiping (similar to what was done in strings)
print(b[0:4:2])

# IMP - String ko element wise sirf read kar paa rahe the modify/write NI
# BUT for a list element reading as well as modification is possible
b[1]="jay"
print(b)

# b[5]=6 , kahi par bhi index out of range jane pe error dega

# concept of negative index is also same for a list
# neg. index = pos. index - (total num. of elements in list)