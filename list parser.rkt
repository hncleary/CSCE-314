(define (collect-type a ls)
  (cond
    ((null? (cdr ls)) '())
    ((a (car ls)) (cons (car ls) (collect-type a (cdr ls)) ))
    (else (collect-type a (cdr ls))))
  )

(display (collect-type string? (list 1 3 4 "b" "a" "f" 5  )))
(newline)
(display (collect-type char? (list 1 3 4 #\b "a" "f" 5  )))
