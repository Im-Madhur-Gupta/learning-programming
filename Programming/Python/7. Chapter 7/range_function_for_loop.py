# range() function is used to generate a custom sequence of numbers
# range is another type of pyhton, it's immutable/hashable
# range(start , stop , step) -

# start - (optional, default = 0) kis number se range chalu hogi (included)

# stop - kis number pe sequence end hogi (excluded)
# For a positive step, sequence goes on till (stop - 1)
# For a negative step, sequence goes on till (stop + 1)

# step - (optional,  default = +1) step can be seen as the increment value , could be
#        positive or negative resulting in an increasing or decreasing sequence.

# All the arguements should be integer
# for step = 0 , error is raised 
# NOTE - range(n) means [0,1,2,3,.....(n-1)] , it contains n numbers.

for num in range(1,9,2):
    print(num)

print("done")

for num in range(7,-1,-2):
    print(num)