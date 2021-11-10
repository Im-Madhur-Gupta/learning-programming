class ComplexNum:
    def __init__(self, r, i) -> None:
        self.r = r
        self.i = i

    def __add__(self, num2):
        return ComplexNum(self.r+num2.r, self.i+num2.i)

    def __mul__(self, num2):
        return ComplexNum(self.r*num2.r-self.i*num2.i, self.i*num2.r+self.r*num2.i)


cmp1 = ComplexNum(1, 2)
cmp2 = ComplexNum(2, 3)
add = cmp1 + cmp2
mul = cmp1 * cmp2

print(add.r,add.i)
print(mul.r,mul.i)