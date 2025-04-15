import mysql.connector

def get_contact_table():
    con = mysql.connector.connect(
        user='root',
        password='root',
        host='localhost',
        database='contact18'
    )

    curs = con.cursor()
    curs.execute("SELECT * FROM contact")
    columns = [desc[0] for desc in curs.description]
    rows = curs.fetchall()

    curs.close()
    con.close()

    return columns, rows