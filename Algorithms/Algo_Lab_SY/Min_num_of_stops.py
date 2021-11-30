l = int(input("Enter total path distance from starting point: "))
c = int(input("Enter capacity of your bike: "))
N = int(input("Enter the number of charging stations in your path: "))
print("Enter space-seperated station distances from starting point in order: ")
station_distance = [int(x) for x in input().split()]
station_distance.append(l)

for i in range(N, 0, -1):
    station_distance[i] -= station_distance[i-1]

stops = 0
dis_travelled = 0
i = 0
while(i <= N):
    if l <= c:
        stops = 0
        break
    if station_distance[i] > c:
        stops = -1
        break
    if c-dis_travelled >= station_distance[i]:
        dis_travelled += station_distance[i]
        i += 1
    else:
        stops += 1
        dis_travelled = 0

if stops>0:
    stops-=1 # I have reached destination but have counted the destination as a stop as well.
    
print(stops)
