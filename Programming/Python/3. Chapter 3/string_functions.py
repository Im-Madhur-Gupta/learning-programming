a = "madhur lives in Bhopal, Madhya Pradesh, India."

# 1. len() - length funtion - returns the length of the string
print(len(a))

# 2. string_name.endswith("xyz") -
# checks whether the given string end with "xyz" or not
print(a.endswith("ia."))
# similarly we have .startswith()

# 3. string_name.count("") -
# counts the total number of occuerences of any charcter OR word
print(a.count("a"))

# 4. string_name.capitalize() -
# this function can capitalizes any chracter of  given string
# kis character ko capitalize karana he wo a[index].capitalize karke batenge
# agr sirf a.capitalize likha to by default 1st character capitalize ho jaega
# it doesn't affect the original string unless we want it to,
# ex. - a = a.capitalize()
print(a.capitalize())

# 5. string_name.find("") -
# this function finds a word or character in a string and returns
# the index of it's first occuerence in the string
# and if that word or character isn't present in string then it returns -1
print(a.find("a"))

# 6. string_name.replace(old word,new word)
# this function replaces the old word with the new word in the entire string
# agr old word string me he hi nhi to function kuch bhi replace ni karga
# matlab string aisi ki aisi reh jaegi
# it doesn't affect the original string unless we want it to,
# ex. - a = a.replace(old word,new word)
print(a.replace("madhur","jay"))