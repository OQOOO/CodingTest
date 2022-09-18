import sys
x, y, w, h = map(int, sys.stdin.readline().split())

# xy로부터 경계선까지 상 하 좌 우 거리
top = h - y
bottom = y
right = w - x
left = x

print(min(top, bottom, right, left))