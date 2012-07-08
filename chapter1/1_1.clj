(prn 10)

(prn (+ 5 3 4))

(prn (- 9 1))

(prn (/ 6 2))

(prn (+ (* 2 4) (- 4 6)))

(def a 3)

(def b (+ a 1))

(prn (+ a b (* a b)))

(prn (= a b))

(prn (if (and (> b a) (< b (* a b)))
        b
        a))

(prn (cond (= a 4) 6
        (= b 4) (+ 6 7 a)
        true 25))

(prn (+ 2 (if (> b a) b a)))

(prn (*
        (cond (> a b) a
                (- a b) b
                true -1)
    (+ a 1)))
