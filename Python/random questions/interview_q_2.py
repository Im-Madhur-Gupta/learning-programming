# Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

inp_list = [int(x) for x in input().split()]

out_list = []

for i in range(len(inp_list)):
    temp=1
    for j in range(len(inp_list)):
        if i!=j: 
            temp = temp*inp_list[j]
    out_list.append(temp)

print(inp_list)
print(out_list)