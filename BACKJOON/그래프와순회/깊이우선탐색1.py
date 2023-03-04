import sys
input = sys.stdin.readline

nodeNum, edgeNum, startNode = map(int, input().split())
graph = [[] for _ in range(nodeNum + 1)]

for _ in range(edgeNum):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

for i in graph:
    i.sort(reverse=True)


visitedArr = [0] * (nodeNum + 1)
toVisitStack = [startNode]
cnt = 1
while toVisitStack:
    node = toVisitStack.pop()

    if visitedArr[node]:
        continue
    visitedArr[node] = cnt
    cnt += 1

    for i in graph[node]:
        if visitedArr[i] == 0:
            toVisitStack.append(i)

print(*visitedArr[1:], sep="\n")