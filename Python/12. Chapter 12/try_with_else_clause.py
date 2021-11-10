try:
    i = int(input("Enter a number: "))
except Exception as e:
    print(e,"You have entered an INVALID number.")
else: 
    # else clause sirf tab execute hota he jab try clause successfully execute hua ho.
    print("You have entered a VALID number.")