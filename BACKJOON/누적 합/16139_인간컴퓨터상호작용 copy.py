import sys
input = sys.stdin.readline

s = input().strip()
qNum = int(input())
arr = [[0 for _ in range(len(s))] for __ in range(26)]

arr[ord(s[0]) - 97][0] = 1
for i in range(1, len(s)):
    arr[ord(s[i]) - 97][i] = 1
    for j in range(26):
        arr[j][i] += arr[j][i-1]

for i in arr:
    print(i)

for i in range(qNum):
    a, st, ed = input().split()
    
    if int(st) > 0:
        print(arr[ord(a) -97][int(ed)] - arr[ord(a) -97][int(st)-1])
    else:
        print(arr[ord(a) -97][int(ed)])