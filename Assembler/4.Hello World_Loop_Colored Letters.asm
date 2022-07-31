.data
db 'Hello world!'      

START:

    MOV AX, @data
    MOV DS, AX        ;set segment register
    MOV AX, 0b800h
    MOV ES, AX        ;set segment register
    MOV SI, 0         ;si char used to index code column
    MOV DI, 0         ;di is used to locate the target column
    MOV CX, 12        ;string length    
    MOV BL, 01h       ;set start char color

    s1:
    MOV AL,DS:[SI]    ;source char
    MOV ES:[DI],AL    ;display the target char

    MOV AL,BL         ;color
    MOV ES:[DI+1],AL  ;set the target character color

    INC SI            ;db one character one byte
    ADD DI, 2         ;video memory one character two bytes:even character body, odd character color
    INC BL            ;set next color
    LOOP s1

    MOV AH,4CH
    INT 21H

END START