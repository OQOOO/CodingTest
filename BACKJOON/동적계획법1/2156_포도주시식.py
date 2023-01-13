import sys
input = sys.stdin.readline

n = int(input())
arr = [int(input()) for _ in range(n)]

if n <= 2:
    print(sum(arr))

else:
    dp = [0] * (n + 1) 
    dp[0] = arr[0]
    dp[1] = arr[0] + arr[1]
    for i in range(2, n):
        dp[i] = max(arr[i] + arr[i-1] + dp[i-3],
                    arr[i-1] + arr[i-2] + dp[i-4],
                    arr[i] + dp[i-2])

    print(arr)
    print(dp)
    print(dp[-2])