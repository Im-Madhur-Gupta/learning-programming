username = input("Enter a username : ")

if(len(username) < 10):
    print("Username contains less than 10 characters.")
else:
    print("Entered username has greater than or equal to 10 characters.")