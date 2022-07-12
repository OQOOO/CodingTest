import sys

n, m = map(int, input().split())

arr = set(sys.stdin.readline() for _ in range(n))
arr2 = list(sys.stdin.readline() for _ in range(m))

count = 0
for i in arr2:
    if i in arr:
        count += 1

print(count)