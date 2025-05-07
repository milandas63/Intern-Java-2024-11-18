from tkinter import *
from PIL import ImageTk, Image
from tkinter import messagebox

root = Tk()
root.title("MessageBox demo")
root.iconbitmap("bird.ico")
root.geometry("600x500")

def show_messagebox1():
    messagebox.showinfo("Information Message", "Python programmers have bright future")
    return

def show_messagebox2():
    messagebox.showwarning("Warning Message", "Python programmers have bright future")
    return

def show_messagebox3():
    messagebox.showerror("Error Message", "Python programmers have bright future")
    return

def show_messagebox4():
    messagebox.askquestion("Question Message", "Python programmers have bright future")
    return

def show_messagebox5():
    messagebox.askokcancel("Ok Cancel Message", "Python programmers have bright future")
    return

def show_messagebox6():
    messagebox.askyesno("Yes No Message", "Python programmers have bright future")
    return

btn_1 = Button(root, text="showinfo", command=show_messagebox1)
btn_2 = Button(root, text="showwarning", command=show_messagebox2)
btn_3 = Button(root, text="showerror", command=show_messagebox3)
btn_4 = Button(root, text="askquestion", command=show_messagebox4)
btn_5 = Button(root, text="askokcancel", command=show_messagebox5)
btn_6 = Button(root, text="askyesno", command=show_messagebox6)
btn_1.pack()
btn_2.pack()
btn_3.pack()
btn_4.pack()
btn_5.pack()
btn_6.pack()

root.mainloop()
