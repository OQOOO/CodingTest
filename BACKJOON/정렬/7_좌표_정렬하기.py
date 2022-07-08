import sys

n = int(input())

arr = []
for _ in range(n):
    x, y = map(int, sys.stdin.readline().split())
    arr.append([x, y])

arr = sorted(arr, key=lambda x:x[0])
arr = sorted(arr, key=lambda x:x[1])

for i in arr:
    print(i[0], i[1])

# 주어진 좌표를 y값이 작은 순, 같을경우 x값이 작은 순서로 정렬하는 문제