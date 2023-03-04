import sys
input = sys.stdin.readline

nNum, sNum = map(int, input().split())
nArr = list(map(int, input().split()))

apArr = [0]
for i in range(nNum):
    apArr.append(apArr[i]+nArr[i])

for _ in range(sNum):
    st, ed = map(int, input().split())
    print(apArr[ed] - apArr[st -1])