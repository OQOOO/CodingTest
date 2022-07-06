yy, xx = map(int, input().split())

bord = []
for _ in range(yy):
    line = list(input())
    bord.append(line)

count = []
# 틀 이동
for y in range(yy - 7):
    for x in range(xx - 7):
        
    # 틀 내부 체크
        w = 0
        b = 0
        for i in range(y ,8 + y):
            for j in range(x, 8 + x):

                # 칸 체크
                if i % 2 == j % 2:          # 짝수
                    if bord[i][j] != 'W':
                        w += 1
                    else:
                        b += 1
                else:                       # 홀수
                    if bord[i][j] != 'B':
                        w += 1
                    else:
                        b += 1

        count.append(w)
        count.append(b)

print(min(count))