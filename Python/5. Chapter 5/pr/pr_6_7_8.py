friend_dict = {}

print("Friend 1")
name = input("Enter Name : ")
lang = input("Enter your favourite language : ")
friend_dict.update({name:lang})
# alt to .update() - friend_dict[name] = lang

print("Friend 2")
name = input("Enter Name : ")
lang = input("Enter your favourite language : ")
friend_dict.update({name:lang})

print("Friend 3")
name = input("Enter Name : ")
lang = input("Enter your favourite language : ")
friend_dict.update({name:lang})

print("Friend 4")
name = input("Enter Name : ")
lang = input("Enter your favourite language : ")
friend_dict.update({name:lang})

print("\n",friend_dict)