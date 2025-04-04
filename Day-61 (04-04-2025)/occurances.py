# occurances.py

text = "Good morning"

lcount = []
for i in range(0,26):
	lcount.append(0)

for i in text:
	each = ord(i)
	if each>=65 and each<=90:
		lcount[each-65] = lcount[each-65] + 1
	elif each>=97 and each<=122:
		lcount[each-97] = lcount[each-97] + 1

index = 0
for i in lcount:
	if lcount[index]>0:
		print( chr(index+65), " = ", lcount[index])
	index = index + 1

