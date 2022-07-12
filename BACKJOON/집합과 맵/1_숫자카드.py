import sys

n = int(input())
cards = set(sys.stdin.readline().split())

m = int(input())
comps = list(sys.stdin.readline().split())

for card in comps:
    print(1, end=' ') if card in cards else print(0, end=' ')