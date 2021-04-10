# A For loop is used to iterate through a sequence like a list, tuple or a string.
# such sequences are called iterables as using an index all of their elements can be accessed
# for loop me koisi normal condition ni chalegi, sirf sequence me iterate karne ke liye he

seq = [1,1.0,True,False,"madhur",'jay'] # similar for tuple

for item in seq:
    print(item)

# item me ek ek karke seq ke sare elements store ho jaenge


str = "Madhur is Drak Knight"
for char in str:
    print(char)