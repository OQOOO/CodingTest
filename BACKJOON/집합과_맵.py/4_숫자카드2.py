import sys

n = int(sys.stdin.readline())

numArr = list(map(int, sys.stdin.readline().split()))

dic = {}
for i in numArr:
    dic[i] = 0

for i in numArr:
    dic[i] += 1

m = int(sys.stdin.readline())

sangArr = list(map(int,sys.stdin.readline().split()))

for i in sangArr:
    try:
        print(dic[i], end=' ')
    except:
        print(0, end=' ')