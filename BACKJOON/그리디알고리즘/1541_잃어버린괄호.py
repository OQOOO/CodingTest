import sys

iptArr = sys.stdin.readline()
iArr = []
s_temp = ""
for i in iptArr:
    if i == "+" or i == "-":
        iArr.append(int(s_temp))
        s_temp = ""
    s_temp += i
iArr.append(int(s_temp))
iArr.append(iArr)
del iArr[len(iArr) -1]

# 계산
answer = 0
sw = 0
# 첫번째 음수 이후 모든 숫자 음수로
for i in iArr:
    if i < 0:
        sw = 1

    if sw == 0:
        answer += i
    else:
        answer -= abs(i)
    
print(answer)