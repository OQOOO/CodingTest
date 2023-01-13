import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

sumArr = [[0] * (n + 1) for _ in range(n + 1)]

for i in range(1, n+1):
    for j in range(1, n+1):
        sumArr[i][j] = sumArr[i-1][j] + sumArr[i][j-1] - sumArr[i-1][j-1] + arr[i-1][j-1]

for i in sumArr:
    print(i)
for i in range(m):
    ySt, xSt, yEd, xEd  = map(int, input().split())
    print(sumArr[yEd][xEd] - sumArr[ySt-1][xEd] - sumArr[yEd][xSt-1] + sumArr[ySt-1][xSt-1])