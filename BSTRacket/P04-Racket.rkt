#lang racket
; Class Name: P04-Racket.rkt
;
; Structure: BST, acts as a BST node, containing the value, the left child, and the right child
;
; The following is an implementation of a Binary Search Tree in Racket, using Functional Programming syntax and methodology. 
; This implementation contains a structure for each node, and my-bst, which will build a BST using hard-coded values, provided in the assignment PDF.
; In addition, the search function is included, which will search for the value, returning true if the value is at all found.
; If the given value is smaller, it will perform a recursive call to check the left child, and if the value is larger, it will check the right child.
; If the bottom of the tree is reached and the value is not found, the function will return false, because the value was not found in the tree.
;

(define-struct bst (value left right)) ; Defining the struct for a BST, with a parameter for the value, as well as the left and right nodes

(define my-bst ; Defining the hard-coded BST
  (make-bst 5 ; Using the make-bst function included in define-struct to keep creating BSTs to build the example BST provided in the assignment PDF
            (make-bst 2
                      (make-bst 1 '() '())
                      (make-bst 3 '() '()))
            (make-bst 12
                      (make-bst 9 '() '())
                      (make-bst 21
                                (make-bst 19 '() '())
                                (make-bst 25 '() '())))))

(define (search bst value) ; Defining the function to search the BST for a value
  (cond
    [(empty? bst) #f]                       ; If the tree is empty, return false 
    [(= value (bst-value bst)) #t]          ; If the value matches, return true
    [(< value (bst-value bst)) (search (bst-left bst) value)]  ; Go left if smaller
    [(> value (bst-value bst)) (search (bst-right bst) value)] ; Go right if larger
    [else #f]))                             ; In case of any other unexpected condition


(search my-bst 22) ; Declaration of the search function on my-bst searching for 22