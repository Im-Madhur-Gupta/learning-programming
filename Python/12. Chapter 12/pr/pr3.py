def giveTable(n):
    return [n*x for x in range(1,11)]

n = int(input("Please enter a number: "))
table = giveTable(n)

if __name__=="__main__":
    print(table)