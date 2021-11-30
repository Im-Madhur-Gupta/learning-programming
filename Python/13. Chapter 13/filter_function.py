l1 = [1,2,3,4,5,6,7,8]

func1 = lambda x : x>=5

l1_passed = list(filter(func1,l1))
# Basically, ek list ke elements ko filter karne ke liye.
print(l1_passed)