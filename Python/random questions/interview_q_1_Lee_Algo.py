array = []
M = int(input("Enter M : "))
N = int(input("Enter N : "))

temp_row = []

for i in range(M):
    temp_row = [x for x in input().split()]
    # "f" for false and "t" for true. 
    array.append(temp_row)

print("Enter start coordinates as space seprated integers : ")
start_coor = [int(x) for x in input().split()]
print("Enter end coordinates as space seprated integers : ")
end_coor = [int(x) for x in input().split()]