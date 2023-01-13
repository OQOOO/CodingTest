# 첫칸 흰색, 검은색의 누적합을 각각 구한 후 계산
# 

# 둘중 하나만 칠하는 경우로 고려해야 하는 이유
# 뒤쪽 구하는 공식의 의미
#

import sys
input = sys.stdin.readline

n, m, k = map(int, input().split())

arr = [list(input().strip()) for _ in range(n)]

sArr = [[0] * (m + 1) for _ in range(n + 1)]

for y in range(1, n + 1):
    for x in range(1, m + 1):

        if (y + x) % 2 == 0:
            if arr[y-1][x-1] == "W":
                sArr[y][x] = sArr[y-1][x] + sArr[y][x-1] - sArr[y-1][x-1]
            else:
                sArr[y][x] = sArr[y-1][x] + sArr[y][x-1] - sArr[y-1][x-1] + 1
        else:
            if arr[y-1][x-1] == "W":
                sArr[y][x] = sArr[y-1][x] + sArr[y][x-1] - sArr[y-1][x-1] + 1
            else:
                sArr[y][x] = sArr[y-1][x] + sArr[y][x-1] - sArr[y-1][x-1]

mx = float('-inf')
mn = float('inf')
for y in range(k, n + 1):
    for x in range(k, m + 1):
        # 가장 많이 칠해야 하는 경우의 수   B(k*k-mx) == W(mn)
        mx = max(sArr[y][x] - sArr[y-k][x] - sArr[y][x-k] + sArr[y-k][x-k], mx)
        # 가장 적게 칠하는 경우의 수
        mn = min(sArr[y][x] - sArr[y-k][x] - sArr[y][x-k] + sArr[y-k][x-k], mn)

print(min(mn, k*k-mx))