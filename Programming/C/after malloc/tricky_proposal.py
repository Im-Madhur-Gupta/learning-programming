test_cases = int(input(""))

name = ""
length = 0
coded_list = []
temp = ""

while test_cases>0:
    name = input("")
    length = len(name)

    temp = ""
    for i in range(0,length):
        temp = temp + str((ord(name[i])) - 64)

    length = len(temp)
    temp = int(temp)*int(temp[length-1])

    coded_list.append(temp)
    
    test_cases = test_cases-1

for item in coded_list:
    print(item)

# MAIN HINT - treat the coded number as a string initially then typecast it acc. to needs