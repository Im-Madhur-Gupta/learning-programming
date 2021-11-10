import pr3

f = open("12. Chapter 12/pr/tables.txt","w")
n = pr3.n
f.write(f"Table of {n}\n\n")
for i in range(1,11):
    f.write(f"{i} * {n} = {i*n}\n")
f.close()