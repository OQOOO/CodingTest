import sys

input = sys.stdin.readline

nodeNum = int(input())
lineNum = int(input())
startNode = 1

network = [[] for _ in range(nodeNum + 1)]
for _ in range(lineNum):
    a, b = map(int, input().split())
    network[a].append(b)
    network[b].append(a)

nextVisit = [startNode]
visitedNode = [0] * (nodeNum + 1)
visitedNode[1] = 1
cnt = 0
while nextVisit:
    node = nextVisit.pop()
    
    for i in network[node]:
        if visitedNode[i]:
            continue
        visitedNode[i] = 1
        nextVisit.append(i)
        cnt += 1
print(cnt)