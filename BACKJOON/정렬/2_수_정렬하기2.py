import sys
n = int(input())
li = [int(sys.stdin.readline()) for _ in range(n)]
for i in sorted(li):
    print(i)