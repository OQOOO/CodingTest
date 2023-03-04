import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

maxNum = max(arr)
dp1 = [1] * n
dp2 = [1] * n
result = [0] * n
for i in range(n):
    for j in range(i):
        if arr[i] > arr[j]:
            dp1[i] = max(dp1[i], dp1[j]+1)
arr.reverse()

for i in range(n):
    for j in range(i):
        if arr[i] > arr[j]:
            dp2[i] = max(dp2[i], dp2[j]+1)
dp2.reverse()

for i in range(n):
    result[i] = dp1[i] + dp2[i]

print(max(result) - 1)


