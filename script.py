import csv
import time
import operator
start =time.time()
print('enter 0 to read heart csv file')
print('enter 1 to search by Age :')
print('enter 2 to search by Gender of the person :')
print('enter 3 to search by Chest Pain type :')
print('enter 4 to search by resting blood pressure :')
print('enter 5 to search by cholesterol:')
print('enter 6 to search by fasting blood sugar :')
print('enter 7 to search by resting electrocardiographic :')
print('enter 8 to search by maximum heart rate :')
print('enter 9 to search by exercise induced angina :')
print('enter 10 to search by old peak :')
print('enter 11 to search by slp :')
print('enter 12 to search by Cerebral amyloid angiopathy /caa :')
print('enter 13 to search by thall :')
print('enter 14 to search by output :')
## sort oparetion
print('enter 15 to sort csv file by age')
print('enter 16 to sort csv by oldpeak')
def readcsv():
    with open('heart.csv') as csv_file:
        heart = csv.DictReader(csv_file)
        for heart in heart:
            print(heart)
def searchByAge():
    age = input('enter any range of age :\n')
    csv_file = csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if age==row[0]:
           print(row)

def searchBysex():
    sex=input('enter to see gender 1 for male and 0 for female :')
    csv_file=csv.reader(open('heart.csv','r'))

    for row in csv_file:
        if sex== row[1]:
            print(row)

def searchBycp():
    cp=input('enter chest pain type 0 to 3 :')
    csv_file=csv.reader(open('heart.csv','r'))

    for row in csv_file:
        if cp== row[2]:
            print(row)

def searchBytrtbps():
    trtbps=input('enter blood pressure 94 to 192 :')
    csv_file=csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if trtbps==row[3]:
            print(row)

def searchBychol():
    chol=input('enter cholesterol to identify :')
    csv_file=csv.reader(open('heart.csv','r'))

    for row in csv_file:
        if chol== row[4]:
            print(row)
def searchByfbs():
    fbs=input('enter fasting blood sugar >120 mg/dl) (1 = true; 0 = false) ')
    csv_file=csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if fbs==row[5]:
            print(row)
def searchByrestecg():
    restecg=input('enter ecg input 0 to 2 :')
    csv_file=csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if restecg==row[6]:
            print(row)
def searchBythalachh():
    thalachh=input('enter maximum heart rate :')
    csv_file=csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if thalachh==row[7]:
            print(row)
def searchByexng():
    exng=input('enter exercise induced angina input (1 = yes; 0 = no):')
    csv_file=csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if exng==row[8]:
            print(row)
def searchByoldpeak():
    oldpeak=input('enter oldpeak :')
    csv_file=csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if oldpeak==row[9]:
            print(row)
def searchslp():
    slp=input('enter slp :')
    csv_file=csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if slp==row[10]:
            print(row)
def searchBycaa():
    caa=input('enter Caa 0 to 4:')
    csv_file=csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if caa==row[11]:
            print(row)
def searchBythall():
    thall=input('enter Thall1 or 2 or 3:')
    csv_file=csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if thall==row[12]:
            print(row)
def searchByoutput():
    output=input('enter oputput 0 or 1:')
    csv_file=csv.reader(open('heart.csv','r'))
    for row in csv_file:
        if output==row[13]:
            print(row)

def sortByage():
        with open('heart.csv', 'r') as f:
            reader = csv.reader(f, delimiter=',')
            sort=sorted(reader,key=operator.itemgetter(0))
            for row in sort:
                print(row)
def sortByoldpeak():
    with open('heart.csv', 'r') as f:
        oldpeak = csv.reader(f, delimiter=',')
        sort = sorted(oldpeak, key=operator.itemgetter(9))
        for row in sort:
            print(row)

def menu():
    case=int(input('enter your choice:'))
    if case==0:
        readcsv()
    elif case==1:
        searchByAge()
    elif case==2:
         searchBysex()
    elif case==3:
         searchBycp()
    elif case==4:
         searchBytrtbps()
    elif case==5:
         searchBychol()
    elif case==6:
         searchByfbs()
    elif case==7:
         searchByrestecg()
    elif case==8:
         searchBythalachh()
    elif case ==9:
         searchByexng()
    elif case ==10:
         searchByoldpeak()
    elif case ==11:
        searchslp()
    elif case ==12:
        searchBycaa()
    elif case ==13:
        searchBythall()
    elif case ==14:
        searchByoutput()
    elif case ==15:
        sortByage()
    elif case ==16:
        sortByoldpeak()
    else:
        print('invalid input')

menu()
end = time.time()
time_taken=end-start
print('\nTime Taken to run this program'+' '+str(time_taken))






