import sys
from collections import deque
input = sys.stdin.readline

n, m = map(int, input().split())
arr = deque(i for i in range(1, n+1))

iptArr = list(map(int, input().split()))
cnt = 0
for i in iptArr:
    while True:
        if arr[0] == i:
            arr.popleft()
            break
        elif len(arr)-1 - arr.index(i) < arr.index(i):
            while arr[0] != i:
                arr.appendleft(arr.pop())
                cnt += 1
        else:
            while arr[0] != i:
                arr.append(arr.popleft())           
                cnt += 1
print(cnt)
        
