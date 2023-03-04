import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

queue = deque()
for _ in range(n):
    ipt = input().split()

    if ipt[0] == "push":
        queue.append(int(ipt[1]))
    
    elif ipt[0] == "pop":
        if queue:                    
            print(queue.popleft())
        else:
            print(-1)
            
    elif ipt[0] == "size":
        print(len(queue))

    elif ipt[0] == "empty":
        if not queue:
            print(1)
        else:
            print(0)

    elif ipt[0] == "front":
        if queue:
            print(queue[0])
        else:
            print(-1)

    elif ipt[0] == "back":
        if queue:
            print(queue[-1])
        else:
            print(-1)