a = "Madhur"
print(a[0:4])
# a[ye wali index se(included) : ye wali index tak(excluded)]
print(a[2:5]+a[0])

print(a[0:6]) # equivalent to - print(a[:6]) or print(a[0:])

# slicing me - ( _ matlab empty ) ( n is a valid index )
# a[_:n] --> _ ki jagah 0 aa jaega yani smallest non-neg. index

# a[n:_] --> _ ki jagah (greatest index of string + 1) a jaega yani 
# agr string ki length 6 he to 6 aa jaega (+1 as it's excluded)

# a[_:_] -->  1st _ pe 0 ayega, 2nd underscore pe length of string yani 
# (greatest index of string + 1)

# More in negative index