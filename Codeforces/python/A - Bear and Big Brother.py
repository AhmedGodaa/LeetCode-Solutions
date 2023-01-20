x = list(map(int,input().split()))
year = 0
while x[0] <= x[1] : 
    x [0] = x[0]*3
    x [1] = x [1]*2
    year = year + 1
print(year)