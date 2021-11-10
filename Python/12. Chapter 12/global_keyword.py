a = 1
s = "Salsa" # global variable

def hello():
    # s = "Salsa_new" # local variable
    # print(s) # local wala print hoga
    
    global s # use karo global s
    # By chance, "s" agar global scope me koi variable ni hota to "s" name ka ek new global variable ban jata
    s = "Salsa_new" # global vala pe assign hoga
    print(s) # global vala print hoga
    # global keyword use karke mai aise variable ki value modify kar sakta hu jo current scope ke bahar ka he.
    
hello()
print(s) # global wala print hoga
