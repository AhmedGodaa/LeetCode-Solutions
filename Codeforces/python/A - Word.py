x = str(input())
counterupper = 0 
counterlower = 0 
 
for i in (x):
    info = i.isupper()
 
    if info == bool(True) :
        counterupper +=1
    else : 
        counterlower += 1
if counterupper > counterlower:
    print(x.upper())
else:
    print(x.lower())
 
