n = int(input())
 
for x in range(n):
    word = str(input())
    length = str(len(word)-int(2))
    length1 = int(len(word))
    if length1 > int(10):
        solution = word[0]+length+word[-1]
        print(solution)
    else:
        print(word)
 
 
 
    