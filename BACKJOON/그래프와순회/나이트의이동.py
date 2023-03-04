import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
for _ in range(n):
    l = int(input())
    arr = [[0] * l for _ in range(l)]
    stY, stX = map(int, input().split())
    ty, tx = map(int, input().split())

    dy = [2, 2, 1, -1, -2, -2, 1, -1]
    dx = [1, -1, 2, 2, 1, -1, -2, -2]

    nextNode = deque([[stY, stX]])
    while nextNode:
        y, x = nextNode.popleft()

        if y == ty and x == tx:
            print(arr[y][x])
            break
        for i in range(8):
            ny = y + dy[i]
            nx = x + dx[i]
            if 0 <= ny < l and 0 <= nx < l and not arr[ny][nx]:
                arr[ny][nx] = arr[y][x] + 1
                nextNode.append([ny, nx])

