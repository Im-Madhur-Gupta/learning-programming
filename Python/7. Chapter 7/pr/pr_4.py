num = int(input("Enter a number : "))

factors = 0
for temp in range(1, num+1):
    if(num % temp == 0):
        factors = factors + 1

if(factors == 2):
    print("Entered number is a Prime number.")
elif(factors == 1 or factors == 0):
    print("Neither prime nor composite.")
else:
    print("Entered number is a Composite number.")
