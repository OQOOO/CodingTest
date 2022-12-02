while True:
    stack = []
    ipt = input()

    if ipt == '.':
        break

    for i in ipt:
        try:
            if i == '(' or i == '[':
                stack.append(i)
            elif i == ')' or i == ']':
                if stack[-1] == '(' and i == ')':
                    stack.pop()
                elif stack[-1] == '[' and i == ']':
                    stack.pop()
                else:
                    break
        except:
            stack.append(-1)
            break
        
    if stack == []:
        print('yes')
    else:
        print('no')