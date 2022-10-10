import sys
n = int(sys.stdin.readline())
stack = []

for _ in range(n):
    ipt = sys.stdin.readline().split() #####
    cmd = ipt[0] ####
    
    if cmd == 'push':
        stack.append(ipt[1])
    elif cmd == 'pop':
        if stack:
            p = stack.pop()
            print(p)
        else:
            print(-1)
    elif cmd == 'size':
        print(len(stack))
    elif cmd == 'empty':
        if stack:
            print(0)
        else:
            print(1)
    elif cmd == 'top':
        if stack:
            print(stack[-1])
        else:
            print(-1)