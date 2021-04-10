n = int(input("Enter number of rows to be printed : "))
row = 1
while(row <= n):
    print(" "*(n-row)+"*"*(2*row-1))
    row = row + 1