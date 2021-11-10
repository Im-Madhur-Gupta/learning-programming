# Java me operator overloading sirf functions ki madad se hoti thi.
# Cpp me operator overloading kar sakte the, usme new operators ni bana sakte the but jo purane operators he (excluding a few) unko mai overload kar sakta tha.

# Operator Overloading in Python is achieved using Dunder methods.

class Number:
    def __init__(self, num) -> None:
        self.num = num

    def __add__(self, num2):
        # '+' operator overload kar diya he Number class ke objects ko add karne ke liye
        # Number class ke objects ko add karne ke liye mai simply unke num attributes ko add karke return kar raha hu.
        # Note - This method is capable of ONLY adding 2 objects of Number class.
        return self.num + num2.num

    def __mul__(self, num2):
        return self.num * num2.num
        # Note - This method is capable of ONLY multplying 2 objects of Number class.

    # Baki operators ko overload karne ke liye unke respective dunder methods use karne padenge.

    # Some other Dunder methods -
    # 1. tab use hoga jab app is class ke object ko string ki tarah use karna chah rahe ho.
    def __str__(self):
        return f"{self.num}"

    # 2. jab len(obj) call kiya to ye chalega
    def __len__(self):
        dig = 0
        n = self.num
        while(n != 0):
            n = n//10  # Integral (floor) division karna he.
            dig += 1
        return dig


num1 = Number(2)
num2 = Number(3)
print(num1+num2)
print(num1*num2)
print(num1)
print(len(num1))
