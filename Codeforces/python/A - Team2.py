n = int(input())
sure = 0
for x in range(n):
    problems = list(map(int,(input().split())))
    if sum(problems) >= int(2):
        sure += 1
print(sure)