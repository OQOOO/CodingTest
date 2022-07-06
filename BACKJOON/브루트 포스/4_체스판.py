n, m = map(int, input().split())
board = []

for i in range(n):
    line = list(input())
    board.append(line)

count = []
for i in range(n - 7):
    for j in range(m - 7):
        w = 0
        b = 0
        for y in range(i, i + 8):
            for x in range(j, j + 8):
                if y % 2 == x % 2:
                    if board[y][x] != 'W':
                        w += 1
                    else:
                        b += 1
                else:
                    if board[y][x] != 'B':
                        w += 1
                    else:
                        b += 1
        count.append(w)
        count.append(b)

print(min(count))

# 무작위로 칠해진 판을 잘라 체스보드를 만들때 가장 적게 새로 칠할 수 있는 경우를 구하는 문제