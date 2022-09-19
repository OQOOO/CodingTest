import sys
'''
   4
1     2
   3
가장 큰 가로 x 세로 - 가장 큰 가로 세로와 인접하지 않고 
두 칸 떨어져 있는 가로, 세로의 곱
'''
k = int(sys.stdin.readline())

total = []
width, high = [], []
for _ in range(6):
    temp = list(map(int, sys.stdin.readline().split()))
    total.append(temp[1])

    # 가로, 세로의 가장 큰 값 구하는 과정
    width.append(temp[1]) if temp[0] <= 2 else high.append(temp[1])
mWidth = max(width)
mHigh = max(high)

sWidth, sHigh = 0, 0
# 큰 가로값 반시계방향에 큰 세로값이 있다면
if total[(total.index(mWidth) - 1) % 6] == mHigh:
    # 시계방향으로 두번 이동한 값이 작은 사각형의 가로값
    sWidth = total[(total.index(mWidth) + 2) % 6]
else:
    # 없다면 반시계방향으로 두번 이동한 값이 작은 사각형의 가로값
    sWidth = total[(total.index(mWidth) - 2) % 6]
# 위와 같은 방식으로 세로값 구하기
if total[(total.index(mHigh) - 1) % 6] == mWidth:
    sHigh = total[(total.index(mHigh) + 2) % 6]
else:
    sHigh = total[(total.index(mHigh) - 2) % 6]

print(k * (mWidth * mHigh - sWidth * sHigh))