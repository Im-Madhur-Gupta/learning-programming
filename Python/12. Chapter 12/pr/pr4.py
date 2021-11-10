a = int(input("a: "))
b = int(input("b: "))

try:
    print(a/b)
except ZeroDivisionError as e:
    if(a>0):
        print("Positive Infinity.")
    elif(a<0):
        print("Negative Infinity.")
    else:
        print("Indeterminant Form")