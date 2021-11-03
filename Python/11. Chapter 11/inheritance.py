class Species: # Parent class
    gender = "male"
    foobar = "foo"
    def printGender(self):
        print(self.gender)
    def greet(self):
        print("Hello")
class Human(Species): # Child class
    name = "Madhur"
    foobar = "foo1"
    def greet(self):
        print("Hello, overwrite")
    def greet_non_overwridden(self):
        super().greet() # super keyword ka use kar liya non-overwridden method call karne ke liye
    def foo(self):
        print(self.foobar)    
    def foo_non_overwridden(self):
        print(super().foobar)
        
    
# Ofcourse mai child class me parent class ke attributes & methods overwrite karsakta hu

s = Species()
h = Human()

s.greet()
h.greet()
h.greet_non_overwridden()
h.foo()
h.foo_non_overwridden()