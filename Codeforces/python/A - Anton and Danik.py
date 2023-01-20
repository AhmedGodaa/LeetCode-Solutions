n = int(input())
test = str(input())
Anton = 0
Danik = 0
for x in test :
    if x == "A":
        Anton +=1
    else : 
        Danik +=1
 
if Anton > Danik :
    print("Anton")
if Anton < Danik :
    print("Danik")
if Anton == Danik :
    print("Friendship")