with open("9. Chapter 9/with.txt","w") as f:
    f.write("Hello People")
# Jaise hi indent hata ke kuch likha to file automatically close ho jaegi

with open("9. Chapter 9/with.txt","r") as f:
    data = f.read()
# Jaise hi indent hata ke kuch likha to file automatically close ho jaegi

print(data)

# with statement use hi isliye karte he taki alag se f.close() na likhna pade.