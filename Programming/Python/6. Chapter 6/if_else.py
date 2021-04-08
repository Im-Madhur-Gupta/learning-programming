# IF ELSE and ELIF statement -
# elif is short for else if
# if (condition): # colon ata he after the bracket of condition
#   stmt 1
#   stmt 2
# elif (condition):
#   stmt 3
#   stmt 4
# else :
#   stmt 5
#   stmt 6
# NOTE - Bracketing ki jagah Indentation (tab or 4 spaces) se dekha jata he ki statement
#        if/elif/else ka he ya alag normal stmt he 

# ex 1 -
a = int(input("enter a number : "))

if(a%2 == 0):
    print("Entered number is even")
    print("part of if") # kyoki 2nd print is indented so it's a part of the if stmt
print("not a part of if")

# ex 2 -
a = int(input("enter a number : "))
if(a%2==0):
    print("EVEN")
elif(a%2 != 0):
    print("ODD")
else:
    print("INVALID VALUE ENTERED")