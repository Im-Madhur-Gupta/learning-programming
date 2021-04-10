n = int(input("Enter number of rows to be printed : "))
row = 1
while(row <= n):
    if(row ==1 or row == n):
        print("*"*n)
    else:
        print("*"+" "*(n-2)+"*")
    
    row = row + 1