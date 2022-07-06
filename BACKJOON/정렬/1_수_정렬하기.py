n = int(input())
li = list(int(input()) for _ in range(n))

for i in sorted(li):
    print(i)