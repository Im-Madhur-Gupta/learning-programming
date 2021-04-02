a = 65  # a integer variable
b = float(a)  # typecasted to a float variable
print(a, b)

# python me typecast karne ke liye mai jis datatype me typecast karna he uske
# corresponding function use kar leta hu
# typecasting may NOT be always possible

c = '''123'''  # str --> int
c = int(c) + 2
print(c)

# upar wale type ki string can be typecasted to int
# but agar aisi hoti - '''123 Hi''' to iska typecasting to int ni ho pata

c = '''123'''  # str --> float
c = float(c) + 2.0
print(c)

c = 123  # int --> str
c = str(c) + " converted"
print(c)

c = 123.2  # float --> str
c = str(c) + " converted"
print(c)

# "31" --> string literal (single aur triple single quotes wala bhi)
# 31 --> numeric literal