n = int(input())
f = 0
for x in range(n):
    word = str(input())
    if word == "X++" or word == "++X":
        f += 1
    if word == "X--" or word == "--X":
        f -= 1
print(f)
