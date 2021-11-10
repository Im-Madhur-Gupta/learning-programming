class Employee:
    name = "Madhurc"

    def changeName_instance_attr(self, name):
        self.name = name  # Will change the instance attribute name

    # def changeName_class_attr(self, name):
    #     self.__class__.name = name  # Will change the class attribute name
    #     # __xyz__ wale methods ko DUNDER methods bolte he
    #     # Class attr/methods ko access karne ke liye we can use __class__ .

    # Class attributes ko change karne ka better tareka is using Class Methods -
    # Class Methods yani aese methods jo class se jude ho naki object se (just like class attributes).
    @classmethod # --> class method decorator
    def changeName_class_attr(cls, name):
        cls.name = name
        
person = Employee()
person.name = "Madhuri"

print(person.name)
print(Employee.name)

person.changeName_instance_attr("Madhur1i")
person.changeName_class_attr("Madhur1c")

print(person.name)
print(Employee.name)
