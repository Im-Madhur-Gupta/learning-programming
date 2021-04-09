mark1 = float(input("Enter Marks obtained in subject 1 : "))
mark2 = float(input("Enter Marks obtained in subject 2 : "))
mark3 = float(input("Enter Marks obtained in subject 3 : "))

if( (mark1 >= 33) and (mark2 >= 33) and (mark3 >= 33) and ((mark1+mark2+mark3) >= 120) ):
    print("You have Passed the examination.")
else:
    print("You have Failes the examination.")