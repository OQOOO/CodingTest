import sys
from collections import deque
input = sys.stdin.readline
n = int(input())

de = deque()
for _ in range(n):
    ipt = input().split()

    if ipt[0] == "push_front":
        de.appendleft(ipt[1])
    elif ipt[0] == "push_back":
        de.append(ipt[1])
    elif ipt[0] == "pop_front":
        if de:
            print(de.popleft())
        else:
            print(-1)
    elif ipt[0] == "pop_back":
        if de:
            print(de.pop())
        else:
            print(-1)
    elif ipt[0] == "size":
        print(len(de))
    elif ipt[0] == "empty":
        if de:
            print(0)
        else:
            print(1)
    elif ipt[0] == "front":
        if de:
            print(de[0])
        else:
            print(-1)
    elif ipt[0] == "back":
        if de:
            print(de[-1])
        else:
            print(-1)