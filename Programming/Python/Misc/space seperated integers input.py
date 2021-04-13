# ek line pe space seperated variable number of integers input me lene he

num_str = input("")

length = len(num_str)
num_list = []
temp = ""
neg = False

for i in range(length):
    
    if(num_str[i] == '-'):
        neg = True
        continue
    
    if(neg==True):
        if(num_str[i] == ' '):
            num_list.append((-1)*int(temp))
            temp = ""
            neg=False
            continue
        temp = temp + num_str[i]
        continue

    if(num_str[i] == ' '):
        num_list.append(int(temp))
        temp = ""
        continue
    temp = temp + num_str[i]

if(neg==True):
    num_list.append((-1)*int(temp))
else:
    num_list.append(int(temp))

print(num_list)