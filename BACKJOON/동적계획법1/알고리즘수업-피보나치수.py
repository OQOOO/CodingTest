import sys
input = sys.stdin.readline

def fibonacci(n):
    arr = [0] * (n + 1)
    arr[1] = 1
    arr[2] = 1
    for i in range(3, n+1):
        arr[i] = arr[i - 1] + arr[i - 2]
    return arr[i]

n = int(input())
print(fibonacci(n))
print(n-2)