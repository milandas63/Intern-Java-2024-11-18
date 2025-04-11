"""
    Read a file in the name Pyramid.py and write the content in the
    name p.py
"""

handle1 = open("Pyramid.py","r")
text_content = handle1.read()

handle2 = open("p.py","w")
handle2.write(text_content)

handle1.close()
handle2.close()

