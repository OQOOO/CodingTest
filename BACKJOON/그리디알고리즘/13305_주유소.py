import sys

cityNum = int(sys.stdin.readline())
roadArr = list(map(int, sys.stdin.readline().split()))
priceArr = list(map(int, sys.stdin.readline().split()))

# 이전 주유소보다 더 싼 주유소가 나올때까지 이동할 기름 구입
money = priceArr[0] * roadArr[0]
beforePrice = priceArr[0]

for i in range(1, cityNum - 1):
    price = priceArr[i]
    road = roadArr[i]

    if price < beforePrice:
        beforePrice = price
    
    money += beforePrice * road

print(money)