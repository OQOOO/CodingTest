import sys

nNum, sNum = map(int, sys.stdin.readline().split())
nArr = list(map(int, sys.stdin.readline().split()))

apArr = [0]
for i in range(nNum):
    apArr.append(apArr[i]+nArr[i])

for _ in range(sNum):
    st, ed = map(int, sys.stdin.readline().split())
    print(apArr[ed] - apArr[st -1])