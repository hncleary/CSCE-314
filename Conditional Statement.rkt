(define (conditions x)
  (cond ( (> x 2)
          (display "x is greater than two \n"))
        ( (< x 2)
          (display "x is less than two"))
        (else 0
         )
        )
  )

(display (conditions 5))
(newline)

;; fibonacci conditional + recursion
(define (fib n)
  (if (< n 2) n  ; true
      (+ (fib (- n 1)) (fib (- n 2))) ; false
  )
)

(display (cdr '(a b c d e f g)))
(newline)

;; cons combines two lists with a node
;first item points to first item of the second piece in the argument
(display (cons 1 '(2 3)))
(newline)
(display (cons '(1 2 3) '(3 4 5)))
(newline)
(if (null? '() )
    (display "the list is null")
    (display "the list is not null")
    )
(newline)

;;count nodes
(define (count-nodes tree)
  (if (leaf? tree)
    1
    (+ 1 (count-nodes-in-forest (children tree)))))

(define (count-nodes-in-forest tree)
  (if (null? tree)
    0
    (+ (count-nodes (car tree))
       (count-nodes-in-forest (cdr tree)))))

;;flatten function
(define (flatten tree)
    (cond ((null? tree) '())
          ((not (pair? tree)) (list tree))
          (else (append (flatten (datum tree))
                        (flatten (children tree))))))
;returns the last element in a list
(define (last_element l)
  (cond ((null? (cdr l)) (car l))
        (else (last_element (cdr l)))))

; counter of leaves in tree
(define (count-leaves t)
  (cond ((null? t) 0)
        ((not (pair? t)) 1)
        (else (+ (count-leaves (car t)) 
        (count-leaves (cdr t))))))

;; accumulate date in list recursively
(define (list-sum lst)
        (cond
             ((null? lst) 0)                              
             (else (+ (car lst) (list-sum (cdr lst))))    
        )
)

;; recursive power function
(define (power x y acc)
  (if (= y 0)
      acc
      (power x (- y 1) (* x acc))
  )
)
(display (power 2 4 1))
(newline)

(define (power-new x y)
  (if (= y 0)
  1
  (* (power-new x (- y 1)) x)
             )
  )
;; triple everything without recursion
(define (triple-everything list)
  (map (lambda (n) (* 3 n)) list )
  ;(map * '(3 3 3) list )
  )
(display (triple-everything '(1 2 3)))
(newline)


;;triple everything with recursion
(define (triple-everything-rec list)
  (if (null? list)
      '()
      (cons (* 3 (car list))
            (triple-everything-rec (cdr list))
            )
      )
  )
(display (triple-everything-rec '(1 2 3 4)))
(newline)

(power-new 2 4)
  