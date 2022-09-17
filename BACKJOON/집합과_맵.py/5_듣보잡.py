import sys

n, m = map(int, sys.stdin.readline().split())

nHeard = set(sys.stdin.readline().rstrip() for _ in range(n))
nSeen = set(sys.stdin.readline().rstrip() for _ in range(m))

unHeardOf = sorted(list(nHeard & nSeen))

print(len(unHeardOf))
for i in unHeardOf:
    print(i)