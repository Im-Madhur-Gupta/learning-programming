try:
    i = int(input("Enter a number: "))
except Exception as e:
    print(e,"You have entered an INVALID number.")
    exit() # used to stop execution
finally: 
    # "finally" clause HAMESHA execute hota he irrespective of the fact whether "except" me apne execution stop kiya ya ni.
    print("DONE")