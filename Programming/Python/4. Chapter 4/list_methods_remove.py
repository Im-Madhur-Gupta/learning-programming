# list remove -
# it removes the first occurence of A value/string/whatever from the list
# 1st occuerence is decided from 0th index
# if the value isn't found in the list then it shows error
# as True = 1 = 1.0 (vice-versa) and False = 0 = 0.0 (vice-versa)

l1 = [1, False, 2, 4, 67, 0, True, "true", 6.9, "true"]
l1.remove(True) # --> won't work to remove True as it's eq. to 1, instead use pop
print(l1)
l1.remove("true")
print(l1)
l1.remove(0) # --> won't remove 0 instead it removes False as it's eq. to 0
print(l1)