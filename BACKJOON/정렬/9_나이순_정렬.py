import sys
n = int(input())

arr = []
for _ in range(n):
    age, name = sys.stdin.readline().split()
    arr.append([int(age), name])

arr = sorted(arr, key=lambda x:x[0])

for i in arr:
    print(i[0], i[1])

# 나이와 함께 주어진 회원정보를 나이순, 가입순으로 정렬하는 문제