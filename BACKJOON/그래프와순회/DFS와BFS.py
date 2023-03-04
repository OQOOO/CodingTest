import sys
from collections import deque
input = sys.stdin.readline

def DFS():
    for i in graph:
        i.sort(reverse=True)

    serch = []
    nextNode = [startNode]
    visitedNode = [0] * (nodeNum + 1)
    cnt = 1

    while nextNode:
        node = nextNode.pop()

        if visitedNode[node]:
            continue
        visitedNode[node] = cnt
        serch.append(node)
        cnt += 1

        for i in graph[node]:
            if visitedNode[i] == 0:
                nextNode.append(i)

    return serch

def BFS():
    for i in graph:
        i.sort()

    serch = [startNode]
    nextNode = deque([startNode])
    visitedNode = [0] * (nodeNum + 1)
    cnt = 1
    visitedNode[startNode] = cnt

    while nextNode:
        node = nextNode.popleft()

        for i in graph[node]:
            if visitedNode[i]:
                continue
            cnt += 1
            visitedNode[i] = cnt
            serch.append(i)
            nextNode.append(i)
            
    return serch

if __name__ == "__main__":
    nodeNum, edgeNum, startNode = map(int, input().split())
    graph = [[] for _ in range(nodeNum + 1)]
    
    for _ in range(edgeNum):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)

    

    print(*DFS(), sep=" ")
    print(*BFS(), sep=" ")

