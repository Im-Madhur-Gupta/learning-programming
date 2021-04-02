# positive indices was like - 0,1,2,3,4......(length of string -1)
# negative index = positive index - (length of string)

# positive index mai tab use karta tha jab mujhe string seedhi padhni he
# matlab left to right

# agr mujhe string right to left read karna he (ulti read karni he)
# to mai negative indices use karunga

# a = "Madhur"
#  M   a   d   h   u   r
#  0   1   2   3   4   5
# -6  -5  -4  -3  -2  -1

a = "Madhur"
print(a[-1])
print(a[-2])
print(a[-3])
print(a[-4])
print(a[-5])
print(a[-6])

# SLICING FOR NEGATIVE INDEX-
print(a[-6:-2]) # this is equivalent to print(a[0:4])
# a[_:_] wale jo 3 cases the in slicing for + or non-neg. index are similar.