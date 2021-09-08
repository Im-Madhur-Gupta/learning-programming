for t in range(int(input())):
    ans = 0
    n = int(input())
    F_status = input()
    M_status = [True]*(len(F_status)+2**n)
    for i in range(len(F_status)):
        if M_status[i] == True and F_status[i] == "N":
            M_status[2*i+2] = False
        elif M_status[i] == False and F_status[i] == "Y":
            M_status[2*i+1] = False
        elif M_status[i] == False and F_status[i] == "N":
            M_status[2*i+1] = False
            M_status[2*i+2] = False
    for j in range(len(F_status), len(M_status)):
        if M_status[j] == True:
            ans += 1
    print(ans)