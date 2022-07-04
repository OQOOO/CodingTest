n = input()
for i in range(int(n)+1):
    temp = i

    for j in str(i):
        temp += int(j)

    if temp == int(n):
        print(i)
        break

    if i == int(n):
        print(0)

# 자연수 N이 주어졌을때 N의 가장 작은 생성자를 구하는 프로그램을 작성하시오
# 생성자가 없는 경우 0을 출력