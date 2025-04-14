import time as t
from datetime import datetime


try:
    print(datetime.strptime(str(datetime.now()),"%H:%M:%S"))
    with open("Pyramid.py","r") as f:
        for one in iter(lambda: f.read(1), ""):
            print(one,flush=True)
            f.flush()
            t.sleep(0.1)
        f.close()
    print(datetime.now().time())

except KeyboardInterrupt as e:
    print(e.__doc__)
except Exception as e:
    print("Error while readeing ",e)


from datetime import datetime 
  
start = datetime.strptime("4:25:40", "%H:%M:%S") 
end = datetime.strptime("11:40:10", "%H:%M:%S") 
  
difference = end - start 
  
seconds = difference.total_seconds() 
print('difference in seconds is:', seconds) 
  
minutes = seconds / 60
print('difference in minutes is:', minutes) 
  
hours = seconds / (60 * 60) 
print('difference in hours is:', hours)