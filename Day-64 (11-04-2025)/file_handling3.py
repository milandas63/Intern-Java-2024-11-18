"""
    Read a file in the name Pyramid.py and write the content in the
    name p.py
"""

handle1 = open("Pyramid.py","r")
text_content = handle1.read()

handle2 = open("p.py","a")
handle2.write("\r\n\r\nWe are the students of IIG Varsity")

handle1.close()
handle2.close()

