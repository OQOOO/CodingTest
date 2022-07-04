n = int(input())

li = []
for _ in range(n):
    x, y = map(int, input().split())
    li.append([x, y])

answer = []
for bulk in li:
    cnt = 1
    for comp in li:
        if bulk[0] < comp[0] and bulk[1] < comp[1]:
            cnt += 1
    answer.append(str(cnt))

print(" ".join(answer))

# 키와 몸무게[x, y]가 큰 순서로 등수를 매기는 문제
# 키, 몸무게 모두가 큰 경우가 아니면 동일한 덩치로 간주