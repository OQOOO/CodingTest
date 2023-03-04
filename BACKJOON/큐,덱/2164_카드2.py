import sys
from collections import deque

input = sys.stdin.readline
n = int(input())

queue = deque(list(i for i in range(1, n+1)))
for _ in range(n-1):
    queue.popleft()
    queue.append(queue.popleft())

print(queue[0])