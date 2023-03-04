import sys
from collections import deque
input = sys.stdin.readline

_n = int(input())
for _ in range(_n):
    n, idx = map(int, input().split())
    arr = deque(map(int, input().split()))

    cnt = 0
    while arr:
        if arr[0] != max(arr):
            arr.append(arr.popleft())
            idx -= 1

            if idx == -1:
                idx = len(arr) - 1
        else:    
            cnt += 1
            if idx == 0 and arr[idx] == max(arr):
                break
            arr.popleft()
            idx -= 1

    print(cnt)
