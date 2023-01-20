n = int(input())
y = 0
for x in range(n):
    cake = list(map(int,input().split()))
    while cake[0] != int(1) :
        cake[0] -= 1
        y+=cake[1]
    while cake[1] != int(1):
        cake[1] -= 1
        y+= cake[0]
    if y == cake[2]:
        print("YES")
    if y != cake[2]:
        print("NO")
    y = 0