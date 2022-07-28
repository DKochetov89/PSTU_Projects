; This example prints out
;  "HELLO WORLD!"
; by writing directly to
; Video Memory.

#make_BIN#

; set segment register:
MOV     AX, 0B800h
MOV     DS, AX

; print "HELLO" using DS
; as segment:

MOV [52h], 'H'

MOV [54h], 'E'
 
MOV [56h], 'L'

MOV [58h], 'L'

MOV [5Ah], 'O'


; print "WORD!" using ES
; as segment (better since
; this way you won't loose
; access to variables declared
; in code segment).

; set segment registers:
PUSH    CS
POP     DS      ; DS = CS.
MOV     AX, 0B800h
MOV     ES, AX

MOV ES:[5Eh], 'W'
 
MOV ES:[60h], 'O'

MOV ES:[62h], 'R'

MOV ES:[64h], 'L'

MOV ES:[66h], 'D'

MOV ES:[68h], '!'

HLT
