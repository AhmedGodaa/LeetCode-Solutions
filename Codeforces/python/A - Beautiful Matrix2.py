counter = 0
for i in range(5):
    x = list(map(int,input().split()))
    if sum(x) == 1 :
        counter += abs ( i -2 )
    for gogo in range(5):
        if x[gogo] == 1 :
            counter +=abs(gogo-2)
    
print(counter)