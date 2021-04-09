# id() function returns an object's memory address
# object could be any variable

a = 1
b = 6
a = b
c = 4
print(id(a))
print(id(b))
print(id(c))