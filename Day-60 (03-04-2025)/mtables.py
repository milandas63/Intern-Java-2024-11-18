"""
    Write a program to print all multiplication tables between
    2 to 24
"""
def padL(data, width):
    buf = str(data)
    for i in range(len(buf),width):
        buf = ' '+buf
    return buf


start = 2
end = 24

for i in range(start,end+1,6):
    for j in range(1,11):
        for k in range(i,i+6):
            if k>end:
                break;
            print(padL(k,2)," x ",padL(j,2)," = ",padL((k*j),3),"  ",sep='',end='')
        print()
    print()
print()
