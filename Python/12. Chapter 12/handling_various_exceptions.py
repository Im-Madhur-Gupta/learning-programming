try:
    a = int(input("Enter a Number: "))
    c = 1/a
    print(c)
except ValueError:
    print("Invalid number entered.")
except ZeroDivisionError:
    print("0 entered, inverse not possible.")
except:
    print("Some error occured")