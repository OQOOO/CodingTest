import sys

n = int(input())
arr = list(map(int, sys.stdin.readline().split()))

sArr = sorted(list(set(arr)))

dic = {sArr[i] : i for i in range(len(sArr))}

for i in arr:
    print(dic[i], end=' ')

# 주어진 숫자의 차이를 최소한으로 압축하는 문제