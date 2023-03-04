import sys
from collections import deque
input = sys.stdin.readline

nodeNum, lineNum, startNode = map(int, input().split())
graph = [[] for i in range(nodeNum + 1)]
for _ in range(lineNum):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

for i in graph:
    i.sort()

visitedArr = [0] * (nodeNum + 1)
toVisitStack = deque([startNode])
cnt = 1
visitedArr[startNode] = cnt

print(graph)

while toVisitStack:
    node = toVisitStack.popleft()

    for i in graph[node]:
        print(i)
        if visitedArr[i]:
            continue
        cnt += 1
        visitedArr[i] = cnt
        toVisitStack.append(i)

print(*visitedArr[1:], sep="\n")