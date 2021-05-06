a = int(input("Enter Number 1 : "))
b = int(input("Enter Number 2 : "))
c = int(input("Enter Number 3 : "))
d = int(input("Enter Number 4 : "))

if (a>b and a>c and a>d):
    print("Number 1 is greatest.")
elif (b>a and b>c and b>d):
    print("Number 2 is greatest.")
elif (c>b and a<c and c>d):
    print("Number 3 is greatest.")
elif (d>b and d>c and a<d):
    print("Number 4 is greatest.")
else:
    print("All 4 of the numbers entered are same.")