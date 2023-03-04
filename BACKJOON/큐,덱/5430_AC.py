import sys
from collections import deque
input = sys.stdin.readline

t = int(input())
for _ in range(t):
    p = input().rstrip()
    n = int(input())
    arr = deque(input().rstrip()[1:-1].split(","))

    if n == 0:
        arr = []

    error = 0
    rvsCnt = 0
    for cmd in p:
        if cmd == "R":
            rvsCnt += 1
        else:
            if arr:
                if rvsCnt % 2 == 1:
                    arr.pop()
                else:
                    arr.popleft()
            else:
                print("error")
                error = 1
                break
    if error == 0:
        if rvsCnt % 2 == 0:
            print("[" + ",".join(arr) + "]")
        else:
            arr.reverse()
            print("[" + ",".join(arr) + "]")
