from queue import PriorityQueue

[n, m, k, c, p] = (int(x) for x in input().split())
g = list([])
dp = list([])
station = list([])
for i in range(n+1):
    g.append(list([]))
    curr = list([])
    for j in range(c+1):
        curr.append(1e18)
    dp.append((curr))
    station.append(0)

for _ in range(m):
    [x, y, w] = (int(x) for x in input().split())
    g[x].append(([y , w]))
    g[y].append(([x , w]))

racer = list(map(int , input().split()))
if p>0:
    temp = list(map(int , input().split()))
    for i in temp:
        station[i] = 1

q = PriorityQueue()
q.put((0 , 0 , n))

visited=list([])
for i in range(0,n+1):
    visited.append(0)

while not q.empty():
    (cost, curr_fuel, node) = q.get()
    if visited[node]:
        continue

    visited[node]=1

    dp[node][curr_fuel] = cost
    for j in range(curr_fuel , c+1 , 1):
        dp[node][j] = min(dp[node][j] , dp[node][curr_fuel])
    if station[node]:
        curr_fuel = 0
    for (child , weight) in g[node]:
        if curr_fuel + weight <= c and cost + weight < dp[child][curr_fuel + weight]:
            dp[child][curr_fuel + weight] = cost + weight
            q.put(( cost + weight ,curr_fuel + weight , child ))

ans = [1e18 , 1e18]

for i in racer:
    ans = min(ans , [ dp[i][c] , i ])

if ans[0] == 1e18:
    print(-1)
else:
    print(ans[1])
