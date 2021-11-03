class Employee:
    company = "Microsoft"
    def __init__(self,name,age) -> None:
        self.name = name
        self.age = age
        
    def printDetails(self):
        print(self.name)
        print(self.age)
        print(self.company)
        
emp1 = Employee("Madhur",20)
emp1.printDetails()
