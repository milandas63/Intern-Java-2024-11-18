from tkinter import *
from tkinter import ttk

def submit_form():
    name = name_entry.get()
    age = age_entry.get()
    gender = gender_combo.get()
    course = course_entry.get()
    email = email_entry.get()

    print("----- Student Details -----")
    print(f"Name   : {name}")
    print(f"Age    : {age}")
    print(f"Gender : {gender}")
    print(f"Course : {course}")
    print(f"Email  : {email}")
    print("---------------------------")

root = Tk()
root.title("Student Registration Form")
root.geometry("400x400")

Label_1 = Label(root, text="Student Form", fg="blue", font=("Arial", 16, "bold"))
Label_1.pack(pady=10)

form_frame = Frame(root, padx=20, pady=10)
form_frame.pack()

name_label = Label(form_frame, text="Name:")
name_label.pack(anchor='w', pady=2)
name_entry = Entry(form_frame, width=30)
name_entry.pack(pady=2)

age_label = Label(form_frame, text="Age:")
age_label.pack(anchor='w', pady=2)
age_entry = Entry(form_frame, width=30)
age_entry.pack(pady=2)

gender_label = Label(form_frame, text="Gender:")
gender_label.pack(anchor='w', pady=2)
gender_combo = ttk.Combobox(form_frame, values=["Male", "Female", "Other"], width=28, state="readonly")
gender_combo.pack(pady=2)
gender_combo.current(0)

course_label = Label(form_frame, text="Course:")
course_label.pack(anchor='w', pady=2)
course_entry = Entry(form_frame, width=30)
course_entry.pack(pady=2)

email_label = Label(form_frame, text="Email:")
email_label.pack(anchor='w', pady=2)
email_entry = Entry(form_frame, width=30)
email_entry.pack(pady=2)

submit_btn = Button(root, text="Submit", bg="blue", fg="white", width=15, command=submit_form)
submit_btn.pack(pady=15)

root.mainloop()
