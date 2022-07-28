ORG 100h
	
start:	
  MOV CX, 26         ;The loop will be executed 26 times
  ;MOV CX, 127       ;All ASCII symbols 
  MOV DL, 'A'        ;The first letter
  ;MOV DL, 00        ;The first ASCII symbol
  MOV BX, 676h       ;Position of the first letter on the screen     
  MOV AX, 0B800h     ;Set AX = B800h - VGA memory   
  MOV DS, AX         ;Copy value from AX to DS       
  MOV DH, 01001110b	 ;CH = color attributes 

abcde:
  MOV [BX], DX       ;Write a character to VGA memory     
  INC DL             ;Increase          
  ADD BX, 2          ;Shift        
  LOOP abcde         ;Repeat loop       
  
  END	start