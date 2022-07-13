import sys

n, m = map(int, sys.stdin.readline().split())

dic = {}
for i in range(1, n + 1):
    a = sys.stdin.readline().rstrip()
    dic[i] = a
    dic[a] = i

for j in range(m):
    key = sys.stdin.readline().rstrip()
    if key.isdigit() == True:
        print(dic[int(key)])
    else:
        print(dic[key])