(define (leaf? node)
  (null? (children node)))

(define (datum node)
  (car node))

(define (children node)
  (cdr node))

(define (count-leaves tree)
  (if (leaf? tree)
      1
      (count-leaves-in-forest (children tree))
  )
)

(define (count-leaves-in-forest forest)
  (if (null? forest)
      0
      (+ (count-leaves (car forest))
         (count-leaves-in-forest (cdr forest)))
  )
)

(define (make-node datum children)
  (cons datum children))

(define (leaf datum)
  (make-node datum '())
)

(define (cities name-list)
  (map leaf name-list)
)

(define (in-tree? place tree)
  (or (equal? place (datum tree))
      (in-forest? place (children tree))
  )
)

(define (in-forest? place forest)
  (if (null? forest)
      #f
      (or (in-tree? place (car forest))
	    (in-forest? place (cdr forest)))
  )
)



;value of tree
(define (value tree)
  (car tree))

; counter of leaves in tree
(define (count-leaves t)
  (cond ((null? t) 0)
        ((not (pair? t)) 1)
        (else (+ (count-leaves (car t)) 
        (count-leaves (cdr t))))))

;;finds length of several types in scheme
(define generic-length
	(lambda (x)
	    (cond ((string? x) (string-length x))
		  ((vector? x) (vector-length x))
		  ((list? x) (length x)))))

;returns the last element in a list
(define (last_element l)
  (cond ((null? (cdr l)) (car l))
        (else (last_element (cdr l)))))

;count nodes function

;(define (leaf? node)
  ;(null? (children node)))

(define (count-nodes tree)
  (if (leaf? tree)
    1
    (+ 1 (count-nodes-in-forest (children tree)))))

(define (count-nodes-in-forest tree)
  (if (null? tree)
    0
    (+ (count-nodes (car tree))
       (count-nodes-in-forest (cdr tree)))))

;;


(define (locate city tree)
  (if (equal? city (datum tree))
      (list city)
      (let ((subpath (locate-in-forest city (children tree))))
        (if subpath
            (cons (datum tree) subpath)
            #f))))

(define (locate-in-forest city forest)
  (if (null? forest)
      #f
      (or (locate city (car forest))
	  (locate-in-forest city (cdr forest)))))



(define world-tree2
  (make-node
   'world
   (list (make-node
          'italy
          (cities '(venezia riomaggiore firenze roma)))
         (make-node
          '(united states)
          (list (make-node
                 'california
                 (cities '(berkeley (san francisco) gilroy)))
                (make-node
                 'massachusetts
                 (cities '(cambridge amherst sudbury)))
                (make-node 'ohio (cities '(kent)))))
         (make-node 'zimbabwe (cities '(harare hwange)))
         (make-node 'china
		        (cities '(beijing shanghai guangzhou suzhou)))
         (make-node
          '(great britain)
          (list 
           (make-node 'england (cities '(liverpool)))
           (make-node 'scotland
		            (cities '(edinburgh glasgow (gretna green))))
           (make-node 'wales (cities '(abergavenny)))))
         (make-node
          'australia
          (list
           (make-node 'victoria (cities '(melbourne)))
           (make-node '(new south wales) (cities '(sydney)))
           (make-node 'queensland
		            (cities '(cairns (port douglas))))))
         (make-node 'honduras (cities '(tegucigalpa))))))




; (count-leaves world-tree)
(display (count-leaves world-tree2))
(newline)
;> (in-tree? 'abergavenny world-tree)
(display (in-tree? 'abergavenny world-tree2))
;#T
(newline)
;> (in-tree? 'abbenay world-tree)
(display (in-tree? 'abbenay world-tree2))
;#F
(newline)
;> (in-tree? 'venezia (cadr (children world-tree)))
(display (in-tree? 'venezia (cadr (children world-tree2))))
;#F
(newline)
;total nodes
(display (count-leaves world-tree2))
(newline)
(display (generic-length world-tree2))
(display "  ")
(display (generic-length (cdr world-tree2)))
(newline)
(display (last_element world-tree2))
(newline)
(display (last_element (last_element world-tree2)))
(newline)
(display (last_element (last_element (last_element world-tree2))))
(newline)
(display "Node Count: ")
(display (count-nodes world-tree2))


