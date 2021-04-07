my_dict = {8: [1, 2, 3], 8.8: 1, 1: "check_1",
           "Madhur": "I am Batman", False: 0, "another_dict":{"random":"temp"}}

# Methods -

# 1. To get all the KEYS of a DICTIONARY-
# print(dictionary_name.keys())
# type/datatype of dictionary_name.keys() is a class called dict_keys
# it can be easily type casted to a list
print(my_dict.keys())
print(type(my_dict.keys()))
print(list(my_dict.keys()))



# 2. To get all the VALUES of a DICTIONARY-
# print(dictionary_name.values())
# type/datatype of dictionary_name.values() is a class called dict_values
# it can be easily type casted to a list
print(my_dict.values())
print(type(my_dict.values()))
print(list(my_dict.values()))

# Revision - list --> [] , tuple --> ()



# 3. dictionary_name.items() -
# Prints ALL (key,value) pairs for a dictionary.
# useful in iterating(later)
# it gives a tuple (like), actual class is again different
print(my_dict.items())



# 4. Adding (key,value) pair/pairs to a Dictionary -
# dictionary_name.update({key_1:value_1 , key_2:value_2 ........})
# ALT - temp_dict = {key_1:value_1 , key_2:value_2 ........}
#       dictionary_name.update(temp_dict) 
# agr .update() ke andar koi pehle se used KEY he to uske corresponding VALUE will get UPDATED
print(my_dict)
my_dict.update({"aditya":"friend","dev":"friend",8:[2,3]})
print(my_dict)
temp_dict = {"batman":"hero","ironman":"hero"}
my_dict.update(temp_dict)
print(my_dict)