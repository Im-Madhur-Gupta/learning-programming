def swap_case(s):
    
    s_temp=list(s)
    small = []
    
    # listing small alphabets
    for i in range(97,123):
        for j in range(s_temp.count(chr(i))):
            index = s_temp.index(chr(i))
            small.append(index)
            s_temp[index]=0
    
    s_temp=list(s)           
    large=[]
    
    # listing big alphabets
    for i in range(65,91):
        for j in range(s_temp.count(chr(i))):
            index = s_temp.index(chr(i))
            large.append(index)
            s_temp[index]=0
    
    s_temp=list(s)
    # converting small to large
    for i in small:
        s_temp[i]=chr(ord(s[i])-32)
        
    # converting small to large
    for i in large:
        s_temp[i]=chr(ord(s[i])+32)
    
    s = ""
    for i in s_temp:
        s = s + i
        
    return s


if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)