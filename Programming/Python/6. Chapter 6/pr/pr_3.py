a = input("Enter a comment - \n")

if(a.find("make a lot of money")!=-1 or a.find("buy now")!=-1 or a.find("subscribe this")!=-1 or a.find("click this")!=-1):
    print("This is a spam comment.")
else:
    print("This is not a spam comment.")

# string_name.find("") -
# this function finds a word or character in a string and returns
# the index of it's first occuerence in the string
# and if that word or character isn't present in string then it returns -1