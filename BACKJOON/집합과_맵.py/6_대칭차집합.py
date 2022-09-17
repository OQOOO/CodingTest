import sys
input = sys.stdin.readline

a, b = map(int, input().split())

aArr = set(input().split())
bArr = set(input().split())

a_b = aArr - bArr
b_a = bArr - aArr

a_b |= b_a

print(len(a_b))