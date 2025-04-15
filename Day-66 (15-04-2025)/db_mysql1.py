import mysql.connector

conn = mysql.connector.connect(
	host = 'localhost',
	user = 'root',
	passwd = 'root',
	database = 'contact18'
)

curs = conn.cursor()
curs.execute("SELECT con_id,con_name,mobile_no1,email_id FROM contact")

for row in curs:
    for index, col in enumerate(row):
        print(col, end=', ')
    print()
