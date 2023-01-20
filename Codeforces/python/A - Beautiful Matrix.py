x1 = list(map(int,input().split()))
x2 = list(map(int,input().split()))
x3 = list(map(int,input().split()))
x4 = list(map(int,input().split()))
x5 = list(map(int,input().split()))
counter = 0
for n in range(5):
    if x1[n] == 1 :
       counter = abs(n - 2)
for n in range(5):
    if x2[n] == 1 :
       counter = abs(n - 2)
for n in range(5):
    if x3[n] == 1 :
       counter = abs(n - 2)
for n in range(5):
    if x4[n] == 1 :
       counter = abs(n - 2)
for n in range(5):
    if x5[n] == 1 :
       counter = abs(n - 2)
 
if sum(x1) == 1 :
    counter += 2
if sum(x2) == 1 :
    counter += 1
if sum(x3) == 1 :
    pass
if sum(x4) == 1 :
    counter += 1
if sum(x5) == 1 :
    counter += 2
    
print(counter)