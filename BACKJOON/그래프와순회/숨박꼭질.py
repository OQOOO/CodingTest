import sys
from collections import deque
input = sys.stdin.readline

n, k = map(int, input().split())
arr = [0] * 100001

nextNode = deque([n])
while nextNode:
    x = nextNode.popleft()
    if x == k:
        print(arr[x])
        print(arr[:20])
        break
    for nx in (x+1, x-1, x*2):
        if 0 <= nx <= 100001 and not arr[nx]:
            arr[nx] = arr[x] + 1
            nextNode.append(nx)