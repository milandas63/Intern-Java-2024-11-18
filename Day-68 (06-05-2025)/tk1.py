from tkinter import *

root = Tk()
root.title('My First TKinter Program')
root.iconbitmap('bird.ico')
root.geometry('450x250')

#l1 = Label(root, text='Hello World!', font='20', height='35')
#l1.pack()
#l2 = Label(root, text='Hello World!', font='40', pady='10', height='35')
#l2.pack()
l3 = Label(root, text ='Hello World!', font="40", pady='10')
l3.pack()
b = Button(root, text='Click to Work', font='40', pady='25')
b.pack()
b1 = Button(root, text='Click to Work', font='40', pady='25', padx='25')
b1.pack()
e = Entry(root, text='Quick Brown Fox Jumps Over', font='40')
e.pack()

root.mainloop()
