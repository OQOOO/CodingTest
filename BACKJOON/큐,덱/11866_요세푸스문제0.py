import sys
input = sys.stdin.readline

n, k = map(int, input().split())

arr = list(i for i in range(1, n + 1))
answer = []
pIdx = 0
for i in range(n):
    pIdx += k-1
    pIdx %= len(arr)
    answer.append(str(arr.pop(pIdx)))

print("<" + ", ".join(answer) + ">", sep = "")