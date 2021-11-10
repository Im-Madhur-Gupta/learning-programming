# Single Inheritance - Jab EK child class EK parent class se inherit kare.
class Species:
    gender = "male"
    foobar = "foo"
    def printGender(self):
        print(self.gender)
class Human(Species):
    name = "Madhur"
    foobar = "foo1"
    def greet(self):
        print("Hello")
        
        
# Multiple Inheritance - Jab EK child class EK SE ZYADA Parent class se inherit kare.
class Employee:
    company="GOOGLE"
    type="auto"
class Freelancer:
    company="TOPAL"
    level=1
class Person(Employee,Freelancer):
    # Left vali class has higher precedence/importance so, left vali class ke ppts/methods right wali class ke ppt/methods ko overwrite kar dete he.
    name="Madhur"
p = Person()
print(p.name)
print(p.company)


# Multilevel Inheritance - A child class of a parent class is itself a parent class.