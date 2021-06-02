= []
str_to_list[:0] = s

result = [False,False,False,False,False]

for i in str_to_list:
    
    if result[0]==False:
        result[0]=i.isalnum()
    
    if result[1]==False:
        result[1]=i.isalpha()
    
    if result[2]==False:
        result[2]=i.isdigit()
    
    if result[3]==False:
        result[3]=i.islower()
    
    if result[4]==False:
        result[4]=i.isupper()

for j in result:
    print(j)