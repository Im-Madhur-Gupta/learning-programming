test_cases = int(input())

list_words=[]

for i in range(test_cases):
    evidence = input()
    problem = input()
    list_words.append([evidence,problem])
    
mystery = False

count_evidence=0
count_problem=0
len_evidence=0
len_problem=0

for i in range(test_cases):
    len_evidence=len(list_words[i][0])
    len_problem=len(list_words[i][1])
    
    for j in range(len_evidence):
        
        count_evidence = list_words[i][0].count(list_words[i][0][j])
        count_problem = list_words[i][1].count(list_words[i][0][j])
        
        if(count_evidence <= count_problem):
            mystery=True
        else:
            mystery=False
            break
    
    if(mystery==True):
        print("YES")
    else:
        print("NO")