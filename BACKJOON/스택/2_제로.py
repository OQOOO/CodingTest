import sys
k = int(sys.stdin.readline())

stack = []
for _ in range(k):
    i = int(sys.stdin.readline())
    if i != 0:
        stack.append(i)
    else:
        stack.pop()

print(sum(stack))

# 0 이 입력됐을때 이전에 들어온 수를 지우는 문제