list1 = [1, 2, 4, 6.74, "Madhur", True]

# Enumerate se mai kisi bhi iterable cheez ke through iterate kar pata hu, it returns (index, item) pairs.
# The order of returning values is IMP - first index, then item.
for index, item in enumerate(list1):
    print(index, item)

# Upar ka alternative
# index=0
# for item in list1:
#     print(index,item)
#     index+=1