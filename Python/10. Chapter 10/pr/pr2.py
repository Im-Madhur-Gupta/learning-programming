class Calculator:
    @staticmethod
    def square(a):
        return a**2
    
    @staticmethod
    def cube(a):
        return a**3
    
    @staticmethod
    def squareRoot(a):
        return a**(0.5)

print(Calculator.square(2))
print(Calculator.cube(2))
print(Calculator.squareRoot(4))
    