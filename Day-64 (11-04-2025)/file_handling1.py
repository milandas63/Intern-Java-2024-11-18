"""
    Read a file in the name Pyramid.py and write the content in the
    name p.py
"""

handle = open("Pyramid.py")
text_content = handle.read()
print(text_content)
handle.close()
