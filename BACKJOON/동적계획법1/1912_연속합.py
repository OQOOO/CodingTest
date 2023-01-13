import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

# 연속된 가장 큰 값
# 새로 추가된 값을 합산한 결과가 더 작으면 연속 끊기

for i in range(1, n):
    arr[i] = max(arr[i], arr[i-1] + arr[i]) # 이전값을 합산한 값이 더 작아지면 자동으로 다시 시작

# 합산들이 포함된 상태의 배열
print(max(arr))

    




