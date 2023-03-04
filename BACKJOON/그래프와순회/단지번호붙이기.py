import sys
input = sys.stdin.readline

dy = [1, -1, 0, 0]
dx = [0, 0, 1, -1]
def DFS(arr, y, x):
    n = len(arr)
    nextNode = [[y, x]]
    arr[y][x] = 0
    cnt = 1
    
    while nextNode:
        y, x = nextNode.pop()
        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]

            if nx < 0 or ny < 0 or nx >= n or ny >= n:
                continue
            if arr[ny][nx] == 1:
                arr[ny][nx] = 0
                nextNode.append([ny, nx])
                cnt += 1
    return cnt

n = int(input())
arr = [list(map(int, input().rstrip())) for _ in range(n)]
cntArr = []
for i in range(n):
    for j in range(n):
        if arr[i][j] == 1:
            cntArr.append(DFS(arr, i, j))

cntArr.sort()
print(len(cntArr))
print(*cntArr, sep="\n")