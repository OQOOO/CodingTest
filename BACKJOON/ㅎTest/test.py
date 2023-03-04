import sys
input = sys.stdin.readline

n = 10

arr = []
for i in range(1, n):
    tempArr = []
    for j in range(1, n):
        ij = str(i * j)
        if len(ij) == 1:
            ij = " " + ij
            
        ans = str(i) + " x " + str(j) + " = " + ij
        tempArr.append(ans)
    arr.append(tempArr)

for i in range(0, n-1):
    print()
    for j in range(0, n-1):
        print(arr[j][i], end="   ")
