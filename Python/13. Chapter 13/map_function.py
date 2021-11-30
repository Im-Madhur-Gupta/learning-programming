l1 = [1, 2, 3, 4]
def func1(x): return x**2


l2 = []

# Normal way -
# for i in l1:
#     l2.append(func1(i))

# Mentos Zindagi way -
l2 = list(map(func1, l1))
# map function list ke ek ek item ko uthayega usko as an argument function me pass karega and result ko ek "map" object me store karega jisse mai list me type cast kar sakte he aramse.
print(l2)

# Functionality wise its same as JS map method.
