n = int(input())
list1 = []
list2 = []
list3 = []
for x in range(n):
    num = list(map(float,input().split()))
    list1.append(num[0])
    list2.append(num[1])
    list3.append(num[2])
if sum(list1)== 0  and sum(list2) == 0 and sum(list3) == 0 :
    print("YES")
else :
    print("NO")