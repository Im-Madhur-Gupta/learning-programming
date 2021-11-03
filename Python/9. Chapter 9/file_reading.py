f = open("9. Chapter 9/reading.txt","r") # default mode is "r"

# read() function ko mai sirf ek bar call kar sakta hu

# print(f.read()) --> sara kuch read ho jaega

# print(f.read(4)) # specified num. of chars read honge

print(f.readline()) # ek line read karega
# remember readline() ek \n tak read karega including that \n.

f.close()