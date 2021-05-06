# Escape sequence character - 

# Sequence of character after \ (backslash)

# Escape sequence character comprises of more than 1 charcters but they
# represent only 1 charcter when used inside strings

# Examples - 
# \n -> newline character, prints newline
# \t -> tab dene ke liye
# \\ -> ek backslash string me rakhne ke liye
# \' -> string me ek single quote rakhne ke liye
# \" -> string me ek double quote rakhne ke liye

a="mad\nhur\n"
print(a)

a="mad\thur"
print(a)

a="mad\\hur"
print(a)

a='mad\'hur'
print(a)

a="mad\"hur"
print(a)