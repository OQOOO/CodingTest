import sys
input = sys.stdin.readline

n = int(input())
arr = []
for _ in range(n):
    arr.append(list(map(int, input().split())))
    
arr = sorted(arr)

dp = [1] * n
for i in range(n):

    # i 이전의 것들을 모두 비교
    for j in range(i):

        # arr[?][1]의 값은 정렬된 상태가 아니므로
        # 이번에 지정된 값이 비교값보다 클 때만 (증가하는 부분 수열)
            # 같은 값일땐 증가하지 않으므로 >
        if arr[i][1] > arr[j][1]:

            # j 값중 가장 큰 값 저장
            # max는 지금의 계산을 위한(if else와 비슷한 역할)
            dp[i] = max(dp[i], dp[j] + 1)

print(n - max(dp))