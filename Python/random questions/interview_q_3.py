# Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

inp_list = [int(x) for x in input().split()]
sum = int(input())
for i in range(len(inp_list)):
    if(inp_list.count(sum-inp_list[i])!=0):
        print(True)
        break
else:
    print(False)

# Note - is algo ki time complexity O(n^2) he
# if we use binary search then its O(n) = only in 1 pass. 