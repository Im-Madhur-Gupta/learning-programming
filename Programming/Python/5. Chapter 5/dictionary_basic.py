# In an english dictionary, we have words and their corresponding meanings
# similarly in python a dictionary contains pairs of keys and their corresponding values
# keys are analogous to words and values are analogous to meanings

# syntax -
# dictionary_name = {key_1:value_1 , key_2:value_2 , .......}

# Keys can contain strings or numbers(float or int) or boolean
# Keys should be UNIQUE
# Values can be numbers, strings, a list (also tuple) even another dictionary.
# 2 or more than 2 keys can have same value.

my_dict = {8: [1, 2, 3], 8.8: 1, 1: "check_1",
           "Madhur": "I am Batman", False: 0, "another_dict":{"random":"temp"}}

# accesing/reading a value corresponding to a key of a dictionary -
# dictionary_name[key]

print(my_dict[8])
print(my_dict[8.8])
print(my_dict[1])
print(my_dict["Madhur"])
print(my_dict[True])
print(my_dict[False])

# Nested dictionary -
print(my_dict["another_dict"])
print(my_dict["another_dict"]["random"])

# NOTE - Values corresponding to any Key can be read as well as modified -
#  dictionary_name[key] = new value
my_dict[8] = [2,3,4]
print(my_dict[8])

# printing the whole dictionary at once-
print(my_dict)

# Some ppt. of Dictionary in python -
# 1. It's UNORDERED
# 2. Dictionary is INDEXED but this index isn't 0,1,2... rather it's corresponding to keys