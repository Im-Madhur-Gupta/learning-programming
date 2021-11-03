# Python me constructor likhne ke liye apn 
# def __init__(self,....) -> None: ka use karte he
# self is a necessary argument of the constructor.

class Employee:
    name = ""
    type = ""
    def __init__(self,name,type) -> None:
        self.name = name
        self.type = type

emp1 = Employee("Madhur","SWE")
print(emp1.name)
print(emp1.type)
