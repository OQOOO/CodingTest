import sys
from collections import deque
input = sys.stdin.readline

h, w = map(int, input().split())
arr = [list(map(int, input().rstrip())) for _ in range(h)]

dy = [1, 0, -1, 0]
dx = [0, 1, 0, -1]

y, x = 0, 0
nextNode = deque([[y, x]])
while nextNode:
    y, x = nextNode.popleft()
    if y == h-1 and x == w-1:
        break

    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if ny >= h or nx >= w or ny < 0 or nx < 0:
            continue
        if arr[ny][nx] == 1:
            arr[ny][nx] = arr[y][x] + 1
            nextNode.append([ny, nx])

print(*arr, sep="\n")
print(arr[h-1][w-1])