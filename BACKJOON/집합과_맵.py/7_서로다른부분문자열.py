s = input()

arr = set()

for i in range(len(s)):
    temp = ''
    for j in range(i, len(s)):
        temp += s[j]
        arr.add(temp)

print(len(arr))