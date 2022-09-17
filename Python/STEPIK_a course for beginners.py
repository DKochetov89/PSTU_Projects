###########################################################
# Write a program to find the digits of a four-digit number.
num = int(input())
d = num % 10
c = (num % 100) // 10 
b = (num % 1000) // 100
a = num // 1000
print('Цифра в позиции тысяч равна', a)
print('Цифра в позиции сотен равна', b)
print('Цифра в позиции десятков равна', c)
print('Цифра в позиции единиц равна', d)

###########################################################
# Write a program that verifies that the 
# following relation holds for a given four-digit number: 
# the sum of the first and last digits is equal to the difference 
# of the second and third digits.
num = int(input())
d = num % 10
c = (num % 100) // 10 
b = (num % 1000) // 100
a = num // 1000
if a+d == b-c:
    print('ДА')
else:
    print('НЕТ') 

###########################################################
#Two different cells of the chessboard are given. Write a program 
# that determines whether the king can get from the first square to 
# the second one in one move. The program receives four numbers from 1 to 8 each, 
# specifying the column number and row number first for the first cell, then for 
# the second cell. The program should output "YES" if it is possible to get to the 
# second cell from the first cell by the king's move, or "NO" otherwise.
x1, y1, x2, y2 = int(input()), int(input()), int(input()), int(input())
if (-1<=x2-x1<=1) and (-1<=y2-y1<=1):
    print('YES')
else:
    print('NO')

###########################################################
#On the roulette wheel, the pockets are numbered from 0 to 36. 
# Write a program that reads the pocket number and shows whether this 
# pocket is green, red or black. The program should display an error message 
# if the user enters a number that lies outside the range from 0 to 36.
a = int(input())
if (a == 0):
    print('зеленый')
elif (1<=a<=10) and (a % 2 == 0):
    print('черный')
elif (1<=a<=10) and (a % 2 != 0):
    print('красный') # с 1 по 10 карманы с нечетным номером имеют красный цвет, карманы с четным номером – черный;
elif (11<=a<=18) and (a % 2 == 0):
    print('красный')
elif (11<=a<=18) and (a % 2 != 0):
    print('черный') # с 11 по 18 карманы с нечетным номером имеют черный цвет, карманы с четным номером – красный;
elif (19<=a<=28) and (a % 2 == 0):
    print('черный')
elif (19<=a<=28) and (a % 2 != 0):
    print('красный') # с 19 по 28 карманы с нечетным номером имеют красный цвет, карманы с четным номером – черный;
elif (29<=a<=36) and (a % 2 == 0):
    print('красный')
elif (29<=a<=36) and (a % 2 != 0):
    print('черный')  # с 29 по 36 карманы с нечетным номером имеют черный цвет, карманы с четным номером – красный
elif (a<0) or (a>36):
    print('ошибка ввода')

###########################################################
# Write a program that orders three numbers from larger to smaller.
n1, n2, n3 = int(input()), int(input()), int(input())
n_max = max(n1, n2, n3)
n_min = min(n1, n2, n3)
n_sr = (n1+n2+n3)-n_min-n_max
print(n_max, n_sr, n_min, sep = '\n') 

###########################################################
# Given three real numbers a, b, c. Write a program that finds the real 
# roots of the quadratic equation ax^2 +bx +c = 0.
import math

a, b, c = float(input()), float(input()), float(input())
if ((b*b) - (4*a*c)) > 0:
    D = math.sqrt((b*b) - (4*a*c))
    x1 = (-b+D) / (2*a)                 
    x2 = (-b-D) / (2*a)
    if x1<x2:
        print (x1, x2, sep = '\n')
    else:
        print (x2, x1, sep = '\n')
elif ((b*b) - (4*a*c)) == 0:
    D = math.sqrt((b*b) - (4*a*c))
    x1 = (-b+D) / (2*a)
    print (x1)
else:
    print ('Нет корней')

###########################################################
# Two integers m and n (m > n) are given. 
# Write a program that outputs all odd numbers from m to n inclusive in descending order.
m, n = int(input()), int(input())
for i in range(m, n-1, -1):
    if i%2!=0:
        print(i)

###########################################################
# The input to the program is a natural number n, and then n different natural numbers, 
# each on a separate line. Write a program that outputs the largest and second largest number of the sequence.
n = int(input())
largest = 0
prelargest = 0
for i in range(1, n+1):
    b = int(input())
    if b > largest:
        prelargest = largest
        largest = b
    elif (b > prelargest):
        prelargest = b
print(largest)
print(prelargest)

###########################################################
# Given a natural number. Write a program that determines whether the sequence 
# of its digits when viewed from right to left is ordered in non-decreasing order.
num = int(input())
flag = True
s = num % 10
while num != 0:
    n = num % 10
    if n<s:
        flag = False
    else:
        s = n
    num = num // 10
if flag:
    print('YES')
else:
    print('NO')

###########################################################
# A natural number is received for processing. You need to write a program that 
# displays the maximum digit of a number that is a multiple of 33. If there are no 
# digits in the number that are multiples of 33, it is required to display "NO" on the screen. 
# The programmer was in a hurry and wrote the program incorrectly.
n = int(input())
max_digit = -1
while n > 0:
    digit = n % 10
    if digit % 3 == 0:
        if digit > max_digit:
            max_digit = digit
    n = n // 10
if max_digit == -1:
    print('NO')
else:
    print(max_digit)

###########################################################
# The program is fed two natural numbers a and b (a < b) as input. 
# Write a program that finds a natural number from the segment [a; b] with the maximum sum of divisors.
a, b = int(input()), int(input())
summ_count = 0
max_x = 0

for x in range(a, b + 1):
    count = 0
    for j in range(1, x + 1):
        if x % j == 0:
            count += j
        if count >= summ_count:
            summ_count = count
            max_x = x
print(max_x, summ_count)

###########################################################
# Caesar's cipher. In the first line, the number n is given, (1≤ n≤ 25) is a shift, in the 
# second line, an encoded message is given in the form of a string with lowercase Latin letters. 
# The program should output one line – a decoded message. Note that you need to decode the message, 
# not encode it.
n, s = int(input()), input()
for letter in s:
    decryption = ord(letter) - n
    if decryption < 97:
        decryption += 26
    print(chr(decryption), end='')

###########################################################
# The input to the program is a natural number of n and n lines, and then the number k. 
# Write a program that outputs the k letter from the entered lines on one line without spaces.
n = int(input())
mylist = []

for i in range(0, n):
    s = input()
    mylist.append(s)
k = int(input())
S = ''
for j in range(0, n):
    s = mylist[j]
    if len(s) >= k:
        S += s[k-1]
print(S)

###########################################################
# The input to the program is a natural number n, then n rows, then the number k — the number 
# of search queries, then k rows — search queries. Write a program that outputs all the entered lines 
# in which all search queries occur.
n = int(input())
new_list = []
need_list = []
final_list = []
count = 0

for i in range(0, n):
    new = input()
    new_list.append(new)

k = int(input())

for j in range(0, k):
    need = input()
    need_list.append(need)

for k1 in range(0, n):
    for k2 in range(0, k):
        if need_list[k2].lower() in new_list[k1].lower():
            count+=1
    if count >= k:
        final_list.append(new_list[k1])
    count = 0
print(*final_list, sep='\n')

###########################################################
# Hacking the Brotherhood of Steel. On the first line, the lattice symbol is entered and 
# immediately the natural number nn is the number of lines in the program, not counting the 
# first one. This is followed by nn lines of code. You need to output the same lines, but remove 
# comments and empty space characters at the end of the lines. You do not need to output an empty 
# line instead of the first input line.
n_sharp = input()
n = int(n_sharp[1:])
text_list = []
for i in range(0, n):
    string = input()
    text_list.append(string)
for j in range(0, n):
    position = text_list[j].find('#')
    if position != -1:
        string = text_list[j][:position].rstrip()
    else:
        string = text_list[j].rstrip()
    print(string, end = '\n')

###########################################################
# Write the function get_next_prime(num), which takes as an 
# argument the natural number num and returns the first prime number greater than the number num.
def get_next_prime(num):
    num += 1
    for i in range(2, num):
        if num % i == 0:
            return get_next_prime(num)
    return num

n = int(input())

print(get_next_prime(n))
