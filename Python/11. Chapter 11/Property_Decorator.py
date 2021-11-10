class Employee:
    salary = 1000000
    salary_bonus = 30000
    
    # Assume that I want to make a ppt called total salary -
    
    @property # --> property decorator
    def total_salary(self):
        return self.salary+self.salary_bonus
    # Above is also called a getter method, ye tab run hoga jab mai total_slary ki value read karne jaunga.
    
    @total_salary.setter
    def total_salary(self,val):
        self.salary_bonus = val - self.salary
    # Above is called a setter method, ye tab run hoga jab mai total_salary ki value change karne jaunga.
    
    # Ab total salary will behave lika a ppt.
    # NOTE - Yaha Abstraction chal raha he.
    
e = Employee()
print(e.total_salary)
e.total_salary = 1200000
print(e.salary)
print(e.salary_bonus)
print(e.total_salary)
