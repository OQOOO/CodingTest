import sys
from collections import Counter

n = int(sys.stdin.readline())
arr = [int(sys.stdin.readline()) for _ in range(n)]

arr.sort()
print(round(sum(arr)/n)) # 산술평균
print(arr[int(n/2)]) # 중앙값

li = Counter(arr) # 최빈값
li = li.most_common()
if len(li) > 1:
    if li[0][1] == li[1][1]:
        print(li[1][0])
    else:
        print(li[0][0])
else:
    print(li[0][0])

print(max(arr) - min(arr)) # 범위

# N개의 수에서 산술평균, 중앙값, 최빈값, 범위를 구하는 문제