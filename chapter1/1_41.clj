(defn inc [x] (+ x 1))

(defn double [f]
    (fn [x] (f (f x))))

(prn ((double inc) 3))
(prn (((double (double double)) inc) 5))
