# Python me exception handling karte he using try-except block (same as try-catch).

while(True):
    a = input("Enter a number or q to quit: ")
    if a=='q':
        break
    try: # Try clause
        # Jitna try block run ho paa raha hoga utna hoga jaese hi error milega to except block run karega.
        print("Trying.........")
        if int(a)>6:
            print("You entered a number greater than 6.")
    except Exception as e: # Except clause
        # Exception jo bhi mile usse alias name 'e' dedo
        print(e) # Simply jo bhi exception mile usse print kardo.
        print("You have encountered an error. Try Again")