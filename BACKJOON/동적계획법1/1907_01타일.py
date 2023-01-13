import sys
input = sys.stdin.readline
n = int(input())

fibo = [0] * (n + 3)
fibo[1] = 1
fibo[2] = 1

for i in range(3, n):
    fibo[i] = fibo[i-2] + fibo[i-1]

print(fibo)

