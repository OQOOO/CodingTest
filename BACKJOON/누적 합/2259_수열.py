import sys

dayNum, sNum = map(int, sys.stdin.readline().split())
dayArr = list(map(int, sys.stdin.readline().split()))

cuArr = [0]
for i in range(dayNum):
    cuArr.append(cuArr[i] + dayArr[i])

answer = cuArr[sNum]
for i in range(len(cuArr) - sNum):
    st, ed = i, i + sNum
    temp = cuArr[ed] - cuArr[st]

    if answer < temp:
        answer = temp

print(answer)
