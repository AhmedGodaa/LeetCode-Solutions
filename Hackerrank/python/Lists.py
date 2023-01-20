mylist = []
for x in range(int(input())):
    line = list(map(str, input().split()))
    if line[0] == "insert":
        mylist.insert(int(line[1]), int(line[2]))
    if line[0] == "remove":
        mylist.remove(int(line[1]))
    if line[0] == "print":
        print(mylist)
    if line[0] == "append":
        mylist.append(int(line[1]))
    if line[0] == "sort":
        mylist.sort()
    if line[0] == "pop":
        mylist.pop()
    if line[0] == "reverse":
        mylist.reverse()
