import sys
input = sys.stdin.readline

thingNum, maxWeight = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(thingNum)]

dp = [[0] * (maxWeight + 1) for _ in range(thingNum + 1)]

for thing in range(1, thingNum + 1):
    for bagWeight in range(1, maxWeight + 1):
        thingWeight = arr[thing-1][0]
        value = arr[thing-1][1]

        if bagWeight < thingWeight:
            dp[thing][bagWeight] = dp[thing -1][bagWeight]
        else:
            dp[thing][bagWeight] = max(dp[thing -1][bagWeight], dp[thing-1][bagWeight-thingWeight] + value)

print(dp[-1][-1])