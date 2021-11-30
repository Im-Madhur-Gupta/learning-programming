name = "Madhur"
age = "20"

sentence = "I'm {}, I'm {} years old.".format(name,age)
print(sentence)

# Now if you want to change the order of arguments just place its index in {} -
sentence1 = "I'm {1} year(s) old, {2}, I'm {0}.".format(name,age,"IIITV")
print(sentence1)
