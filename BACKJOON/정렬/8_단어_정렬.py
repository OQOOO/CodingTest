import sys

n = int(input())
arr = set()
for _ in range(n):
    arr.add(sys.stdin.readline())
arr = list(arr)

newArr = []
for i in arr:
    newArr.append([len(i), i])

newArr = sorted(newArr, key=lambda x:x[1])
newArr = sorted(newArr, key=lambda x:x[0])

for i in newArr:
    print(i[1], end='')

# 단어를 길이순서, 같을경우 사전 순서로 정렬하는 문제