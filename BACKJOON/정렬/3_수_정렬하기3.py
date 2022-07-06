import sys
n = int(input())
arr = [0] * 10001

for _ in range(n):
    arr[int(sys.stdin.readline())] += 1

for i in range(10001):
    if arr[i] != 0:
        for _ in range(arr[i]):
            print(i)

# 계수정렬 구현문제