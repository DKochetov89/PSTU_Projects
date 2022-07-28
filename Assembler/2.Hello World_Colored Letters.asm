; This example prints out
; "HELLO WORLD!"
; by writing directly to
; Video Memory.

#make_BIN#

; set segment register:
MOV     AX, 0B800h
MOV     DS, AX

; print "HELLO" with colored 
; letters using DS
; as segment:

MOV AL, 1h

MOV [52h], 'H'

MOV [53h], AL

INC AL

MOV [54h], 'E'

MOV [55h], AL

INC AL
 
MOV [56h], 'L'

MOV [57h], AL

INC AL

MOV [58h], 'L'

MOV [59h], AL

INC AL

MOV [5Ah], 'O'

MOV [5Bh], AL


; print "WORD!" with colored 
; lettersusing ES
; as segment (better since
; this way you won't loose
; access to variables declared
; in code segment).

; set segment registers:
PUSH    CS
POP     DS      ; DS = CS.
MOV     AX, 0B800h
MOV     ES, AX

MOV AH, 6h  

MOV ES:[5Eh], 'W'

MOV ES:[5Fh], AH

INC AH 
 
MOV ES:[60h], 'O'

MOV ES:[61h], AH

INC AH

MOV ES:[62h], 'R'

MOV ES:[63h], AH

INC AH

MOV ES:[64h], 'L'

MOV ES:[65h], AH

INC AH

MOV ES:[66h], 'D'

MOV ES:[67h], AH

INC AH

MOV ES:[68h], '!'

INC AH

MOV ES:[69h], AH

HLT