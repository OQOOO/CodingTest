import sys
input = sys.stdin.readline

nodeNum, lineNum, startNode = map(int, input().split())

graph = [[] for _ in range(nodeNum + 1)]
for _ in range(lineNum):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(1, nodeNum+1):
    graph[i].sort()


result = [0] * (nodeNum + 1)
visitedArr = [-1] * (nodeNum + 1)
toVisit = [startNode]
cnt = 1

while toVisit:
    node = toVisit.pop()

    if visitedArr[node] == 1:
        continue
    visitedArr[node] = 1
    result[node] = cnt
    cnt += 1

    for i in graph[node]:
        if visitedArr[i] == -1:
            toVisit.append(i)

print(*result[1:], sep="\n")