from itertools import *

card, target = map(int, input().split())
num = map(int, input().split())

answer = 0
for combi in permutations(num, 3):
    s = sum(combi)
    if answer < s <= target:
        answer = s
print(answer)

# 주어진 숫자들 중 3장을 뽑아 더한 수 중에서
# target을 넘지 않으면서 가장 큰 수를 출력하시오