import sys
t = int(sys.stdin.readline())
for _ in range(t):
    bracket = sys.stdin.readline().strip()
    stack = []
    for i in bracket:
        try:
            if i == '(':
                stack.append(1)
            else:
                stack.pop()
        except:
            stack.append(-1)
            break

    if stack == []:
        print('YES')
    else:
        print('NO')

# 올바른 괄호인지 확인하는 문제