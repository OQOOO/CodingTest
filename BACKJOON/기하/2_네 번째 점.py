import sys

# 같은 축에 단 한번만 나온 값들로 만든 좌표가 정답
x = []
y = []
for _ in range(3):   
    a, b = map(int, sys.stdin.readline().split())

    # 같은 값 들어오면 제거
    if a in x:
        x.pop(x.index(a))
    else:
        x.append(a)

    if b in y:
        y.pop(y.index(b))
    else:
        y.append(b)

print(x[0], y[0])