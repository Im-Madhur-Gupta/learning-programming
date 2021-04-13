num_str = input("Please enter your numbers: ")

num_list = [int(i) for i in num_str.split()]

# This method is called List Comprehension as it creates a list.
# instead of .split() we could have used .split(" "), by default split ek space hi skip karega
# basically split ke braket me apko wo dalne he jo ek reading ke bad skip hona chahiye
# ex - if I wanted to readed '2 spaces' seperated integers, i.e 1  2  3  4, then -
# I will use .split("  ") --> 2 spaces in bracket
# ex - if I wanted to read a pattern of consecutive *, / and i, then -
# .split("") will be used --> no spaces in bracket

print(num_list)