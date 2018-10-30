;; Hunter Cleary
;; hncleary
;; hncleary@tamu.edu
;; 625001547

;;while A isnt null pair with B
;;when B is null move to cadr of a 
;;repeat until A is null

;;cross (A B)
;;while A isnt null
;;(list (car A) (car B) (cross A 

(display (length '(1 2 3)))
(newline)

(define (cross A B)
  (if null? A)
  0
  (list ( list (car A) '(car B) (cross A '(cdr B) ) ))
  )


              

(display (cross '(1 2 3) '(a b)))