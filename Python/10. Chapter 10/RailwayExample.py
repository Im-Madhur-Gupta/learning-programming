class RailwayForm:
    formType = "Railway" # A Class Attribute, will be available to each object of this class.
    formPrice = 100 # another Class Attribute
    def printData(self):
        print(f"name - {self.name}")

form1 = RailwayForm()
form1.name = "xyz" # An Instance Attribute, will be only available to a particular object, here, form1.
# Instance Attribute ka preference zyada he as compared to Class Attribute.
form1.printData()