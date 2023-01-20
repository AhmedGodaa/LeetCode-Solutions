word = list(str(input()))
word = list(dict.fromkeys(word))
lenght = len(word)
if lenght %2 == 0:
    print("CHAT WITH HER!")
else :
    print("IGNORE HIM!")
 