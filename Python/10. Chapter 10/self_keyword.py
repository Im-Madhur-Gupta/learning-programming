# self --> java ke "this" keyword se similar he but thoda pharak he.
# Isko mujhe sirf NON-STATIC methods ki parameter list me mention karna padta he.

class Employee:
    company="Google"
    def getSalary(self):
        print("Your're salary is $300k")

emp1 = Employee()

emp1.getSalary() # Alternative 1
# OR
# Employee.getSalary(emp1) # Alternative 2

# Why do I need to put self in a method's argument list?
# Python me Alternative 1 and Alternative 2 dono chalenge, behind the scenes Alternative 1 change ho jata he Alternative 2 me aur Alternative 2 ke hisab se getSalary() or any method will take atleast 1 argument and that is the object itself ie. self.


# Important - mai self ki jagah kuch bhi valid Identifier use kar sakta hu non-static method ki argument list me
class Temp:
    def temp(obj,name):
        obj.name = name
# Yaha obj will work same as self just name change kar diya he