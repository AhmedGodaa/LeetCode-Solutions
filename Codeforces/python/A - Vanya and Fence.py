x = list(map(int,input().split()))
y = list(map(int,input().split()))
counter = 0
for i in range(x[0]):
    if y[i] <= x[1]:
        counter +=1
    else:
        counter +=2
print(counter)
